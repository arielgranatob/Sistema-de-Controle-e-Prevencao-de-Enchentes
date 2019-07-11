/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.Conexao;
import Dao.RelatoriosDAO;
import Model.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ariel
 */
public class JFrmRelatorioRegiaoExibir extends javax.swing.JFrame {

    /**
     * Creates new form JFrmRelatorioEnchente
     */
    
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    String regiao = JFrmRelatorioRegiao.regiao;

    public JFrmRelatorioRegiaoExibir() {
        initComponents();
        Connection con;
        con = Conexao.conexao();
        carregarDados();
        this.setLocationRelativeTo(null);
        jLabel1.setText("Exibindo somente dados de " + regiao);

    }

    public void carregarDados() {
        //Varável com a query SQL para passar como parâmetro para a função consulta no PessoasDAO
        String sql = "SELECT * FROM endereco AS e JOIN indicePluviometrico AS ip ON e.idEndereco = ip.idEndereco AND e.reigaoEndereco = '"+regiao+"' ORDER BY medidaIndicePluviometrico DESC";
        ArrayList<Relatorio> arrayRelatorios = new ArrayList<Relatorio>();
        RelatoriosDAO relatoriosDAO = new RelatoriosDAO();
        //Preenche o arrayPessoas com objetos do tipo PESSOA retornados pela função consulta do PessoasDAO
        arrayRelatorios = relatoriosDAO.consulta(sql);
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Cidade", "Bairro", "Estado", "Período", "Indice Pluviometrico"}, 0);
        for (int i = 0; i < arrayRelatorios.size(); i++) {
            Object dados[] = {
                arrayRelatorios.get(i).getCidade(),
                arrayRelatorios.get(i).getBairro(),
                arrayRelatorios.get(i).getEstado(),
                arrayRelatorios.get(i).getPeriodo(),
                arrayRelatorios.get(i).getMedida(),};
            modelo.addRow(dados);
        }
        // Faz chamada da função criarTabela passando como parâmetro o modelo criado
        jTableRelatorio.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"11/04/2019", "São Paulo", "SP", "222,5"},
                {"15/03/2019", "Itu", "SP", "175,5"},
                {"18/02/2018", "Campinas", "SP", "163"},
                {"01/02/2019", "Rio Pomba", "MG", "150,5"}
            },
            new String [] {
                "Data", "Cidade", "Estado", "Índice Pluviométrico"
            }
        ));
        jScrollPane1.setViewportView(jTableRelatorio);
        if (jTableRelatorio.getColumnModel().getColumnCount() > 0) {
            jTableRelatorio.getColumnModel().getColumn(0).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(1).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(2).setResizable(false);
            jTableRelatorio.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Relatório dos locais que tiveram maiores enchentes.");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        JFrmTableRelatorios jfrmRelatorios = new JFrmTableRelatorios();
        jfrmRelatorios.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma a impressão desse relatório?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Imprimindo...");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(((DefaultTableModel) jTableRelatorio.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
        jTableRelatorio.setRowSorter(sorter);
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(JFrmRelatorioRegiaoExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorioRegiaoExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorioRegiaoExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmRelatorioRegiaoExibir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmRelatorioRegiaoExibir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorio;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}