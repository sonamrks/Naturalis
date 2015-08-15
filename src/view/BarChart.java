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
    public void BeverageVsSnackBarChart(String appTitle,String chartTitle,double beveragesSold, double snacksSold){
        this.beveragesSold = beveragesSold;
        this.snacksSold = snacksSold;
        
        DefaultCategoryDataset bevSnackDataset = new DefaultCategoryDataset();
        bevSnackDataset.setValue(40,"Count sold", "Beverages");
        bevSnackDataset.setValue(60,"Count sold", "Snacks");
        
        JFreeChart bevSnackchart = ChartFactory.createBarChart3D("Beverage Vs Snack Comparison", "Category", "Count sold", bevSnackDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = bevSnackchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartPanel bevSnackChartPanel = new ChartPanel(bevSnackchart);
        bevSnackChartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(bevSnackChartPanel);
    }
    
}
