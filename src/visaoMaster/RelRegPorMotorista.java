/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visaoMaster;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import Beans.BeansRegistrarAtiv;
import Beans.BeansTabelas;
import Beans.BeansVeiculo;
import modeloConection.ConexaoBD;
import modeloDao.DaoRegistarAtiv;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Professor
 */
public class RelRegPorMotorista extends javax.swing.JFrame {
    ConexaoBD conex = new ConexaoBD();
    DaoRegistarAtiv control = new DaoRegistarAtiv();
    BeansRegistrarAtiv mod = new BeansRegistrarAtiv();
    /**
     * Creates new form janelaPadrao
     */
    public RelRegPorMotorista() {
        initComponents();
        CbMotorista();
        jInternalFrameAtvPorMotor.setVisible(false);
    }
    
    
    
    public void CbMotorista(){
    
        conex.conexao();
        conex.executaSql("select *from tbl_motorista order by nomemotorista");
        try{
            conex.rs.first();
            jComboBoxMotorista.removeAllItems();
            do{
                jComboBoxMotorista.addItem(conex.rs.getString("nomemotorista").toUpperCase());
            }while(conex.rs.next());
        
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Registre os motoristas da empresa no menu Cadastro de Motorista");
            //RegistrarAtiv.this.dispose();
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameAtvPorMotor = new javax.swing.JInternalFrame();
        jScrollPaneBmotorista = new javax.swing.JScrollPane();
        jTableBmotorista = new javax.swing.JTable();
        jLabelRegSelecionado = new javax.swing.JLabel();
        jTextFieldRegSelecionado = new javax.swing.JTextField();
        jButtonSairIF = new javax.swing.JButton();
        jButtonImprimir1 = new javax.swing.JButton();
        jLabelFaixaMenu1 = new javax.swing.JLabel();
        JlabelFundoMenuIF = new javax.swing.JLabel();
        jLabelAtividade = new javax.swing.JLabel();
        jLabelSetorAtendido = new javax.swing.JLabel();
        jTextFieldSetorAt = new javax.swing.JTextField();
        jTextFieldAtividade = new javax.swing.JTextField();
        jLabelFuncionario = new javax.swing.JLabel();
        jTextFieldFuncionario = new javax.swing.JTextField();
        jLabelDestino = new javax.swing.JLabel();
        jTextFieldDestino = new javax.swing.JTextField();
        jLabelaData = new javax.swing.JLabel();
        jDateChooserdtativ = new com.toedter.calendar.JDateChooser();
        jLabelHrS = new javax.swing.JLabel();
        jFormattedTextFieldHrS = new javax.swing.JFormattedTextField();
        jLabelKmS = new javax.swing.JLabel();
        jTextFieldKmS = new javax.swing.JTextField();
        jLabelHrC = new javax.swing.JLabel();
        jFormattedTextFieldHrC = new javax.swing.JFormattedTextField();
        jLabelKmC = new javax.swing.JLabel();
        jTextFieldKmC = new javax.swing.JTextField();
        jLabelDistancia = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelMotorista = new javax.swing.JLabel();
        jComboBoxMotorista = new javax.swing.JComboBox();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonImprimir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFaixaMenu = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atividades por Motorista");
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameAtvPorMotor.setTitle("Atividades por Motorista");
        jInternalFrameAtvPorMotor.setVisible(true);
        jInternalFrameAtvPorMotor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableBmotorista.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jTableBmotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableBmotorista.setGridColor(new java.awt.Color(255, 255, 255));
        jTableBmotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBmotoristaMouseClicked(evt);
            }
        });
        jScrollPaneBmotorista.setViewportView(jTableBmotorista);

        jInternalFrameAtvPorMotor.getContentPane().add(jScrollPaneBmotorista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 460, 260));

        jLabelRegSelecionado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelRegSelecionado.setForeground(new java.awt.Color(255, 102, 51));
        jLabelRegSelecionado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelRegSelecionado.setText("MOTORISTA:");
        jInternalFrameAtvPorMotor.getContentPane().add(jLabelRegSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 20));

        jTextFieldRegSelecionado.setEditable(false);
        jTextFieldRegSelecionado.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldRegSelecionado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextFieldRegSelecionado.setForeground(new java.awt.Color(255, 102, 51));
        jTextFieldRegSelecionado.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldRegSelecionado.setBorder(null);
        jInternalFrameAtvPorMotor.getContentPane().add(jTextFieldRegSelecionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 150, 20));

        jButtonSairIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/sair.png"))); // NOI18N
        jButtonSairIF.setToolTipText("Sair");
        jButtonSairIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairIFActionPerformed(evt);
            }
        });
        jInternalFrameAtvPorMotor.getContentPane().add(jButtonSairIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 45, 30));

        jButtonImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/imprimir.png"))); // NOI18N
        jButtonImprimir1.setToolTipText("Imprimir");
        jButtonImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimir1ActionPerformed(evt);
            }
        });
        jInternalFrameAtvPorMotor.getContentPane().add(jButtonImprimir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 30));

        jLabelFaixaMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu1.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_FaixaInferior.png"))); // NOI18N
        jInternalFrameAtvPorMotor.getContentPane().add(jLabelFaixaMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, 0, 910, 60));

        JlabelFundoMenuIF.setBackground(new java.awt.Color(255, 255, 255));
        JlabelFundoMenuIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        JlabelFundoMenuIF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jInternalFrameAtvPorMotor.getContentPane().add(JlabelFundoMenuIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 460, 310));

        getContentPane().add(jInternalFrameAtvPorMotor);
        jInternalFrameAtvPorMotor.setBounds(20, 20, 470, 320);

        jLabelAtividade.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelAtividade.setText("Atividade:");
        getContentPane().add(jLabelAtividade);
        jLabelAtividade.setBounds(40, 110, 60, 25);

        jLabelSetorAtendido.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelSetorAtendido.setText("Setor Atendido:");
        getContentPane().add(jLabelSetorAtendido);
        jLabelSetorAtendido.setBounds(10, 140, 90, 25);

        jTextFieldSetorAt.setEditable(false);
        jTextFieldSetorAt.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSetorAt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldSetorAt);
        jTextFieldSetorAt.setBounds(100, 140, 290, 25);

        jTextFieldAtividade.setEditable(false);
        jTextFieldAtividade.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldAtividade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldAtividade);
        jTextFieldAtividade.setBounds(100, 110, 290, 25);

        jLabelFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelFuncionario.setText("Funcionário:");
        getContentPane().add(jLabelFuncionario);
        jLabelFuncionario.setBounds(30, 170, 70, 25);

        jTextFieldFuncionario.setEditable(false);
        jTextFieldFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldFuncionario);
        jTextFieldFuncionario.setBounds(100, 170, 290, 25);

        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelDestino.setText("Destino:");
        getContentPane().add(jLabelDestino);
        jLabelDestino.setBounds(30, 200, 70, 25);

        jTextFieldDestino.setEditable(false);
        jTextFieldDestino.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDestino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jTextFieldDestino);
        jTextFieldDestino.setBounds(100, 200, 290, 25);

        jLabelaData.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelaData.setText("Data:");
        getContentPane().add(jLabelaData);
        jLabelaData.setBounds(60, 230, 40, 25);

        jDateChooserdtativ.setEnabled(false);
        jDateChooserdtativ.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jDateChooserdtativ.setMaxSelectableDate(new java.util.Date(253370779288000L));
        getContentPane().add(jDateChooserdtativ);
        jDateChooserdtativ.setBounds(100, 230, 150, 25);

        jLabelHrS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelHrS.setText("Hr. de Saída:");
        getContentPane().add(jLabelHrS);
        jLabelHrS.setBounds(20, 260, 80, 25);

        jFormattedTextFieldHrS.setEditable(false);
        jFormattedTextFieldHrS.setBackground(new java.awt.Color(204, 204, 204));
        try {
            jFormattedTextFieldHrS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHrS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldHrS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextFieldHrS);
        jFormattedTextFieldHrS.setBounds(100, 260, 60, 25);

        jLabelKmS.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelKmS.setText("Km. de Saída:");
        getContentPane().add(jLabelKmS);
        jLabelKmS.setBounds(180, 260, 90, 25);

        jTextFieldKmS.setEditable(false);
        jTextFieldKmS.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldKmS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKmS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKmSActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldKmS);
        jTextFieldKmS.setBounds(270, 260, 80, 25);

        jLabelHrC.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelHrC.setText("Hr. de Chegada:");
        getContentPane().add(jLabelHrC);
        jLabelHrC.setBounds(10, 290, 90, 25);

        jFormattedTextFieldHrC.setEditable(false);
        jFormattedTextFieldHrC.setBackground(new java.awt.Color(204, 204, 204));
        try {
            jFormattedTextFieldHrC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldHrC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextFieldHrC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextFieldHrC);
        jFormattedTextFieldHrC.setBounds(100, 290, 60, 25);

        jLabelKmC.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelKmC.setText("Km. de Chegada:");
        getContentPane().add(jLabelKmC);
        jLabelKmC.setBounds(170, 290, 100, 25);

        jTextFieldKmC.setEditable(false);
        jTextFieldKmC.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldKmC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKmC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKmCActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldKmC);
        jTextFieldKmC.setBounds(270, 290, 80, 25);

        jLabelDistancia.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelDistancia.setText("Km. Rodados na atividade:");
        getContentPane().add(jLabelDistancia);
        jLabelDistancia.setBounds(90, 320, 180, 25);

        jTextFieldDistancia.setEditable(false);
        jTextFieldDistancia.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDistancia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldDistancia.setForeground(new java.awt.Color(255, 0, 51));
        jTextFieldDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDistanciaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDistancia);
        jTextFieldDistancia.setBounds(270, 320, 80, 25);

        jLabelPlaca.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPlaca.setText("Placa:");
        getContentPane().add(jLabelPlaca);
        jLabelPlaca.setBounds(60, 80, 40, 25);

        jTextFieldPlaca.setEditable(false);
        jTextFieldPlaca.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPlaca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextFieldPlaca.setMaximumSize(new java.awt.Dimension(8, 8));
        jTextFieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPlaca);
        jTextFieldPlaca.setBounds(100, 80, 90, 25);

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMarca.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMarca.setText("Marca:");
        getContentPane().add(jLabelMarca);
        jLabelMarca.setBounds(180, 80, 50, 20);

        jLabelModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelModelo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelModelo.setText("Modelo:");
        getContentPane().add(jLabelModelo);
        jLabelModelo.setBounds(300, 80, 60, 20);

        jTextFieldModelo.setEditable(false);
        jTextFieldModelo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldModelo.setForeground(new java.awt.Color(51, 0, 255));
        jTextFieldModelo.setBorder(null);
        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldModelo);
        jTextFieldModelo.setBounds(230, 80, 100, 20);

        jTextFieldMarca.setEditable(false);
        jTextFieldMarca.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMarca.setForeground(new java.awt.Color(51, 0, 255));
        jTextFieldMarca.setBorder(null);
        getContentPane().add(jTextFieldMarca);
        jTextFieldMarca.setBounds(360, 80, 120, 20);

        jLabelMotorista.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelMotorista.setText("Motorista:");
        getContentPane().add(jLabelMotorista);
        jLabelMotorista.setBounds(40, 50, 60, 25);

        jComboBoxMotorista.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMotoristaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMotorista);
        jComboBoxMotorista.setBounds(100, 50, 290, 25);

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/pesquisar.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Buscar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(10, 0, 45, 30);

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/windows/imprimir.png"))); // NOI18N
        jButtonImprimir.setToolTipText("Imprimir");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImprimir);
        jButtonImprimir.setBounds(60, 0, 45, 30);

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
        jLabel1.setBounds(0, 390, 220, 20);

        jLabelFaixaMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFaixaMenu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelFaixaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_Faixa.png"))); // NOI18N
        getContentPane().add(jLabelFaixaMenu);
        jLabelFaixaMenu.setBounds(0, 0, 590, 30);

        jLabelFundo.setBackground(new java.awt.Color(204, 204, 204));
        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuprincipal_fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo);
        jLabelFundo.setBounds(0, 10, 620, 380);

        setSize(new java.awt.Dimension(524, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        RelARelatorios rel = new RelARelatorios();
        rel.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMotoristaActionPerformed

    }//GEN-LAST:event_jComboBoxMotoristaActionPerformed

    private void jTableBmotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBmotoristaMouseClicked
       String cod = ""+jTableBmotorista.getValueAt(jTableBmotorista.getSelectedRow(), 0);
       int i = Integer.parseInt(cod);
    
        mod.setCodigo(i); 
        control.PesquisarReg(mod); 
        jInternalFrameAtvPorMotor.setVisible(false);
        
            jComboBoxMotorista.setSelectedItem(mod.getNomemotorista());
            jTextFieldAtividade.setText(mod.getAtividade());
            jTextFieldSetorAt.setText(mod.getSetoratendido());
            jTextFieldPlaca.setText(mod.getPlaca());
            jTextFieldFuncionario.setText(mod.getFuncionario());
            jTextFieldKmS.setText(String.valueOf(mod.getKmsaida()));
            jTextFieldKmC.setText(String.valueOf(mod.getKmchegada()));
            jDateChooserdtativ.setDate(mod.getDtativ());
            jFormattedTextFieldHrS.setText(mod.getHrsaida());
            jFormattedTextFieldHrC.setText(mod.getHrchegada());
            jTextFieldModelo.setText(mod.getModelo());
            jTextFieldMarca.setText(mod.getMarca());
            jTextFieldDestino.setText(mod.getDestino());
            jTextFieldDistancia.setText(String.valueOf(mod.getDistancia()));
    }//GEN-LAST:event_jTableBmotoristaMouseClicked

    private void jButtonSairIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairIFActionPerformed
        jInternalFrameAtvPorMotor.dispose();
    }//GEN-LAST:event_jButtonSairIFActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        
    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jTextFieldKmSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKmSActionPerformed

    }//GEN-LAST:event_jTextFieldKmSActionPerformed

    private void jTextFieldKmCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKmCActionPerformed

    }//GEN-LAST:event_jTextFieldKmCActionPerformed

    private void jTextFieldDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDistanciaActionPerformed

    private void jTextFieldPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaActionPerformed

    }//GEN-LAST:event_jTextFieldPlacaActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed

    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        jInternalFrameAtvPorMotor.setVisible(true);
        
        mod.setNomemotorista(((String) jComboBoxMotorista.getSelectedItem()));
        control.PesquisarMotorista(mod);
        jTextFieldRegSelecionado.setText(mod.getNomemotorista());
        PreencherTabela("select a.id_regatividade as id, a.dtativ, a.setoratendido, c.descricao as desc from tbl_reg_ativ as a inner join tbl_motorista as b \n" +
                "on (a.id_motorista = b.id_motorista) inner join tbl_tipoatividade c\n" +
                "on (a.id_tipoatividade = c.id_tipoatividade) where nomemotorista ilike'%"+ mod.getNomemotorista()+"%' order by a.id_regatividade desc");// 
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimir1ActionPerformed
        try{
            conex.executaSql("select a.id_regatividade as id, a.dtativ, a.setoratendido, c.descricao as desc from tbl_reg_ativ as a inner join tbl_motorista as b \n" +
                "on (a.id_motorista = b.id_motorista) inner join tbl_tipoatividade c\n" +
                "on (a.id_tipoatividade = c.id_tipoatividade) where nomemotorista ilike'%"+ mod.getNomemotorista()+"%' order by a.id_regatividade desc");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conex.rs); // Paasando um resultset que ira servir como base de dados do relatório
            JasperPrint jpPrint = JasperFillManager.fillReport("iReport/RelRegPorMotorista.jasper", new HashMap(), relatResul);// HashMap:Mapeamento do Diretório// relatResul: passa a base de dados que o rel sera preenchido
            JasperViewer jv = new JasperViewer(jpPrint,false); //seta falso para exit_on_close
            jv.setVisible(true);//chama para visualização
            //jv.toFront();//caso o relatório saia atras do programa, este comando tras o relatório para frete da aplicação
        }
        
         catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao carregar relatório\nErro:"+ex); 
        }
    }//GEN-LAST:event_jButtonImprimir1ActionPerformed

    public void PreencherTabela(String SQL){
      ArrayList dados = new ArrayList();
      String[] colunas = new String[]{"","","",""};
      
      conex.conexao();
      conex.executaSql(SQL);

      try{
          conex.rs.first();       
          do{
              dados.add(new Object[]{conex.rs.getInt("id"),
                                     conex.rs.getDate("dtativ"),
                                     conex.rs.getString("setoratendido"),
                                     conex.rs.getString("desc")
                                    });
 
          }while(conex.rs.next());
      
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(rootPane, "O motorista não possuí atividades registradas"); 
        }
      
      BeansTabelas modelo = new BeansTabelas(dados, colunas);
      
      jTableBmotorista.setModel(modelo);
      jTableBmotorista.getColumnModel().getColumn(0).setPreferredWidth(30);
      jTableBmotorista.getColumnModel().getColumn(0).setResizable(false);
      jTableBmotorista.getColumnModel().getColumn(0).setHeaderValue("ID");
      jTableBmotorista.getColumnModel().getColumn(1).setPreferredWidth(60);
      jTableBmotorista.getColumnModel().getColumn(1).setResizable(false); //não redimensionaveL
      jTableBmotorista.getColumnModel().getColumn(1).setHeaderValue("DATA");
      jTableBmotorista.getColumnModel().getColumn(2).setPreferredWidth(110);
      jTableBmotorista.getColumnModel().getColumn(2).setResizable(false);
      jTableBmotorista.getColumnModel().getColumn(2).setHeaderValue("SETOR");
      jTableBmotorista.getColumnModel().getColumn(3).setPreferredWidth(237);
      jTableBmotorista.getColumnModel().getColumn(3).setResizable(false);
      jTableBmotorista.getColumnModel().getColumn(3).setHeaderValue("ATIVIDADE");

      jTableBmotorista.getTableHeader().setReorderingAllowed(false); //não reordenavel
      jTableBmotorista.setAutoResizeMode(jTableBmotorista.AUTO_RESIZE_OFF); //não redmencionar
      jTableBmotorista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//selicioar um dado por vez
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
            java.util.logging.Logger.getLogger(RelRegPorMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelRegPorMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelRegPorMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelRegPorMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelRegPorMotorista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelFundoMenuIF;
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonImprimir1;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSairIF;
    private javax.swing.JComboBox jComboBoxMotorista;
    private com.toedter.calendar.JDateChooser jDateChooserdtativ;
    private javax.swing.JFormattedTextField jFormattedTextFieldHrC;
    private javax.swing.JFormattedTextField jFormattedTextFieldHrS;
    private javax.swing.JInternalFrame jInternalFrameAtvPorMotor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAtividade;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelFaixaMenu;
    private javax.swing.JLabel jLabelFaixaMenu1;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelHrC;
    private javax.swing.JLabel jLabelHrS;
    private javax.swing.JLabel jLabelKmC;
    private javax.swing.JLabel jLabelKmS;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelMotorista;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelRegSelecionado;
    private javax.swing.JLabel jLabelSetorAtendido;
    private javax.swing.JLabel jLabelaData;
    private javax.swing.JScrollPane jScrollPaneBmotorista;
    private javax.swing.JTable jTableBmotorista;
    private javax.swing.JTextField jTextFieldAtividade;
    private javax.swing.JTextField jTextFieldDestino;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldFuncionario;
    private javax.swing.JTextField jTextFieldKmC;
    private javax.swing.JTextField jTextFieldKmS;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    public javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldRegSelecionado;
    private javax.swing.JTextField jTextFieldSetorAt;
    // End of variables declaration//GEN-END:variables
}
