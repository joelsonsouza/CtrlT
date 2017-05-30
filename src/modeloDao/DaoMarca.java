/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansMarca;
import modeloConection.ConexaoBD;


public class DaoMarca {
    
    
    ConexaoBD conex = new ConexaoBD();
    BeansMarca mod = new BeansMarca();
    
    public void Salvar (BeansMarca mod){
    
    conex.conexao();
    
    try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_marca (descricaomarca) values(?)");
            pst.setString(1, mod.getDescricao().toUpperCase());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Marca já cadastrada");
        }
  
    conex.desconecta(); 
    }
    
    public  BeansMarca Pesquisar (BeansMarca mod){
    
    conex.conexao();
    conex.executaSql("select *from tbl_marca where descricaomarca ilike'%"+ mod.getPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_marca"));
            mod.setDescricao(conex.rs.getString("descricaomarca"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }  
    conex.desconecta();
    return mod;
    }
   
    public void Editar (BeansMarca mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_marca set descricaomarca=? where id_marca=?");
            pst.setString(1, mod.getDescricao().toUpperCase());
            pst.setInt(2, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    conex.desconecta(); 
    }
    
    public void Excluir(BeansMarca mod){
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_marca where id_marca=? and descricaomarca=?");
            pst.setString(2, mod.getDescricao());
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }    
    conex.desconecta();
    
    }   
}
