/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author Thevidu
 */
public class CUpdateCustomer {
    ResultSet rs;
    
     public ResultSet getSearchCustomer(String contactno){
    
        MUpdateCustomer obj=new MUpdateCustomer();
        rs=obj.searchCustomer(contactno);
        return rs;
    }
     
      public void getUpdateCustomer(String contactno1,String name,String contactno,String email,String address,String gender){
    
        MUpdateCustomer obj=new MUpdateCustomer();
        obj.saveUpdateCustomer(contactno1,name,contactno,email,address,gender);   
    
    }
}
