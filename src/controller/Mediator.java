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
    public void sendMessageToAll(Colleague sender, Integer code);
    public void registerAColleague (Colleague c);
}
