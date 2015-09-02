/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import java.util.ArrayList;

/**
 *
 * @author Sonam
 */
public class MachineBuilder {
    private MachineManagerPanel machineManager;
    private ItemController itemController;
    private ArrayList<Integer> machineIDs;
    
    public MachineBuilder(MachineManagerPanel machineManager) {
        this.machineManager = machineManager;
        itemController = ItemController.getItemControllerInstance();
    }   
    
    public void loadMachines() {
        machineIDs = itemController.getMachines();
        for(Integer id : machineIDs) {
            Machine machine1 = new Machine(id);
            machineManager.loadMachine(machine1);
        }
        machineManager.generateMachines();
    }
        
    public void addNewMachine(Integer id) {
        Machine newMachine = new Machine(id);
        itemController.addNewMachine(id);
        machineManager.registerMachine(newMachine);
        machineManager.generateMachines();
    }
}
