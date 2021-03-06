/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Beans.BeansModelo;
import Beans.BeansTabelas;
import modeloConection.ConexaoBD;
import modeloDao.DaoModelo;
import controller.UpperCase;

/**
 *
 * @author Professor
 */
public class TbModelo extends javax.swing.JFrame {
    
    ConexaoBD conex = new ConexaoBD();
    BeansModelo mod = new BeansModelo();
    DaoModelo control = new DaoModelo();
    int flag;
    
    
    public TbModelo() {
        initComponents();
        CbMarca();
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonImprimir.setEnabled(false);
        jLabelDescObgtModelo.setVisible(false);
        jTextFieldDescricao.setDocument(new UpperCase());
         jInternalFrameBuscaModelo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBuscaModelo = new javax.swing.JInternalFrame();
        jScrollPaneModelo = new javax.swing.JScrollPane();
        jTableModelo = new javax.swing.JTable();
        jButtonSairIF = new javax.swing.JButton();
        jButtonPesquisarIF = new javax.swing.JButton();
        jLabelFaixaMenu1 = new javax.swing.JLabel();
        JlabelFundoMenuIF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jComboBoxMarca = new javax.swing.JComboBox();
        jLabelDescObgtModelo = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFaixaMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modelo");
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBuscaModelo.setTitle("Selecionar Modelo");
        jInternalFrameBuscaModelo.setVisible(true);
        jInternalFrameBuscaModelo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableModelo.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTableModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableModelo.setGridColor(new java.awt.Color(255, 255, 255));
        jTableModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableModeloMouseClicked(evt);
            }
        });
        jScrollPaneModelo.setViewportView(jTableModelo);

        jInternalFrameBuscaModelo.getContentPane().add(jScrollPaneModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 410, 130));

        jButtonSairIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSairIF.setToolTipText("Sair");
        jButtonSairIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairIFActionPerformed(evt);
            }
        });
        jInternalFrameBuscaModelo.getContentPane().add(jButtonSairIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 45, 30));

        jButtonPesquisarIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/pesquisar.png"))); // NOI18N
        jButtonPesquisarIF.setToolTipText("Buscar");
        jButtonPesquisarIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarIFActionPerformed(evt);
            }
        });
        jInternalFrameBuscaModelo.getContentPane().add(jButtonPesquisarIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 45, 30));

        jLabelFaixaMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu1.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        jInternalFrameBuscaModelo.getContentPane().add(jLabelFaixaMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        JlabelFundoMenuIF.setBackground(new java.awt.Color(255, 255, 255));
        JlabelFundoMenuIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        JlabelFundoMenuIF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jInternalFrameBuscaModelo.getContentPane().add(JlabelFundoMenuIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 420, 180));

        getContentPane().add(jInternalFrameBuscaModelo);
        jInternalFrameBuscaModelo.setBounds(40, 0, 430, 190);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Modelo:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 50, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Marca:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 50, 30);

        jTextFieldDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldDescricao);
        jTextFieldDescricao.setBounds(90, 130, 240, 30);

        jLabelCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCod.setText("Código:");
        getContentPane().add(jLabelCod);
        jLabelCod.setBounds(30, 40, 50, 30);

        jTextFieldCod.setEditable(false);
        jTextFieldCod.setEnabled(false);
        jTextFieldCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCod);
        jTextFieldCod.setBounds(90, 40, 60, 30);

        jComboBoxMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMarca);
        jComboBoxMarca.setBounds(90, 80, 240, 30);

        jLabelDescObgtModelo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDescObgtModelo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDescObgtModelo.setText("Obrigatório");
        getContentPane().add(jLabelDescObgtModelo);
        jLabelDescObgtModelo.setBounds(330, 130, 70, 30);

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/incluir.png"))); // NOI18N
        jButtonIncluir.setToolTipText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIncluir);
        jButtonIncluir.setBounds(10, 0, 45, 30);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/salvar.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(60, 0, 45, 30);

        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/apagar.png"))); // NOI18N
        jButtonApagar.setToolTipText("Deletar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagar);
        jButtonApagar.setBounds(110, 0, 45, 30);

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/limpar.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimparMouseClicked(evt);
            }
        });
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpar);
        jButtonLimpar.setBounds(160, 0, 45, 30);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Buscar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(210, 0, 45, 30);

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir");
        getContentPane().add(jButtonImprimir);
        jButtonImprimir.setBounds(260, 0, 45, 30);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(310, 0, 45, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("* Campos de preenchimento obrigatório.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 170, 220, 14);

        jLabelFaixaMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        getContentPane().add(jLabelFaixaMenu);
        jLabelFaixaMenu.setBounds(0, 0, 500, 30);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 30, 500, 180);

        setSize(new java.awt.Dimension(508, 238));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void CbMarca(){
    
        conex.conexao();
        conex.executaSql("select *from tbl_marca order by descricaomarca");
        try{
            conex.rs.first();
            jComboBoxMarca.removeAllItems();
            do{
                jComboBoxMarca.addItem(conex.rs.getString("descricaomarca"));
            }while(conex.rs.next());
        
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preecher dados");
        }     
        conex.desconecta();       
    }  
    
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        TbATabelasAuxiliares selecTab = new TbATabelasAuxiliares();
        selecTab.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
        jTextFieldDescricao.setText("");
        jTextFieldCod.setText("");
        jLabelDescObgtModelo.setVisible(false);
        jButtonIncluir.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
      
      if(jTextFieldDescricao.getText().isEmpty()) { 
          jLabelDescObgtModelo.setVisible(true);
          JOptionPane.showMessageDialog(null, "Campo Obrigatório");
          jTextFieldDescricao.requestFocus();  
          
      }else{
        mod.setMarca((String) jComboBoxMarca.getSelectedItem());
        mod.setDescricao(jTextFieldDescricao.getText());
        jLabelDescObgtModelo.setVisible(false);
        control.Salvar(mod);
        
        BeansModelo model = control.Pesquisar(mod);
        jTextFieldCod.setText(String.valueOf(mod.getCodigo()));
        
        
               
        jButtonApagar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonIncluir.setEnabled(false);
        }   
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jTextFieldCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodActionPerformed
        
    }//GEN-LAST:event_jTextFieldCodActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
     
        if (jTextFieldDescricao.getText().length() > 0) {
        mod.setMarca((String) jComboBoxMarca.getSelectedItem());
        mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
        mod.setDescricao(jTextFieldDescricao.getText());
        control.Editar(mod);
        jLabelDescObgtModelo.setVisible(false);
        }else {
                jLabelDescObgtModelo.setVisible(true);
                JOptionPane.showMessageDialog(null, "Campo Obrigatório");
                jTextFieldDescricao.requestFocus();
            }         
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
       if(flag==1){
        mod.setDescricao(jTextFieldDescricao.getText()); 
        JOptionPane.showMessageDialog(null, "Excluir Registro?");
        control.Excluir(mod);
        jButtonEditar.setEnabled(false);
        jButtonApagar.setEnabled(false);
        jButtonIncluir.setEnabled(true);
        jTextFieldDescricao.setText("");
        jTextFieldCod.setText("");
        }else{
            int Confirm = JOptionPane.showConfirmDialog(null,"Excluir registro?"," Excluir", JOptionPane.YES_NO_OPTION);
            if (Confirm == JOptionPane.YES_OPTION) {
            mod.setCodigo(Integer.parseInt(jTextFieldCod.getText()));
            mod.setDescricao(jTextFieldDescricao.getText());
            control.Excluir(mod); 
                jButtonEditar.setEnabled(false);
                jButtonApagar.setEnabled(false);
                jButtonIncluir.setEnabled(true);
            }else if (Confirm == JOptionPane.NO_OPTION){
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        PreencherTabelaIF("select a.id_modelo, a.descricao, b.descricaomarca from tbl_modelo as a inner join tbl_marca as b on(a.id_marca = b.id_marca) order by a.descricao");
        
        jInternalFrameBuscaModelo.setVisible(true);
       
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
        
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jTableModeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableModeloMouseClicked
        String descricao = ""+jTableModelo.getValueAt(jTableModelo.getSelectedRow(), 1);
        
            conex.executaSql("select a.id_modelo, a.descricao, b.descricaomarca from tbl_modelo as a inner join tbl_marca as b on(a.id_marca = b.id_marca) where descricao ilike '%"+descricao+"%' order by a.descricao ");
            try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("id_modelo"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setMarca(conex.rs.getString("descricaomarca"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veículo não encontrado"+ex);
        }

        jTextFieldCod.setText(String.valueOf(mod.getCodigo()));
        jTextFieldDescricao.setText(mod.getDescricao());
        jComboBoxMarca.setSelectedItem(mod.getMarca());
        

        jInternalFrameBuscaModelo.dispose();
        jButtonApagar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonIncluir.setEnabled(false);
    }//GEN-LAST:event_jTableModeloMouseClicked

    private void jButtonSairIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairIFActionPerformed
        jInternalFrameBuscaModelo.dispose();
    }//GEN-LAST:event_jButtonSairIFActionPerformed

    private void jButtonPesquisarIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarIFActionPerformed
        PreencherTabelaIF("select a.id_modelo, a.descricao, b.descricaomarca from tbl_modelo as a inner join tbl_marca as b on(a.id_marca = b.id_marca) order by a.descricao");
    }//GEN-LAST:event_jButtonPesquisarIFActionPerformed

    public void PreencherTabelaIF(String SQL){
      ArrayList dados = new ArrayList();
      String[] colunas = new String[]{"COD","MODELO","MARCA"};
      
      conex.conexao();
      conex.executaSql(SQL);

      try{
          conex.rs.first();       
          do{
              dados.add(new Object[]{conex.rs.getInt("id_modelo"),
                                     conex.rs.getString("descricao"),
                                     conex.rs.getString("descricaomarca")
                                   
                                    });
 
          }while(conex.rs.next());
      
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro ao preencher ArrayList\nErro:"+ex);
        }
          
     BeansTabelas modelo = new BeansTabelas(dados, colunas);
      
     jTableModelo.setModel(modelo);
     jTableModelo.getColumnModel().getColumn(0).setPreferredWidth(45);
     jTableModelo.getColumnModel().getColumn(0).setResizable(true);
     jTableModelo.getColumnModel().getColumn(0).setHeaderValue("COD");
     jTableModelo.getColumnModel().getColumn(1).setPreferredWidth(171);
     jTableModelo.getColumnModel().getColumn(1).setResizable(true); //não redimensionaveL
     jTableModelo.getColumnModel().getColumn(1).setHeaderValue("MODELO");
     jTableModelo.getColumnModel().getColumn(2).setPreferredWidth(171);
     jTableModelo.getColumnModel().getColumn(2).setResizable(true); //não redimensionaveL
     jTableModelo.getColumnModel().getColumn(2).setHeaderValue("MARCA");
           

     jTableModelo.getTableHeader().setReorderingAllowed(false); //não reordenavel
     jTableModelo.setAutoResizeMode(jTableModelo.AUTO_RESIZE_OFF); //não redmencionar
     jTableModelo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selicioar um dado por vez
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPadrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelFundoMenuIF;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPesquisarIF;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSairIF;
    private javax.swing.JComboBox jComboBoxMarca;
    private javax.swing.JInternalFrame jInternalFrameBuscaModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelDescObgtModelo;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFaixaMenu1;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JScrollPane jScrollPaneModelo;
    private javax.swing.JTable jTableModelo;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}
