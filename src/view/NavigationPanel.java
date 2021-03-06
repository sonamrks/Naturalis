/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import main.Main;
import controller.AccessUserController;
import controller.ItemController;
import controller.LoginStrategy;
import controller.MultipleLoginAttempts;
import controller.UserLogController;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonam
 */
public class NavigationPanel extends javax.swing.JPanel {
    
    private LoginPanel loginPanel;
    private static String username;
    private String password;
    private AccessUserController accessUserController;
    private UserLogController userLogController;
    private MultipleLoginAttempts multipleLoginAttempts;
    private LoginStrategy strategy;
    /**
     * Creates new form NavigationPage
     */
    public NavigationPanel() {     
        initComponents();
        loginPanel = new LoginPanel();
        accessUserController = new AccessUserController();
        userLogController = new UserLogController();
        this.setPreferredSize(new java.awt.Dimension(100, 300));
    }
    
    public void setLoginStrategy(LoginStrategy strategy){
        this.strategy = strategy;
    }
    public boolean validate(String username, String password, String role,AccessUserController accessUserController){
        boolean validateOK = strategy.validate(username,password,role,accessUserController);
        return validateOK;
    }
    public String getUserName(){
        return this.username;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        managerButton = new javax.swing.JButton();

        adminButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.jpg"))); // NOI18N
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        customerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.jpg"))); // NOI18N
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });

        managerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manager.png"))); // NOI18N
        managerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(managerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
      int result  = JOptionPane.showConfirmDialog(null, loginPanel,"Please Enter User Name and Password", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            username = loginPanel.getUserName();
            password = loginPanel.getPassword();
            
            setLoginStrategy(new MultipleLoginAttempts());
            boolean validateOK = validate(username,password,"admin",accessUserController);
            
            if(validateOK == true) {
                loginPanel.setUserName();
                loginPanel.setPassword();
                userLogController.addLogInEntry(username,"admin");
                Main.setActivityType(1);
                Main.getCardLayout().show(Main.getCards(),"Machines");
            }
            else {
                loginPanel.setPassword();
                JOptionPane.showMessageDialog(loginPanel, "Invalid username/password");
                
            }
        }  
    }//GEN-LAST:event_adminButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        Main.setActivityType(0);
        Main.getCardLayout().show(Main.getCards(),"Machines");
    }//GEN-LAST:event_customerButtonActionPerformed

    private void managerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerButtonActionPerformed
       
        int result  = JOptionPane.showConfirmDialog(null, loginPanel,"Please Enter User Name and Password", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            username = loginPanel.getUserName();
            password = loginPanel.getPassword();
            
            setLoginStrategy(new MultipleLoginAttempts());
            boolean validateOK = validate(username,password,"manager",accessUserController);
            
            if(validateOK == true) {
                loginPanel.setUserName();
                loginPanel.setPassword();
                userLogController.addLogInEntry(username,"manager");
                Main.setActivityType(2);
                new ManagerUI("M").setVisible(true);
            }
            else {
                loginPanel.setPassword();
                JOptionPane.showMessageDialog(loginPanel, "Invalid username/password");
                
            }
        } 
    }//GEN-LAST:event_managerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JButton managerButton;
    // End of variables declaration//GEN-END:variables
}
