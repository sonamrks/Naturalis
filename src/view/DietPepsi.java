/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManagerController;

/**
 *
 * @author AshitaRaghu
 */
public class DietPepsi extends javax.swing.JPanel {
     private ManagerController managerController;
    /**
     * Creates new form DietPepsi
     */
    public DietPepsi() {
        initComponents();
        managerController = new ManagerController();
    }
    public void setPrice(double price){
        dietPepsiPriceTextField.setText(Double.toString(price));
    }
    public void setCount(int count){
        dietPepsiCountTextField.setText(Integer.toString(count));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dietPespiImageLabel = new javax.swing.JLabel();
        dietPepsiPriceTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dietPepsiUpdateButton = new javax.swing.JButton();
        dietPepsiCountTextField = new javax.swing.JTextField();
        dietPepsiAddButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        dietPespiImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dietPepsi.jpg"))); // NOI18N

        dietPepsiPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietPepsiPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        dietPepsiUpdateButton.setText("update");
        dietPepsiUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietPepsiUpdateButtonActionPerformed(evt);
            }
        });

        dietPepsiCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietPepsiCountTextFieldActionPerformed(evt);
            }
        });

        dietPepsiAddButton.setText("+");
        dietPepsiAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietPepsiAddButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Count");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dietPespiImageLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dietPepsiPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dietPepsiUpdateButton))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dietPepsiCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dietPepsiAddButton)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dietPepsiPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dietPepsiUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dietPepsiCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dietPepsiAddButton)))
                    .addComponent(dietPespiImageLabel))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dietPepsiPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietPepsiPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietPepsiPriceTextFieldActionPerformed

    private void dietPepsiUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietPepsiUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(dietPepsiPriceTextField.getText());
        managerController.updatePrice(price,111);
    }//GEN-LAST:event_dietPepsiUpdateButtonActionPerformed

    private void dietPepsiCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietPepsiCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietPepsiCountTextFieldActionPerformed

    private void dietPepsiAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietPepsiAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(dietPepsiCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,111);
        dietPepsiCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_dietPepsiAddButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dietPepsiAddButton;
    private javax.swing.JTextField dietPepsiCountTextField;
    private javax.swing.JTextField dietPepsiPriceTextField;
    private javax.swing.JButton dietPepsiUpdateButton;
    private javax.swing.JLabel dietPespiImageLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
