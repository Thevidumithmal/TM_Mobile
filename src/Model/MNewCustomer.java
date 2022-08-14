/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Thevidu
 */
public class MNewCustomer {
    public void saveNewCustomer(String name,String contactno,String email,String address,String gender){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        int c=st.executeUpdate("Insert into customer values('"+name+"',"
            + "'"+contactno+"','"+email+"','"+address+"','"+gender+"')");
        
        if(c>0){
            JOptionPane.showMessageDialog(null, "Record is submitted");
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
    
}
