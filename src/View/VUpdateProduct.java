/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import java.sql.ResultSet;
import javax.swing.*;

/**
 *
 * @author Thevidu
 */
public class VUpdateProduct extends javax.swing.JFrame {

    /**
     * Creates new form VUpdateProduct
     */
    public VUpdateProduct() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_productID1 = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_productname = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update Product.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 11, -1, 53));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update prodruct.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 101, -1, -1));

        txt_productID1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_productID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_productID1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_productID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 98, 101, -1));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 96, -1, 26));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 580, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 164, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 214, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 265, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Stock");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        txt_productname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 252, -1));

        txt_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 252, -1));

        txt_description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 252, -1));

        txt_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 250, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 351, 580, 10));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 379, -1, -1));

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 379, -1, -1));

        btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 379, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_productID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_productID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_productID1ActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
         setVisible(false);
        new VUpdateProduct().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
      
          if(txt_productID1.getText().equals(""))
        {
              JOptionPane.showMessageDialog(null,"Enter product No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(!(txt_productID1.getText().matches("[0-9]+"))){
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Product No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
       else
       {
        
            String pId;
            ResultSet rs;
            pId=txt_productID1.getText();

             CUpdateProduct obj=new CUpdateProduct();
             rs=obj.getSearchProduct( pId);

             try{
             if (rs.next())
             {
             txt_productname.setText(rs.getString(2));
             txt_price.setText(rs.getString(3));
             txt_description.setText(rs.getString(4));
             txt_stock.setText(rs.getString(5));
             txt_productID1.setEditable(false);

             }
             else
                 JOptionPane.showMessageDialog(null,"Product Id does not Exist");

             }
             catch(Exception e)
             {
                  JOptionPane.showMessageDialog(null, e.getMessage());
             }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String pId,pName,price,description,stock;
       
        pId=txt_productID1.getText();
        pName=txt_productname.getText();
        price=txt_price.getText();
        description=txt_description.getText();
        stock=txt_stock.getText();
        
        if(txt_productID1.getText().equals(""))
        {
              JOptionPane.showMessageDialog(null,"Product ID can't be empty");
        }
        
         else if(txt_productname.getText().equals(""))
        {
                JOptionPane.showMessageDialog(null,"Product Name can't be empty");
        }
         
        else if(!(txt_productID1.getText().matches("[0-9]+")))
        {
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Product No","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if(txt_price.getText().equals(""))
        {
                JOptionPane.showMessageDialog(null,"Price can't be empty");
         }
        else if(!(txt_price.getText().matches("[0-9]+")))
        {
            JOptionPane.showMessageDialog(null,"Please enter numeric values for Price","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
       else if(txt_description.getText().equals(""))
        {
              JOptionPane.showMessageDialog(null,"Discription can't be empty");
        }
       
        else if(txt_stock.getText().equals(""))
        {
              JOptionPane.showMessageDialog(null,"Stock can't be empty");
        }
        
        else if (!(txt_stock.getText().matches("Yes"))&&!(txt_stock.getText().matches("No")))
         {
             JOptionPane.showMessageDialog(null,"Enter Stock for Yes or No","ERROR",JOptionPane.ERROR_MESSAGE);
         }
        
        else{
            CUpdateProduct obj=new CUpdateProduct();
           obj.getUpdateProduct(pId,pName,price,description,stock);

             setVisible(false);
           new VUpdateProduct().setVisible(true);
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
            java.util.logging.Logger.getLogger(VUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VUpdateProduct().setVisible(true);
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_productID1;
    private javax.swing.JTextField txt_productname;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
