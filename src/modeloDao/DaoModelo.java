/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansModelo;
import modeloConection.ConexaoBD;

public class DaoModelo {
    
    ConexaoBD conex = new ConexaoBD();
    BeansModelo mod = new BeansModelo();
    ConexaoBD conexMarca = new ConexaoBD();
    String descricaoMarca;
    int codMarca;

    
    public void Salvar(BeansModelo mod){
        SalvaIdMarca(mod.getMarca());
        conex.conexao();
        
            try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_modelo (descricao, id_marca) values(?,?)");
              
            pst.setString(1, mod.getDescricao().toUpperCase());
            pst.setInt(2, codMarca);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Modelo já cadastrado");
        }    
        conex.desconecta();
    }
    
    public  BeansModelo Pesquisar (BeansModelo mod){
    
    conex.conexao();
    
        try {
            conex.executaSql("select * from tbl_modelo as a inner join tbl_marca as b on(a.id_marca = b.id_marca) where descricao ilike'%"+ mod.getDescricao()+"%'");
            conex.rs.first();
            
            mod.setCodigo(conex.rs.getInt("id_modelo"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setIdMarca(conex.rs.getInt("id_marca"));
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }    
    conex.desconecta();
    return mod;
  
    }
       
    public void Editar (BeansModelo mod){
    SalvaIdMarca(mod.getMarca());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_modelo set descricao=?, id_marca=? where id_modelo=?");
            pst.setString(1, mod.getDescricao());
            pst.setInt(2, codMarca);           
            pst.setInt(3, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }   
    conex.desconecta(); 
    }
    
    public void Excluir(BeansModelo mod){
        
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_modelo where id_modelo=? and descricao=?");
            pst.setString(2, mod.getDescricao());
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }      
    conex.desconecta(); 
    }
    
    public void SalvaIdMarca(String descricao){
    
        conex.conexao();
        conex.executaSql("select *from tbl_marca where descricaomarca = '"+descricao+"'");
        try {
            conex.rs.first();
            codMarca=conex.rs.getInt("id_marca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Marca"+ex);
        }     
        conex.desconecta();
    }
    
    public void PesquisarMarca (int cod){
    
    conexMarca.conexao();
    
        try {
            conexMarca.executaSql("select *from tbl_marca where id_marca="+cod);
            conexMarca.rs.first();
            descricaoMarca = conexMarca.rs.getString("descricaomarca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Marca"+ex);  
            
        }
    conexMarca.desconecta();
    
    }
}