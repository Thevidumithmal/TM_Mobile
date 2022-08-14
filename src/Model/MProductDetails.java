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
public class MProductDetails {
    
     public ResultSet printProduct(String details){
    
        try{
        Statement st=MDatabase.createConnection().createStatement();
        ResultSet rs=st.executeQuery("select*from product");
        return rs;
        }
        
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    
    }
    
}
