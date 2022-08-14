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
public class CDeleteProduct {
    ResultSet rs;
    
     public ResultSet getSearchProduct(String pID){
    
         MDeleteProduct obj=new MDeleteProduct();
        rs=obj.searchProduct(pID);
        return rs;
     }
     
      public void getDeleteProduct(String pID){
    
        MDeleteProduct obj=new MDeleteProduct();
        obj.saveDeleteProduct(pID); 
     }
}
