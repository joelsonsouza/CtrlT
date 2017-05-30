/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansRegistrarAtiv;
import modeloConection.ConexaoBD;
import visaoMaster.RelRegPorMotorista;


public class DaoRegistarAtiv {
    
    ConexaoBD conex = new ConexaoBD();
    BeansRegistrarAtiv mod = new BeansRegistrarAtiv(); 
    //ConexaoBD conexPlaca = new ConexaoBD();
    String descricaoPlaca;
    String marca;
    int codPlaca;
    int codMotorista;
    int codTipoAtividade;
    
    public void Salvar (BeansRegistrarAtiv mod){
        SalvaIdMotorista(mod.getNomemotorista());
        SalvaIdAtividade(mod.getAtividade());
        SalvaIdPlaca(mod.getPlaca());
        
        conex.conexao();
       
            try {
                            
            PreparedStatement pst = conex.con.prepareStatement
                ("insert into tbl_reg_ativ (id_motorista, id_tipoatividade, setoratendido, funcionario, kmsaida, kmchegada, id_veiculo, dtativ, hrsaida, hrchegada, destino, distancia)"
                + " values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
                     pst.setInt(1, codMotorista);
                     pst.setInt(2, codTipoAtividade);
                     pst.setString(3, mod.getSetoratendido());
                     pst.setString(4, mod.getFuncionario().toUpperCase());
                     pst.setInt(5, mod.getKmsaida());
                     pst.setInt(6, mod.getKmchegada());
                     pst.setDate(8, new java.sql.Date(mod.getDtativ().getTime()));
                     pst.setString(9, mod.getHrsaida());
                     pst.setString(10, mod.getHrchegada());
                     pst.setString(11, mod.getDestino());
                     pst.setInt(12, mod.getDistancia());
                     
                     conex.executaSql("select placa from tbl_veiculo  where ativo=true and placa ilike '%"+mod.getPlaca()+"%' limit 1");
                     try {
                         conex.rs.first();
                         pst.setInt(7, codPlaca);
                         
                         
                     } catch (SQLException ex) {
                         JOptionPane.showMessageDialog(null, "Veículo não encontrado");
                     }
                     
                     //mod.setPlaca(jTextFieldPlaca.getText());
                     pst.execute();
                    JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
 
            } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Campo(s) obrigatório(s) sem preenchimento:\nOu erro de Banco de dados:\n"+ex);
            }
        conex.desconecta();
    }
    
    public  BeansRegistrarAtiv Pesquisar (BeansRegistrarAtiv mod){
    
        conex.conexao();
        conex.executaSql("select a.placa, b.descricao, c.descricaomarca as desc from tbl_veiculo as a inner join tbl_modelo as b "
                + "on (a.id_modelo = b.id_modelo) inner join tbl_marca c "
                + "on (b.id_marca = c.id_marca) where ativo=true and placa ilike '%"+mod.getPlaca()+"%'");
        try {
            conex.rs.first();
            mod.setPlaca(conex.rs.getString("placa"));
            //condição para preenchimento dos campos 
            mod.setModelo(conex.rs.getString("descricao"));
            mod.setMarca(conex.rs.getString("desc"));

        } catch (SQLException ex) {          
            JOptionPane.showMessageDialog(null, "Veículo não encontrado"+ex);
        }
        conex.desconecta(); 
        return mod;     
    }
    
    public  BeansRegistrarAtiv PesquisarReg (BeansRegistrarAtiv mod){
    
        conex.conexao();
        
        
        conex.executaSql("select b.nomemotorista, a.id_regatividade as reg, a.destino, a.dtativ, a.distancia, c.descricao as desc,d.placa, a.setoratendido, a.hrsaida, a.hrsaida, a.hrchegada,  a.kmsaida, a.kmchegada, c.descricao as desc, a.funcionario, e.descricao, f.descricaomarca\n"
                        +"from tbl_reg_ativ as a inner join  tbl_motorista as b\n"
                        +"on (a.id_motorista = b.id_motorista) inner join tbl_tipoatividade as c\n"
                        +"on (a.id_tipoatividade = c.id_tipoatividade) inner join tbl_veiculo as d\n"
                        +"on (a.id_veiculo = d.id_veiculo) inner join tbl_modelo as e\n"
                        +"on (d.id_modelo = e.id_modelo) inner join tbl_marca as f\n"
                        +"on (e.id_marca = f.id_marca) where id_regatividade ="+mod.getCodigo());//apagar se não funcional where id_regatividade ="+mod.getCodigo()+"");
                    try {
                        conex.rs.first();
                        mod.setCodigo(conex.rs.getInt("reg")); //refazer para dados tbl_reg_atv
                        mod.setNomemotorista(conex.rs.getString("nomemotorista"));
                        mod.setDestino(conex.rs.getString("destino"));
                        mod.setAtividade(conex.rs.getString("desc"));
                        mod.setSetoratendido(conex.rs.getString("setoratendido"));
                        mod.setPlaca(conex.rs.getString("placa"));
                        mod.setFuncionario(conex.rs.getString("funcionario"));
                        mod.setKmsaida(conex.rs.getInt("kmsaida"));
                        mod.setKmchegada(conex.rs.getInt("kmchegada"));
                        mod.setDtativ(conex.rs.getDate("dtativ"));
                        mod.setHrsaida(conex.rs.getString("hrsaida"));
                        mod.setHrchegada(conex.rs.getString("hrchegada"));
                        mod.setPlaca(conex.rs.getString("placa"));
                        mod.setModelo(conex.rs.getString("descricao"));
                        mod.setMarca(conex.rs.getString("descricaomarca"));
                        mod.setDistancia(conex.rs.getInt("distancia"));


                    }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao selecionar dados");
                    }

                    conex.desconecta();
                    return mod;
    }
   
    public void Editar (BeansRegistrarAtiv mod){
        SalvaIdMotorista(mod.getNomemotorista());
        SalvaIdAtividade(mod.getAtividade());
        SalvaIdPlaca(mod.getPlaca());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement
            ("update tbl_reg_ativ set id_motorista=?,id_tipoatividade=?,setoratendido=?,"
                    + "funcionario=?,kmsaida=?,kmchegada=?,id_veiculo=?,dtativ=?,hrsaida=?,hrchegada=?, destino=?, distancia=? where id_regatividade=? ");

           

                     pst.setInt(1, codMotorista);
                     pst.setInt(2, codTipoAtividade);
                     pst.setString(3, mod.getSetoratendido());
                     pst.setString(4, mod.getFuncionario().toUpperCase());
                     pst.setInt(5, mod.getKmsaida());
                     pst.setInt(6, mod.getKmchegada());
                     pst.setInt(7, codPlaca);
                     pst.setDate(8, new java.sql.Date(mod.getDtativ().getTime()));
                     pst.setString(9, mod.getHrsaida());
                     pst.setString(10, mod.getHrchegada());
                     pst.setString(11, mod.getDestino());
                     pst.setInt(12, mod.getDistancia());
                     pst.setInt(13, mod.getCodigo());
                     
                     pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }   
    conex.desconecta();  
    }
    
    public void Excluir (BeansRegistrarAtiv mod){
    
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_reg_ativ as a where a.id_regatividade=?");
            
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Exclusão:\nErro:"+ex);
        }    
    conex.desconecta();
    }
    
    public void PesquisarPlaca (int cod){
    
    conex.conexao();
    
        try {
            conex.executaSql("select * from tbl_veiculo inner JOIN tbl_marca WHERE id_marca = id_marca where id_veiculo="+cod);
            conex.rs.first();
            descricaoPlaca = conex.rs.getString("placa");
            marca = conex.rs.getString("descricao");
            
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Veículo não encontrado"+ex);
            conex.desconecta();
        }
    }
    
    public void SalvaIdPlaca(String placa){
    
        conex.conexao();
        conex.executaSql("select * from tbl_veiculo where placa = '"+placa+"'");
        try {
            conex.rs.first();
            codPlaca=conex.rs.getInt("id_veiculo");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao salvar Veículo\nErro:"+ex);
        }
        conex.desconecta();
    }
    
    public void SalvaIdMotorista(String nomemotorista){
    
        conex.conexao();
        conex.executaSql("select * from tbl_motorista where nomemotorista = '"+nomemotorista+"'");
        try {
            conex.rs.first();
            codMotorista=conex.rs.getInt("id_motorista");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Motorista\nErro:"+ex);
        }
        conex.desconecta();
    }
    
    public void SalvaIdAtividade(String descricao){
    
        conex.conexao();
        conex.executaSql("select *from tbl_tipoatividade where descricao = '"+descricao+"'");
        try {
            conex.rs.first();
            codTipoAtividade=conex.rs.getInt("id_tipoatividade");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar Atividade\nErro:"+ex);
        }
        conex.desconecta();
    }
    
    public BeansRegistrarAtiv PesquisarMotorista (BeansRegistrarAtiv mod){
    
    conex.conexao();
    
        try {
            
            conex.executaSql("select nomemotorista from tbl_motorista where nomemotorista like'%"+ mod.getNomemotorista()+"%'");
            conex.rs.first();
            mod.setNomemotorista(conex.rs.getString("nomemotorista"));
                        
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Atividade não encontrada"+ex);
            
        }
        conex.desconecta();
        return mod;
    }
    
    public BeansRegistrarAtiv PesquisarPlaca (BeansRegistrarAtiv mod){

     conex.conexao();

         try {

             conex.executaSql("select placa from tbl_veiculo where placa like'%"+ mod.getPlaca()+"%'");
             conex.rs.first();
             mod.setPlaca(conex.rs.getString("placa"));


         } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null, "Atividade não encontrada");

         }
         conex.desconecta();
         return mod;
     }

    public BeansRegistrarAtiv PesquisarAtividade (BeansRegistrarAtiv mod){

     conex.conexao();

         try {

             conex.executaSql("select descricao from tbl_tipoatividade where descricao like'%"+ mod.getAtividade()+"%'");
             conex.rs.first();
             mod.setPlaca(conex.rs.getString("descricao"));


         } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null, "Atividade não encontrada");

         }
         conex.desconecta();
         return mod;
     }

    public BeansRegistrarAtiv PesquisarSetor (BeansRegistrarAtiv mod){
    
    conex.conexao();
    
        try {
            
            conex.executaSql("select setoratendido from tbl_reg_ativ where setoratendido ilike'%"+mod.getSetoratendido()+"%'");
            conex.rs.first();
            mod.setSetoratendido(conex.rs.getString("setoratendido"));
                        
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Atividade não encontrada\n");
            
        }
        conex.desconecta();
        return mod;
    }
}


