/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansLogin;
import modeloConection.ConexaoBD;

/**
 *
 * @author joels
 */
public class DaoMenuPrincipal {
    ConexaoBD conex = new ConexaoBD();
    BeansLogin mod = new BeansLogin();
    
    
     public BeansLogin PesquisarUsuario(BeansLogin mod){
    
        conex.conexao();
        conex.executaSql("select a.usuario as user, a.nome from tbl_usuarios as a inner join tbl_acessos as b\n" +
                         "on (a.id_usuario = b.id_usuario) where usuario ilike '%"+mod.getUsuario()+"%' LIMIT 1");
        try {
            conex.rs.first();
            mod.setUsuario(conex.rs.getString("user"));    
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado\nErro:"+ex);
        }
        conex.desconecta();
        return mod;    
    }
    
    
    
    
    
}
