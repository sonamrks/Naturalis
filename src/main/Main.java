/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.ItemController;
import java.awt.CardLayout;
import java.sql.Connection;
import javax.swing.JPanel;
import model.DatabaseConnection;
import view.MachineBuilder;
import view.MachineManagerPanel;
import view.NavigationPanel;

/**
 *
 * @author Sonam
 */
public class Main extends javax.swing.JFrame {

    static private CardLayout cardLayout;
    static private JPanel cards;
    private NavigationPanel navigationPanel;
    private MachineManagerPanel machinesPanel;
    private MachineBuilder machineBuilder;
    static int activityType=1; // Customer is default activity
    /**
     * Creates new form Main
     */
    public Main() {
        setTitle("Naturalis");
        cardLayout = new CardLayout();
        cards = new JPanel(cardLayout);
        navigationPanel = new NavigationPanel();
        machinesPanel = new MachineManagerPanel();
        machineBuilder = new MachineBuilder(machinesPanel);
        machineBuilder.loadMachines();
        cards.add(navigationPanel, "Navigation");
        cards.add(machinesPanel,"Machines");
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DatabaseConnection.getDatabaseConnectionInstance().closeConnection();
    }//GEN-LAST:event_formWindowClosing
    
    static public JPanel getCards() {
        return cards;
    }

    public void setCards(JPanel cards) {
        this.cards = cards;
    }

    static public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }
    
    public static int getActivityType() {
        return activityType;
    }

    public static void setActivityType(int activityType) {
        Main.activityType = activityType;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setContentPane(cards);
                main.setLocationRelativeTo(null);
                main.setSize(750, 500);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
