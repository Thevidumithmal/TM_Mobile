/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MNewCustomer;


/**
 *
 * @author Thevidu
 */
public class CNewCustomer {
    public void getNewCustomer(String name,String contactno,String email,String address,String gender){
    
        MNewCustomer obj=new MNewCustomer();
        obj.saveNewCustomer(name,contactno,email,address,gender);   //create object model saveNewcustomer
    
    }
    
}
