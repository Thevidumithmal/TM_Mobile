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
public class MDeleteProduct {
     public ResultSet searchProduct(String pID){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from product where PID='"+pID+"'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
     }
     
     
     public void saveDeleteProduct(String pID){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("Delete from product where PID='"+pID+"'");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Product delete Successfully");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
}
