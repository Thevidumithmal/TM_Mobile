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
public class CBilling {
    
     
    ResultSet rs;
    
     public ResultSet getSearchName(String name){
    
         MBilling obj=new MBilling();
        rs=obj.searchName(name);
        return rs;
     } 
     
      public ResultSet getSearchcontact(String contactno){
    
         MBilling obj=new MBilling();
        rs=obj.searchcontact(contactno);
        return rs;
      }
      
      public ResultSet getSearchPID(String pID){
    
         MBilling obj=new MBilling();
        rs=obj.searchPID(pID);
        return rs;
      }
      
       public ResultSet getSearchPname(String pName){
    
         MBilling obj=new MBilling();
        rs=obj.searchPname(pName);
        return rs;
      }
}
