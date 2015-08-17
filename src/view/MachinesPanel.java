/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Sonam
 */
public class MachinesPanel extends javax.swing.JPanel {

    /**
     * Creates new form machinesListPanel
     */
    public MachinesPanel() {
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

        machine1Button = new javax.swing.JButton();
        machine2Button = new javax.swing.JButton();

        machine1Button.setText("Machine 1");
        machine1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine1ButtonActionPerformed(evt);
            }
        });

        machine2Button.setText("Machine 2");
        machine2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(machine1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(machine2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(machine2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(machine1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void machine1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1ButtonActionPerformed
        if(Main.getActivityType() == 0)
            new AdminUI().setVisible(true);
        else 
            new CustomerUI("machine1").setVisible(true);
    }//GEN-LAST:event_machine1ButtonActionPerformed

    private void machine2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2ButtonActionPerformed
        if(Main.getActivityType() == 0)
            new AdminUI().setVisible(true);
        else 
            new CustomerUI("machine2").setVisible(true);
    }//GEN-LAST:event_machine2ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton machine1Button;
    private javax.swing.JButton machine2Button;
    // End of variables declaration//GEN-END:variables
}
