/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
    
    public void itemSoldBarChart(String appTitle,String chartTitle,ArrayList<Integer> soldCount){
        
        DefaultCategoryDataset beverageItemsDataset = new DefaultCategoryDataset();
        beverageItemsDataset.setValue(soldCount.get(0),"Count sold", "Coke");
        beverageItemsDataset.setValue(soldCount.get(1),"Count sold", "OrangeJuice");
        beverageItemsDataset.setValue(soldCount.get(2),"Count sold", "Lemonade");
        beverageItemsDataset.setValue(soldCount.get(3),"Count sold", "Gatorade");
        beverageItemsDataset.setValue(soldCount.get(4),"Count sold", "Frappuccino");
        beverageItemsDataset.setValue(soldCount.get(5),"Count sold", "Coconut Water");
        beverageItemsDataset.setValue(soldCount.get(6),"Count sold", "Sparkling Water");
        beverageItemsDataset.setValue(soldCount.get(7),"Count sold", "Protein Smoothie");
        beverageItemsDataset.setValue(soldCount.get(8),"Count sold", "Protein Shake");
        
        JFreeChart beverageItemschart = ChartFactory.createBarChart3D("Beverages", "Category", "Count sold", beverageItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = beverageItemschart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        DefaultCategoryDataset snackItemsDataset = new DefaultCategoryDataset();
        snackItemsDataset.setValue(soldCount.get(9),"Count sold", "Granola");
        snackItemsDataset.setValue(soldCount.get(10),"Count sold", "Chips");
        snackItemsDataset.setValue(soldCount.get(11),"Count sold", "Nuts");
        snackItemsDataset.setValue(soldCount.get(12),"Count sold", "Cookie");
        snackItemsDataset.setValue(soldCount.get(13),"Count sold", "Dried Fruits");
        snackItemsDataset.setValue(soldCount.get(14),"Count sold", "Popcorn");
        snackItemsDataset.setValue(soldCount.get(15),"Count sold", "Crackers");
        snackItemsDataset.setValue(soldCount.get(16),"Count sold", "Veggie Straws");
        snackItemsDataset.setValue(soldCount.get(17),"Count sold", "Greek Yogurt");
        
        JFreeChart snackItemschart = ChartFactory.createBarChart3D("Snacks", "Category", "Count sold", snackItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot snackPlot = snackItemschart.getCategoryPlot();
        snackPlot.setRangeGridlinePaint(Color.black);
        
        ChartPanel beverageItemsChartPanel = new ChartPanel(beverageItemschart);
        ChartPanel snackItemsChartPanel = new ChartPanel(snackItemschart);
        
        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new BorderLayout());
        chartPanel.add(beverageItemsChartPanel,BorderLayout.WEST);
        chartPanel.add(snackItemsChartPanel,BorderLayout.EAST);
        
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 400));
        beverageItemsChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        snackItemsChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        setContentPane(chartPanel);
    }
    
}
