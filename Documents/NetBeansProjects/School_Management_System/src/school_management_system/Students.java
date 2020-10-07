/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author GRAY COMPUTERS
 */
public class Students { 
    

    
    MY_CONNECTION my_connection = new MY_CONNECTION();
   // create a function to add students ;

  
    public boolean addstudents(String fname, String lname, String phone, String email)
    {  PreparedStatement st;
       ResultSet rs;
       String addQuery = "INSERT INTO `students`( `first_name`,  `last_name`, `phone`, `email`) VALUES (?,?,?,?)";
        return true;
        
        try {
            st= my_connection.createConnection.prepareStatement(addQuery);
            st.setString(1, fname);
             st.setString(2, lname);
            st.setString(3, phone);
            st.setString(4, email);
            
          
             return (st.executeUpdate()>0);
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
           
    
    }
     //create a function to select and edit student 
    public boolean editstudents(int id,String fname, String lname, String phone, String email)
    {
         PreparedStatement ps;
       ResultSet rs;
       String editQuery = " UPDATE `students` SET `id`=?,`first_name`=?,`last_name`=?,`phone`=?,`email`=?";
        return true;
           
        try {
            ps= my_connection.createConnection.prepareStatement(editQuery);
            ps.setString(1, fname);
             ps.setString(2, lname);
            ps.setString(3, phone);
            ps.setString(4, email);
            ps.setInt(5, id);
            
             return (ps.executeUpdate()>0);
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
      
    
    
    
    }
    
     // A function to add students to the fillStudentjtable
    
    
    
    public void fillStudentJTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery =  "SELECT * FROM `students` ";
        
        try {
            ps = my_connection.creatConnection().prepareStatement(selectQuery);
            rs=ps.executeQuery();
            
            DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
            
            Object[] row ;
            while(rs.next())
            { row= new Object [5];
            row[0]= rs.getInt(1);
            row[1]= rs.getString(2);
            row[2]= rs.getString(3);
            row[3]= rs.getString(4);
            row[4]= rs.getString(5);
            
            tabeModel.addRow[];  
            }
            
            
               
                
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
        
    
    
              // create a function to remove selected students;
    public void boolean removeStudent(int id)
{


   PreparedStatement st;
       ResultSet rs;
       String deleteQuery = " DELETE FROM `students` WHERE `id`=?";
        return true;
      
       
            
        try {
            st= my_connection.createConnection.prepareStatement(deleteQuery);
           
            st.setInt(1, id);
            
             return (st.executeUpdate()>0);
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
      
}

}


        
    // create a function to return 
    

