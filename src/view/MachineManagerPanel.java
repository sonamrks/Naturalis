/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import main.Main;
import controller.ItemController;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Sonam
 */
public class MachineManagerPanel extends javax.swing.JPanel {

    private ArrayList<Machine> machines;
    private ItemController itemController;
    private ImageIcon image;
    private Image bg;
    /**
     * Creates new form machinesListPanel
     */
    public MachineManagerPanel() {
        machines = new ArrayList<Machine>();
        itemController = ItemController.getItemControllerInstance();
        initComponents();
    }
    
    public void loadMachine(Machine machine) {
        machines.add(machine);
    }
    
    public void registerMachine(Machine machine) {
        machines.add(machine);
        itemController.addNewMachine(machine.getId());
    }
    
    public Machine getMachine(int id) {
        return machines.get(id);
    }
    
    public void generateMachines() {
        setLayout(new FlowLayout());
        image = new ImageIcon(this.getClass().getResource("/images/scmap.png"));
        bg = (new ImageIcon(image.getImage().getScaledInstance(1024, 800, java.awt.Image.SCALE_SMOOTH))).getImage();
        for(Machine machine : machines) {
            this.add(new JPanel().add(machine));
        }
        Main.getCards().add(this,"Machines");
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

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(516, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Main.getCardLayout().show(Main.getCards(),"Navigation");
    }//GEN-LAST:event_backButtonActionPerformed
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}