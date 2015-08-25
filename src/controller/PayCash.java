/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Item;

/**
 *
 * @author AshitaRaghu
 */
public class PayCash implements PaymentStrategy{
    Item itemTableModel = new Item();
    
    public double pay(double price,double deductable){
       double remainingPrice = price - deductable;
       return (double) Math.round(remainingPrice * 100) / 100;
    }
}
