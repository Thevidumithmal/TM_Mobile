/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.sql.ResultSet;

/**
 *
 * @author Thevidu
 */
public class CUpdateProduct {
    ResultSet rs;
    
     public ResultSet getSearchProduct(String pId ){
    
        MUpdateProduct obj=new MUpdateProduct();
        rs=obj.searchProduct(pId);
        return rs;
     }
     
     public void getUpdateProduct(String pId,String pName,String price,String description,String stock){
    
        MUpdateProduct obj=new MUpdateProduct();
        obj.saveUpdateProduct(pId,pName,price,description,stock);
     }
}
