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
public class MDatabase {
    public static Connection con;
    
    public static Connection createConnection(){
    
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3308/TM_Mobile","root","");
        
        }
        catch(SQLException e){
        
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return con;
    
    }
}
