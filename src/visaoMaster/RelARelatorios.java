/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

/**
 *
 * @author Professor
 */
public class RelARelatorios extends javax.swing.JFrame {

    /**
     * Creates new form janelaPadrao
     */
    public RelARelatorios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jButtonRelRegPorMotorista = new javax.swing.JButton();
        jButtonRelRegPorSetor = new javax.swing.JButton();
        jButtonRelRegPorPlaca = new javax.swing.JButton();
        jButtonRelRegPorAtividade = new javax.swing.JButton();
        jLabelAluno = new javax.swing.JLabel();
        jLabelFaixaMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(0, 0, 45, 30);

        jButtonRelRegPorMotorista.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRelRegPorMotorista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelRegPorMotorista.setForeground(new java.awt.Color(255, 153, 0));
        jButtonRelRegPorMotorista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonRelRegPorMotorista.setText("REGISTROS POR MOTORISTA");
        jButtonRelRegPorMotorista.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelRegPorMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelRegPorMotoristaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelRegPorMotorista);
        jButtonRelRegPorMotorista.setBounds(220, 100, 250, 31);

        jButtonRelRegPorSetor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRelRegPorSetor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelRegPorSetor.setForeground(new java.awt.Color(255, 153, 0));
        jButtonRelRegPorSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonRelRegPorSetor.setText("REGISTROS POR SETOR");
        jButtonRelRegPorSetor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelRegPorSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelRegPorSetorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelRegPorSetor);
        jButtonRelRegPorSetor.setBounds(220, 140, 250, 31);

        jButtonRelRegPorPlaca.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRelRegPorPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelRegPorPlaca.setForeground(new java.awt.Color(255, 153, 0));
        jButtonRelRegPorPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonRelRegPorPlaca.setText("REGISTROS POR VEÍCULO");
        jButtonRelRegPorPlaca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelRegPorPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelRegPorPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelRegPorPlaca);
        jButtonRelRegPorPlaca.setBounds(220, 180, 250, 31);

        jButtonRelRegPorAtividade.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRelRegPorAtividade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelRegPorAtividade.setForeground(new java.awt.Color(255, 153, 0));
        jButtonRelRegPorAtividade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButtonRelRegPorAtividade.setText("REGISTROS POR ATIVIDADE");
        jButtonRelRegPorAtividade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonRelRegPorAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelRegPorAtividadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRelRegPorAtividade);
        jButtonRelRegPorAtividade.setBounds(220, 60, 250, 31);

        jLabelAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Aluno30p.png"))); // NOI18N
        getContentPane().add(jLabelAluno);
        jLabelAluno.setBounds(10, 30, 210, 370);

        jLabelFaixaMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        getContentPane().add(jLabelFaixaMenu);
        jLabelFaixaMenu.setBounds(0, 0, 500, 30);

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 30, 500, 280);

        setSize(new java.awt.Dimension(511, 298));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
    
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonRelRegPorPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelRegPorPlacaActionPerformed
       RelRegPorVeiculo rel = new RelRegPorVeiculo();
       rel.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButtonRelRegPorPlacaActionPerformed

    private void jButtonRelRegPorMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelRegPorMotoristaActionPerformed
        RelRegPorMotorista rel = new RelRegPorMotorista();
        rel.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonRelRegPorMotoristaActionPerformed

    private void jButtonRelRegPorAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelRegPorAtividadeActionPerformed
        RelRegPorAtividade rel = new RelRegPorAtividade();
        rel.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButtonRelRegPorAtividadeActionPerformed

    private void jButtonRelRegPorSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelRegPorSetorActionPerformed
        RelRegPorSetor rel = new RelRegPorSetor();
        rel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRelRegPorSetorActionPerformed

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
            java.util.logging.Logger.getLogger(RelARelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelARelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelARelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelARelatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelARelatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRelRegPorAtividade;
    private javax.swing.JButton jButtonRelRegPorMotorista;
    private javax.swing.JButton jButtonRelRegPorPlaca;
    private javax.swing.JButton jButtonRelRegPorSetor;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
