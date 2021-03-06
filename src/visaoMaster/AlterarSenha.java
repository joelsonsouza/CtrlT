/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

import Beans.BeansCadUsuarios;
import Beans.BeansLogin;
import modeloConection.ConexaoBD;
import modeloDao.DaoCadUsuarios;

/**
 *
 * @author Professor
 */
public class AlterarSenha extends javax.swing.JFrame {

    BeansCadUsuarios mod = new BeansCadUsuarios();
    DaoCadUsuarios control = new DaoCadUsuarios();
    ConexaoBD conex = new ConexaoBD();
    /**
     * Creates new form janelaPadrao
     */
    public AlterarSenha(String usuario) {
        initComponents();
        jTextFieldUser.setText(usuario);
        mod.setLogin(jTextFieldUser.getText());
            BeansCadUsuarios model = control.Pesquisar(mod);
            jTextFieldNomeUser.setText("-"+model.getNome());
            
            jLabelConfNew.setVisible(false);
            jLabelNewObg.setVisible(false);
            jLabelAntObg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldConfirmaNova = new javax.swing.JPasswordField();
        jPasswordFieldAntiga = new javax.swing.JPasswordField();
        jPasswordFieldNova = new javax.swing.JPasswordField();
        jLabelAntObg = new javax.swing.JLabel();
        jLabelNewObg = new javax.swing.JLabel();
        jLabelConfNew = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jTextFieldNomeUser = new javax.swing.JTextField();
        jButtonEditar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFaixaMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Login/Usuário:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 40, 90, 25);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Senha Nova:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 80, 25);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Confirmar Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 130, 110, 25);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha Antiga:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 70, 90, 25);
        getContentPane().add(jPasswordFieldConfirmaNova);
        jPasswordFieldConfirmaNova.setBounds(110, 130, 150, 25);
        getContentPane().add(jPasswordFieldAntiga);
        jPasswordFieldAntiga.setBounds(110, 70, 150, 25);
        getContentPane().add(jPasswordFieldNova);
        jPasswordFieldNova.setBounds(110, 100, 150, 25);

        jLabelAntObg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelAntObg.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAntObg.setText("*");
        getContentPane().add(jLabelAntObg);
        jLabelAntObg.setBounds(20, 70, 20, 20);

        jLabelNewObg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelNewObg.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNewObg.setText("*");
        getContentPane().add(jLabelNewObg);
        jLabelNewObg.setBounds(30, 100, 10, 20);

        jLabelConfNew.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelConfNew.setForeground(new java.awt.Color(255, 0, 0));
        jLabelConfNew.setText("*");
        getContentPane().add(jLabelConfNew);
        jLabelConfNew.setBounds(10, 130, 10, 20);

        jTextFieldUser.setEditable(false);
        jTextFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(255, 102, 51));
        jTextFieldUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUser.setBorder(null);
        getContentPane().add(jTextFieldUser);
        jTextFieldUser.setBounds(110, 40, 60, 20);

        jTextFieldNomeUser.setEditable(false);
        jTextFieldNomeUser.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldNomeUser.setForeground(new java.awt.Color(255, 102, 51));
        jTextFieldNomeUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNomeUser.setBorder(null);
        getContentPane().add(jTextFieldNomeUser);
        jTextFieldNomeUser.setBounds(170, 40, 140, 20);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/salvar.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(10, 0, 45, 30);

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
        jButtonLimpar.setBounds(60, 0, 45, 30);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(110, 0, 45, 30);

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

        setSize(new java.awt.Dimension(334, 228));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
    
        dispose(); 
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
   
    }//GEN-LAST:event_jButtonLimparMouseClicked

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        jPasswordFieldAntiga.setText("");
        jPasswordFieldNova.setText("");
        jPasswordFieldConfirmaNova.setText("");
        
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
           if(jPasswordFieldConfirmaNova.getText().isEmpty() || jPasswordFieldNova.getText().isEmpty() ||  jPasswordFieldAntiga.getText().isEmpty()) { 
            
            if(jPasswordFieldConfirmaNova.getText().isEmpty()) { 
            jLabelConfNew.setVisible(true);
            jPasswordFieldConfirmaNova.requestFocus();  
            
            }else{
            jLabelConfNew.setVisible(false);
            }
            if(jPasswordFieldNova.getText().isEmpty()) { 
            jLabelNewObg.setVisible(true);
            
            jPasswordFieldNova.requestFocus(); 
            }else{
            jLabelNewObg.setVisible(false);
            }
            
            if(jPasswordFieldAntiga.getText().isEmpty()){ 
            jLabelAntObg.setVisible(true);
            
            jPasswordFieldAntiga.requestFocus();  
            }else{
            jLabelAntObg.setVisible(false);
            }
            
                    
        }else{
            mod.setLogin(jTextFieldUser.getText());
            mod.setSenha(jPasswordFieldConfirmaNova.getText());
            control.EditarMP(mod);
            jPasswordFieldAntiga.setText("");
            jPasswordFieldNova.setText("");
            jPasswordFieldConfirmaNova.setText("");
  
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPadrao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAntObg;
    private javax.swing.JLabel jLabelConfNew;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelNewObg;
    private javax.swing.JPasswordField jPasswordFieldAntiga;
    private javax.swing.JPasswordField jPasswordFieldConfirmaNova;
    private javax.swing.JPasswordField jPasswordFieldNova;
    private javax.swing.JTextField jTextFieldNomeUser;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
