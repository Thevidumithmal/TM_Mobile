

package View;

import Controller.*;
import java.sql.*;
import javax.swing.*;

public class VUpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form VUpdateCustomer
     */
    public VUpdateCustomer() {
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

        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_contactnosearch = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_contactno = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_update = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update Customer.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 11, -1, 59));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer update.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 0, -1, 59));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 88, 580, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 112, -1, -1));

        txt_contactnosearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_contactnosearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 109, 150, -1));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 102, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 580, 12));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 174, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contact No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 211, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 245, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 279, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 313, -1, -1));

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 174, 250, -1));

        txt_contactno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 208, 250, -1));

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 242, 250, -1));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 276, 250, -1));

        txt_gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 310, 250, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 365, 580, 10));

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 393, 119, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 393, 119, -1));

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 393, 119, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        setVisible(false);
        new VUpdateCustomer().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
      
       
        if(txt_contactnosearch.getText().equals("")|| txt_contactnosearch.getText().length()!=10)
        {
              JOptionPane.showMessageDialog(null,"Enter correct Contact No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(!(txt_contactnosearch.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Contact no","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
       else
       {
        
            String contactno;
            ResultSet rs;
            contactno=txt_contactnosearch.getText();

             CUpdateCustomer obj=new CUpdateCustomer();
             rs=obj.getSearchCustomer(contactno);

             try{
             if (rs.next())
             {
             txt_name.setText(rs.getString(1));
             txt_contactno.setText(rs.getString(2));
             txt_email.setText(rs.getString(3));
             txt_address.setText(rs.getString(4));
             txt_gender.setText(rs.getString(5));
             txt_contactnosearch.setEditable(false);
             }
            

             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null, e.getMessage());
             }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
            String contactno1,name,contactno,email,address,gender;
       
        contactno1=txt_contactnosearch.getText();
        name=txt_name.getText();
        contactno=txt_contactno.getText();
        email=txt_email.getText();
        address=txt_address.getText();
        gender=txt_gender.getText();
         if(txt_name.getText().equals(""))
         {
           JOptionPane.showMessageDialog(null,"Name Can't be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
         }
         else if(txt_contactno.getText().equals("")||txt_contactno.getText().length()!=10)
        {
              JOptionPane.showMessageDialog(null,"Enter correct Contact No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
          else if(!(txt_contactno.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Contact no","ERROR",JOptionPane.ERROR_MESSAGE);
        }
          else if((txt_email.getText().equals("")||!txt_email.getText().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{3}$"))){
             JOptionPane.showMessageDialog(null,"Enter correct Email","ERROR",JOptionPane.ERROR_MESSAGE);              
        }
          else if(txt_address.getText().equals(""))
         {
           JOptionPane.showMessageDialog(null,"Address Can't be Empty","ERROR",JOptionPane.ERROR_MESSAGE);
         }
        
         else if (!(txt_gender.getText().matches("Male"))&&!(txt_gender.getText().matches("Female"))&&!(txt_gender.getText().matches("Others")))
         {
             JOptionPane.showMessageDialog(null,"Enter gender for Male,Female or Others","ERROR",JOptionPane.ERROR_MESSAGE);
         }
        else{
                CUpdateCustomer obj=new CUpdateCustomer();
               obj.getUpdateCustomer(contactno1,name,contactno,email,address,gender);

                 setVisible(false);
               new VUpdateCustomer().setVisible(true);
            }
    }//GEN-LAST:event_btn_updateActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contactno;
    private javax.swing.JTextField txt_contactnosearch;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}