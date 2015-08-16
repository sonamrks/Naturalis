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
public class PaymentContext {
    
    PaymentStrategy strategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }
    public PaymentStrategy getPaymentStrategy(PaymentStrategy strategy){
        return strategy;
    }
    public double pay(double price,double number)
    {
        return strategy.pay(price,number);
    }

    
}
