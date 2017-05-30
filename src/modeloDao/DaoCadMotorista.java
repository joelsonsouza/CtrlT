/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansCadMotorista;
import modeloConection.ConexaoBD;


public class DaoCadMotorista {
    
    ConexaoBD conex = new ConexaoBD();
    BeansCadMotorista mod = new BeansCadMotorista();
    
    public void Salvar (BeansCadMotorista mod){
    
        conex.conexao();
        
            try {
            PreparedStatement pst = conex.con.prepareStatement
            ("insert into tbl_motorista (nomemotorista,sexo,haba,habb,habc,habd,habe,"
                                        + "regprofissional,matricula,vinculo,tipovinculo,"
                                        + "cep,logradouro,numero,complemento,bairro,telefone,"
                                        + "celular,escolaridade,dtnasc,dtent,status)"
                                        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomemotorista().toUpperCase());
            pst.setString(2, mod.getSexo());
            pst.setBoolean(3, mod.isHaba());
            pst.setBoolean(4, mod.isHabb());
            pst.setBoolean(5, mod.isHabc());
            pst.setBoolean(6, mod.isHabd());
            pst.setBoolean(7, mod.isHabe());
            pst.setInt(8, mod.getRegprofissional());
            pst.setInt(9, mod.getMatricula());
            pst.setInt(10, mod.getVinculo());
            pst.setString(11, mod.getTipovinculo());
            pst.setString(12, mod.getCep());
            pst.setString(13, mod.getLogradouro().toUpperCase());
            pst.setInt(14, mod.getNumero());
            pst.setString(15, mod.getComplemento().toUpperCase());
            pst.setString(16, mod.getBairro().toUpperCase());
            pst.setString(17, mod.getTelefone());
            pst.setString(18, mod.getCelular());
            pst.setString(19, mod.getEscolaridade());
            pst.setDate(20, new java.sql.Date(mod.getDtnasc().getTime()));
            pst.setDate(21, new java.sql.Date(mod.getDtent().getTime()));
          //pst.setDate(22, new java.sql.Date(mod.getDtsai().getTime()));
            pst.setBoolean(22, mod.isStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Motorista já cadastrado");
        }
        conex.desconecta();
    }
    
    public BeansCadMotorista Pesquisar (BeansCadMotorista mod){
    
        conex.conexao();
        conex.executaSql("select *from tbl_motorista where nomemotorista ilike'%"+mod.getPesquisar()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_motorista"));
            mod.setNomemotorista(conex.rs.getString("nomemotorista"));
            mod.setSexo(conex.rs.getString("sexo"));
            mod.setEscolaridade(conex.rs.getString("escolaridade"));
            mod.setHaba(conex.rs.getBoolean("haba"));
            mod.setHabb(conex.rs.getBoolean("habb"));
            mod.setHabc(conex.rs.getBoolean("habc"));
            mod.setHabd(conex.rs.getBoolean("habd"));
            mod.setHabe(conex.rs.getBoolean("habe"));
            mod.setRegprofissional(conex.rs.getInt("regprofissional"));
            mod.setMatricula(conex.rs.getInt("matricula"));
            mod.setVinculo(conex.rs.getInt("vinculo"));
            mod.setTipovinculo(conex.rs.getString("tipovinculo"));
            mod.setCep(conex.rs.getString("cep"));
            mod.setLogradouro(conex.rs.getString("logradouro"));
            mod.setNumero(conex.rs.getInt("numero"));
            mod.setComplemento(conex.rs.getString("complemento"));
            mod.setBairro(conex.rs.getString("bairro"));
            mod.setCelular(conex.rs.getString("celular"));
            mod.setTelefone(conex.rs.getString("telefone"));
            mod.setDtnasc(conex.rs.getDate("dtnasc"));
            mod.setDtent(conex.rs.getDate("dtent"));
            mod.setDtsai(conex.rs.getDate("dtsai"));
            mod.setStatus(conex.rs.getBoolean("status"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado");
        }
        
        conex.desconecta();
        return mod;
    }
   
    public void Editar (BeansCadMotorista mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
            ("update tbl_motorista set nomemotorista=?,sexo=?,haba=?,habb=?,habc=?,habd=?,habe=?,"
                                        + "regprofissional=?,matricula=?,vinculo=?,tipovinculo=?,"
                                        + "cep=?,logradouro=?,numero=?,complemento=?,bairro=?,telefone=?,"
                                        + "celular=?,escolaridade=?,dtnasc=?,dtent=?, dtsai=?,status=? where id_motorista=?");
            pst.setString(1, mod.getNomemotorista().toUpperCase());
            pst.setString(2, mod.getSexo());
            pst.setBoolean(3, mod.isHaba());
            pst.setBoolean(4, mod.isHabb());
            pst.setBoolean(5, mod.isHabc());
            pst.setBoolean(6, mod.isHabd());
            pst.setBoolean(7, mod.isHabe());
            pst.setInt(8, mod.getRegprofissional());
            pst.setInt(9, mod.getMatricula());
            pst.setInt(10, mod.getVinculo());
            pst.setString(11, mod.getTipovinculo());
            pst.setString(12, mod.getCep());
            pst.setString(13, mod.getLogradouro().toUpperCase());
            pst.setInt(14, mod.getNumero());
            pst.setString(15, mod.getComplemento().toUpperCase());
            pst.setString(16, mod.getBairro().toUpperCase());
            pst.setString(17, mod.getTelefone());
            pst.setString(18, mod.getCelular());
            pst.setString(19, mod.getEscolaridade());
            pst.setDate(20, new java.sql.Date(mod.getDtnasc().getTime()));
            pst.setDate(21, new java.sql.Date(mod.getDtent().getTime()));
            pst.setDate(22, new java.sql.Date(mod.getDtsai().getTime()));
            pst.setBoolean(23, mod.isStatus());
            pst.setInt(24, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }
    
    conex.desconecta();
    }
    
    public void Excluir (BeansCadMotorista mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_motorista where id_motorista=? and nomemotorista=? and status=false");
            
            pst.setString(2, mod.getNomemotorista());
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\n"
            + "O para Exclusão o funcionário não pode estar Trabalhando\nErro:"+ex);   
        }       
    conex.desconecta();
    }
    
}


