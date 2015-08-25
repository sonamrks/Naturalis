/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Collegue;

/**
 *
 * @author Sonam
 */
public interface Mediator {
    public void sendMessageToAll(Collegue sender, String type, String product, Integer index, Double value);
    public void registerACollegue (Collegue c);
}
