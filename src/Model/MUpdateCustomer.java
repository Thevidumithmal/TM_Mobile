/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.*;
import View.*;

/**
 *
 * @author Thevidu
 */
public class MUpdateCustomer {
    
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
    
    public void saveUpdateCustomer(String contactno1,String name,String contactno,String email,String address,String gender){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("update customer set name='"+name+"',contactno='"+contactno+"',email='"+email+"',address='"+address+"',gender='"+gender+"'where contactno='"+contactno1+"'");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
}
