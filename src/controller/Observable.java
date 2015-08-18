/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.Observer;

/**
 *
 * @author Sonam
 */
public interface Observable {
    public void attachObserver(Observer observer);
    public void dettachObserver(Observer observer);
    public void notifyObserver();
}
