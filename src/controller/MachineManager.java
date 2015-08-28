/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import view.CustomerUI;

/**
 *
 * @author Sonam
 */
public class MachineManager {
    ArrayList<CustomerUI> machines = new ArrayList<CustomerUI>();
    
    public void registerMachine (CustomerUI machine) {
        machines.add(machine);
    }
}
