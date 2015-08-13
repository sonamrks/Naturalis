/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AdminController;
import controller.ItemController;
import java.util.ArrayList;

/**
 *
 * @author AshitaRaghu
 */
public class AdminUI extends javax.swing.JFrame {

    private AdminController adminController;
    private static ItemController itemsController;
    /**
     * Creates new form AdminUI
     */
    public AdminUI() {
        initComponents();
        adminController = new AdminController();
        itemsController = new ItemController();
        setProtein();
        setSugars();
        setCarbohydrates();
        setCalories();
        setPrice();
        setCount();
        
    }
    public void setProtein(){
        
        ArrayList<Integer> proteinList = adminController.setProtein();
        
        cokeProteinTextField.setText(Integer.toString(proteinList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setSugars(){
        
        ArrayList<Integer> sugarsList = adminController.setSugars();
        
        cokeSugarsTextField.setText(Integer.toString(sugarsList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setCarbohydrates(){
        
        ArrayList<Integer> carbohydratesList = adminController.setCarbohydrates();
        
        cokeCarbohydratesTextField.setText(Integer.toString(carbohydratesList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setCalories(){
        
        ArrayList<Integer> caloriesList = adminController.setCalories();
        
        cokeCaloriesTextField.setText(Integer.toString(caloriesList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setPrice(){
        
        ArrayList<Double> priceList = adminController.setPrice();
        
        cokePriceTextField.setText(Double.toString(priceList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setCount(){
        
        ArrayList<Integer> countList = adminController.setCount();
        
        cokeCountTextField.setText(Integer.toString(countList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemsScrollPanePanel = new javax.swing.JPanel();
        cokePanel = new javax.swing.JPanel();
        cokeImageLabel = new javax.swing.JLabel();
        cokeInfoPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cokeProteinTextField = new javax.swing.JTextField();
        cokeSugarsTextField = new javax.swing.JTextField();
        cokeCarbohydratesTextField = new javax.swing.JTextField();
        cokeCaloriesTextField = new javax.swing.JTextField();
        cokePriceTextField = new javax.swing.JTextField();
        cokeCountTextField = new javax.swing.JTextField();
        cokeCarbsLabel = new javax.swing.JLabel();
        addCokeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        statisticsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cokeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coke.jpg"))); // NOI18N

        jLabel3.setText("Protein");

        jLabel4.setText("Sugars");

        jLabel6.setText("Calories");

        jLabel7.setText("Price");

        jLabel8.setText("Count");

        cokeProteinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeProteinTextFieldActionPerformed(evt);
            }
        });

        cokeSugarsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeSugarsTextFieldActionPerformed(evt);
            }
        });

        cokeCarbohydratesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCarbohydratesTextFieldActionPerformed(evt);
            }
        });

        cokeCaloriesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCaloriesTextFieldActionPerformed(evt);
            }
        });

        cokePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokePriceTextFieldActionPerformed(evt);
            }
        });

        cokeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCountTextFieldActionPerformed(evt);
            }
        });

        cokeCarbsLabel.setText("Carbs");

        javax.swing.GroupLayout cokeInfoPanelLayout = new javax.swing.GroupLayout(cokeInfoPanel);
        cokeInfoPanel.setLayout(cokeInfoPanelLayout);
        cokeInfoPanelLayout.setHorizontalGroup(
            cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokeProteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addComponent(cokeSugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeCarbohydratesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(cokeCarbsLabel)))
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cokeCaloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                        .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        cokeInfoPanelLayout.setVerticalGroup(
            cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cokeCarbsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cokeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeProteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokeSugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokeCarbohydratesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokeCaloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addCokeButton.setText("+");
        addCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCokeButtonActionPerformed(evt);
            }
        });

        updateButton.setText("update");

        javax.swing.GroupLayout cokePanelLayout = new javax.swing.GroupLayout(cokePanel);
        cokePanel.setLayout(cokePanelLayout);
        cokePanelLayout.setHorizontalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addComponent(cokeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addCokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        cokePanelLayout.setVerticalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCokeButton))
                    .addGroup(cokePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cokeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cokePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cokeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout itemsScrollPanePanelLayout = new javax.swing.GroupLayout(itemsScrollPanePanel);
        itemsScrollPanePanel.setLayout(itemsScrollPanePanelLayout);
        itemsScrollPanePanelLayout.setHorizontalGroup(
            itemsScrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsScrollPanePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsScrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        itemsScrollPanePanelLayout.setVerticalGroup(
            itemsScrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsScrollPanePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        statisticsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Statistics Panel");

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsPanelLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(113, 113, 113))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemsScrollPanePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemsScrollPanePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cokeProteinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeProteinTextFieldActionPerformed
        // TODO add your handling code here:
        System.out.println("Changed to "+cokeProteinTextField.getText());
    }//GEN-LAST:event_cokeProteinTextFieldActionPerformed

    private void cokeSugarsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeSugarsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeSugarsTextFieldActionPerformed

    private void cokeCarbohydratesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCarbohydratesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCarbohydratesTextFieldActionPerformed

    private void cokeCaloriesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCaloriesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCaloriesTextFieldActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void cokeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCountTextFieldActionPerformed

    private void addCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCokeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cokeCountTextField.getText());
        count++;
        adminController.addCoke(count);
        System.out.println(count);
        cokeCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addCokeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCokeButton;
    private javax.swing.JTextField cokeCaloriesTextField;
    private javax.swing.JTextField cokeCarbohydratesTextField;
    private javax.swing.JLabel cokeCarbsLabel;
    private javax.swing.JTextField cokeCountTextField;
    private javax.swing.JLabel cokeImageLabel;
    private javax.swing.JPanel cokeInfoPanel;
    private javax.swing.JPanel cokePanel;
    private javax.swing.JTextField cokePriceTextField;
    private javax.swing.JTextField cokeProteinTextField;
    private javax.swing.JTextField cokeSugarsTextField;
    private javax.swing.JPanel itemsScrollPanePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
