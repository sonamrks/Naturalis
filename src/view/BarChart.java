/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
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
    
    public void itemSoldBarChart(String appTitle,String chartTitle,int[] soldCount){
        
        DefaultCategoryDataset beverageItemsDataset = new DefaultCategoryDataset();
        beverageItemsDataset.setValue(soldCount[0],"Count sold", "Coke");
        beverageItemsDataset.setValue(soldCount[1],"Count sold", "OrangeJuice");
        beverageItemsDataset.setValue(soldCount[2],"Count sold", "Lemonade");
        beverageItemsDataset.setValue(soldCount[3],"Count sold", "Gatorade");
        beverageItemsDataset.setValue(soldCount[4],"Count sold", "Frappuccino");
        beverageItemsDataset.setValue(soldCount[5],"Count sold", "Coconut Water");
        beverageItemsDataset.setValue(soldCount[6],"Count sold", "Sparkling Water");
        beverageItemsDataset.setValue(soldCount[7],"Count sold", "Protein Smoothie");
        beverageItemsDataset.setValue(soldCount[8],"Count sold", "Protein Shake");
        
        JFreeChart beverageItemschart = ChartFactory.createBarChart3D("Beverages", "Category", "Count sold", beverageItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = beverageItemschart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        DefaultCategoryDataset snackItemsDataset = new DefaultCategoryDataset();
        snackItemsDataset.setValue(soldCount[9],"Count sold", "Granola");
        snackItemsDataset.setValue(soldCount[10],"Count sold", "Chips");
        snackItemsDataset.setValue(soldCount[11],"Count sold", "Nuts");
        snackItemsDataset.setValue(soldCount[12],"Count sold", "Cookie");
        snackItemsDataset.setValue(soldCount[13],"Count sold", "Dried Fruits");
        snackItemsDataset.setValue(soldCount[14],"Count sold", "Popcorn");
        snackItemsDataset.setValue(soldCount[15],"Count sold", "Crackers");
        snackItemsDataset.setValue(soldCount[16],"Count sold", "Veggie Straws");
        snackItemsDataset.setValue(soldCount[17],"Count sold", "Greek Yogurt");
        
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
