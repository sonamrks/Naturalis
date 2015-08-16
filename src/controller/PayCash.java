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
public class PayCash implements PaymentStrategy{
    ItemTableModel itemTableModel = new ItemTableModel();
    
    public double pay(double price,double deductable){
       double remainingPrice = price - deductable;
       return remainingPrice;
    }
}
