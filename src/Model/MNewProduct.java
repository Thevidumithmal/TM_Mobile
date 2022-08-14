/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author Thevidu
 */
public class  MNewProduct {
    ResultSet rs;
    
    public ResultSet printProduct(){
    
        try{
        Statement st=MDatabase.createConnection().createStatement
        (ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
         rs=st.executeQuery("select max(PID) from product");
        
        }
        
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
        
    }
    
     public void saveNewProduct(String pid,String name,String price,String description,String stock){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("Insert into product values('"+pid+"','"+name+"','"+price+"','"+description+"','"+stock+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Record is submitted");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
}
