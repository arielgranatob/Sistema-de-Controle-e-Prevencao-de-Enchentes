/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author italo
 */
public class JFrmTableRioAfluente extends javax.swing.JFrame {

    private String sql;
    private Connection conn;

    public JFrmTableRioAfluente() {
        super("Rios Afluentes");
        initComponents();
        Connection con;
        con = Conexao.conexao();
        carregarDados();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFundo.setForeground(new java.awt.Color(255, 255, 255));

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "RIO PRINCIPAL", "RIO AFLUENTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAluno);

        jButtonNovo.setText("CADASTRAR");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("ALTERAR");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("ATUALIZAR");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelFundoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFundoLayout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar)))
                        .addGap(18, 18, 18))))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        JFrmCadastroRioAfluente jFrmCadastroRioAfluente = new JFrmCadastroRioAfluente();
        jFrmCadastroRioAfluente.setVisible(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
//        int linhaSelecionada = jTableAluno.getSelectedRow();
//        Object[] opcoes = {"SIM", "NÃO"};
//        if (linhaSelecionada < 0) {
//            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SELECIONE A LINHA QUE DESEJA EXCLUIR", "", 1);
//        } else {
//            int codMatricula = (int) jTableAluno.getValueAt(linhaSelecionada, 0);
//            int confirmaDelete = JOptionPane.showOptionDialog(null, "DESEJA REALMENTE DELETAR OS DADOS DO ALUNO SELECIONADO?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
//            if (confirmaDelete == 0) {
//
//                Alunos aluno = new Alunos();
//                aluno.setId(codMatricula);
//                AlunosDAO alunosdao = new AlunosDAO();
//                alunosdao.delete(aluno);
//                carregarDados();
//            }
//        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        JFrmEditarRioAfluente editarRioAfluente = new JFrmEditarRioAfluente();
        editarRioAfluente.setVisible(true);

//        int linhaSelecionada = jTableAluno.getSelectedRow();
//        if (linhaSelecionada < 0) {
//            JOptionPane.showMessageDialog(rootPane, "POR FAVOR SELECIONE A LINHA QUE DESEJA EDITAR", "", 1);
//        } else {
//            int codAluno = (int) jTableAluno.getValueAt(linhaSelecionada, 0);
//            JFrmEditarAluno editarAluno = new JFrmEditarAluno(codAluno, this);
//            editarAluno.setVisible(true);
//        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
//        carregarDados();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyPressed
//        carregarDadosKey(jTextFieldPesquisa.getText());
    }//GEN-LAST:event_jTextFieldPesquisaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTableRioAfluente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables

    PreparedStatement ps = null;
    ResultSet rs = null;

    public void carregarDados() {

//        //Varável com a query SQL para passar como parâmetro para a função consulta no PessoasDAO
//        String sql = "SELECT * FROM alunos";
//        ArrayList<Alunos> arrayAlunos = new ArrayList<Alunos>();
//        AlunosDAO alunosDAO = new AlunosDAO();
//        //Preenche o arrayPessoas com objetos do tipo PESSOA retornados pela função consulta do PessoasDAO
//        arrayAlunos = alunosDAO.consulta(sql);
//        DefaultTableModel modelo = new DefaultTableModel(new String[]{"#", "NOME COMPLETO", "CPF", "CIDADE", "DATA NASCIMENTO"}, 0);
//        for (int i = 0; i < arrayAlunos.size(); i++) {
//            Object dados[] = {
//                arrayAlunos.get(i).getId(),
//                arrayAlunos.get(i).getNome(),
//                arrayAlunos.get(i).getCpf(),
//                arrayAlunos.get(i).getCidade(),
//                arrayAlunos.get(i).getDataNascimento()
//            };
//            modelo.addRow(dados);
//        }
//        // Faz chamada da função criarTabela passando como parâmetro o modelo criado
//        jTableAluno.setModel(modelo);
    }

    public void carregarDadosKey(String pesquisa) {

//        //Varável com a query SQL para passar como parâmetro para a função consulta no PessoasDAO
//        String sql = "SELECT * FROM alunos WHERE nomeAluno like '%" + pesquisa + "%'";
//        ArrayList<Alunos> arrayAlunos = new ArrayList<Alunos>();
//        AlunosDAO alunosDAO = new AlunosDAO();
//        //Preenche o arrayPessoas com objetos do tipo PESSOA retornados pela função consulta do PessoasDAO
//        arrayAlunos = alunosDAO.consulta(sql);
//        DefaultTableModel modelo = new DefaultTableModel(new String[]{"#", "NOME COMPLETO", "CPF", "CIDADE", "DATA NASCIMENTO"}, 0);
//        for (int i = 0; i < arrayAlunos.size(); i++) {
//            Object dados[] = {
//                arrayAlunos.get(i).getId(),
//                arrayAlunos.get(i).getNome(),
//                arrayAlunos.get(i).getCpf(),
//                arrayAlunos.get(i).getCidade(),
//                arrayAlunos.get(i).getDataNascimento()
//            };
//            modelo.addRow(dados);
//        }
//        // Faz chamada da função criarTabela passando como parâmetro o modelo criado
//        jTableAluno.setModel(modelo);
    }

}
