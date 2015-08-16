/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.SmartCard;

/**
 *
 * @author AshitaRaghu
 */
public class PayCard implements PaymentStrategy{
    private SmartCard smartCard = new SmartCard();
    double balance=0;
    
     public double pay(double price,double number){
        smartCard.retrieveCardDetails((int)number);
        boolean balance_ok=false;
        balance = smartCard.getBalance();

            if(balance>=price){
                balance_ok = true;
                balance-= price;
            }

            if(balance_ok==true){
                smartCard.setBalance(price);
            }
            else 
                balance = 0.0;

        return balance;
    }
   
}
