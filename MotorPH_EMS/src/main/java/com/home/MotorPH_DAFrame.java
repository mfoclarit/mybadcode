/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;


import com.databaseCon.MotorPH_DB;
import static com.databaseCon.MotorPH_DB.con;
import com.home.Bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hp
 */
public class MotorPH_DAFrame extends javax.swing.JFrame {

    /**
     * Creates new form MotorPH_DAFrame
     */
    public MotorPH_DAFrame() {
        initComponents();
        jLabelEmpfistName.setText(String.valueOf(Bal.AdFirstName).toString());
        jLabelEmplastName.setText(String.valueOf(Bal.AdLastName ).toString());
       
       loadTableA();
    }


    public void loadAllDataIntoTableA(List<Bean_AL> list) {
        DefaultTableModel dtm = (DefaultTableModel) jTable2AM.getModel();
        dtm.setRowCount(0);

        for (Bean_AL bean : list) {
            Vector v = new Vector();
            v.add(bean.getId());
            v.add(bean.getLastName());
            v.add(bean.getFirstName());
            v.add(bean.getRiceAl()); // Display Rice Subsidy
            v.add(bean.getPhonAl()); // Display Phone Allowance
            v.add(bean.getClothAl()); // Display Clothing Allowance
            // Display Total Allowance

            dtm.addRow(v);
        }
    }

    public void loadTableA() {
        // Existing code...
        Bal_DA bal = new Bal_DA();
        List<Bean_AL> list = bal.loadDataA();
        loadAllDataIntoTableA(list);
    }

    public void search(String str) {
        Bal_DA bal = new Bal_DA();
      
        List<Bean_AL> list1 = bal.searchEmployeeA(str);

      
        DefaultTableModel dtm1 = (DefaultTableModel) jTable2AM.getModel();
       
        dtm1.setRowCount(0);

        for (Bean_AL bean1 : list1) {
            Object[] rowData = {
                bean1.getId(),
                bean1.getLastName(),
                bean1.getFirstName(),
                bean1.getRiceAl(), // Display Rice Subsidy
                bean1.getPhonAl(), // Display Phone Allowance
                bean1.getClothAl(), // Display Clothing Allowance
               // Display Total Allowance
            };
            dtm1.addRow(rowData);
        }
    }

     public void clearTextFieldsData(){
        jTextField2RS.setText("");
        jTextField3PA.setText("");
        jTextField1CA.setText("");
       
        
            }
    
    
private void updatenewRiceSubsidy(int id, String newRiceSubsidy) {
    try {
        String query = "UPDATE motorphdb SET `Rice Subsidy` = ? WHERE ID = ?";
        PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
        ps.setString(1, newRiceSubsidy);
        ps.setInt(2, id);
        
        // Execute the update query
        ps.executeUpdate();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
    }
}
    private void updatenewPhoneAllowance(int id, String newPhoneAllowance) {
    try {
        String query = "UPDATE motorphdb SET `Phone Allowance` = ? WHERE ID = ?";
        PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
        ps.setString(1, newPhoneAllowance);
        ps.setInt(2, id);
        
        // Execute the update query
        ps.executeUpdate();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
    }
}
    private void updatenewClothingAllowance(int id, String newClothingAllowance) {
    try {
        String query = "UPDATE motorphdb SET `Clothing Allowance` = ? WHERE ID = ?";
        PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
        ps.setString(1, newClothingAllowance);
        ps.setInt(2, id);
        
        // Execute the update query
        ps.executeUpdate();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabelEmpfistName = new javax.swing.JLabel();
        jLabelEmpName = new javax.swing.JLabel();
        jLabelEmplastName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Search = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2AM = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1CA = new javax.swing.JTextField();
        jTextField2RS = new javax.swing.JTextField();
        jTextField3PA = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7RS = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

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

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Office Hours: 8:00AM - 5:00PM");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Office Address: 5th Flr., The World Center #330 Sen. Gil Puyat Ave., Makati City, Manila, Philippines");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Office Phone Number: +63-2-754-7000");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Office Email: support@motorph.com");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MO-IT101 - Computer Programming 1");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Section : A1101");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Group 1");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Metodio Francis M. Oclarit");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1024, 100));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Desktop\\Comp Prog 1\\blankpic.png")); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 150));

        jLabelEmpfistName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelEmpfistName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpfistName.setText("jLabel18");
        jLabelEmpfistName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabelEmpfistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 60));

        jLabelEmpName.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabelEmpName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpName.setText("Welcome!");
        jPanel5.add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 60));

        jLabelEmplastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEmplastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmplastName.setText("jLabel18");
        jLabelEmplastName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabelEmplastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 530));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 208, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 208, 40));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Employee Timesheet");
        jButton8.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 370, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Employee Information");
        jButton3.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 208, 40));

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Allowances");
        jButton9.setPreferredSize(new java.awt.Dimension(72, 23));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 400, 40));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Payroll");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 208, 40));

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 205, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Search :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jTextField1Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1SearchKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Allowances Monthly:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jTable2AM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Last Name", "First Name", "Rice Subsidy", "Phone", "Clothing"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2AM);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 700, 170));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("amounts shown below by 2.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, 230, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setText("Note:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 40, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel9.setText("and allowances, simply divide all the ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 230, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel10.setText("To calculate the semi-monthly deductions ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 230, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Clothing Allowance :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Rice Subsidy :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Phone Allowance :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));
        jPanel1.add(jTextField1CA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 170, -1));
        jPanel1.add(jTextField2RS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 170, -1));
        jPanel1.add(jTextField3PA, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 170, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        jButton7RS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7RS.setText("Update");
        jButton7RS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7RSActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7RS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
        MotorPH_HomeJFrame loginObj = new MotorPH_HomeJFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.hide();
        MotorPH_AttFrame loginObj = new MotorPH_AttFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        MotorPH_AddEmpFrame empObj = new MotorPH_AddEmpFrame();
        empObj.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.hide();
        MotorPH_DAFrame loginObj = new MotorPH_DAFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.hide();
        MotorPH_PayrollFrame payrollObj = new MotorPH_PayrollFrame();
        payrollObj.show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.hide();
        MotorPH_LoginFrame loginObj = new MotorPH_LoginFrame();
        loginObj.show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1SearchKeyReleased
        String searchString = jTextField1Search.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1SearchKeyReleased

    private void jButton7RSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7RSActionPerformed
       if (jTable2AM.getRowCount() != 1 || jTable2AM.getSelectedRowCount() != 1) {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
        return;
    }
    
    // Get the selected row index from jTable1
    int selectedRowIndex = jTable2AM.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex != -1) {
        try {
            // Get the ID from the selected row in jTable1
            int id = (int) jTable2AM.getValueAt(selectedRowIndex, 0);
            
            // Get the new Basic Salary from jTextField2
            String newRiceSubsidy = jTextField2RS.getText();
            
            // Update the Basic Salary in the database
            updatenewRiceSubsidy(id, newRiceSubsidy);
            
            // Reload the table to reflect the changes
            loadTableA();
            
            // Show success message
            JOptionPane.showMessageDialog(this, "Basic Salary updated successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
    }
    }//GEN-LAST:event_jButton7RSActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jTable2AM.getRowCount() != 1 || jTable2AM.getSelectedRowCount() != 1) {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
        return;
    }
    
    // Get the selected row index from jTable1
    int selectedRowIndex = jTable2AM.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex != -1) {
        try {
            // Get the ID from the selected row in jTable1
            int id = (int) jTable2AM.getValueAt(selectedRowIndex, 0);
            
            // Get the new Basic Salary from jTextField2
            String newPhoneAllowance = jTextField3PA.getText();
            
            // Update the Basic Salary in the database
            updatenewPhoneAllowance(id, newPhoneAllowance);
            
            // Reload the table to reflect the changes
            loadTableA();
            
            // Show success message
            JOptionPane.showMessageDialog(this, "Basic Salary updated successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (jTable2AM.getRowCount() != 1 || jTable2AM.getSelectedRowCount() != 1) {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
        return;
    }
    
    // Get the selected row index from jTable1
    int selectedRowIndex = jTable2AM.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRowIndex != -1) {
        try {
            // Get the ID from the selected row in jTable1
            int id = (int) jTable2AM.getValueAt(selectedRowIndex, 0);
            
            // Get the new Basic Salary from jTextField2
            String newClothingAllowance = jTextField1CA.getText();
            
            // Update the Basic Salary in the database
            updatenewClothingAllowance(id, newClothingAllowance);
            
            // Reload the table to reflect the changes
            loadTableA();
            
            // Show success message
            JOptionPane.showMessageDialog(this, "Basic Salary updated successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error updating Basic Salary: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select one employee from the table.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        clearTextFieldsData();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MotorPH_DAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorPH_DAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorPH_DAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorPH_DAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorPH_DAFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton7RS;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelEmpfistName;
    private javax.swing.JLabel jLabelEmplastName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2AM;
    private javax.swing.JTextField jTextField1CA;
    private javax.swing.JTextField jTextField1Search;
    private javax.swing.JTextField jTextField2RS;
    private javax.swing.JTextField jTextField3PA;
    // End of variables declaration//GEN-END:variables
}