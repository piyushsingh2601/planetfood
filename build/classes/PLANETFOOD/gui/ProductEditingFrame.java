/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLANETFOOD.gui;

import PLANETFOOD.dao.CategoryDao;
import PLANETFOOD.dao.ProductDao;
import PLANETFOOD.pojo.Product;
import PLANETFOOD.pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ProductEditingFrame extends javax.swing.JFrame {

    private HashMap<String, String> categories;
    private HashMap<String, Product> productList;
    private String prodName;
    private String catId;
    private double prodPrice;
    private String prodId;
    private String prodIsActive;
    private String catName;
    private Product p;

    public ProductEditingFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        lblUsername.setText("Hello " + UserProfile.getUsername());
        loadProductsDetails();

    }

    public void loadProductsDetails() {
        try {
            categories = CategoryDao.getAllCategoryId();
            for (String catName : categories.keySet()) {
                jcCatId.addItem(catName);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DB", "Exception!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int validateInput() {
        int result = 1;
        prodName = txtProdName.getText();
        if (chkIsActive.isSelected()) {
            prodIsActive = "Y";
        } else {
            prodIsActive = "N";
        }
        try {
            prodPrice = Double.parseDouble(txtProdPrice.getText());
        } catch (Exception ex) {
            result = 0;
        }
        if (prodName.isEmpty()) {
            result = -1;
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkIsActive = new javax.swing.JCheckBox();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jcCatId = new javax.swing.JComboBox<String>();
        jcProdId = new javax.swing.JComboBox<String>();
        txtProdName = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("THE PLANET FOOD APP");
        setName("THE PLANET FOOD APP\n"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("PRODUCT EDITING PANEL");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Product Category");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Product Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Product Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Product Price");

        chkIsActive.setBackground(new java.awt.Color(0, 102, 102));
        chkIsActive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkIsActive.setForeground(new java.awt.Color(240, 240, 240));
        chkIsActive.setText("Is Active");

        btnSaveChanges.setBackground(new java.awt.Color(0, 153, 153));
        btnSaveChanges.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(240, 240, 240));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(240, 240, 240));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jcCatId.setBackground(new java.awt.Color(240, 240, 240));
        jcCatId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcCatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCatIdActionPerformed(evt);
            }
        });

        jcProdId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProdIdActionPerformed(evt);
            }
        });

        txtProdName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtProdPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jcProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkIsActive))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jcProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkIsActive)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveChanges)
                    .addComponent(btnBack))
                .addGap(144, 144, 144))
        );

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Choose Product To Edit");

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(240, 240, 240));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("E:\\SCAPROJECT\\Images\\diet.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminOptionFrame adminFrame = new AdminOptionFrame();
        adminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        int result = validateInput();
        if (result == 0) {
            JOptionPane.showMessageDialog(null, "Please input numeric value for product price", "Invalid Input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (result == -1) {
            JOptionPane.showMessageDialog(null, "Please input Product name", "Invalid input!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            p.setCatId(catId);
            p.setProdId(prodId);
            p.setProdName(prodName);
            p.setIsActive(prodIsActive);
            p.setProdPrice(prodPrice);
            boolean status = ProductDao.updateProduct(p);
            if (status) {
                JOptionPane.showMessageDialog(null, "Product Successfully Updated!", "Success!", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Product not Edited", "Editing Product Denied!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error While Editing Product!", "Exception!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void jcCatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCatIdActionPerformed
        try {
            catName = jcCatId.getSelectedItem().toString();
            catId = categories.get(catName);
            productList = ProductDao.getProductsByCategory(catId);
            jcProdId.removeAllItems();
            for (String x : productList.keySet()) {
                jcProdId.addItem(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception in getProductsByCategory() of productDao");
            e.getStackTrace();
        }


    }//GEN-LAST:event_jcCatIdActionPerformed

    private void jcProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProdIdActionPerformed
        if (jcProdId.getSelectedItem() == null) {
            return;
        }
        prodId = jcProdId.getSelectedItem().toString();
        p = productList.get(prodId);
        txtProdName.setText(p.getProdName());
        txtProdPrice.setText(String.valueOf(p.getProdPrice()));
    }//GEN-LAST:event_jcProdIdActionPerformed

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(Color.white);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(ProductEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductEditingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcCatId;
    private javax.swing.JComboBox<String> jcProdId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    // End of variables declaration//GEN-END:variables
}