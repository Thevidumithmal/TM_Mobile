/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Thevidu
 */
public class MRegistration {
      public void saveNewWorker(String workerID,String workerName,String NIC,String contactNo,String userName,String password,String email){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("Insert into registration values('"+workerID+"',"
            + "'"+workerName+"','"+NIC+"','"+contactNo+"','"+userName+"','"+password+"','"+email+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Record is submitted");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
    
}
