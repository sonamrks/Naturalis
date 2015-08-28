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
import javax.swing.border.Border;
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
    
     public void itemSoldPieChart(String appTitle,String chartTitle,ArrayList<Integer> soldCount){
        
        DefaultPieDataset beverageItemsDataset = new DefaultPieDataset();
        beverageItemsDataset.setValue("coke", soldCount.get(0));
        beverageItemsDataset.setValue("orangeJuice", soldCount.get(1));
        beverageItemsDataset.setValue("lemonade", soldCount.get(2));
        beverageItemsDataset.setValue("gatorade", soldCount.get(3));
        beverageItemsDataset.setValue("frappuccino", soldCount.get(4));
        beverageItemsDataset.setValue("coconut water", soldCount.get(5));
        beverageItemsDataset.setValue("sparkling water", soldCount.get(6));
        beverageItemsDataset.setValue("protein smoothie", soldCount.get(7));
        beverageItemsDataset.setValue("protein shake", soldCount.get(8));
        
        
        JFreeChart beverageitemsChart = ChartFactory.createPieChart3D("Beverages", beverageItemsDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D)beverageitemsChart.getPlot(); 
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.8f);
        
        DefaultPieDataset snackItemsDataset = new DefaultPieDataset();
        snackItemsDataset.setValue("granola", soldCount.get(9));
        snackItemsDataset.setValue("chips", soldCount.get(10));
        snackItemsDataset.setValue("nuts", soldCount.get(11));
        snackItemsDataset.setValue("cookie", soldCount.get(12));
        snackItemsDataset.setValue("dried fruits", soldCount.get(13));
        snackItemsDataset.setValue("popcorn", soldCount.get(14));
        snackItemsDataset.setValue("crackers", soldCount.get(15));
        snackItemsDataset.setValue("veggie straws", soldCount.get(16));
        snackItemsDataset.setValue("greek yogurt", soldCount.get(17));
        
        JFreeChart snackItemsChart = ChartFactory.createPieChart3D("Snacks", snackItemsDataset, true, true, false);
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
    }
    

    void nutritionalItemsSoldPieChart(String pie_Chart, String chartTitle, int[] nutritionalItemsSoldCount,int[] lowCalCount, String[] lowCalNames,int[] highProteinCount, String[] highProteinNames,int[] lowSugarsCount, String[] lowSugarsNames) {
       DefaultPieDataset itemsDataset = new DefaultPieDataset();
        itemsDataset.setValue("Low Calories", nutritionalItemsSoldCount[0]);
        itemsDataset.setValue("High Protein", nutritionalItemsSoldCount[1]);
        itemsDataset.setValue("Low Sugars", nutritionalItemsSoldCount[2]);
        
        JFreeChart itemsChart = ChartFactory.createPieChart3D(chartTitle, itemsDataset, true, true, false);
        PiePlot3D plot = (PiePlot3D)itemsChart.getPlot(); 
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.8f);
        
      
        DefaultCategoryDataset lowCaloriesItemsDataset = new DefaultCategoryDataset();

        for(int i=0 ;lowCalCount[i]!=0; i++){
            lowCaloriesItemsDataset.setValue(lowCalCount[i],"Count sold", lowCalNames[i]);
        }
        
        JFreeChart lowCaloriesItemschart = ChartFactory.createBarChart3D("Low Calories", "Category", "Count sold", lowCaloriesItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot lowCalPlot = lowCaloriesItemschart.getCategoryPlot();
        lowCalPlot.setRangeGridlinePaint(Color.black);
        
        DefaultCategoryDataset highProteinItemsDataset = new DefaultCategoryDataset();
        for(int i=0; highProteinCount[i]!=0; i++){
            highProteinItemsDataset.setValue(highProteinCount[i],"Count sold", highProteinNames[i]);
        }
        
        JFreeChart highProteinItemschart = ChartFactory.createBarChart3D("High Protein", "Category", "Count sold", highProteinItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot highProteinPlot = highProteinItemschart.getCategoryPlot();
        highProteinPlot.setRangeGridlinePaint(Color.black);
        
        DefaultCategoryDataset lowSugarsItemsDataset = new DefaultCategoryDataset();
        for(int i=0; lowSugarsCount[i]!=0; i++){
            lowSugarsItemsDataset.setValue(lowSugarsCount[i],"Count sold", lowSugarsNames[i]);
        }
        
        JFreeChart lowSugarsItemschart = ChartFactory.createBarChart3D("Low Sugars", "Category", "Count sold", lowSugarsItemsDataset, PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot lowSugarsPlot = lowSugarsItemschart.getCategoryPlot();
        lowSugarsPlot.setRangeGridlinePaint(Color.black);
        
        ChartPanel nutritionalChartPanel = new ChartPanel(itemsChart);
        ChartPanel lowCalChartPanel = new ChartPanel(lowCaloriesItemschart);
        ChartPanel highProteinChartPanel = new ChartPanel(highProteinItemschart);
        ChartPanel lowSugarsChartPanel = new ChartPanel(lowSugarsItemschart);
        
        JPanel chartPanel = new JPanel();
        chartPanel.setLayout(new BorderLayout());
        chartPanel.add(nutritionalChartPanel,BorderLayout.NORTH);
        chartPanel.add(lowCalChartPanel,BorderLayout.WEST);
        chartPanel.add(highProteinChartPanel,BorderLayout.CENTER);
        chartPanel.add(lowSugarsChartPanel,BorderLayout.EAST);
        
        
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 400));
        nutritionalChartPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        lowCalChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        highProteinChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        lowSugarsChartPanel.setPreferredSize(new java.awt.Dimension(400, 300));
        setContentPane(chartPanel);
    }
    
}
