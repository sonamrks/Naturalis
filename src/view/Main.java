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
public class Main {
        public static void main(String args[]) {
    
  //     ItemFactory factory1 = new BeverageFactory();
  //     Item item1 = factory1.createItem("model.Coke");
  //     System.out.println("Coke calories: " + item1.getCalories());
       
   //    Item item2 = factory1.createItem("model.Juice");
   //    System.out.println("Juice calories: " + item2.getCalories());
       
              /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerUI().setVisible(true);
            }
        }); 
    }
    
}
