/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author AshitaRaghu
 */
public class PieChartDemo {
    public static void main(String[] args){
            PieChart cc = new PieChart("Pie Chart Test","OS comparison",1,1);
            cc.pack();
            cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cc.setVisible(true);
    }
}
