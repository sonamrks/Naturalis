/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author AshitaRaghu
 */
public class PayCard implements PaymentStrategy{
    private SmartCardController smartCardController;
    double balance=0;
    
    public PayCard(SmartCardController smartCardController) {
        this.smartCardController = smartCardController;
    }
    
    public double pay(double price,double number){
        smartCardController.retrieveCardDetails((int)number);
        boolean balance_ok=false;
        balance = smartCardController.getBalance();

            if(balance>=price){
                balance_ok = true;
                balance-= price;
            }

            if(balance_ok==true){
                smartCardController.setBalance(price);
            }
            else 
                balance = 0.0;

        return balance;
    }
   
}
