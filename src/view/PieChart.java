/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author AshitaRaghu
 */
public class PieChart extends JFrame {
    
    private double beveragesSold;
    private double snacksSold;

    
    public PieChart(){
        
    }
    public void beverageVsSnackPieChart(String appTitle,String chartTitle,double beveragesSold, double snacksSold){
        this.beveragesSold = beveragesSold;
        this.snacksSold = snacksSold;
        
        DefaultPieDataset bevSnackDataset = new DefaultPieDataset();
        bevSnackDataset.setValue("beverages", beveragesSold);
        bevSnackDataset.setValue("snacks", snacksSold);
        
        JFreeChart bevSnackChart = ChartFactory.createPieChart3D(chartTitle, bevSnackDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D)bevSnackChart.getPlot(); 
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.8f);
        
        ChartPanel bevSnackChartPanel = new ChartPanel(bevSnackChart);
        bevSnackChartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(bevSnackChartPanel);
    }
    
     public void itemSoldPieChart(String appTitle,String chartTitle,int[] soldCount){
        
        DefaultPieDataset itemsDataset = new DefaultPieDataset();
        itemsDataset.setValue("coke", soldCount[0]);
        itemsDataset.setValue("orangeJuice", soldCount[1]);
        itemsDataset.setValue("lemonade", soldCount[2]);
        itemsDataset.setValue("gatorade", soldCount[3]);
        itemsDataset.setValue("granola", soldCount[4]);
        itemsDataset.setValue("chips", soldCount[5]);
        itemsDataset.setValue("nuts", soldCount[6]);
        itemsDataset.setValue("cookie", soldCount[7]);
        
        JFreeChart itemsChart = ChartFactory.createPieChart3D(chartTitle, itemsDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D)itemsChart.getPlot(); 
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.8f);
        
        ChartPanel itemsChartPanel = new ChartPanel(itemsChart);
        itemsChartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(itemsChartPanel);
    }
    
}
