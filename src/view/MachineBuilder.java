/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Sonam
 */
public class MachineBuilder {
    private MachineManagerPanel machineManager;
    
    public MachineBuilder(MachineManagerPanel machineManager) {
        this.machineManager = machineManager;        
    }
    
    public void loadMachines() {
        Machine machine1 = new Machine(4201);
        Machine machine2 = new Machine(4202);
        machineManager.loadMachine(machine1);
        machineManager.loadMachine(machine2);
        machineManager.generateMachines();
    }
        
    public void addNewMachine(Integer id) {
        Machine newMachine = new Machine(id);
        machineManager.registerMachine(newMachine);
        machineManager.generateMachines();
    }
}
