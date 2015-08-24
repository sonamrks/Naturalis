/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CartItemsController;
import controller.Observer;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Sonam
 */
public class CartItemsPanel extends javax.swing.JPanel implements Observer {
    
    private JTable cartTable; 
    private static CartItemsController itemsCartController;

    /**
     * Creates new form CartItemsPanel
     */
    public CartItemsPanel(CartItemsController itemsCartController) {
        initComponents();   
        this.itemsCartController = itemsCartController;
        addCartTable();
    }
        
    public void addCartTable() {
        cartTable = new JTable(itemsCartController.getTableModel());
        cartTable.getSelectionModel().addListSelectionListener(itemsCartController);
        JScrollPane cartScrollPane = new JScrollPane(cartTable);
        cartItemsPanel.setLayout(new BorderLayout());
        cartItemsPanel.add(cartScrollPane, BorderLayout.CENTER);       
    }
    
   /* public void updateCartTable() {    
    }*/
       
    public void update(){
        cartTable.setModel(itemsCartController.getTableModel());
    }
    
    public void setItemCodeTextField(String s) {
        hiddenTextField.setText(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        cartItemsPanel = new javax.swing.JPanel();
        hiddenTextField = new javax.swing.JTextField();

        jLabel5.setText("Items to Buy");

        removeButton.setText("Remove");
        removeButton.setActionCommand("Delete");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        cartItemsPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout cartItemsPanelLayout = new javax.swing.GroupLayout(cartItemsPanel);
        cartItemsPanel.setLayout(cartItemsPanelLayout);
        cartItemsPanelLayout.setHorizontalGroup(
            cartItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cartItemsPanelLayout.setVerticalGroup(
            cartItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        hiddenTextField.setEditable(false);
        hiddenTextField.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cartItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(hiddenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeButton)))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartItemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(hiddenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        itemsCartController.removeItem(hiddenTextField.getText());
    }//GEN-LAST:event_removeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartItemsPanel;
    private javax.swing.JTextField hiddenTextField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
