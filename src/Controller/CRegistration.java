/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;

/**
 *
 * @author Thevidu
 */
public class CRegistration {
    public void getNewWorker(String workerID,String workerName,String NIC,String contactNo,String userName,String password,String email){
    
        MRegistration obj=new MRegistration();
        obj.saveNewWorker(workerID,workerName,NIC,contactNo,userName,password,email);
    }
    
}
