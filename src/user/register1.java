package user;

import database.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class register1 extends javax.swing.JFrame {
private Connection conn = new koneksi().getkoneksi();   
    protected void kosong(){
        ruser.setText("");
        rumur.setText("");
        rpass.setText("");
        rcpass.setText("");             
}
    public register1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ruser = new javax.swing.JTextField();
        rumur = new javax.swing.JTextField();
        rcpass = new javax.swing.JPasswordField();
        rpass = new javax.swing.JPasswordField();
        rbtnregist = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rloginbtn = new javax.swing.JLabel();
        rtelp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        remail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rnama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jTextField2.setBackground(new java.awt.Color(0, 153, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setToolTipText("");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 153, 0));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setToolTipText("");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("belum punya akun ?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        ruser.setBackground(new java.awt.Color(0, 153, 0));
        ruser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ruser.setForeground(new java.awt.Color(255, 255, 255));
        ruser.setToolTipText("");
        ruser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ruser.setOpaque(false);
        ruser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruserActionPerformed(evt);
            }
        });

        rumur.setBackground(new java.awt.Color(0, 153, 0));
        rumur.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rumur.setForeground(new java.awt.Color(255, 255, 255));
        rumur.setToolTipText("");
        rumur.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rumur.setOpaque(false);
        rumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rumurActionPerformed(evt);
            }
        });
        rumur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rumurKeyTyped(evt);
            }
        });

        rcpass.setBackground(new java.awt.Color(0, 153, 0));
        rcpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rcpass.setForeground(new java.awt.Color(255, 255, 255));
        rcpass.setToolTipText("");
        rcpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rcpass.setOpaque(false);
        rcpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcpassActionPerformed(evt);
            }
        });

        rpass.setBackground(new java.awt.Color(0, 153, 0));
        rpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rpass.setForeground(new java.awt.Color(255, 255, 255));
        rpass.setToolTipText("");
        rpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rpass.setOpaque(false);
        rpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpassActionPerformed(evt);
            }
        });

        rbtnregist.setBackground(new java.awt.Color(255, 255, 255));
        rbtnregist.setText("Register");
        rbtnregist.setBorder(new javax.swing.border.MatteBorder(null));
        rbtnregist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnregistActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Sudah punya akun ?");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Umur");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirm password");

        rloginbtn.setText("Click here");
        rloginbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        rloginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rloginbtnMouseClicked(evt);
            }
        });

        rtelp.setBackground(new java.awt.Color(0, 153, 0));
        rtelp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rtelp.setForeground(new java.awt.Color(255, 255, 255));
        rtelp.setToolTipText("");
        rtelp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rtelp.setOpaque(false);
        rtelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtelpActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        remail.setBackground(new java.awt.Color(0, 153, 0));
        remail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        remail.setForeground(new java.awt.Color(255, 255, 255));
        remail.setToolTipText("");
        remail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        remail.setOpaque(false);
        remail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remailActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No.Telp");

        rnama.setBackground(new java.awt.Color(0, 153, 0));
        rnama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rnama.setForeground(new java.awt.Color(255, 255, 255));
        rnama.setToolTipText("");
        rnama.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        rnama.setOpaque(false);
        rnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnamaActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Lengkap");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnregist, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rloginbtn)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(rpass, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(ruser, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(rumur, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(remail, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rnama, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtelp, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(rnama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(remail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(rumur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(rpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rcpass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnregist, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(rloginbtn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ruserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruserActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void rumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rumurActionPerformed

    private void rcpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcpassActionPerformed

    private void rpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpassActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rpassActionPerformed

    private void rbtnregistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnregistActionPerformed
        // TODO add your handling code her
        String Confirm = new String (rcpass.getText());
        if (rnama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "nama tidak boleh kosong");
            kosong();
        }else if (rtelp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No telepon tidak boleh kosong");
            kosong();
        }else if (remail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Email tidak boleh kosong");
            kosong();
        }else if (rumur.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Umur tidak boleh kosong");
            kosong();
        }else if (ruser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "User tidak boleh kosong");
            kosong();
        }else if (rpass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
            kosong();
        }else if (!rpass.getText().equals(Confirm)){
            JOptionPane.showMessageDialog(null, "Password harus sama");
            kosong();
        }else if (Integer.parseInt(rumur.getText()) < 18){
            JOptionPane.showMessageDialog(null, "Tidak cukup umur");
            kosong();
        }else{
            try{
                 String sql = "insert into user values (0,'"+rnama.getText()+"','"+rtelp.getText()+"','"+remail.getText()+"','"+rumur.getText()+"','"+ruser.getText()+"','"+rpass.getText()+"','2')";
                 PreparedStatement stat = conn.prepareStatement(sql);
                 stat.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Pendaftaran berhasil !");
                 login start = new login();
                 start.setVisible(true);
                 this.dispose();
                }catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Cek kembali data anda !" +e);
                }
        }
    }//GEN-LAST:event_rbtnregistActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

    private void rloginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rloginbtnMouseClicked
        // TODO add your handling code here:
        login start = new login();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rloginbtnMouseClicked

    private void rumurKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rumurKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();       
        if(!Character.isDigit(c)){
            evt.consume();
        }
         
    }//GEN-LAST:event_rumurKeyTyped

    private void rtelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtelpActionPerformed

    private void remailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remailActionPerformed

    private void rnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnamaActionPerformed

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
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton rbtnregist;
    private javax.swing.JPasswordField rcpass;
    private javax.swing.JTextField remail;
    private javax.swing.JLabel rloginbtn;
    private javax.swing.JTextField rnama;
    private javax.swing.JPasswordField rpass;
    private javax.swing.JTextField rtelp;
    private javax.swing.JTextField rumur;
    private javax.swing.JTextField ruser;
    // End of variables declaration//GEN-END:variables
}
