/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Mediator;

/**
 *
 * @author Sonam
 */
public interface Collegue {
    public void sendMessage(String type, String product, Integer code, Double value);
    public void receiveMessage(String type, String product, Integer code, Double value);
    public void addMediator (Mediator mediator);
    public String getId();
}

