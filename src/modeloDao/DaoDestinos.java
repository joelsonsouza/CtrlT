/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansDestinos;
import Beans.BeansMarca;
import Beans.BeansRegistrarAtiv;
import modeloConection.ConexaoBD;

/**
 *
 * @author Joelson
 */
public class DaoDestinos {
  
    ConexaoBD conex = new ConexaoBD();
    BeansDestinos modDest = new BeansDestinos();
    BeansRegistrarAtiv reg = new BeansRegistrarAtiv();
    
    
    public void Salvar (BeansDestinos modDest){
    
    conex.conexao();
    
    try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_destinos (descricao) values(?)");
            pst.setString(1, modDest.getDescricao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Destino Salvo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Destino já cadastado");
        }
  
    conex.desconecta(); 
    }
    
    public  BeansDestinos Pesquisar (BeansDestinos modDest){
    
    conex.conexao();
    conex.executaSql("select *from tbl_destinos where descricao ilike'%"+ modDest.getDescricao()+"%'");
        try {
            conex.rs.first();
            modDest.setCodigo(conex.rs.getInt("id_destino"));
            modDest.setDescricao(conex.rs.getString("descricao"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }  
    conex.desconecta();
    return modDest;
    }
   
    public void Editar (BeansDestinos modDest){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_destinos set descricao=? where id_destino=?");
            pst.setString(1, modDest.getDescricao().toUpperCase());
            pst.setInt(2, modDest.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Destino já cadastado");
        }
    conex.desconecta(); 
    }
    
    public void Excluir(BeansDestinos modDest){
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_destinos where id_destino=? and descricao=?");
            pst.setString(2, modDest.getDescricao());
            pst.setInt(1, modDest.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }    
    conex.desconecta();
    
    }   
}

