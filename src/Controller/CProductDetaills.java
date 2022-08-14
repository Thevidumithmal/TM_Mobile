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
public class CProductDetaills {
    
    ResultSet rs;
    
     public ResultSet getPrintProduct(String details){
    
        MProductDetails obj=new MProductDetails();
        rs=obj.printProduct(details);
        return rs;
    
    }
    
}
