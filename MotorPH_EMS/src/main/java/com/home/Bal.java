/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import com.databaseCon.MotorPH_DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Bal {
    
    public static int EmpID;
    public static String EmpFirstName;
    public static String EmpLastName;
    public static Date EmpBirthday;
    public static String EmpEmail;
    public static int AdID;
    public static String AdFirstName;
    public static String AdLastName;
    public static Date AdBirthday;
    public static String AdEmail;
    
    
    
    public List<Bean> loadData() {
        List<Bean> list = new ArrayList<Bean>();
        try {
            String query = "select * from motorphdb"; 
            PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
                        while (rs.next()) {                
                int id = rs.getInt("ID");
                String lastName = rs.getString("Last Name");
                String firstName = rs.getString("First Name");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String password = rs.getString("Password");
                String designation = rs.getString("Designation");
                
                Bean bean = new Bean(id,lastName, firstName, birthday, email, password, designation);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
      
    
    public void insertDataAddEmp(Bean bean){
        try {
         
           String query = "INSERT INTO motorphdb (`Last Name`, `First Name`, Birthday, Email, Password, Designation) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
       

        ps.setString(1, bean.getLastName());
        ps.setString(2, bean.getFirstName());
        ps.setObject(3, bean.getBirthday());
        ps.setString(4, bean.getEmail());
        ps.setString(5, bean.getPassword());
        ps.setString(6, bean.getDesignation());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Employee Successfully Added");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "" + e);
        }
    }
    
   
    
    public Bean returnAllDataToTextField (int id){
        Bean bean = null;
        try {
            String query = "select * from motorphdb where ID = "+id;
            PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {                
                id = rs.getInt("ID");
                String lastName = rs.getString("Last Name");
                String firstName = rs.getString("First Name");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String password = rs.getString("Password");
                String designation = rs.getString("Designation");
                
                bean = new Bean(id, lastName, firstName, birthday, email, password, designation);
             
                }
        } catch (Exception e) {

        }
        return bean;
    }
    
   
    public void updateBirthday(Bean bean){
        try {
            
            String query = "update motorphdb set `Last Name` = ?, `First Name` = ?, Birthday = ?, Email = ?, Password = ?, Designation = ? WHERE ID = ?";
            PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
             ps.setString(1, bean.getLastName());
            ps.setString(2, bean.getFirstName());
            ps.setObject(3,bean.getBirthday());
            ps.setString(4, bean.getEmail());
            ps.setString(5, bean.getPassword());
            ps.setString(6, bean.getDesignation());
            ps.setInt(7, bean.getId());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record has been updated");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }

    
     
 
    
    
    
    public List<Bean> searchEmployee(String keyword) {
        List<Bean> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM motorphdb WHERE ID = ? OR `Last Name` LIKE ? OR `First Name` LIKE ?";
            PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
            ps.setString(1, keyword);
            ps.setString(2, "%" + keyword + "%");
            ps.setString(3, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String lastName = rs.getString("Last Name");
                String firstName = rs.getString("First Name");
                java.sql.Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String password = rs.getString("Password");
                String designation = rs.getString("Designation");

                Bean bean = new Bean(id, lastName, firstName, birthday, email, password, designation);
                list.add(bean);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error searching employees: " + e.getMessage());
        }
        return list;
    }

 public void displayEmployeeInfo(JLabel jLabel53SSSN, JLabel jLabel5PHN, JLabel jLabel55PN, JLabel jLabel45TINN) {
        try {
            // Query to retrieve specific columns based on EmpID
            String query = "SELECT `SSS #`, `Philhealth #`, `Pag-ibig #`, `TIN #` FROM motorphdb WHERE ID = ?";
            PreparedStatement ps = MotorPH_DB.con.prepareStatement(query);
            ps.setInt(1, EmpID); // Assuming EmpID is accessible from this class
            
            ResultSet rs = ps.executeQuery();
            
            // Check if there is a result
            if (rs.next()) {
                // Update JLabels with retrieved values
                jLabel53SSSN.setText(rs.getString("SSS #"));
                jLabel5PHN.setText(rs.getString("Philhealth #"));
                jLabel55PN.setText(rs.getString("Pag-ibig #"));
                jLabel45TINN.setText(rs.getString("TIN #"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    
}
