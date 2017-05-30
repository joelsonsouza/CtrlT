/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Beans.BeansVeiculo;
import modeloConection.ConexaoBD;


public class DaoVeiculo {
    
    ConexaoBD conex = new ConexaoBD();
    BeansVeiculo mod = new BeansVeiculo();
    ConexaoBD conexModelo = new ConexaoBD();
    String descricaoModelo;
    int codModelo;
    
    
  public void Salvar (BeansVeiculo mod){
    SalvaIdModelo(mod.getModelo());
    conex.conexao();
    
    try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tbl_veiculo (placa, renavan, ano, anomodelo, cor, chassi, ativo, id_modelo) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getPlaca().toUpperCase());
            pst.setInt(2, mod.getRenavan());
            pst.setInt(3, mod.getAno());
            pst.setInt(4, mod.getAnoModelo());
            pst.setString(5, mod.getCor().toUpperCase());
            pst.setString(6, mod.getChassi().toUpperCase());
            pst.setBoolean(7, mod.isAtivar()); 
            pst.setInt(8, codModelo);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veículo já cadastrado");
        }
    conex.desconecta();
    }
    
  public  BeansVeiculo Pesquisar (BeansVeiculo mod){
    
    conex.conexao();
    conex.executaSql("select * from tbl_veiculo as a inner join tbl_modelo as b "
            + "on (a.id_modelo=b.id_modelo) where placa ilike'%"+ mod.getPlaca()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_veiculo"));
            mod.setPlaca(conex.rs.getString("placa"));
            mod.setAno(conex.rs.getInt("ano"));
            mod.setAnoModelo(conex.rs.getInt("anomodelo"));
            mod.setRenavan(conex.rs.getInt("renavan"));
            mod.setCor(conex.rs.getString("cor"));
            mod.setChassi(conex.rs.getString("chassi"));
            mod.setAtivar(conex.rs.getBoolean("ativo"));
            mod.setIdmodelo(conex.rs.getInt("id_modelo"));
            mod.setModelo(conex.rs.getString("descricao"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não encontrado\n");           
        }     
    conex.desconecta();
    return mod;
    }
     
  public void Editar (BeansVeiculo mod){
        SalvaIdModelo(mod.getModelo());
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update tbl_veiculo set placa=?, renavan=?, ano=?, anomodelo=?, cor=?, chassi=?, ativo=?, id_modelo=? where id_veiculo=?");
            pst.setString(1, mod.getPlaca().toUpperCase());
            pst.setInt(2, mod.getRenavan());
            pst.setInt(3, mod.getAno());
            pst.setInt(4, mod.getAnoModelo());
            pst.setString(5, mod.getCor().toUpperCase());
            pst.setString(6, mod.getChassi().toUpperCase());
            pst.setBoolean(7, mod.isAtivar());
            pst.setInt(8, codModelo);
            pst.setInt(9, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com Sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
        }    
    conex.desconecta();  
    }
    
  public void Excluir(BeansVeiculo mod){
    conex.conexao();

    try {
            PreparedStatement pst = conex.con.prepareStatement("delete from tbl_veiculo where id_veiculo=? and placa=? and ativo=false"); 
            
            pst.setInt(1, mod.getCodigo());
            pst.setString(2, mod.getPlaca());
            pst.execute();   
            JOptionPane.showMessageDialog(null, "Registro excluido com Sucesso");
            
        } catch (SQLException ex) {  
            JOptionPane.showMessageDialog(null, "Erro na alteração:\nErro:"+ex);
            JOptionPane.showMessageDialog(null, "Veiculo Ativo\n");
        }    
    conex.desconecta();
    }
    
  public void SalvaIdModelo(String descricao){
    
        conex.conexao();
        conex.executaSql("select *from tbl_modelo where descricao = '"+descricao+"'");
        try {
            conex.rs.first();
            codModelo=conex.rs.getInt("id_modelo");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Marca"+ex);
        }
        conex.desconecta();   
    }
    
  public void PesquisarModelo (int cod){
    
    conexModelo.conexao();
    
        try {
            conexModelo.executaSql("select *from tbl_modelo where id_modelo="+cod);
            conexModelo.rs.first();
            descricaoModelo = conexModelo.rs.getString("descricao");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Modelo"+ex);    
        }
    conexModelo.desconecta();   
}
    
  public BeansVeiculo PesquisarMarca(BeansVeiculo mod){
    
        conex.conexao();
        conex.executaSql("select a.descricaomarca as desc from tbl_marca as a inner join tbl_modelo as b\n" +
                         "on (a.id_marca = b.id_marca) where descricao ilike '%"+mod.getModelo()+"%' LIMIT 1");
        try {
            conex.rs.first();
            mod.setMarca(conex.rs.getString("desc"));    
    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Marca não encontrado\nErro:"+ex);
        }
        conex.desconecta();
        return mod;    
    }
}
