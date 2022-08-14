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
public class CNewProduct {
    ResultSet rs;
    
     public ResultSet getProduct(){
    
        MNewProduct obj=new MNewProduct();
        rs=obj.printProduct();
        return rs;
     }
     
     public void getNewProduct(String pid,String name,String price,String description,String stock){
    
        MNewProduct obj=new MNewProduct();
        obj.saveNewProduct(pid,name,price,description,stock);   
    
    }
}
