/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
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
        
        DefaultPieDataset beverageItemsDataset = new DefaultPieDataset();
        beverageItemsDataset.setValue("coke", soldCount[0]);
        beverageItemsDataset.setValue("orangeJuice", soldCount[1]);
        beverageItemsDataset.setValue("lemonade", soldCount[2]);
        beverageItemsDataset.setValue("gatorade", soldCount[3]);
        
        
        JFreeChart beverageitemsChart = ChartFactory.createPieChart3D(chartTitle, beverageItemsDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D)beverageitemsChart.getPlot(); 
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.8f);
        
        DefaultPieDataset snackItemsDataset = new DefaultPieDataset();
        snackItemsDataset.setValue("granola", soldCount[4]);
        snackItemsDataset.setValue("chips", soldCount[5]);
        snackItemsDataset.setValue("nuts", soldCount[6]);
        snackItemsDataset.setValue("cookie", soldCount[7]);
        
        JFreeChart snackItemsChart = ChartFactory.createPieChart3D(chartTitle, snackItemsDataset, true, true, false);
        PiePlot3D snackPlot = (PiePlot3D)snackItemsChart.getPlot(); 
        snackPlot.setStartAngle(0);
        snackPlot.setDirection(Rotation.CLOCKWISE);
        snackPlot.setForegroundAlpha(0.8f);
        
        ChartPanel beverageItemsChartPanel = new ChartPanel(beverageitemsChart);
        ChartPanel snackItemsChartPanel = new ChartPanel(snackItemsChart);
        
        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new BorderLayout());
        chartPanel.add(beverageItemsChartPanel,BorderLayout.WEST);
        chartPanel.add(snackItemsChartPanel,BorderLayout.EAST);
        
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 400));
        beverageItemsChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        snackItemsChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        setContentPane(chartPanel);
       // setContentPane(snackItemsChartPanel);
    }
    

    void nutritionalItemsSoldPieChart(String pie_Chart, String chartTitle, int[] nutritionalItemsSoldCount) {
       DefaultPieDataset itemsDataset = new DefaultPieDataset();
        itemsDataset.setValue("Low Calories", nutritionalItemsSoldCount[0]);
        itemsDataset.setValue("High Protein", nutritionalItemsSoldCount[1]);
        itemsDataset.setValue("Low Sugars", nutritionalItemsSoldCount[2]);
        
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
