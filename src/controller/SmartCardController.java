/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CustomerUI;
import model.SmartCard;

/**
 *
 * @author Sonam
 */
public class SmartCardController {
    int cardNumber;
    double balance=0;
    
    private SmartCard smartCard;
    private CustomerUI customerUI;
    
    public SmartCardController(CustomerUI customerUI) {
        this.customerUI = customerUI;
        smartCard = new SmartCard();
    }
    
    
    public Integer addNewCard(String name,Integer cost){
        return smartCard.createNewCard(name,cost);
    }
    
    public void removeCard(Integer num){
        smartCard.deleteCard(num);
    }
   
    public Double payUsingCard(Double price, Integer cardNumber){
        
        smartCard.retrieveCardDetails(cardNumber);
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
    
    public double reload(int cardNumber, double amount){
        return smartCard.reload(cardNumber,amount);
    }
    
}

