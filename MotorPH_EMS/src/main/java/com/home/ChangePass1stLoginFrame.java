/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;

import com.databaseCon.MotorPH_DB;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class ChangePass1stLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChangePass1stLoginFrame
     */
    public ChangePass1stLoginFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1Submit = new javax.swing.JButton();
        jButton2BackLogin = new javax.swing.JButton();
        jPasswordField1NewPass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1ConPass = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1SA = new javax.swing.JTextField();
        jComboBox1SQ = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\comp prog1\\MotorPHLogo.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\comp prog1\\motorlogin.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 560, 340));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel10.setText("Change Password");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("New Password :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Security Answer :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jButton1Submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1Submit.setText("Submit");
        jButton1Submit.setBorderPainted(false);
        jButton1Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SubmitActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, -1));

        jButton2BackLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2BackLogin.setText("Back");
        jButton2BackLogin.setBorderPainted(false);
        jButton2BackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BackLoginActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2BackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 130, -1));
        jPanel4.add(jPasswordField1NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 230, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Confirm New Password:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jPanel4.add(jPasswordField1ConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Security Question :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jTextField1SA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SAActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1SA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, -1));

        jComboBox1SQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother's maiden name?", "What is the name of your first pet?", "In what city were you born?", "What is the name of your elementary school?", "What is your favorite sports team?", "What is your favorite movie?", "What was the make and model of your first car?", "What is your favorite book?", "What is your favorite food?", "What is your favorite vacation spot?", "What is the name of your childhood best friend?", "What is your favorite color", "What is the name of the street you grew up on?", "What is your father's middle name?", "What is your maternal grandmother's first name?" }));
        jPanel4.add(jComboBox1SQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 340, 340));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Office Hours: 8:00AM - 5:00PM");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Office Address: 5th Flr., The World Center #330 Sen. Gil Puyat Ave., Makati City, Manila, Philippines");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Office Phone Number: +63-2-754-7000");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Office Email: support@motorph.com");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MO-IT101 - Computer Programming 1");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Section : A1101");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Group 1");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Metodio Francis M. Oclarit");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1024, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SubmitActionPerformed
                                                    
     String securityQuestion = (String) jComboBox1SQ.getSelectedItem();
    String securityAnswer = jTextField1SA.getText();
    String newPassword = new String(jPasswordField1NewPass.getPassword());
    String confirmPassword = new String(jPasswordField1ConPass.getPassword());

    // Validate if new password matches the confirmed password
    if (!newPassword.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(null, "Passwords do not match!");
        return; // Exit the method if passwords don't match
    }

    try {
        // Update the database with the new security question, answer, and password
        String query = "UPDATE motorphdb SET `Security Question` = ?, `Security Answer` = ?, Password = ?, FirstLogin = 0 WHERE Email = ?";
        PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
        ps.setString(1, securityQuestion);
        ps.setString(2, securityAnswer);
        ps.setString(3, newPassword);
        ps.setString(4, Bal.EmpEmail); // Assuming Bal.EmpEmail contains the email of the employee
        ps.executeUpdate();

        // Show success message
        JOptionPane.showMessageDialog(null, "Welcome, New Employee! Your password and security details have been updated successfully!");

        // Proceed to MotorPH_EmpFrame
        MotorPH_EmpFrame empFrame = new MotorPH_EmpFrame();
        empFrame.setVisible(true);
        this.dispose(); // Close the current frame
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_jButton1SubmitActionPerformed
    
    
    
    }
    
    private void jTextField1SAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SAActionPerformed

    private void jButton2BackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BackLoginActionPerformed
        this.hide();
        MotorPH_LoginFrame loginObj = new MotorPH_LoginFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton2BackLoginActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePass1stLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass1stLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass1stLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass1stLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass1stLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Submit;
    private javax.swing.JButton jButton2BackLogin;
    private javax.swing.JComboBox<String> jComboBox1SQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1ConPass;
    private javax.swing.JPasswordField jPasswordField1NewPass;
    private javax.swing.JTextField jTextField1SA;
    // End of variables declaration//GEN-END:variables
}