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
public class MLogin {
    public ResultSet rst;
    
    public ResultSet checkUser(String username,String password){
               
        try{
        
            Statement st=MDatabase.createConnection().createStatement();
            rst=st.executeQuery("Select * from registration where username='"+username+"' and password ='"+password+"' ");
        
            
        
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage(),"Database Error!",JOptionPane.ERROR_MESSAGE);

        }
        
     return rst;
    }
    
}
