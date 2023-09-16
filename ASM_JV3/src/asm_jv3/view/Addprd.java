/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asm_jv3.view;

import Model.SmartPhone;
import Model.view.Stocker;
import Service.QLSPService;
import Service_IMPL.QLSPServiceIMPL;
import Util.Uhelper;
import static com.sun.tools.attach.VirtualMachine.list;
import static java.nio.file.Files.list;
import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author chung
 */
public class Addprd extends javax.swing.JFrame {
    
    QLSPService QLSPV = new QLSPServiceIMPL();
    ASM asm;
    private DefaultComboBoxModel cboModel;
    List<SmartPhone> list = new ArrayList<>();

    /**
     * Creates new form Addprd
     */
    public Addprd(ASM parent) {
        this.asm = parent;
        initComponents();
        loadCBO(QLSPV.getCBOPM());
        setLocationRelativeTo(null);
        
    }
    
    private Addprd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void loadCBO(List<SmartPhone> lst) {
        cboModel = (DefaultComboBoxModel) cboAddProductCategoryID.getModel();
        for (SmartPhone sp : lst) {
            cboModel.addElement(sp.getCategoryId());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddProductCetaID = new javax.swing.JLabel();
        lblAddProductName = new javax.swing.JLabel();
        lblAddProductQuantity = new javax.swing.JLabel();
        txtAddProductQuantity = new javax.swing.JTextField();
        lblAddProductPrice = new javax.swing.JLabel();
        txtAddProductPrice = new javax.swing.JTextField();
        cboAddProductCategoryID = new javax.swing.JComboBox<>();
        btnAddProduct = new javax.swing.JButton();
        btnCancelAddproduct = new javax.swing.JButton();
        lblAddProductTitle = new javax.swing.JLabel();
        txtAddProductName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAddProductCetaID.setText("Category ID");

        lblAddProductName.setText("Name");

        lblAddProductQuantity.setText("Quantity");

        lblAddProductPrice.setText("Price");

        cboAddProductCategoryID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAddProductCategoryIDActionPerformed(evt);
            }
        });

        btnAddProduct.setText("Add");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnCancelAddproduct.setText("Cancel");
        btnCancelAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelAddproductActionPerformed(evt);
            }
        });

        lblAddProductTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAddProductTitle.setText("Add product");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddProductCetaID)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cboAddProductCategoryID, 0, 275, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddProduct)
                                .addGap(131, 131, 131)
                                .addComponent(btnCancelAddproduct)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtAddProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAddProductTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAddProductCetaID, lblAddProductName, lblAddProductPrice, lblAddProductQuantity});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboAddProductCategoryID, txtAddProductName, txtAddProductPrice, txtAddProductQuantity});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddProduct, btnCancelAddproduct});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddProductTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddProductCetaID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboAddProductCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelAddproduct))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddProduct, btnCancelAddproduct, cboAddProductCategoryID, lblAddProductCetaID, lblAddProductName, lblAddProductPrice, lblAddProductQuantity, txtAddProductName, txtAddProductPrice, txtAddProductQuantity});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboAddProductCategoryIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAddProductCategoryIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAddProductCategoryIDActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        int cateID = (int) cboAddProductCategoryID.getSelectedItem();
        String name = txtAddProductName.getText();
        int sl;
        try {
            sl = Integer.parseInt(txtAddProductQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "quantity is number");
            return;
        }
        double price;
        try {
            price = Double.parseDouble(txtAddProductPrice.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "price is number");
            return;
        }
        if (sl > 0 && price > 0) {
            if (valuesDate()) {
                SmartPhone sp = new SmartPhone(cateID, name, sl, price);
                JOptionPane.showMessageDialog(this, QLSPV.addPRD(sp));
                asm.loadDataPM(QLSPV.getListPM());
                this.setVisible(false);
                this.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "must be than 0");
            return;
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnCancelAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelAddproductActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_btnCancelAddproductActionPerformed

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
            java.util.logging.Logger.getLogger(Addprd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addprd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addprd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addprd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addprd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancelAddproduct;
    private javax.swing.JComboBox<String> cboAddProductCategoryID;
    private javax.swing.JLabel lblAddProductCetaID;
    private javax.swing.JLabel lblAddProductName;
    private javax.swing.JLabel lblAddProductPrice;
    private javax.swing.JLabel lblAddProductQuantity;
    private javax.swing.JLabel lblAddProductTitle;
    private javax.swing.JTextField txtAddProductName;
    private javax.swing.JTextField txtAddProductPrice;
    private javax.swing.JTextField txtAddProductQuantity;
    // End of variables declaration//GEN-END:variables
public boolean valuesDate() {
        if (Uhelper.CheckNull(txtAddProductName, "name is not empty")) {
            return false;
        }
        if (Uhelper.CheckNull(txtAddProductPrice, "price is not empty")) {
            return false;
        }
        if (Uhelper.CheckNull(txtAddProductQuantity, "quantity is not empty")) {
            return false;
        }
        return true;
    }
}
