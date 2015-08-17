/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import controller.ManagerController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author AshitaRaghu
 */
public class ManagerUI extends javax.swing.JFrame {

    private ManagerController managerController;
    private static ItemController itemsController;
    /**
     * Creates new form AdminUI
     */
    public ManagerUI() {
        initComponents();
        managerController = new ManagerController();
        itemsController = new ItemController();
        //setProtein();
        //setSugars();
        //setCarbohydrates();
        //setCalories();
        setPrice();
        setCount();
        
    }
    public void setProtein(){
        
        ArrayList<Integer> proteinList = managerController.setProtein();
        
        //cokeProteinTextField.setText(Integer.toString(proteinList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setSugars(){
        
        ArrayList<Integer> sugarsList = managerController.setSugars();
        
        //cokeSugarsTextField.setText(Integer.toString(sugarsList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setCarbohydrates(){
        
        ArrayList<Integer> carbohydratesList = managerController.setCarbohydrates();
        
        //cokeCarbohydratesTextField.setText(Integer.toString(carbohydratesList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setCalories(){
        
        ArrayList<Integer> caloriesList = managerController.setCalories();
        
       // cokeCaloriesTextField.setText(Integer.toString(caloriesList.get(0)));
       /* orangeJuiceCodeLabel.setText(Integer.toString(codeList.get(1)));
        lemonadeCodeLabel.setText(Integer.toString(codeList.get(2)));
        gatoradeCodeLabel.setText(Integer.toString(codeList.get(3)));
        frappuccinoCodeLabel.setText(Integer.toString(codeList.get(4)));
        coconutWaterCodeLabel.setText(Integer.toString(codeList.get(5)));
        sparklingWaterCodeLabel.setText(Integer.toString(codeList.get(6)));
        proteinSmoothieCodeLabel.setText(Integer.toString(codeList.get(7)));
        proteinShakeCodeLabel.setText(Integer.toString(codeList.get(8)));*/
        
        
    }
    public void setPrice(){
        
        ArrayList<Double> priceList = managerController.setPrice();
        
        cokePriceTextField.setText(Double.toString(priceList.get(0)));
        orangePriceTextField.setText(Double.toString(priceList.get(1)));
        lemonadePriceTextField.setText(Double.toString(priceList.get(2)));
        gatoradePriceTextField.setText(Double.toString(priceList.get(3)));
        frappuccinoPriceTextField.setText(Double.toString(priceList.get(4)));
        coconutWaterPriceTextField.setText(Double.toString(priceList.get(5)));
        sparklingWaterPriceTextField.setText(Double.toString(priceList.get(6)));
        proteinSmoothiePriceTextField.setText(Double.toString(priceList.get(7)));
        proteinShakePriceTextField1.setText(Double.toString(priceList.get(8)));
        
        granolaPriceTextField.setText(Double.toString(priceList.get(9)));
        chipsPriceTextField.setText(Double.toString(priceList.get(10)));
        nutsPriceTextField.setText(Double.toString(priceList.get(11)));
        cookiePriceTextField.setText(Double.toString(priceList.get(12)));
        driedFruitsPriceTextField.setText(Double.toString(priceList.get(13)));
        popcornPriceTextField.setText(Double.toString(priceList.get(14)));
        crackersPriceTextField.setText(Double.toString(priceList.get(15)));
        veggieStrawsPriceTextField.setText(Double.toString(priceList.get(16)));
        greekYogurtPriceTextField.setText(Double.toString(priceList.get(17)));
        
        
        
        
    }
    public void setCount(){
        
        ArrayList<Integer> countList = managerController.setCount();
        
        cokeCountTextField.setText(Integer.toString(countList.get(0)));
        orangeCountTextField.setText(Integer.toString(countList.get(1)));
        lemonadeCountTextField.setText(Integer.toString(countList.get(2)));
        gatoradeCountTextField.setText(Integer.toString(countList.get(3)));
        frappuccinoCountTextField.setText(Integer.toString(countList.get(4)));
        coconutWaterCountTextField.setText(Integer.toString(countList.get(5)));
        sparklingWaterCountTextField.setText(Integer.toString(countList.get(6)));
        proteinSmoothieCountTextField.setText(Integer.toString(countList.get(7)));
        proteinShakeCountTextField.setText(Integer.toString(countList.get(8)));
        
        granolaCountTextField.setText(Integer.toString(countList.get(9)));
        chipsCountTextField.setText(Integer.toString(countList.get(10)));
        nutsCountTextField.setText(Integer.toString(countList.get(11)));
        cookieCountTextField.setText(Integer.toString(countList.get(12)));
        driedFruitsCountTextField.setText(Integer.toString(countList.get(13)));
        popcornCountTextField.setText(Integer.toString(countList.get(14)));
        crackersCountTextField.setText(Integer.toString(countList.get(15)));
        veggieStrawsCountTextField.setText(Integer.toString(countList.get(16)));
        greekYogurtCountTextField.setText(Integer.toString(countList.get(17)));
        
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bevSnackMachineButtonGroup = new javax.swing.ButtonGroup();
        itemsMachineButtonGroup = new javax.swing.ButtonGroup();
        nutritionalStatisticsButtonGroup = new javax.swing.ButtonGroup();
        allMachinesButtonGroup = new javax.swing.ButtonGroup();
        statisticsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BevSnacksStatisticsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        beveragesSoldTextField = new javax.swing.JTextField();
        snacksSoldTextField = new javax.swing.JTextField();
        bevSnackPieChartButton = new javax.swing.JButton();
        bevSnackBarChartButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        itemsPieChartButton = new javax.swing.JButton();
        itemsBarChartButton = new javax.swing.JButton();
        nutritionalStatisticsPanel = new javax.swing.JPanel();
        nutritionalStatisticsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        machine1RadioButton = new javax.swing.JRadioButton();
        machine2RadioButton = new javax.swing.JRadioButton();
        allMachinesRadioButton = new javax.swing.JRadioButton();
        itemsScrollPane = new javax.swing.JScrollPane();
        cokePanel = new javax.swing.JPanel();
        frappuccinoPanel = new javax.swing.JPanel();
        frappuccinoImageLabel = new javax.swing.JLabel();
        cokeInfoPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        frappuccinoPriceTextField = new javax.swing.JTextField();
        frappuccinoCountTextField = new javax.swing.JTextField();
        frappuccinoUpdateButton = new javax.swing.JButton();
        addFrappuccinoButton = new javax.swing.JButton();
        orangePanel = new javax.swing.JPanel();
        orangeImageLabel = new javax.swing.JLabel();
        cokeInfoPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        orangePriceTextField = new javax.swing.JTextField();
        orangeCountTextField = new javax.swing.JTextField();
        orangeUpdateButton = new javax.swing.JButton();
        addOrangeButton = new javax.swing.JButton();
        lemonadePanel = new javax.swing.JPanel();
        lemonadeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lemonadePriceTextField = new javax.swing.JTextField();
        lemonadeCountTextField = new javax.swing.JTextField();
        lemonadeUpdateButton = new javax.swing.JButton();
        addLemonadeButton = new javax.swing.JButton();
        gatoradePanel1 = new javax.swing.JPanel();
        gatoradeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gatoradePriceTextField = new javax.swing.JTextField();
        gatoradeCountTextField = new javax.swing.JTextField();
        gatoradeUpdateButton = new javax.swing.JButton();
        addGatoradeButton = new javax.swing.JButton();
        coconutWaterPanel = new javax.swing.JPanel();
        coconutWaterImageLabel = new javax.swing.JLabel();
        cokeInfoPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        coconutWaterPriceTextField = new javax.swing.JTextField();
        coconutWaterCountTextField = new javax.swing.JTextField();
        coconutWaterUpdateButton = new javax.swing.JButton();
        addCoconutWaterButton = new javax.swing.JButton();
        sparlkingWaterPanel = new javax.swing.JPanel();
        sparklingWaterImageLabel = new javax.swing.JLabel();
        cokeInfoPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sparklingWaterPriceTextField = new javax.swing.JTextField();
        sparklingWaterCountTextField = new javax.swing.JTextField();
        sparklingWaterUpdateButton = new javax.swing.JButton();
        addSparklingWaterButton = new javax.swing.JButton();
        cokeInfoPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cokePriceTextField = new javax.swing.JTextField();
        cokeCountTextField = new javax.swing.JTextField();
        updateCokeButton = new javax.swing.JButton();
        addCokeButton = new javax.swing.JButton();
        cokeImageLabel1 = new javax.swing.JLabel();
        proteinSmoothiePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        proteinSmoothiePriceTextField = new javax.swing.JTextField();
        proteinSmoothieCountTextField = new javax.swing.JTextField();
        updateProteinSmoothieButton = new javax.swing.JButton();
        addProteinSmoothieButton = new javax.swing.JButton();
        proteinSmoothieImageLabel = new javax.swing.JLabel();
        granolaShakePanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        granolaPriceTextField = new javax.swing.JTextField();
        granolaCountTextField = new javax.swing.JTextField();
        granolaUpdateButton = new javax.swing.JButton();
        granolaAddButton = new javax.swing.JButton();
        granolaShakeImageLabel = new javax.swing.JLabel();
        proteinShakePanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        proteinShakePriceTextField1 = new javax.swing.JTextField();
        proteinShakeCountTextField = new javax.swing.JTextField();
        proteinShakeUpdateButton1 = new javax.swing.JButton();
        addproteinShakeButton1 = new javax.swing.JButton();
        proteinShakeImageLabel1 = new javax.swing.JLabel();
        chipsShakePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        chipsPriceTextField = new javax.swing.JTextField();
        chipsCountTextField = new javax.swing.JTextField();
        chipsUpdateButton = new javax.swing.JButton();
        chipsAddButton = new javax.swing.JButton();
        chipsImageLabel = new javax.swing.JLabel();
        nutsShakePanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nutsPriceTextField = new javax.swing.JTextField();
        nutsCountTextField = new javax.swing.JTextField();
        nutsUpdateButton = new javax.swing.JButton();
        nutsAddButton = new javax.swing.JButton();
        nutsImageLabel = new javax.swing.JLabel();
        cookieShakePanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cookiePriceTextField = new javax.swing.JTextField();
        cookieCountTextField = new javax.swing.JTextField();
        cookieUpdateButton = new javax.swing.JButton();
        cookieAddButton = new javax.swing.JButton();
        cookieImageLabel = new javax.swing.JLabel();
        driedFruitsPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        driedFruitsPriceTextField = new javax.swing.JTextField();
        driedFruitsCountTextField = new javax.swing.JTextField();
        driedFruitsUpdateButton = new javax.swing.JButton();
        driedFruitsAddButton = new javax.swing.JButton();
        driedFruitsImageLabel = new javax.swing.JLabel();
        popcornPanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        popcornPriceTextField = new javax.swing.JTextField();
        popcornCountTextField = new javax.swing.JTextField();
        popcornUpdateButton = new javax.swing.JButton();
        popcornAddButton = new javax.swing.JButton();
        popcornImageLabel = new javax.swing.JLabel();
        crackersPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        crackersPriceTextField = new javax.swing.JTextField();
        crackersCountTextField = new javax.swing.JTextField();
        crackersUpdateButton = new javax.swing.JButton();
        crackersAddButton = new javax.swing.JButton();
        crackersImageLabel = new javax.swing.JLabel();
        veggieStrawsPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        veggieStrawsPriceTextField = new javax.swing.JTextField();
        veggieStrawsCountTextField = new javax.swing.JTextField();
        veggieStrawsUpdateButton = new javax.swing.JButton();
        veggieStrawsAddButton = new javax.swing.JButton();
        veggieStrawsImageLabel = new javax.swing.JLabel();
        greekYogurtPanel = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        greekYogurtPriceTextField = new javax.swing.JTextField();
        greekYogurtCountTextField = new javax.swing.JTextField();
        greekYogurtUpdateButton = new javax.swing.JButton();
        greekYogurtAddButton = new javax.swing.JButton();
        greekYogurtImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statisticsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Statistics Panel");

        BevSnacksStatisticsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Number of Beverages Sold :");

        jLabel3.setText("Number of Snacks Sold : ");

        beveragesSoldTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beveragesSoldTextFieldActionPerformed(evt);
            }
        });

        snacksSoldTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snacksSoldTextFieldActionPerformed(evt);
            }
        });

        bevSnackPieChartButton.setText("Pie Chart");
        bevSnackPieChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bevSnackPieChartButtonActionPerformed(evt);
            }
        });

        bevSnackBarChartButton.setText("Bar Chart");
        bevSnackBarChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bevSnackBarChartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BevSnacksStatisticsPanelLayout = new javax.swing.GroupLayout(BevSnacksStatisticsPanel);
        BevSnacksStatisticsPanel.setLayout(BevSnacksStatisticsPanelLayout);
        BevSnacksStatisticsPanelLayout.setHorizontalGroup(
            BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                        .addGroup(BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(beveragesSoldTextField))
                            .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(snacksSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))
                    .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                        .addComponent(bevSnackPieChartButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bevSnackBarChartButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BevSnacksStatisticsPanelLayout.setVerticalGroup(
            BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BevSnacksStatisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(beveragesSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(snacksSoldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BevSnacksStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bevSnackPieChartButton)
                    .addComponent(bevSnackBarChartButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("All items Statistics");

        itemsPieChartButton.setText("Pie Chart");
        itemsPieChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsPieChartButtonActionPerformed(evt);
            }
        });

        itemsBarChartButton.setText("Bar Chart");
        itemsBarChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsBarChartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(itemsPieChartButton)
                        .addGap(34, 34, 34)
                        .addComponent(itemsBarChartButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsPieChartButton)
                    .addComponent(itemsBarChartButton))
                .addGap(30, 30, 30))
        );

        nutritionalStatisticsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nutritionalStatisticsButton.setText("Nutritional Statistics");
        nutritionalStatisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutritionalStatisticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nutritionalStatisticsPanelLayout = new javax.swing.GroupLayout(nutritionalStatisticsPanel);
        nutritionalStatisticsPanel.setLayout(nutritionalStatisticsPanelLayout);
        nutritionalStatisticsPanelLayout.setHorizontalGroup(
            nutritionalStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutritionalStatisticsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nutritionalStatisticsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );
        nutritionalStatisticsPanelLayout.setVerticalGroup(
            nutritionalStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutritionalStatisticsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(nutritionalStatisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Sales Satistics");

        allMachinesButtonGroup.add(machine1RadioButton);
        machine1RadioButton.setText("Machine 1");
        machine1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine1RadioButtonActionPerformed(evt);
            }
        });

        allMachinesButtonGroup.add(machine2RadioButton);
        machine2RadioButton.setText("Machine 2");
        machine2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine2RadioButtonActionPerformed(evt);
            }
        });

        allMachinesButtonGroup.add(allMachinesRadioButton);
        allMachinesRadioButton.setText("All Machines");
        allMachinesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMachinesRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(machine1RadioButton)
                        .addGap(37, 37, 37)
                        .addComponent(machine2RadioButton)
                        .addGap(30, 30, 30)
                        .addComponent(allMachinesRadioButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(machine1RadioButton)
                    .addComponent(machine2RadioButton)
                    .addComponent(allMachinesRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nutritionalStatisticsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(statisticsPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(BevSnacksStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BevSnacksStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(nutritionalStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        frappuccinoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frappuccino.jpg"))); // NOI18N

        jLabel11.setText("Price");

        jLabel12.setText("Count");

        frappuccinoPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoPriceTextFieldActionPerformed(evt);
            }
        });

        frappuccinoCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoCountTextFieldActionPerformed(evt);
            }
        });

        frappuccinoUpdateButton.setText("update");
        frappuccinoUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoUpdateButtonActionPerformed(evt);
            }
        });

        addFrappuccinoButton.setText("+");
        addFrappuccinoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFrappuccinoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel1Layout = new javax.swing.GroupLayout(cokeInfoPanel1);
        cokeInfoPanel1.setLayout(cokeInfoPanel1Layout);
        cokeInfoPanel1Layout.setHorizontalGroup(
            cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frappuccinoPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frappuccinoUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFrappuccinoButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel1Layout.setVerticalGroup(
            cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frappuccinoPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frappuccinoUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFrappuccinoButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout frappuccinoPanelLayout = new javax.swing.GroupLayout(frappuccinoPanel);
        frappuccinoPanel.setLayout(frappuccinoPanelLayout);
        frappuccinoPanelLayout.setHorizontalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(frappuccinoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frappuccinoPanelLayout.setVerticalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(frappuccinoImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        orangeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/orange.jpg"))); // NOI18N

        jLabel13.setText("Price");

        jLabel14.setText("Count");

        orangePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangePriceTextFieldActionPerformed(evt);
            }
        });

        orangeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeCountTextFieldActionPerformed(evt);
            }
        });

        orangeUpdateButton.setText("update");
        orangeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeUpdateButtonActionPerformed(evt);
            }
        });

        addOrangeButton.setText("+");
        addOrangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrangeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel2Layout = new javax.swing.GroupLayout(cokeInfoPanel2);
        cokeInfoPanel2.setLayout(cokeInfoPanel2Layout);
        cokeInfoPanel2Layout.setHorizontalGroup(
            cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orangePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangeUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addOrangeButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel2Layout.setVerticalGroup(
            cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orangeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrangeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addComponent(orangeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cokeInfoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orangePanelLayout.setVerticalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orangeImageLabel)
                    .addComponent(cokeInfoPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lemonadeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lemonade.jpg"))); // NOI18N

        jLabel15.setText("Price");

        jLabel16.setText("Count");

        lemonadePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadePriceTextFieldActionPerformed(evt);
            }
        });

        lemonadeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeCountTextFieldActionPerformed(evt);
            }
        });

        lemonadeUpdateButton.setText("update");
        lemonadeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeUpdateButtonActionPerformed(evt);
            }
        });

        addLemonadeButton.setText("+");
        addLemonadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLemonadeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel3Layout = new javax.swing.GroupLayout(cokeInfoPanel3);
        cokeInfoPanel3.setLayout(cokeInfoPanel3Layout);
        cokeInfoPanel3Layout.setHorizontalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lemonadePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lemonadeUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lemonadeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLemonadeButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel3Layout.setVerticalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lemonadePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lemonadeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lemonadeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLemonadeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout lemonadePanelLayout = new javax.swing.GroupLayout(lemonadePanel);
        lemonadePanel.setLayout(lemonadePanelLayout);
        lemonadePanelLayout.setHorizontalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addComponent(lemonadeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cokeInfoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lemonadePanelLayout.setVerticalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lemonadeImageLabel1)
                    .addComponent(cokeInfoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gatoradeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gatorade.jpg"))); // NOI18N

        jLabel17.setText("Price");

        jLabel18.setText("Count");

        gatoradePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradePriceTextFieldActionPerformed(evt);
            }
        });

        gatoradeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradeCountTextFieldActionPerformed(evt);
            }
        });

        gatoradeUpdateButton.setText("update");
        gatoradeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradeUpdateButtonActionPerformed(evt);
            }
        });

        addGatoradeButton.setText("+");
        addGatoradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGatoradeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel4Layout = new javax.swing.GroupLayout(cokeInfoPanel4);
        cokeInfoPanel4.setLayout(cokeInfoPanel4Layout);
        cokeInfoPanel4Layout.setHorizontalGroup(
            cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gatoradePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gatoradeUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGatoradeButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel4Layout.setVerticalGroup(
            cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gatoradePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gatoradeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGatoradeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout gatoradePanel1Layout = new javax.swing.GroupLayout(gatoradePanel1);
        gatoradePanel1.setLayout(gatoradePanel1Layout);
        gatoradePanel1Layout.setHorizontalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addComponent(gatoradeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cokeInfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gatoradePanel1Layout.setVerticalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gatoradeImageLabel1)
                    .addComponent(cokeInfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        coconutWaterImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coconutWater.jpg"))); // NOI18N

        jLabel19.setText("Price");

        jLabel20.setText("Count");

        coconutWaterPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterPriceTextFieldActionPerformed(evt);
            }
        });

        coconutWaterCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterCountTextFieldActionPerformed(evt);
            }
        });

        coconutWaterUpdateButton.setText("update");
        coconutWaterUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterUpdateButtonActionPerformed(evt);
            }
        });

        addCoconutWaterButton.setText("+");
        addCoconutWaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoconutWaterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel5Layout = new javax.swing.GroupLayout(cokeInfoPanel5);
        cokeInfoPanel5.setLayout(cokeInfoPanel5Layout);
        cokeInfoPanel5Layout.setHorizontalGroup(
            cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(coconutWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCoconutWaterButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel5Layout.setVerticalGroup(
            cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coconutWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coconutWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCoconutWaterButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout coconutWaterPanelLayout = new javax.swing.GroupLayout(coconutWaterPanel);
        coconutWaterPanel.setLayout(coconutWaterPanelLayout);
        coconutWaterPanelLayout.setHorizontalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coconutWaterPanelLayout.setVerticalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeInfoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sparklingWaterImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sparklingWater.jpg"))); // NOI18N

        jLabel21.setText("Price");

        jLabel22.setText("Count");

        sparklingWaterPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterPriceTextFieldActionPerformed(evt);
            }
        });

        sparklingWaterCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterCountTextFieldActionPerformed(evt);
            }
        });

        sparklingWaterUpdateButton.setText("update");
        sparklingWaterUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterUpdateButtonActionPerformed(evt);
            }
        });

        addSparklingWaterButton.setText("+");
        addSparklingWaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSparklingWaterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel6Layout = new javax.swing.GroupLayout(cokeInfoPanel6);
        cokeInfoPanel6.setLayout(cokeInfoPanel6Layout);
        cokeInfoPanel6Layout.setHorizontalGroup(
            cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sparklingWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sparklingWaterUpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSparklingWaterButton)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(68, 68, 68))
        );
        cokeInfoPanel6Layout.setVerticalGroup(
            cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sparklingWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sparklingWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSparklingWaterButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sparlkingWaterPanelLayout.setVerticalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeInfoPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel9.setText("Price");

        jLabel10.setText("Count");

        cokePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokePriceTextFieldActionPerformed(evt);
            }
        });

        cokeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCountTextFieldActionPerformed(evt);
            }
        });

        updateCokeButton.setText("update");
        updateCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCokeButtonActionPerformed(evt);
            }
        });

        addCokeButton.setText("+");
        addCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCokeButtonActionPerformed(evt);
            }
        });

        cokeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coke.jpg"))); // NOI18N

        javax.swing.GroupLayout cokeInfoPanel7Layout = new javax.swing.GroupLayout(cokeInfoPanel7);
        cokeInfoPanel7.setLayout(cokeInfoPanel7Layout);
        cokeInfoPanel7Layout.setHorizontalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateCokeButton))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCokeButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        cokeInfoPanel7Layout.setVerticalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateCokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCokeButton))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel7.setText("Price");

        jLabel8.setText("Count");

        proteinSmoothiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinSmoothiePriceTextFieldActionPerformed(evt);
            }
        });

        proteinSmoothieCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinSmoothieCountTextFieldActionPerformed(evt);
            }
        });

        updateProteinSmoothieButton.setText("update");
        updateProteinSmoothieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProteinSmoothieButtonActionPerformed(evt);
            }
        });

        addProteinSmoothieButton.setText("+");
        addProteinSmoothieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProteinSmoothieButtonActionPerformed(evt);
            }
        });

        proteinSmoothieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinSmoothie.jpg"))); // NOI18N

        javax.swing.GroupLayout proteinSmoothiePanelLayout = new javax.swing.GroupLayout(proteinSmoothiePanel);
        proteinSmoothiePanel.setLayout(proteinSmoothiePanelLayout);
        proteinSmoothiePanelLayout.setHorizontalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateProteinSmoothieButton))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProteinSmoothieButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        proteinSmoothiePanelLayout.setVerticalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProteinSmoothieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProteinSmoothieButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        jLabel23.setText("Price");

        jLabel24.setText("Count");

        granolaPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaPriceTextFieldActionPerformed(evt);
            }
        });

        granolaCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaCountTextFieldActionPerformed(evt);
            }
        });

        granolaUpdateButton.setText("update");
        granolaUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaUpdateButtonActionPerformed(evt);
            }
        });

        granolaAddButton.setText("+");
        granolaAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaAddButtonActionPerformed(evt);
            }
        });

        granolaShakeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/granola.jpg"))); // NOI18N

        javax.swing.GroupLayout granolaShakePanelLayout = new javax.swing.GroupLayout(granolaShakePanel);
        granolaShakePanel.setLayout(granolaShakePanelLayout);
        granolaShakePanelLayout.setHorizontalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaUpdateButton))
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        granolaShakePanelLayout.setVerticalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel23))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel25.setText("Price");

        jLabel26.setText("Count");

        proteinShakePriceTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakePriceTextField1ActionPerformed(evt);
            }
        });

        proteinShakeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakeCountTextFieldActionPerformed(evt);
            }
        });

        proteinShakeUpdateButton1.setText("update");
        proteinShakeUpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakeUpdateButton1ActionPerformed(evt);
            }
        });

        addproteinShakeButton1.setText("+");
        addproteinShakeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproteinShakeButton1ActionPerformed(evt);
            }
        });

        proteinShakeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinShake.jpg"))); // NOI18N

        javax.swing.GroupLayout proteinShakePanel1Layout = new javax.swing.GroupLayout(proteinShakePanel1);
        proteinShakePanel1.setLayout(proteinShakePanel1Layout);
        proteinShakePanel1Layout.setHorizontalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proteinShakeUpdateButton1))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addproteinShakeButton1)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        proteinShakePanel1Layout.setVerticalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel25))
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proteinShakeUpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addproteinShakeButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel27.setText("Price");

        jLabel28.setText("Count");

        chipsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsPriceTextFieldActionPerformed(evt);
            }
        });

        chipsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsCountTextFieldActionPerformed(evt);
            }
        });

        chipsUpdateButton.setText("update");
        chipsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsUpdateButtonActionPerformed(evt);
            }
        });

        chipsAddButton.setText("+");
        chipsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsAddButtonActionPerformed(evt);
            }
        });

        chipsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chips.jpg"))); // NOI18N

        javax.swing.GroupLayout chipsShakePanelLayout = new javax.swing.GroupLayout(chipsShakePanel);
        chipsShakePanel.setLayout(chipsShakePanelLayout);
        chipsShakePanelLayout.setHorizontalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(chipsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsUpdateButton))
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        chipsShakePanelLayout.setVerticalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel27))
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel29.setText("Price");

        jLabel30.setText("Count");

        nutsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsPriceTextFieldActionPerformed(evt);
            }
        });

        nutsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsCountTextFieldActionPerformed(evt);
            }
        });

        nutsUpdateButton.setText("update");
        nutsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsUpdateButtonActionPerformed(evt);
            }
        });

        nutsAddButton.setText("+");
        nutsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsAddButtonActionPerformed(evt);
            }
        });

        nutsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuts.jpg"))); // NOI18N

        javax.swing.GroupLayout nutsShakePanelLayout = new javax.swing.GroupLayout(nutsShakePanel);
        nutsShakePanel.setLayout(nutsShakePanelLayout);
        nutsShakePanelLayout.setHorizontalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(nutsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutsUpdateButton))
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutsAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        nutsShakePanelLayout.setVerticalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel29))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(nutsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel31.setText("Price");

        jLabel32.setText("Count");

        cookiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiePriceTextFieldActionPerformed(evt);
            }
        });

        cookieCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieCountTextFieldActionPerformed(evt);
            }
        });

        cookieUpdateButton.setText("update");
        cookieUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieUpdateButtonActionPerformed(evt);
            }
        });

        cookieAddButton.setText("+");
        cookieAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieAddButtonActionPerformed(evt);
            }
        });

        cookieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cookie.jpg"))); // NOI18N

        javax.swing.GroupLayout cookieShakePanelLayout = new javax.swing.GroupLayout(cookieShakePanel);
        cookieShakePanel.setLayout(cookieShakePanelLayout);
        cookieShakePanelLayout.setHorizontalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cookieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieUpdateButton))
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        cookieShakePanelLayout.setVerticalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel31))
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cookieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel33.setText("Price");

        jLabel34.setText("Count");

        driedFruitsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsPriceTextFieldActionPerformed(evt);
            }
        });

        driedFruitsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsCountTextFieldActionPerformed(evt);
            }
        });

        driedFruitsUpdateButton.setText("update");
        driedFruitsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsUpdateButtonActionPerformed(evt);
            }
        });

        driedFruitsAddButton.setText("+");
        driedFruitsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsAddButtonActionPerformed(evt);
            }
        });

        driedFruitsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/driedFruits.jpg"))); // NOI18N

        javax.swing.GroupLayout driedFruitsPanelLayout = new javax.swing.GroupLayout(driedFruitsPanel);
        driedFruitsPanel.setLayout(driedFruitsPanelLayout);
        driedFruitsPanelLayout.setHorizontalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addComponent(driedFruitsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driedFruitsUpdateButton))
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addComponent(driedFruitsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driedFruitsAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        driedFruitsPanelLayout.setVerticalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel33))
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driedFruitsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel35.setText("Price");

        jLabel36.setText("Count");

        popcornPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornPriceTextFieldActionPerformed(evt);
            }
        });

        popcornCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornCountTextFieldActionPerformed(evt);
            }
        });

        popcornUpdateButton.setText("update");
        popcornUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornUpdateButtonActionPerformed(evt);
            }
        });

        popcornAddButton.setText("+");
        popcornAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornAddButtonActionPerformed(evt);
            }
        });

        popcornImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popcorn.jpg"))); // NOI18N

        javax.swing.GroupLayout popcornPanelLayout = new javax.swing.GroupLayout(popcornPanel);
        popcornPanel.setLayout(popcornPanelLayout);
        popcornPanelLayout.setHorizontalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(popcornImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popcornUpdateButton))
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popcornAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        popcornPanelLayout.setVerticalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel35))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(popcornImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel37.setText("Price");

        jLabel38.setText("Count");

        crackersPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersPriceTextFieldActionPerformed(evt);
            }
        });

        crackersCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersCountTextFieldActionPerformed(evt);
            }
        });

        crackersUpdateButton.setText("update");
        crackersUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersUpdateButtonActionPerformed(evt);
            }
        });

        crackersAddButton.setText("+");
        crackersAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersAddButtonActionPerformed(evt);
            }
        });

        crackersImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crackers.jpg"))); // NOI18N

        javax.swing.GroupLayout crackersPanelLayout = new javax.swing.GroupLayout(crackersPanel);
        crackersPanel.setLayout(crackersPanelLayout);
        crackersPanelLayout.setHorizontalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(crackersImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crackersUpdateButton))
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crackersAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        crackersPanelLayout.setVerticalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37))
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(crackersImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel39.setText("Price");

        jLabel40.setText("Count");

        veggieStrawsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsPriceTextFieldActionPerformed(evt);
            }
        });

        veggieStrawsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsCountTextFieldActionPerformed(evt);
            }
        });

        veggieStrawsUpdateButton.setText("update");
        veggieStrawsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsUpdateButtonActionPerformed(evt);
            }
        });

        veggieStrawsAddButton.setText("+");
        veggieStrawsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsAddButtonActionPerformed(evt);
            }
        });

        veggieStrawsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veggieStraws.jpg"))); // NOI18N

        javax.swing.GroupLayout veggieStrawsPanelLayout = new javax.swing.GroupLayout(veggieStrawsPanel);
        veggieStrawsPanel.setLayout(veggieStrawsPanelLayout);
        veggieStrawsPanelLayout.setHorizontalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veggieStrawsUpdateButton))
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veggieStrawsAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        veggieStrawsPanelLayout.setVerticalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel39))
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel41.setText("Price");

        jLabel42.setText("Count");

        greekYogurtPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtPriceTextFieldActionPerformed(evt);
            }
        });

        greekYogurtCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextFieldActionPerformed(evt);
            }
        });

        greekYogurtUpdateButton.setText("update");
        greekYogurtUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtUpdateButtonActionPerformed(evt);
            }
        });

        greekYogurtAddButton.setText("+");
        greekYogurtAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtAddButtonActionPerformed(evt);
            }
        });

        greekYogurtImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greekYogurt.jpg"))); // NOI18N

        javax.swing.GroupLayout greekYogurtPanelLayout = new javax.swing.GroupLayout(greekYogurtPanel);
        greekYogurtPanel.setLayout(greekYogurtPanelLayout);
        greekYogurtPanelLayout.setHorizontalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greekYogurtUpdateButton))
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greekYogurtAddButton)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        greekYogurtPanelLayout.setVerticalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel41))
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cokePanelLayout = new javax.swing.GroupLayout(cokePanel);
        cokePanel.setLayout(cokePanelLayout);
        cokePanelLayout.setHorizontalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greekYogurtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cokePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(gatoradePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cokePanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(183, Short.MAX_VALUE)))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(176, Short.MAX_VALUE)))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        cokePanelLayout.setVerticalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gatoradePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(granolaShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chipsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nutsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cookieShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(driedFruitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greekYogurtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3516, Short.MAX_VALUE))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5368, Short.MAX_VALUE)))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5486, Short.MAX_VALUE)))
            .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cokePanelLayout.createSequentialGroup()
                    .addGap(982, 982, 982)
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(4513, Short.MAX_VALUE)))
        );

        itemsScrollPane.setViewportView(cokePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proteinSmoothiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothiePriceTextFieldActionPerformed

    private void proteinSmoothieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothieCountTextFieldActionPerformed

    private void frappuccinoPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoPriceTextFieldActionPerformed

    private void frappuccinoCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoCountTextFieldActionPerformed

    private void addProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(proteinSmoothieCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,108);
        System.out.println(count);
        proteinSmoothieCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addProteinSmoothieButtonActionPerformed

    private void addFrappuccinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFrappuccinoButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(frappuccinoCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,105);
        frappuccinoCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addFrappuccinoButtonActionPerformed

    private void updateProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(proteinSmoothiePriceTextField.getText());
        managerController.updatePrice(price,108);
    }//GEN-LAST:event_updateProteinSmoothieButtonActionPerformed

    private void frappuccinoUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(frappuccinoPriceTextField.getText());
        managerController.updatePrice(price,105);
    }//GEN-LAST:event_frappuccinoUpdateButtonActionPerformed

    private void orangePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangePriceTextFieldActionPerformed

    private void orangeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangeCountTextFieldActionPerformed

    private void orangeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(orangePriceTextField.getText());
        managerController.updatePrice(price,102);
    }//GEN-LAST:event_orangeUpdateButtonActionPerformed

    private void addOrangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrangeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(orangeCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,102);
        orangeCountTextField.setText(Integer.toString(count));
        System.out.println("test");
    }//GEN-LAST:event_addOrangeButtonActionPerformed

    private void lemonadePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadePriceTextFieldActionPerformed

    private void lemonadeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadeCountTextFieldActionPerformed

    private void lemonadeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeUpdateButtonActionPerformed
        // TODO add your handling code here:
         
        double price = Double.valueOf(lemonadePriceTextField.getText());
        managerController.updatePrice(price,103);
    }//GEN-LAST:event_lemonadeUpdateButtonActionPerformed

    private void addLemonadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLemonadeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(lemonadeCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,103);
        lemonadeCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addLemonadeButtonActionPerformed

    private void gatoradePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradePriceTextFieldActionPerformed

    private void gatoradeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradeCountTextFieldActionPerformed

    private void gatoradeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(gatoradePriceTextField.getText());
        managerController.updatePrice(price,104);
    }//GEN-LAST:event_gatoradeUpdateButtonActionPerformed

    private void addGatoradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGatoradeButtonActionPerformed
        // TODO add your handling code here:
         int count = Integer.valueOf(gatoradeCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,104);
        gatoradeCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addGatoradeButtonActionPerformed

    private void coconutWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterPriceTextFieldActionPerformed

    private void coconutWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterCountTextFieldActionPerformed

    private void coconutWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(coconutWaterPriceTextField.getText());
        managerController.updatePrice(price,106);
    }//GEN-LAST:event_coconutWaterUpdateButtonActionPerformed

    private void addCoconutWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoconutWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(coconutWaterCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,106);
        System.out.println(count);
        coconutWaterCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addCoconutWaterButtonActionPerformed

    private void sparklingWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterPriceTextFieldActionPerformed

    private void sparklingWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterCountTextFieldActionPerformed

    private void sparklingWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(sparklingWaterPriceTextField.getText());
        managerController.updatePrice(price,107);
    }//GEN-LAST:event_sparklingWaterUpdateButtonActionPerformed

    private void addSparklingWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSparklingWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(sparklingWaterCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,107);
        System.out.println(count);
        sparklingWaterCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addSparklingWaterButtonActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void cokeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCountTextFieldActionPerformed

    private void updateCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCokeButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(cokePriceTextField.getText());
        managerController.updatePrice(price,101);
    }//GEN-LAST:event_updateCokeButtonActionPerformed

    private void addCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCokeButtonActionPerformed
        // TODO add your handling code here:
          int count = Integer.valueOf(cokeCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,101);
        System.out.println(count);
        cokeCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_addCokeButtonActionPerformed

    private void granolaPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaPriceTextFieldActionPerformed

    private void granolaCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaCountTextFieldActionPerformed

    private void granolaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(granolaPriceTextField.getText());
        managerController.updatePrice(price,201);
    }//GEN-LAST:event_granolaUpdateButtonActionPerformed

    private void granolaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(granolaCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,201);
        System.out.println(count);
        granolaCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_granolaAddButtonActionPerformed

    private void proteinShakePriceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakePriceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakePriceTextField1ActionPerformed

    private void proteinShakeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakeCountTextFieldActionPerformed

    private void proteinShakeUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeUpdateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakeUpdateButton1ActionPerformed

    private void addproteinShakeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproteinShakeButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addproteinShakeButton1ActionPerformed

    private void chipsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsPriceTextFieldActionPerformed

    private void chipsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsCountTextFieldActionPerformed

    private void chipsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(chipsPriceTextField.getText());
        managerController.updatePrice(price,202);
    }//GEN-LAST:event_chipsUpdateButtonActionPerformed

    private void chipsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(chipsCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,202);
        System.out.println(count);
        chipsCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_chipsAddButtonActionPerformed

    private void nutsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsPriceTextFieldActionPerformed

    private void nutsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsCountTextFieldActionPerformed

    private void nutsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(nutsPriceTextField.getText());
        managerController.updatePrice(price,203);
    }//GEN-LAST:event_nutsUpdateButtonActionPerformed

    private void nutsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsAddButtonActionPerformed
        // TODO add your handling code here:
         int count = Integer.valueOf(nutsCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,203);
        System.out.println(count);
        nutsCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_nutsAddButtonActionPerformed

    private void cookiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiePriceTextFieldActionPerformed

    private void cookieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieCountTextFieldActionPerformed

    private void cookieUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieUpdateButtonActionPerformed
        // TODO add your handling code here:
           double price = Double.valueOf(cookiePriceTextField.getText());
        managerController.updatePrice(price,204);
    }//GEN-LAST:event_cookieUpdateButtonActionPerformed

    private void cookieAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cookieCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,204);
        cookieCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_cookieAddButtonActionPerformed

    private void driedFruitsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsPriceTextFieldActionPerformed

    private void driedFruitsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsCountTextFieldActionPerformed

    private void driedFruitsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(driedFruitsPriceTextField.getText());
        managerController.updatePrice(price,205);
    }//GEN-LAST:event_driedFruitsUpdateButtonActionPerformed

    private void driedFruitsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(driedFruitsCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,205);
        driedFruitsCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_driedFruitsAddButtonActionPerformed

    private void popcornPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornPriceTextFieldActionPerformed

    private void popcornCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornCountTextFieldActionPerformed

    private void popcornUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(popcornPriceTextField.getText());
        managerController.updatePrice(price,206);
    }//GEN-LAST:event_popcornUpdateButtonActionPerformed

    private void popcornAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(popcornCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,206);
        popcornCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_popcornAddButtonActionPerformed

    private void crackersPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersPriceTextFieldActionPerformed

    private void crackersCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersCountTextFieldActionPerformed

    private void crackersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(crackersPriceTextField.getText());
        managerController.updatePrice(price,207);
    }//GEN-LAST:event_crackersUpdateButtonActionPerformed

    private void crackersAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(crackersCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,207);
        crackersCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_crackersAddButtonActionPerformed

    private void veggieStrawsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsPriceTextFieldActionPerformed

    private void veggieStrawsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsCountTextFieldActionPerformed

    private void veggieStrawsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(veggieStrawsPriceTextField.getText());
        managerController.updatePrice(price,208);
    }//GEN-LAST:event_veggieStrawsUpdateButtonActionPerformed

    private void veggieStrawsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(veggieStrawsCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,208);
        veggieStrawsCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_veggieStrawsAddButtonActionPerformed

    private void greekYogurtPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtPriceTextFieldActionPerformed

    private void greekYogurtCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextFieldActionPerformed

    private void greekYogurtUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(greekYogurtPriceTextField.getText());
        managerController.updatePrice(price,209);
    }//GEN-LAST:event_greekYogurtUpdateButtonActionPerformed

    private void greekYogurtAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(greekYogurtCountTextField.getText());
        count++;
        managerController.increaseItemCount(count,209);
        greekYogurtCountTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_greekYogurtAddButtonActionPerformed

    private void beveragesSoldTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beveragesSoldTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beveragesSoldTextFieldActionPerformed

    private void snacksSoldTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snacksSoldTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snacksSoldTextFieldActionPerformed

    private void bevSnackPieChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bevSnackPieChartButtonActionPerformed
        // TODO add your handling code here:
        int beveragesSold = Integer.parseInt(beveragesSoldTextField.getText());
        int snacksSold = Integer.parseInt(snacksSoldTextField.getText());
        double totalSale = beveragesSold+snacksSold;
        
        double beveragesFraction = (beveragesSold/totalSale)*100;
        double snacksFraction = (snacksSold/totalSale)*100;
        
        
        PieChart pieChart = new PieChart();
        pieChart.beverageVsSnackPieChart("Pie Chart","Beverages vs Snacks comparison",beveragesFraction,snacksFraction);
        pieChart.pack();
        pieChart.setVisible(true);
    }//GEN-LAST:event_bevSnackPieChartButtonActionPerformed

    private void bevSnackBarChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bevSnackBarChartButtonActionPerformed
        // TODO add your handling code here:
        int beveragesSold = Integer.parseInt(beveragesSoldTextField.getText());
        int snacksSold = Integer.parseInt(snacksSoldTextField.getText());
        double totalSale = beveragesSold+snacksSold;
        
        double beveragesFraction = (beveragesSold/totalSale)*100;
        double snacksFraction = (snacksSold/totalSale)*100;
        
        BarChart barChart = new BarChart();
        barChart.beverageVsSnackBarChart("Bar Chart","Beverage vs Snack Comparison",beveragesFraction,snacksFraction);
        barChart.pack();
        barChart.setVisible(true);
    }//GEN-LAST:event_bevSnackBarChartButtonActionPerformed

    private void itemsBarChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsBarChartButtonActionPerformed
        // TODO add your handling code here:
        int[] itemsSoldCount = new int[100];
        if(machine1RadioButton.isSelected())
            itemsSoldCount = managerController.getItemSoldCount("machine1");
        else if(machine1RadioButton.isSelected())
            itemsSoldCount = managerController.getItemSoldCount("machine2");
        else
           itemsSoldCount = managerController.getItemSoldCount("allMachines"); 
        BarChart barChart = new BarChart();
        barChart.itemSoldBarChart("Bar Chart","Items Sold Comparison",itemsSoldCount);
        barChart.pack();
        barChart.setVisible(true);
    }//GEN-LAST:event_itemsBarChartButtonActionPerformed

    private void itemsPieChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsPieChartButtonActionPerformed
        // TODO add your handling code here:
        int[] itemsSoldCount = new int[100];
        if(machine1RadioButton.isSelected())
            itemsSoldCount = managerController.getItemSoldCount("machine1");
        else if(machine1RadioButton.isSelected())
            itemsSoldCount = managerController.getItemSoldCount("machine2");
        else
           itemsSoldCount = managerController.getItemSoldCount("allMachines");
         
        PieChart pieChart = new PieChart();
        pieChart.itemSoldPieChart("Pie Chart","Items Sold Comparison",itemsSoldCount);
        pieChart.pack();
        pieChart.setVisible(true);
    }//GEN-LAST:event_itemsPieChartButtonActionPerformed

    private void nutritionalStatisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutritionalStatisticsButtonActionPerformed
        // TODO add your handling code here:
        int[] nutritionalItemsSoldCount = new int[100];
        if(machine1RadioButton.isSelected())
            nutritionalItemsSoldCount = managerController.getNutritionalItemSoldCount("machine1");
        else if(machine2RadioButton.isSelected())
            nutritionalItemsSoldCount = managerController.getNutritionalItemSoldCount("machine2");
        else
           nutritionalItemsSoldCount = managerController.getNutritionalItemSoldCount("allMachines"); 
        PieChart pieChart = new PieChart();
        pieChart.nutritionalItemsSoldPieChart("Pie Chart","Items Sold Comparison",nutritionalItemsSoldCount);
        pieChart.pack();
        pieChart.setVisible(true);
    }//GEN-LAST:event_nutritionalStatisticsButtonActionPerformed

    private void allMachinesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMachinesRadioButtonActionPerformed
        // TODO add your handling code here:
        beveragesSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("beverage")));
        snacksSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("snack")));
    }//GEN-LAST:event_allMachinesRadioButtonActionPerformed

    private void machine1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1RadioButtonActionPerformed
        // TODO add your handling code here:
        beveragesSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("beverage","machine1")));
        snacksSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("snack","machine1")));
    }//GEN-LAST:event_machine1RadioButtonActionPerformed

    private void machine2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2RadioButtonActionPerformed
        // TODO add your handling code here:
        beveragesSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("beverage","machine2")));
        snacksSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("snack","machine2")));
    }//GEN-LAST:event_machine2RadioButtonActionPerformed
    public static void main(String[] args){
    /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BevSnacksStatisticsPanel;
    private javax.swing.JButton addCoconutWaterButton;
    private javax.swing.JButton addCokeButton;
    private javax.swing.JButton addFrappuccinoButton;
    private javax.swing.JButton addGatoradeButton;
    private javax.swing.JButton addLemonadeButton;
    private javax.swing.JButton addOrangeButton;
    private javax.swing.JButton addProteinSmoothieButton;
    private javax.swing.JButton addSparklingWaterButton;
    private javax.swing.JButton addproteinShakeButton1;
    private javax.swing.ButtonGroup allMachinesButtonGroup;
    private javax.swing.JRadioButton allMachinesRadioButton;
    private javax.swing.JButton bevSnackBarChartButton;
    private javax.swing.ButtonGroup bevSnackMachineButtonGroup;
    private javax.swing.JButton bevSnackPieChartButton;
    private javax.swing.JTextField beveragesSoldTextField;
    private javax.swing.JButton chipsAddButton;
    private javax.swing.JTextField chipsCountTextField;
    private javax.swing.JLabel chipsImageLabel;
    private javax.swing.JTextField chipsPriceTextField;
    private javax.swing.JPanel chipsShakePanel;
    private javax.swing.JButton chipsUpdateButton;
    private javax.swing.JTextField coconutWaterCountTextField;
    private javax.swing.JLabel coconutWaterImageLabel;
    private javax.swing.JPanel coconutWaterPanel;
    private javax.swing.JTextField coconutWaterPriceTextField;
    private javax.swing.JButton coconutWaterUpdateButton;
    private javax.swing.JTextField cokeCountTextField;
    private javax.swing.JLabel cokeImageLabel1;
    private javax.swing.JPanel cokeInfoPanel1;
    private javax.swing.JPanel cokeInfoPanel2;
    private javax.swing.JPanel cokeInfoPanel3;
    private javax.swing.JPanel cokeInfoPanel4;
    private javax.swing.JPanel cokeInfoPanel5;
    private javax.swing.JPanel cokeInfoPanel6;
    private javax.swing.JPanel cokeInfoPanel7;
    private javax.swing.JPanel cokePanel;
    private javax.swing.JTextField cokePriceTextField;
    private javax.swing.JButton cookieAddButton;
    private javax.swing.JTextField cookieCountTextField;
    private javax.swing.JLabel cookieImageLabel;
    private javax.swing.JTextField cookiePriceTextField;
    private javax.swing.JPanel cookieShakePanel;
    private javax.swing.JButton cookieUpdateButton;
    private javax.swing.JButton crackersAddButton;
    private javax.swing.JTextField crackersCountTextField;
    private javax.swing.JLabel crackersImageLabel;
    private javax.swing.JPanel crackersPanel;
    private javax.swing.JTextField crackersPriceTextField;
    private javax.swing.JButton crackersUpdateButton;
    private javax.swing.JButton driedFruitsAddButton;
    private javax.swing.JTextField driedFruitsCountTextField;
    private javax.swing.JLabel driedFruitsImageLabel;
    private javax.swing.JPanel driedFruitsPanel;
    private javax.swing.JTextField driedFruitsPriceTextField;
    private javax.swing.JButton driedFruitsUpdateButton;
    private javax.swing.JTextField frappuccinoCountTextField;
    private javax.swing.JLabel frappuccinoImageLabel;
    private javax.swing.JPanel frappuccinoPanel;
    private javax.swing.JTextField frappuccinoPriceTextField;
    private javax.swing.JButton frappuccinoUpdateButton;
    private javax.swing.JTextField gatoradeCountTextField;
    private javax.swing.JLabel gatoradeImageLabel1;
    private javax.swing.JPanel gatoradePanel1;
    private javax.swing.JTextField gatoradePriceTextField;
    private javax.swing.JButton gatoradeUpdateButton;
    private javax.swing.JButton granolaAddButton;
    private javax.swing.JTextField granolaCountTextField;
    private javax.swing.JTextField granolaPriceTextField;
    private javax.swing.JLabel granolaShakeImageLabel;
    private javax.swing.JPanel granolaShakePanel;
    private javax.swing.JButton granolaUpdateButton;
    private javax.swing.JButton greekYogurtAddButton;
    private javax.swing.JTextField greekYogurtCountTextField;
    private javax.swing.JLabel greekYogurtImageLabel;
    private javax.swing.JPanel greekYogurtPanel;
    private javax.swing.JTextField greekYogurtPriceTextField;
    private javax.swing.JButton greekYogurtUpdateButton;
    private javax.swing.JButton itemsBarChartButton;
    private javax.swing.ButtonGroup itemsMachineButtonGroup;
    private javax.swing.JButton itemsPieChartButton;
    private javax.swing.JScrollPane itemsScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lemonadeCountTextField;
    private javax.swing.JLabel lemonadeImageLabel1;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JTextField lemonadePriceTextField;
    private javax.swing.JButton lemonadeUpdateButton;
    private javax.swing.JRadioButton machine1RadioButton;
    private javax.swing.JRadioButton machine2RadioButton;
    private javax.swing.JButton nutritionalStatisticsButton;
    private javax.swing.ButtonGroup nutritionalStatisticsButtonGroup;
    private javax.swing.JPanel nutritionalStatisticsPanel;
    private javax.swing.JButton nutsAddButton;
    private javax.swing.JTextField nutsCountTextField;
    private javax.swing.JLabel nutsImageLabel;
    private javax.swing.JTextField nutsPriceTextField;
    private javax.swing.JPanel nutsShakePanel;
    private javax.swing.JButton nutsUpdateButton;
    private javax.swing.JTextField orangeCountTextField;
    private javax.swing.JLabel orangeImageLabel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JTextField orangePriceTextField;
    private javax.swing.JButton orangeUpdateButton;
    private javax.swing.JButton popcornAddButton;
    private javax.swing.JTextField popcornCountTextField;
    private javax.swing.JLabel popcornImageLabel;
    private javax.swing.JPanel popcornPanel;
    private javax.swing.JTextField popcornPriceTextField;
    private javax.swing.JButton popcornUpdateButton;
    private javax.swing.JTextField proteinShakeCountTextField;
    private javax.swing.JLabel proteinShakeImageLabel1;
    private javax.swing.JPanel proteinShakePanel1;
    private javax.swing.JTextField proteinShakePriceTextField1;
    private javax.swing.JButton proteinShakeUpdateButton1;
    private javax.swing.JTextField proteinSmoothieCountTextField;
    private javax.swing.JLabel proteinSmoothieImageLabel;
    private javax.swing.JPanel proteinSmoothiePanel;
    private javax.swing.JTextField proteinSmoothiePriceTextField;
    private javax.swing.JTextField snacksSoldTextField;
    private javax.swing.JTextField sparklingWaterCountTextField;
    private javax.swing.JLabel sparklingWaterImageLabel;
    private javax.swing.JTextField sparklingWaterPriceTextField;
    private javax.swing.JButton sparklingWaterUpdateButton;
    private javax.swing.JPanel sparlkingWaterPanel;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JButton updateCokeButton;
    private javax.swing.JButton updateProteinSmoothieButton;
    private javax.swing.JButton veggieStrawsAddButton;
    private javax.swing.JTextField veggieStrawsCountTextField;
    private javax.swing.JLabel veggieStrawsImageLabel;
    private javax.swing.JPanel veggieStrawsPanel;
    private javax.swing.JTextField veggieStrawsPriceTextField;
    private javax.swing.JButton veggieStrawsUpdateButton;
    // End of variables declaration//GEN-END:variables
}