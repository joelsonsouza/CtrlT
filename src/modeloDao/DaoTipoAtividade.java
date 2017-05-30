/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansTipoAtividade;


public class DaoTipoAtividade {
    ConexaoBD conex = new ConexaoBD();
    BeansTipoAtividade mod = new BeansTipoAtividade();
    
    
    public void Salvar(BeansTipoAtividade mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_tipoatividade (descricao) values(?)");
            pst.setString(1, mod.getDescricao().toUpperCase());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo de atividade já cadastrado");
        } 
    conex.desconecta();
    }
    
    public void Editar(BeansTipoAtividade mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_tipoatividade set descricao=? where id_tipoatividade=?");
            pst.setString(1, mod.getDescricao().toUpperCase());
            pst.setInt(2, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    
    conex.desconecta();
 
    }
     
    public BeansTipoAtividade Pesquisar (BeansTipoAtividade mod){
    
    conex.conexao();
    conex.executaSql("select *from tbl_tipoatividade where descricao ilike'%"+ mod.getDescricao()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_tipoatividade"));
            mod.setDescricao(conex.rs.getString("descricao"));
  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }     
    conex.desconecta();
    return mod;
    }
    
    public void Excluir (BeansTipoAtividade mod){
    
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_tipoatividade where id_tipoatividade=? and descricao=?");
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

