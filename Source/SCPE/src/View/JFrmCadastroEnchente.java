/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.EnderecosDAO;
import Dao.RiosDAO;
import Model.Endereco;
import Model.Rio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author italo
 */
public class JFrmCadastroEnchente extends javax.swing.JFrame {

    private String sql;
    private Connection conn;
    JFrmTableEnchente listarEnchentes = null;

    /**
     * Creates new form JFrmCadastroAluno
     */
    public JFrmCadastroEnchente() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    JFrmCadastroEnchente(JFrmTableEnchente listarEnchentes) {
        initComponents();
        carregarDadosEndereco();
        carregarDadosRio();
        this.listarEnchentes = listarEnchentes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxEndereco = new javax.swing.JComboBox<>();
        jComboBoxRio = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTitulo.setText("CADASTRAR ENCHENTE");

        jLabelNome.setText("ENDEREÇO:");

        jLabelCpf.setText("RIO:");

        jLabelCidade.setText("DATA ENCHENTE:");

        jLabelDataNasc.setText("ESTAÇÃO ENCHENTE:");

        jButtonCadastrar.setText("CADASTRAR");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primavera", "Verão", "Outono", "Inverno" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCpf)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEndereco, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxRio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButtonCadastrar)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jComboBoxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jComboBoxRio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataNasc)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButton2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

//        Alunos aluno = new Alunos();
//
//        aluno.setNome(jTextFieldNomeCompleto.getText());
//        aluno.setCpf(jTextFieldCPF.getText());
//        aluno.setCidade(jTextFieldCidade.getText());
//        aluno.setDataNascimento(jTextFieldDataNas.getText());
//
//        AlunosDAO alunosdao = new AlunosDAO();
//        alunosdao.add(aluno);
//        listarAlunos.carregarDados();
//        this.dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmCadastroEnchente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmCadastroEnchente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmCadastroEnchente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmCadastroEnchente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmCadastroEnchente().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBoxEndereco;
    private javax.swing.JComboBox<String> jComboBoxRio;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables

    PreparedStatement ps = null;
    ResultSet rs = null;

    public void carregarDadosEndereco() {

        String sql = "SELECT * FROM endereco";
        ArrayList<Endereco> arrayEnderecos = new ArrayList<Endereco>();
        ArrayList<String> comboEnderecos = new ArrayList<String>();

        EnderecosDAO enderecosDAO = new EnderecosDAO();
        arrayEnderecos = enderecosDAO.consulta(sql);

        for (int i = 0; i < arrayEnderecos.size(); i++) {

            comboEnderecos.add(Integer.toString(arrayEnderecos.get(i).getId()) + " - " + arrayEnderecos.get(i).getPais() + ", " + arrayEnderecos.get(i).getEstado() + ", " + arrayEnderecos.get(i).getRegiao() + ", " + arrayEnderecos.get(i).getCidade() + ", " + arrayEnderecos.get(i).getBairro());

        }

        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(comboEnderecos.toArray());
        jComboBoxEndereco.setModel(defaultComboBox);

    }

    public void carregarDadosRio() {

        String sql = "SELECT rio.*, baciaHidrografica.*, endereco.* FROM rio, baciaHidrografica, endereco";
        ArrayList<Rio> arrayRios = new ArrayList<Rio>();
        ArrayList<String> comboRios = new ArrayList<String>();

        RiosDAO riosdao = new RiosDAO();
        arrayRios = riosdao.consulta(sql);

        for (int i = 0; i < arrayRios.size(); i++) {

            comboRios.add(Integer.toString(arrayRios.get(i).getId()) + " - " + arrayRios.get(i).getNome());

        }

        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(comboRios.toArray());
        jComboBoxRio.setModel(defaultComboBox);

    }
}
