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
public class MForgetPassword {
    
    public ResultSet rst;
    public ResultSet checkExistingUser(int id,String username,String nic,String con ){
    
        
        try{
        
            Statement st=MDatabase.createConnection().createStatement();
            rst=st.executeQuery("Select workerid,username,email from registration  where workerid ='"+id+"' and nic='"+nic+"' and username='"+username+"' and contactNo='"+con+"'");
        
            
        
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage(),"Database Error!",JOptionPane.ERROR_MESSAGE);

        }
        
    
    return rst;
    }
    public int updateNewLoginDetails(int id,String password){
     int c=0;
        try{
            
            
        
            Statement st=MDatabase.createConnection().createStatement();
            c=st.executeUpdate("Update registration set password='"+password+"' where workerid='"+id+"'");
        
            
            
            
        
        }
        catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage(),"Database Error!",JOptionPane.ERROR_MESSAGE);

        }
    
    
        return c;
    }
}
