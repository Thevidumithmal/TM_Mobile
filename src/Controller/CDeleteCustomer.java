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
public class CDeleteCustomer {
    
    ResultSet rs;
    
     public ResultSet getSearchCustomer(String contactno){
    
         MDeleteCustomer obj=new MDeleteCustomer();
        rs=obj.searchCustomer(contactno);
        return rs;
    
    }
     
     public void getDeleteCustomer(String contactno){
    
        MDeleteCustomer obj=new MDeleteCustomer();
        obj.saveDeleteCustomer(contactno); 
     }
}
     
