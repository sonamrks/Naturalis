/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CartItemsController;
import controller.Observer;
import controller.PayCard;
import controller.PayCash;
import controller.PaymentContext;
import controller.SmartCardController;
import javax.swing.JOptionPane;

/**
 *
 * @author Sonam
 */
public class PaymentPanel extends javax.swing.JPanel implements Observer {

    private CustomerUI customerUI;
    private static CartItemsController itemsCartController;
    private SmartCardController smartCardController;
    private static PaymentContext context;
    private double price;
    /**
     * Creates new form PaymentPanel
     */
    public PaymentPanel(CustomerUI customerUI, CartItemsController itemsCartController) {
        initComponents();   
        this.customerUI = customerUI;
        this.itemsCartController = itemsCartController;
        smartCardController = new SmartCardController();
        insertCoinPanel.setVisible(false);
        insertCardPanel.setVisible(false);
    }
       
 /*   public void updatePrice(double price) {
        priceTextField.setValue(price);
    }*/
        
    @Override
    public void update(){
        priceTextField.setValue(itemsCartController.getTotalPrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void setPaymentPanel(){
       insertCoinPanel.setVisible(false);
       insertCardPanel.setVisible(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentPanel = new javax.swing.JPanel();
        insertCoinPanel = new javax.swing.JPanel();
        insertCoinLabel = new javax.swing.JLabel();
        insertNoteLabel = new javax.swing.JLabel();
        amoutPanel = new javax.swing.JPanel();
        cent10Button = new javax.swing.JButton();
        cent25Button = new javax.swing.JButton();
        cent50Button = new javax.swing.JButton();
        dollar1Button = new javax.swing.JButton();
        dollar5Button = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JFormattedTextField();
        cashRadioButton = new javax.swing.JRadioButton();
        cardRadioButton = new javax.swing.JRadioButton();
        buyCardPanel = new javax.swing.JPanel();
        buyCardLabel = new javax.swing.JLabel();
        dollar10Button = new javax.swing.JButton();
        dollar20Button = new javax.swing.JButton();
        dollar50Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        insertCardPanel = new javax.swing.JPanel();
        payCardButton = new javax.swing.JButton();
        insertCardMessageTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();

        insertCoinLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insertCoin.jpg"))); // NOI18N

        insertNoteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insertNote.png"))); // NOI18N

        cent10Button.setText("10c");
        cent10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent10ButtonActionPerformed(evt);
            }
        });

        cent25Button.setText("25c");
        cent25Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent25ButtonActionPerformed(evt);
            }
        });

        cent50Button.setText("50c");
        cent50Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cent50ButtonActionPerformed(evt);
            }
        });

        dollar1Button.setText("$1");
        dollar1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar1ButtonActionPerformed(evt);
            }
        });

        dollar5Button.setText("$5");
        dollar5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar5ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout amoutPanelLayout = new javax.swing.GroupLayout(amoutPanel);
        amoutPanel.setLayout(amoutPanelLayout);
        amoutPanelLayout.setHorizontalGroup(
            amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amoutPanelLayout.createSequentialGroup()
                        .addComponent(cent10Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dollar1Button))
                    .addGroup(amoutPanelLayout.createSequentialGroup()
                        .addComponent(cent25Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dollar5Button))
                    .addComponent(cent50Button))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        amoutPanelLayout.setVerticalGroup(
            amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amoutPanelLayout.createSequentialGroup()
                .addGroup(amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cent10Button)
                    .addComponent(dollar1Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dollar5Button, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cent25Button, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cent50Button)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout insertCoinPanelLayout = new javax.swing.GroupLayout(insertCoinPanel);
        insertCoinPanel.setLayout(insertCoinPanelLayout);
        insertCoinPanelLayout.setHorizontalGroup(
            insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCoinPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(insertCoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertNoteLabel)))
        );
        insertCoinPanelLayout.setVerticalGroup(
            insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertCoinLabel)
                    .addGroup(insertCoinPanelLayout.createSequentialGroup()
                        .addComponent(insertNoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        priceLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priceLabel.setText("Total Price");

        priceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTextFieldActionPerformed(evt);
            }
        });

        cashRadioButton.setText("Cash");
        cashRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRadioButtonActionPerformed(evt);
            }
        });

        cardRadioButton.setText("Card");
        cardRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashRadioButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardRadioButton)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cashRadioButton)
                    .addComponent(cardRadioButton))
                .addGap(18, 18, 18)
                .addComponent(insertCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buyCardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card.jpg"))); // NOI18N

        dollar10Button.setText("$10");
        dollar10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar10ButtonActionPerformed(evt);
            }
        });

        dollar20Button.setText("$20");
        dollar20Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar20ButtonActionPerformed(evt);
            }
        });

        dollar50Button.setText("$50");
        dollar50Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dollar50ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Buy SmartCal Card");

        jLabel5.setText("Enter your name :");

        javax.swing.GroupLayout buyCardPanelLayout = new javax.swing.GroupLayout(buyCardPanel);
        buyCardPanel.setLayout(buyCardPanelLayout);
        buyCardPanelLayout.setHorizontalGroup(
            buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyCardPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buyCardPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField))
                    .addGroup(buyCardPanelLayout.createSequentialGroup()
                        .addGroup(buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buyCardPanelLayout.createSequentialGroup()
                                .addComponent(buyCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dollar50Button)
                                    .addComponent(dollar20Button)
                                    .addComponent(dollar10Button)))
                            .addGroup(buyCardPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        buyCardPanelLayout.setVerticalGroup(
            buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyCardPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buyCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buyCardLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buyCardPanelLayout.createSequentialGroup()
                        .addComponent(dollar10Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dollar20Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dollar50Button))))
        );

        payCardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insertCard.png"))); // NOI18N
        payCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payCardButtonActionPerformed(evt);
            }
        });

        insertCardMessageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCardMessageTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Enter Card Number : ");

        cardNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNumberTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insertCardPanelLayout = new javax.swing.GroupLayout(insertCardPanel);
        insertCardPanel.setLayout(insertCardPanelLayout);
        insertCardPanelLayout.setHorizontalGroup(
            insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insertCardMessageTextField)
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(payCardButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertCardPanelLayout.setVerticalGroup(
            insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payCardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertCardMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buyCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(paymentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertCardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buyCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardRadioButtonActionPerformed
        // TODO add your handling code here:
        context = new PaymentContext();
        context.setPaymentStrategy(new PayCard());

        insertCoinPanel.setVisible(false);
        insertCardPanel.setVisible(true);
    }//GEN-LAST:event_cardRadioButtonActionPerformed

    private void cashRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioButtonActionPerformed
        // TODO add your handling code here:
        context = new PaymentContext();
        context.setPaymentStrategy(new PayCash());

        insertCardPanel.setVisible(false);
        insertCoinPanel.setVisible(true);
    }//GEN-LAST:event_cashRadioButtonActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
        if(priceTextField.getText()=="0.0"){
            customerUI.dispense();
        }
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void cardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void insertCardMessageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCardMessageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertCardMessageTextFieldActionPerformed

    private void payCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCardButtonActionPerformed
        // TODO add your handling code here:
        insertCardMessageTextField.setEditable(false);
        double price = Double.parseDouble(priceTextField.getText());
        double cardNumber = Double.parseDouble(cardNumberTextField.getText());
        System.out.println(cardNumber);
        if(cardNumber<300000 || cardNumber>400000){
            JOptionPane.showMessageDialog(paymentPanel,"Enter a valid card number");
        }
        double remainingBalance = context.pay(price,cardNumber);
        //double remainingBalance = smartCardController.payUsingCard(price,cardNumber);
        if(remainingBalance>=0)
        insertCardMessageTextField.setText("Your remaining balance is : "+Double.toString(remainingBalance));
        else
        insertCardMessageTextField.setText("Sorry! you do not have enough balance");
    }//GEN-LAST:event_payCardButtonActionPerformed

    private void dollar5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar5ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 5);
        if(remainingPrice>0)
        priceTextField.setText(Double.toString(remainingPrice));
        else if(remainingPrice>0){
            customerUI.giveChange("0.0");
        }
        else{
            priceTextField.setText("0");
            //    changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
            customerUI.dispense();
        }
    }//GEN-LAST:event_dollar5ButtonActionPerformed

    private void dollar1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar1ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 1);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>0)
        priceTextField.setText(Double.toString(remainingPrice));
        else if(remainingPrice>0){
            customerUI.giveChange("0.0");
        }
        else{
            priceTextField.setText("0");
            //  changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
            customerUI.dispense();
        }
    }//GEN-LAST:event_dollar1ButtonActionPerformed

    private void cent50ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent50ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.50);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>0)
        priceTextField.setText(Double.toString(remainingPrice));
        else if(remainingPrice>0){
            customerUI.giveChange("0.0");
        }
        else{
            priceTextField.setText("0");
            //  changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
            customerUI.dispense();
        }
    }//GEN-LAST:event_cent50ButtonActionPerformed

    private void cent25ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent25ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.25);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>0)
        priceTextField.setText(Double.toString(remainingPrice));
        else if(remainingPrice>0){
            customerUI.giveChange("0.0");
        }
        else{
            priceTextField.setText("0");
            //   changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
            customerUI.dispense();
        }
    }//GEN-LAST:event_cent25ButtonActionPerformed

    private void cent10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent10ButtonActionPerformed
        // TODO add your handling code here:
        price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.10);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>0){
            priceTextField.setText(Double.toString(remainingPrice));
        }
        else if(remainingPrice>0){
            customerUI.giveChange("0.0");
        }
        else{
            priceTextField.setText("0");
            //    changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
            customerUI.dispense();
        }
    }//GEN-LAST:event_cent10ButtonActionPerformed

    private void dollar10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar10ButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
        if(name.equals(""))
            JOptionPane.showMessageDialog(paymentPanel,"Please enter a name");

        Integer cardNumber = smartCardController.addNewCard(name, 10);
        JOptionPane.showMessageDialog(paymentPanel,"Your card number is "+cardNumber+". Your current balance is $10");

    }//GEN-LAST:event_dollar10ButtonActionPerformed

    private void dollar20ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar20ButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
         if(name.equals(""))
            JOptionPane.showMessageDialog(paymentPanel,"Please enter a name");
        Integer cardNumber = smartCardController.addNewCard(name, 20);
        JOptionPane.showMessageDialog(paymentPanel,"Your card number is "+cardNumber+". Your current balance is $20");
    }//GEN-LAST:event_dollar20ButtonActionPerformed

    private void dollar50ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar50ButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextField.getText();
         if(name.equals(""))
            JOptionPane.showMessageDialog(paymentPanel,"Please enter a name");
        Integer cardNumber = smartCardController.addNewCard(name, 50);
        JOptionPane.showMessageDialog(paymentPanel,"Your card number is "+cardNumber+". Your current balance is $50");
    }//GEN-LAST:event_dollar50ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amoutPanel;
    private javax.swing.JLabel buyCardLabel;
    private javax.swing.JPanel buyCardPanel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JRadioButton cardRadioButton;
    private javax.swing.JRadioButton cashRadioButton;
    private javax.swing.JButton cent10Button;
    private javax.swing.JButton cent25Button;
    private javax.swing.JButton cent50Button;
    private javax.swing.JButton dollar10Button;
    private javax.swing.JButton dollar1Button;
    private javax.swing.JButton dollar20Button;
    private javax.swing.JButton dollar50Button;
    private javax.swing.JButton dollar5Button;
    private javax.swing.JTextField insertCardMessageTextField;
    private javax.swing.JPanel insertCardPanel;
    private javax.swing.JLabel insertCoinLabel;
    private javax.swing.JPanel insertCoinPanel;
    private javax.swing.JLabel insertNoteLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton payCardButton;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JFormattedTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
