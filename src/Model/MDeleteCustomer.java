/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Thevidu
 */
public class MDeleteCustomer {
    
     public ResultSet searchCustomer(String contactno){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from customer where contactno='"+contactno+"'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;       
  }
     
     
     public void saveDeleteCustomer(String contactno){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("Delete from customer where contactno='"+contactno+"'");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Customer delete Successfully");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
}
