/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.Observer;

/**
 *
 * @author Sonam
 */
public interface Observable {
    public void attachObserver(Observer observer);
    public void dettachObserver(Observer observer);
    public void notifyObservers();
}
