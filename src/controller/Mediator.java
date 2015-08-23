/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Colleague;

/**
 *
 * @author Sonam
 */
public interface Mediator {
    public void sendMessageToAll(Colleague sender, String type, String product, Integer index, Double value);
    public void registerAColleague (Colleague c);
}
