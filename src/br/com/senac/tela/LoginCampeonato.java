package br.com.senac.tela;

import java.awt.Color;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amanda.nazario
 */
public class LoginCampeonato extends javax.swing.JFrame {

    private Point point = new Point();

    /**
     * Creates new form LoginCampeonato
     */
    public LoginCampeonato() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lbTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbLoginEmail = new javax.swing.JLabel();
        btAcessar = new javax.swing.JButton();
        btSaida = new javax.swing.JButton();
        javax.swing.JTextField varEmail = new javax.swing.JTextField();
        varSenha = new javax.swing.JPasswordField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 410));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        lbTexto.setBackground(new java.awt.Color(255, 255, 255));
        lbTexto.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        lbTexto.setForeground(new java.awt.Color(255, 255, 255));
        lbTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTexto.setText("Login de Acesso");
        lbTexto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lbTexto)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbLoginEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLoginEmail.setForeground(new java.awt.Color(91, 95, 99));
        lbLoginEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLoginEmail.setText("Entre com seu E-mail");

        btAcessar.setBackground(new java.awt.Color(58, 65, 84));
        btAcessar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btAcessar.setForeground(new java.awt.Color(255, 255, 255));
        btAcessar.setText("Acessar");
        btAcessar.setBorderPainted(false);
        btAcessar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAcessar.setFocusPainted(false);
        btAcessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAcessarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAcessarMouseExited(evt);
            }
        });
        btAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarActionPerformed(evt);
            }
        });

        btSaida.setBackground(new java.awt.Color(217, 81, 51));
        btSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSaida.setForeground(new java.awt.Color(255, 255, 255));
        btSaida.setText("Sair");
        btSaida.setBorderPainted(false);
        btSaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSaida.setFocusPainted(false);
        btSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSaidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSaidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSaidaMouseExited(evt);
            }
        });
        btSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaidaActionPerformed(evt);
            }
        });

        varEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varEmailActionPerformed(evt);
            }
        });

        varSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLoginEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(varEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(btSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(btAcessar, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(varSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varEmailActionPerformed
    }//GEN-LAST:event_varEmailActionPerformed

    private void btSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSaidaActionPerformed

    private void btSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaidaMouseClicked
    }//GEN-LAST:event_btSaidaMouseClicked

    private void btSaidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaidaMouseEntered
        btSaida.setBackground(new Color(235, 235, 235));
        btSaida.setForeground(new Color(217, 81, 51));
// TODO add your handling code here
    }//GEN-LAST:event_btSaidaMouseEntered

    private void btAcessarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcessarMouseEntered
        btAcessar.setBackground(new Color(235, 235, 235));
        btAcessar.setForeground(new Color(58, 65, 84));

    }//GEN-LAST:event_btAcessarMouseEntered

    private void btSaidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaidaMouseExited
        btSaida.setBackground(new Color(217, 81, 51));
        btSaida.setForeground(Color.WHITE);
    }//GEN-LAST:event_btSaidaMouseExited

    private void btAcessarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAcessarMouseExited
        btAcessar.setBackground(new Color(58, 65, 84));
        btAcessar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btAcessarMouseExited

    private void btAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarActionPerformed

        //        if (acessarButton.getText().equals("@") && acessarButton.getText().equals(".")) {
        //            JOptionPane.showMessageDialog(null, "Bem vindo");
        //
        //        } else {
        //            JOptionPane.showMessageDialog(null, "Acesso negado");
        //
        //        }
        //
        //        Point p = this.getLocation();
        //        LoginCampeonato loginCampeonato = this;
        //
        //        new Thread() {
        //            @Override
        //            public void run() {
        //                try {
        //                    for (int i = 0; i < 4; i++) {
        //                        loginCampeonato.setLocation(p.x - 10, p.y);
        //                        sleep(20);
        //                        loginCampeonato.setLocation(p.x - 10, p.y);
        //
        //                    }
        //                    loginCampeonato.setLocation(p.x, p.y);
        //                } catch (InterruptedException ex) {
        //                    Logger.getLogger(LoginCampeonato.class.getName()).log(Level.SEVERE, null, ex);
        //                }
        //
        //            }
        //        }.start();
    }//GEN-LAST:event_btAcessarActionPerformed
//
//    private boolean validarFormulario() {
//        String senha = varSenha.getText().trim();
//        if (validarCampoMenorQue3(senha)) {
//            JOptionPane.showMessageDialog(null, "Digite uma senha válida!!");
//            return true;
//        }
//        if (validarEmail()) {
//            JOptionPane.showMessageDialog(null, "Informe um E-mail válido!!");
//            return true;
//        }
//        return false;
//    }
//
//    private boolean validarEmail() {
//////        String email = var.getText().trim();
////
////        if (email.equals("") || !email.contains("@") || !email.contains(".")) {
////            return true;
////        }
////        return false;
////    }
//
//    private boolean validarCampoMenorQue3(String valorCampo) {
//        return valorCampo.length() < 3;
//    }

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void varSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSenhaActionPerformed
    }//GEN-LAST:event_varSenhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCampeonato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessar;
    private javax.swing.JButton btSaida;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbLoginEmail;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
