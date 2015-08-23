/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sonam
 */
public class MachinesPanel extends javax.swing.JPanel {

    private ItemController itemController;
    ImageIcon image;
    Image bg;
    /**
     * Creates new form machinesListPanel
     */
    public MachinesPanel(ItemController itemController) {
        initComponents();
        image = new ImageIcon(this.getClass().getResource("/images/scmap.png"));
        bg = (new ImageIcon(image.getImage().getScaledInstance(1024, 800, java.awt.Image.SCALE_SMOOTH))).getImage();
        repaint();
        this.itemController = itemController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        machine2Button = new javax.swing.JButton();
        machine1Button = new javax.swing.JButton();

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        machine2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendingMachine.png"))); // NOI18N
        machine2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine2ButtonActionPerformed(evt);
            }
        });

        machine1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendingMachine.png"))); // NOI18N
        machine1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine1ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(machine1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(machine2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(136, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(machine2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(machine1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void machine1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1ButtonActionPerformed
        if(Main.getActivityType() == 0)
            new CustomerUI(itemController, 4201).setVisible(true);  
        else 
            new AdminUI(itemController, 4201).setVisible(true);
    }//GEN-LAST:event_machine1ButtonActionPerformed

    private void machine2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2ButtonActionPerformed
        if(Main.getActivityType() == 0)
            new CustomerUI(itemController, 4202).setVisible(true);
        else if(Main.getActivityType() == 1)
            new AdminUI(itemController, 4202).setVisible(true);            
    }//GEN-LAST:event_machine2ButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Main.getCardLayout().show(Main.getCards(),"Navigation");
    }//GEN-LAST:event_backButtonActionPerformed
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton machine1Button;
    private javax.swing.JButton machine2Button;
    // End of variables declaration//GEN-END:variables
}
