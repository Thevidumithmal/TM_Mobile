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
public class CCustomerDetails {
     ResultSet rs;
    
     public ResultSet getPrintCustomer(String details){
    
        MCustomerDetails obj=new MCustomerDetails();
        rs=obj.printCustomer(details);
        return rs;
    
    }
}
