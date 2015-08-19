/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Observer;
import controller.PayCard;
import controller.PayCash;
import controller.PaymentContext;

/**
 *
 * @author Sonam
 */
public class PaymentPanel extends javax.swing.JPanel  implements Observer {

    private double price;
    private static PaymentContext context;
    /**
     * Creates new form PaymentPanel
     */
    public PaymentPanel() {
        initComponents();    
        insertCoinPanel.setVisible(false);
        insertCardPanel.setVisible(false);
    }
       
    public void updatePrice(double price) {
        priceTextField.setValue(price);
    }
        
    public void Update(String ID){
      //  addItem(ID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel9 = new javax.swing.JLabel();
        insertCardPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        payCardButton = new javax.swing.JButton();
        insertCardMessageTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cardNumberTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JFormattedTextField();
        cashRadioButton = new javax.swing.JRadioButton();
        cardRadioButton = new javax.swing.JRadioButton();

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
                .addContainerGap()
                .addGroup(amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cent10Button)
                    .addComponent(dollar1Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cent25Button)
                    .addComponent(dollar5Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cent50Button)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel9.setText("Pay using cash");

        javax.swing.GroupLayout insertCoinPanelLayout = new javax.swing.GroupLayout(insertCoinPanel);
        insertCoinPanel.setLayout(insertCoinPanelLayout);
        insertCoinPanelLayout.setHorizontalGroup(
            insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCoinPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertCoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertCoinPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(amoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(insertCoinPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(insertNoteLabel)))))
        );
        insertCoinPanelLayout.setVerticalGroup(
            insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCoinPanelLayout.createSequentialGroup()
                .addGroup(insertCoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertCoinPanelLayout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertNoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(insertCoinPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(insertCoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel10.setText("Pay using card");

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
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardNumberTextField))
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addGroup(insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insertCardPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10))
                    .addGroup(insertCardPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(payCardButton)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(insertCardMessageTextField)
        );
        insertCardPanelLayout.setVerticalGroup(
            insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertCardPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(insertCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cardNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(payCardButton)
                .addGap(18, 18, 18)
                .addComponent(insertCardMessageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(paymentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cashRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(cardRadioButton)
                            .addGap(8, 8, 8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paymentPanelLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertCoinPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(insertCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(paymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cent10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent10ButtonActionPerformed
        // TODO add your handling code here:
        price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.10);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>=0)
        priceTextField.setText(Double.toString(remainingPrice));
        else{
            priceTextField.setText("0");
            changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            //  customerUI.giveChange(Double.toString(Math.abs(remainingPrice)));
        }
    }//GEN-LAST:event_cent10ButtonActionPerformed

    private void cent25ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent25ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.25);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>=0)
        priceTextField.setText(Double.toString(remainingPrice));
        else{
            priceTextField.setText("0");
            changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
        }
    }//GEN-LAST:event_cent25ButtonActionPerformed

    private void cent50ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cent50ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 0.50);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>=0)
        priceTextField.setText(Double.toString(remainingPrice));
        else{
            priceTextField.setText("0");
            changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
        }
    }//GEN-LAST:event_cent50ButtonActionPerformed

    private void dollar1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar1ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 1);
        priceTextField.setText(Double.toString(remainingPrice));
        if(remainingPrice>=0)
        priceTextField.setText(Double.toString(remainingPrice));
        else{
            priceTextField.setText("0");
            changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
        }
    }//GEN-LAST:event_dollar1ButtonActionPerformed

    private void dollar5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dollar5ButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.parseDouble(priceTextField.getText());
        double remainingPrice = context.pay(price, 5);
        if(remainingPrice>0)
        priceTextField.setText(Double.toString(remainingPrice));
        else{
            priceTextField.setText("0");
            changeTextField.setText(Double.toString(Math.abs(remainingPrice)));
            item1DispensedLabel.setIcon(new ImageIcon("/images/greekYogurt.jpg"));
        }

    }//GEN-LAST:event_dollar5ButtonActionPerformed

    private void payCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payCardButtonActionPerformed
        // TODO add your handling code here:
        insertCardMessageTextField.setEditable(false);
        double price = Double.parseDouble(priceTextField.getText());
        double cardNumber = Double.parseDouble(cardNumberTextField.getText());

        double remainingBalance = context.pay(price,cardNumber);
        //double remainingBalance = smartCardController.payUsingCard(price,cardNumber);
        if(remainingBalance>=0)
        insertCardMessageTextField.setText("Your remaining balance is : "+Double.toString(remainingBalance));
        else
        insertCardMessageTextField.setText("Sorry! you do not have enough balance");
    }//GEN-LAST:event_payCardButtonActionPerformed

    private void insertCardMessageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCardMessageTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_insertCardMessageTextFieldActionPerformed

    private void cardNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNumberTextFieldActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
        // TODO add your handling code here:
        if(priceTextField.getText()=="0.0")
        item1DispensedLabel.setIcon(new ImageIcon("C:/Ashita/COEN 359 Design Patterns/Project/thumbnail images/greekYogurt.jpg"));
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void cashRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioButtonActionPerformed
        // TODO add your handling code here:
        context = new PaymentContext();
        context.setPaymentStrategy(new PayCash());

        insertCardPanel.setVisible(false);
        insertCoinPanel.setVisible(true);
    }//GEN-LAST:event_cashRadioButtonActionPerformed

    private void cardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardRadioButtonActionPerformed
        // TODO add your handling code here:
        context = new PaymentContext();
        context.setPaymentStrategy(new PayCard());

        insertCoinPanel.setVisible(false);
        insertCardPanel.setVisible(true);
    }//GEN-LAST:event_cardRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amoutPanel;
    private javax.swing.JTextField cardNumberTextField;
    private javax.swing.JRadioButton cardRadioButton;
    private javax.swing.JRadioButton cashRadioButton;
    private javax.swing.JButton cent10Button;
    private javax.swing.JButton cent25Button;
    private javax.swing.JButton cent50Button;
    private javax.swing.JButton dollar1Button;
    private javax.swing.JButton dollar5Button;
    private javax.swing.JTextField insertCardMessageTextField;
    private javax.swing.JPanel insertCardPanel;
    private javax.swing.JLabel insertCoinLabel;
    private javax.swing.JPanel insertCoinPanel;
    private javax.swing.JLabel insertNoteLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton payCardButton;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JFormattedTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
