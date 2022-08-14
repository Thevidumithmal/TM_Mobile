/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.*;

/**
 *
 * @author Thevidu
 */
public class CLogin {
    
    public ResultSet rst;
    
    public ResultSet getLoginDetails(String username,String password){
    
        MLogin obj=new MLogin();
        rst=obj.checkUser(username, password);
        return rst;
    }
}
