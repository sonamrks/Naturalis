/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author AshitaRaghu
 */
public class BarChart extends JFrame {
    
    private double beveragesSold;
    private double snacksSold;

    
    public BarChart(){
        
    }
    public void beverageVsSnackBarChart(String appTitle,String chartTitle,double beveragesSold, double snacksSold){
        this.beveragesSold = beveragesSold;
        this.snacksSold = snacksSold;
        
        DefaultCategoryDataset bevSnackDataset = new DefaultCategoryDataset();
        bevSnackDataset.setValue(beveragesSold,"Count sold", "Beverages");
        bevSnackDataset.setValue(snacksSold,"Count sold", "Snacks");
        
        JFreeChart bevSnackchart = ChartFactory.createBarChart3D("Beverage Vs Snack Comparison", "Category", "Count sold", bevSnackDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = bevSnackchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartPanel bevSnackChartPanel = new ChartPanel(bevSnackchart);
        bevSnackChartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(bevSnackChartPanel);
    }
    
    public void itemSoldBarChart(String appTitle,String chartTitle,int[] soldCount){
        
        DefaultCategoryDataset itemsDataset = new DefaultCategoryDataset();
        itemsDataset.setValue(soldCount[0],"Count sold", "Coke");
        itemsDataset.setValue(soldCount[1],"Count sold", "OrangeJuice");
        itemsDataset.setValue(soldCount[2],"Count sold", "Lemonade");
        itemsDataset.setValue(soldCount[3],"Count sold", "Gatorade");
        itemsDataset.setValue(soldCount[4],"Count sold", "Granola");
        itemsDataset.setValue(soldCount[5],"Count sold", "Chips");
        itemsDataset.setValue(soldCount[6],"Count sold", "Nuts");
        itemsDataset.setValue(soldCount[7],"Count sold", "Cookie");
         
        JFreeChart itemschart = ChartFactory.createBarChart3D("Beverage Vs Snack Comparison", "Category", "Count sold", itemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = itemschart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartPanel itemsChartPanel = new ChartPanel(itemschart);
        itemsChartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(itemsChartPanel);
    }
    
}
