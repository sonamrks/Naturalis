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
    
    public double reload(int cardNumber, double amount){
        return smartCard.reload(cardNumber,amount);
    }
    
    public double checkBalance(int cardNumber){
        return smartCard.checkBalance(cardNumber);
    }
    
    public void retrieveCardDetails(Integer cardNumber){
        smartCard.retrieveCardDetails(cardNumber);
    }
    
    public Double getBalance() {
        return smartCard.getBalance();
    }
    
    public void setBalance(Double balance) {
        smartCard.setBalance(balance);
    }
}

