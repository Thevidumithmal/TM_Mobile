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
public class MUpdateProduct {
     public ResultSet searchProduct(String pId){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from product where PID='"+pId+"'");
        return rs;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
     }
     
      public void saveUpdateProduct(String pId,String pName,String price,String description,String stock){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("update product set ProductName='"+pName+"',Price='"+price+"',Description='"+description+"',Stock='"+stock+"'where PID='"+pId+"'");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Successfully Updated");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
}
