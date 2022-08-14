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
public class CForgetPassword {
    
    public ResultSet getForgotPasswordDetails(int id,String username,String nic,String con){
    
        ResultSet rst;
        
        MForgetPassword obj=new MForgetPassword();
        rst=obj.checkExistingUser(id,username,nic,con);
    
        return rst;
    }
    public int setNewLoginDetails(int id,String password){
    
        MForgetPassword obj=new MForgetPassword();
        int c=obj.updateNewLoginDetails(id,password);
    return c;
    }
}
