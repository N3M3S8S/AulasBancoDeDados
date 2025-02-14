/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package info3;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 20221194010007
 */
public class TelaCadastro extends javax.swing.JFrame {

    public String selgenero() {
        if (BotaoHomem.isSelected()){
            return "m";
        }
        else {
            if (BotaoMulher.isSelected()) {
            return "f";
            }
            else {
                return "n";
            }
        }
    }
    
    public void limpaTela () {
        BotoesGenero.clearSelection();
        RecebeNome.setText("");
        RecebeEmail.setText("");
        RecebeLogin.setText("");
        RecebeSenha.setText("");
    }
    
    public TelaCadastro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotoesGenero = new javax.swing.ButtonGroup();
        TelaCadastro = new javax.swing.JPanel();
        RecebeNome = new javax.swing.JTextField();
        LabelNome = new javax.swing.JLabel();
        LabelCadastro = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        RecebeEmail = new javax.swing.JTextField();
        LabelLogin = new javax.swing.JLabel();
        RecebeLogin = new javax.swing.JTextField();
        LabelSenha = new javax.swing.JLabel();
        RecebeSenha = new javax.swing.JPasswordField();
        LabelGenero = new javax.swing.JLabel();
        BotaoHomem = new javax.swing.JRadioButton();
        BotaoMulher = new javax.swing.JRadioButton();
        BotaoCadastrar = new javax.swing.JButton();
        TexTel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TexTel1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TexTel2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNome.setText("Nome:");

        LabelCadastro.setText("CADASTRO");

        LabelEmail.setText("Email:");

        LabelLogin.setText("Login:");

        LabelSenha.setText("Senha:");

        LabelGenero.setText("Gênero:");

        BotoesGenero.add(BotaoHomem);
        BotaoHomem.setText("Masculino");
        BotaoHomem.setInheritsPopupMenu(true);
        BotaoHomem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BotaoHomemStateChanged(evt);
            }
        });
        BotaoHomem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BotaoHomemMouseDragged(evt);
            }
        });
        BotaoHomem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoHomemMouseClicked(evt);
            }
        });
        BotaoHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoHomemActionPerformed(evt);
            }
        });
        BotaoHomem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotaoHomemKeyTyped(evt);
            }
        });

        BotoesGenero.add(BotaoMulher);
        BotaoMulher.setText("Feminino");

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        TexTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexTelActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone:");

        jLabel2.setText("Telefone:");

        TexTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexTel1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone:");

        TexTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexTel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaCadastroLayout = new javax.swing.GroupLayout(TelaCadastro);
        TelaCadastro.setLayout(TelaCadastroLayout);
        TelaCadastroLayout.setHorizontalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(LabelCadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroLayout.createSequentialGroup()
                        .addComponent(BotaoCadastrar)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaCadastroLayout.createSequentialGroup()
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelGenero)
                            .addComponent(LabelSenha)
                            .addComponent(LabelLogin)
                            .addComponent(LabelEmail)
                            .addComponent(LabelNome)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RecebeNome)
                            .addComponent(RecebeEmail)
                            .addComponent(RecebeLogin)
                            .addComponent(RecebeSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addGroup(TelaCadastroLayout.createSequentialGroup()
                                .addComponent(BotaoHomem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoMulher))
                            .addComponent(TexTel)
                            .addComponent(TexTel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TexTel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(62, 62, 62))))
        );
        TelaCadastroLayout.setVerticalGroup(
            TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaCadastroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelCadastro)
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecebeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail)
                    .addComponent(RecebeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelLogin)
                    .addComponent(RecebeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSenha)
                    .addComponent(RecebeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGenero)
                    .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotaoHomem)
                        .addComponent(BotaoMulher)))
                .addGap(18, 18, 18)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(BotaoCadastrar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        String nome = RecebeNome.getText();
        String email = RecebeEmail.getText();
        String login = RecebeLogin.getText();
        String senha = new String(RecebeSenha.getPassword());
        String genero = selgenero();

        Usuario u = new Usuario(nome, email, login, senha, genero);
        try {
            u.Cadastrar();
            //cadastrando telefones
                //Verificando quantos campos foram preenchidos
            if (TexTel.getText() != "") {
                Telefones t = new Telefones();
                t.setTelefone(TexTel.getText());
                t.setIdusuarios(u.getIdusuario());
                t.cadastrar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaTela();
        JOptionPane.showMessageDialog(rootPane, "Cadastro concluído com sucesso! Chave do usuário: " + u.getIdusuario());
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoHomemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoHomemKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHomemKeyTyped

    private void BotaoHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoHomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHomemActionPerformed

    private void BotaoHomemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHomemMouseClicked

    }//GEN-LAST:event_BotaoHomemMouseClicked

    private void BotaoHomemMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoHomemMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoHomemMouseDragged

    private void BotaoHomemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotaoHomemStateChanged

    }//GEN-LAST:event_BotaoHomemStateChanged

    private void TexTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexTelActionPerformed

    private void TexTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexTel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexTel1ActionPerformed

    private void TexTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexTel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexTel2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JRadioButton BotaoHomem;
    private javax.swing.JRadioButton BotaoMulher;
    private javax.swing.ButtonGroup BotoesGenero;
    private javax.swing.JLabel LabelCadastro;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JTextField RecebeEmail;
    private javax.swing.JTextField RecebeLogin;
    private javax.swing.JTextField RecebeNome;
    private javax.swing.JPasswordField RecebeSenha;
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JTextField TexTel;
    private javax.swing.JTextField TexTel1;
    private javax.swing.JTextField TexTel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
