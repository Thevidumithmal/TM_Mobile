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
public class MBilling {
    
    public ResultSet searchName(String name){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from customer where name like'"+name+"%'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null; 
    } 
    
     public ResultSet searchcontact(String contactno){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from customer where contactno like'"+contactno+"%'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
     }
     
      public ResultSet searchPID(String pID){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from product where PID='"+pID+"'and stock='Yes'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
     }
      
       public ResultSet searchPname(String pName){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from product where ProductName ='"+pName+"'");
        return rs;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
     }
}
