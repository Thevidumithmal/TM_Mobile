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
public class VDeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form VDeleteProduct
     */
    public VDeleteProduct() {
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
        txt_productId1 = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_productname = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btn_delete = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete Product.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 8, -1, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 0, -1, 53));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 580, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Product ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 83, -1, -1));

        txt_productId1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 112, -1));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 72, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 116, 580, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 147, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 188, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Description");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 229, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Stock");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 270, -1, -1));

        txt_productname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 144, 250, -1));

        txt_description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 226, 250, -1));

        txt_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 185, 250, -1));

        txt_stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 267, 250, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 590, 10));

        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 369, -1, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 369, -1, -1));

        btn_close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 369, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
         setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        setVisible(false);
       new VDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       
       String pID;
       ResultSet rs;
       pID=txt_productId1.getText();
       
        CDeleteProduct obj=new CDeleteProduct();
        rs=obj.getSearchProduct(pID);
        
        try{
        if (rs.next()){
        txt_productname.setText(rs.getString(2));
        txt_price.setText(rs.getString(3));
        txt_description.setText(rs.getString(4));
        txt_stock.setText(rs.getString(5));
        txt_productId1.setEditable(false);
        txt_productname.setEditable(false);
        txt_price.setEditable(false);
        txt_description.setEditable(false);
        txt_stock.setEditable(false);
        }
        else
            JOptionPane.showMessageDialog(null,"Product Id does not Exist");
        
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         if(txt_productId1.getText().isEmpty()||(!(txt_productId1.getText().matches("[0-9]+"))) )
        {
          JOptionPane.showMessageDialog(null,"Enter Correct Product ID","ERROR",JOptionPane.ERROR_MESSAGE);   
        }
        else
         {
            String pID;
              pID=txt_productId1.getText();

             int a =JOptionPane.showConfirmDialog(null, "Do you want to Delete","Select",JOptionPane.YES_NO_OPTION);
             if(a==0)
             {
                  CDeleteProduct obj=new CDeleteProduct();
                  obj.getDeleteProduct(pID);

                  setVisible(false);
                  new VDeleteProduct().setVisible(true);
             }
         }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(VDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
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
    private javax.swing.JTextField txt_productId1;
    private javax.swing.JTextField txt_productname;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}