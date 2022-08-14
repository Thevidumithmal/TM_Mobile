/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.*;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Thevidu
 */
public class VForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form VForgetPassword
     */
    
    public VForgetPassword() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_workerID = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_NIC = new javax.swing.JTextField();
        txt_contactNo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_send = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 580, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Worker ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 94, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 149, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NIC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 205, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contact No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 260, -1, -1));

        txt_workerID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_workerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 91, 250, -1));

        txt_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 146, 250, -1));

        txt_NIC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 202, 250, -1));

        txt_contactNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_contactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contactNoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 257, 250, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 351, 580, 10));

        btn_send.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btn_send.setText("Send");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });
        getContentPane().add(btn_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 392, 108, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 392, 108, -1));

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 392, 108, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
       
        if(txt_workerID.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null,"Worker ID can't be Empty","ERROR",JOptionPane.ERROR_MESSAGE);   
        }
        else if(!(txt_workerID.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Worker ID","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_username.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null,"Username can't be Empty","ERROR",JOptionPane.ERROR_MESSAGE); 
        }
        else if(txt_NIC.getText().isEmpty())
        {  
            JOptionPane.showMessageDialog(null,"NIC can't be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_NIC.getText().length()<10 || txt_NIC.getText().length()>12 || txt_NIC.getText().length()==11)
        {  
            JOptionPane.showMessageDialog(null,"Please enter correct NIC","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_contactNo.getText().isEmpty()||txt_contactNo.getText().length()!=10)
        {  
            JOptionPane.showMessageDialog(null,"Enter correct Contact No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(!(txt_contactNo.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Contact no","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
       else{
        try{
            String username="",nic="",contactno="";
            int id=0;

            id=Integer.parseInt(txt_workerID.getText());
            username=txt_username.getText();
            nic=txt_NIC.getText();
            contactno=txt_contactNo.getText();
            
            CForgetPassword obj=new  CForgetPassword();
            ResultSet rst=obj.getForgotPasswordDetails(id,username, nic,contactno);
            
             if(rst.next()){
             
             String password=String.valueOf(generateRandomId(8));
             CForgetPassword jj=new CForgetPassword();
             int c= jj.setNewLoginDetails(rst.getInt(1),password);
             
             if(c>0){
               
                   Properties properties = new Properties();
                    properties.put("mail.smtp.auth","true");
                    properties.put("mail.smtp.starttls.enable","true");
                    properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
                    properties.put("mail.smtp.host","smtp.gmail.com");
                    properties.put("mail.smtp.port",587);

                    Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator()
                        {

                            protected PasswordAuthentication getPasswordAuthentication(){

                                return new PasswordAuthentication("tmmobilescenter30@gmail.com","srgeuwszvrzqvmbm");
                            }

                        }

                    );

                    try {

                        MimeMessage message = new MimeMessage(session);

                        message.setFrom(new InternetAddress("tmmobilescenter30@gmail.com"));

                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(rst.getString(3)));

                        message.setSubject("RESET PASSWORD");

                        message.setText("Dear Sir/Madam,\n\nYou have succesfully reset the username and password.\nYour new Credentials are,\n\n\t\t New Password:  "+password+"\n\t\t Username: '"+rst.getString(2)+"'\n\nThank You!\nTM Mobiles,\nThevidu(owner).\n\nThis is a system generated email.\n(Do not reply).");

                        Transport.send(message);

                        JOptionPane.showMessageDialog(null, "Please check your Email address.\n");


                    } 
                    catch (MessagingException mex) {
                        JOptionPane.showMessageDialog(null, mex.getMessage(),"Database Error!",JOptionPane.ERROR_MESSAGE);

                    }
                   
               
               }
             }
             else{
                JOptionPane.showMessageDialog(null,"Cannot find your Account..Enter correct details","ERROR",JOptionPane.ERROR_MESSAGE);
             
             }
            
            
             }
            catch(Exception e)
                 {
                      JOptionPane.showMessageDialog(null, e.getMessage());
                 }
        }
    }//GEN-LAST:event_btn_sendActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        setVisible(false);
        new VForgetPassword().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_contactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactNoKeyTyped
        
    }//GEN-LAST:event_txt_contactNoKeyTyped

    private static char[] generateRandomId(int length) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      return password;
   }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VForgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_contactNo;
    private javax.swing.JTextField txt_username;
    private javax.swing.JTextField txt_workerID;
    // End of variables declaration//GEN-END:variables
}