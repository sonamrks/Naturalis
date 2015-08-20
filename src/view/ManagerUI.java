/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import controller.ManagerController;
import java.awt.Color;
import java.awt.FlowLayout;
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
public class ManagerUI extends javax.swing.JFrame implements Colleague {

    private ManagerController managerController;
    private ItemController itemController;
    ArrayList<Double> priceList;
    ArrayList<Integer> countList;
    /**
     * Creates new form AdminUI
     */
    public ManagerUI(ItemController itemController) {
        initComponents();
        managerController = new ManagerController();
     //   itemsController = new ItemController();
        this.itemController = itemController;
        itemController.registerAColleague(this);
        
        lycheeJuicePanel.setVisible(false);
        dietPepsiPanel.setVisible(false);
        pretzelPanel.setVisible(false);
        cornPanel.setVisible(false);
        
        setPrice();
        setCount();     
    }
    
    public void sendMessage(String type, Integer index, Double value) {
        System.out.println("2. ");
        itemController.sendMessageToAll(this, type, index, value);
    }
    
    public void receiveMessage(String type, Integer index, Double value) {
        if(type.equals("addtocart")) 
            countList.set(index, countList.get(index)-1);
        if(type.equals("removefromcart"))
            countList.set(index, countList.get(index)+1);
        if(type.equals("addtocount"))
            countList.set(index, countList.get(index)+1);
        setCount(); 
    }
    
    public void setProtein(){
        
        ArrayList<Integer> proteinList = managerController.setProtein();
    }
    public void setSugars(){
        
        ArrayList<Integer> sugarsList = managerController.setSugars();
    }
    public void setCarbohydrates(){
        
        ArrayList<Integer> carbohydratesList = managerController.setCarbohydrates();
    }
    public void setCalories(){
        
        ArrayList<Integer> caloriesList = managerController.setCalories();
    }
    public void setPrice(){
        
        priceList = managerController.setPrice();
        
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
        
        countList = managerController.setCount();
        
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
        collectMoneyButtonGroup = new javax.swing.ButtonGroup();
        statisticsPanel = new javax.swing.JPanel();
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
        allMachinesRadioButton = new javax.swing.JRadioButton();
        addNewItemPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        proteinLabel = new javax.swing.JLabel();
        sugarsLabel = new javax.swing.JLabel();
        carbohydratesLabel = new javax.swing.JLabel();
        codeTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        proteinTextField = new javax.swing.JTextField();
        sugarsTextField = new javax.swing.JTextField();
        carbohydratesTextField = new javax.swing.JTextField();
        caloriesLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        countLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        machineIDLabel = new javax.swing.JLabel();
        caloriesTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        countTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        machineIDTextField = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        collectMoneyPanel = new javax.swing.JPanel();
        collectMoneyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        collectMoneyTextField = new javax.swing.JTextField();
        machine1CollectRadioButton = new javax.swing.JRadioButton();
        machine2CollectRadioButton = new javax.swing.JRadioButton();
        itemsScrollPane = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();
        frappuccinoPanel = new javax.swing.JPanel();
        frappuccinoImageLabel = new javax.swing.JLabel();
        cokeInfoPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        frappuccinoPriceTextField = new javax.swing.JTextField();
        frappuccinoUpdateButton = new javax.swing.JButton();
        orangePanel = new javax.swing.JPanel();
        orangeImageLabel = new javax.swing.JLabel();
        cokeInfoPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        orangePriceTextField = new javax.swing.JTextField();
        orangeUpdateButton = new javax.swing.JButton();
        lemonadePanel = new javax.swing.JPanel();
        lemonadeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lemonadePriceTextField = new javax.swing.JTextField();
        lemonadeUpdateButton = new javax.swing.JButton();
        gatoradePanel1 = new javax.swing.JPanel();
        gatoradeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        gatoradePriceTextField = new javax.swing.JTextField();
        gatoradeUpdateButton = new javax.swing.JButton();
        coconutWaterPanel = new javax.swing.JPanel();
        coconutWaterImageLabel = new javax.swing.JLabel();
        cokeInfoPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        coconutWaterPriceTextField = new javax.swing.JTextField();
        coconutWaterUpdateButton = new javax.swing.JButton();
        sparlkingWaterPanel = new javax.swing.JPanel();
        sparklingWaterImageLabel = new javax.swing.JLabel();
        cokeInfoPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        sparklingWaterPriceTextField = new javax.swing.JTextField();
        sparklingWaterUpdateButton = new javax.swing.JButton();
        cokePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cokePriceTextField = new javax.swing.JTextField();
        updateCokeButton = new javax.swing.JButton();
        cokeImageLabel1 = new javax.swing.JLabel();
        proteinSmoothiePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        proteinSmoothiePriceTextField = new javax.swing.JTextField();
        updateProteinSmoothieButton = new javax.swing.JButton();
        proteinSmoothieImageLabel = new javax.swing.JLabel();
        granolaShakePanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        granolaPriceTextField = new javax.swing.JTextField();
        granolaUpdateButton = new javax.swing.JButton();
        granolaShakeImageLabel = new javax.swing.JLabel();
        proteinShakePanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        proteinShakePriceTextField1 = new javax.swing.JTextField();
        proteinShakeUpdateButton1 = new javax.swing.JButton();
        chipsShakePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        chipsPriceTextField = new javax.swing.JTextField();
        chipsUpdateButton = new javax.swing.JButton();
        chipsImageLabel = new javax.swing.JLabel();
        nutsShakePanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        nutsPriceTextField = new javax.swing.JTextField();
        nutsUpdateButton = new javax.swing.JButton();
        nutsImageLabel = new javax.swing.JLabel();
        cookieShakePanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        cookiePriceTextField = new javax.swing.JTextField();
        cookieUpdateButton = new javax.swing.JButton();
        cookieImageLabel = new javax.swing.JLabel();
        driedFruitsPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        driedFruitsPriceTextField = new javax.swing.JTextField();
        driedFruitsUpdateButton = new javax.swing.JButton();
        driedFruitsImageLabel = new javax.swing.JLabel();
        popcornPanel = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        popcornPriceTextField = new javax.swing.JTextField();
        popcornUpdateButton = new javax.swing.JButton();
        popcornImageLabel = new javax.swing.JLabel();
        crackersPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        crackersPriceTextField = new javax.swing.JTextField();
        crackersUpdateButton = new javax.swing.JButton();
        crackersImageLabel = new javax.swing.JLabel();
        veggieStrawsPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        veggieStrawsPriceTextField = new javax.swing.JTextField();
        veggieStrawsUpdateButton = new javax.swing.JButton();
        veggieStrawsImageLabel = new javax.swing.JLabel();
        greekYogurtPanel = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        greekYogurtPriceTextField = new javax.swing.JTextField();
        greekYogurtUpdateButton = new javax.swing.JButton();
        greekYogurtImageLabel = new javax.swing.JLabel();
        dietPepsiPanel = new javax.swing.JPanel();
        pretzelPanel = new javax.swing.JPanel();
        cornPanel = new javax.swing.JPanel();
        lycheeJuicePanel = new javax.swing.JPanel();
        proteinShakeImageLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        statisticsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                        .addGap(29, 29, 29)
                        .addComponent(itemsBarChartButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsPieChartButton)
                    .addComponent(itemsBarChartButton)))
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
                .addContainerGap()
                .addComponent(nutritionalStatisticsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        nutritionalStatisticsPanelLayout.setVerticalGroup(
            nutritionalStatisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nutritionalStatisticsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(machine1RadioButton)
                        .addGap(140, 140, 140)
                        .addComponent(allMachinesRadioButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel5)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(machine1RadioButton)
                    .addComponent(allMachinesRadioButton)))
        );

        jLabel6.setText("Add new item");

        codeLabel.setText("Code :");

        nameLabel.setText("Name :");

        proteinLabel.setText("Protein :");

        sugarsLabel.setText("Sugars :");

        carbohydratesLabel.setText("Carbohydrates: ");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        caloriesLabel.setText("Calories :");

        priceLabel.setText("Price :");

        countLabel.setText("Count :");

        categoryLabel.setText("Category :");

        machineIDLabel.setText("MachineID :");

        addItemButton.setText("Add");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addNewItemPanelLayout = new javax.swing.GroupLayout(addNewItemPanel);
        addNewItemPanel.setLayout(addNewItemPanelLayout);
        addNewItemPanelLayout.setHorizontalGroup(
            addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewItemPanelLayout.createSequentialGroup()
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addNewItemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(addNewItemPanelLayout.createSequentialGroup()
                                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(addNewItemPanelLayout.createSequentialGroup()
                                        .addComponent(carbohydratesLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(carbohydratesTextField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addNewItemPanelLayout.createSequentialGroup()
                                        .addComponent(sugarsLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addNewItemPanelLayout.createSequentialGroup()
                                        .addComponent(proteinLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(proteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addNewItemPanelLayout.createSequentialGroup()
                                        .addComponent(nameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addNewItemPanelLayout.createSequentialGroup()
                                        .addComponent(codeLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caloriesLabel)
                                    .addComponent(priceLabel)
                                    .addComponent(countLabel)
                                    .addComponent(categoryLabel)
                                    .addComponent(machineIDLabel))
                                .addGap(36, 36, 36)
                                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(countTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(caloriesTextField)
                                    .addComponent(priceTextField)
                                    .addComponent(categoryTextField)
                                    .addComponent(machineIDTextField)))))
                    .addGroup(addNewItemPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addItemButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addNewItemPanelLayout.setVerticalGroup(
            addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(codeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caloriesLabel)
                    .addComponent(caloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinLabel)
                    .addComponent(proteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countLabel)
                    .addComponent(countTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugarsLabel)
                    .addComponent(sugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addNewItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carbohydratesLabel)
                    .addComponent(carbohydratesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(machineIDLabel)
                    .addComponent(machineIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(addItemButton))
        );

        collectMoneyButton.setText("Collect Money");
        collectMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectMoneyButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coins.png"))); // NOI18N

        allMachinesButtonGroup.add(machine1CollectRadioButton);
        machine1CollectRadioButton.setText("Machine 1");
        machine1CollectRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine1CollectRadioButtonActionPerformed(evt);
            }
        });

        allMachinesButtonGroup.add(machine2CollectRadioButton);
        machine2CollectRadioButton.setText("Machine 2");
        machine2CollectRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine2CollectRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout collectMoneyPanelLayout = new javax.swing.GroupLayout(collectMoneyPanel);
        collectMoneyPanel.setLayout(collectMoneyPanelLayout);
        collectMoneyPanelLayout.setHorizontalGroup(
            collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(machine1CollectRadioButton)
                    .addComponent(machine2CollectRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(collectMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        collectMoneyPanelLayout.setVerticalGroup(
            collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addGroup(collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(collectMoneyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectMoneyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(collectMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(machine1CollectRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(machine2CollectRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addNewItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BevSnacksStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collectMoneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nutritionalStatisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticsPanelLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addComponent(addNewItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(collectMoneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BevSnacksStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nutritionalStatisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        frappuccinoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frappuccino.jpg"))); // NOI18N

        jLabel11.setText("Price");

        frappuccinoPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoPriceTextFieldActionPerformed(evt);
            }
        });

        frappuccinoUpdateButton.setText("update");
        frappuccinoUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoUpdateButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(frappuccinoUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout frappuccinoPanelLayout = new javax.swing.GroupLayout(frappuccinoPanel);
        frappuccinoPanel.setLayout(frappuccinoPanelLayout);
        frappuccinoPanelLayout.setHorizontalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(frappuccinoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        orangePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangePriceTextFieldActionPerformed(evt);
            }
        });

        orangeUpdateButton.setText("update");
        orangeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeUpdateButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(orangeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addComponent(orangeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        lemonadePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadePriceTextFieldActionPerformed(evt);
            }
        });

        lemonadeUpdateButton.setText("update");
        lemonadeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cokeInfoPanel3Layout = new javax.swing.GroupLayout(cokeInfoPanel3);
        cokeInfoPanel3.setLayout(cokeInfoPanel3Layout);
        cokeInfoPanel3Layout.setHorizontalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lemonadePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonadeUpdateButton))
                    .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cokeInfoPanel3Layout.setVerticalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lemonadeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lemonadePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout lemonadePanelLayout = new javax.swing.GroupLayout(lemonadePanel);
        lemonadePanel.setLayout(lemonadePanelLayout);
        lemonadePanelLayout.setHorizontalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addComponent(lemonadeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        gatoradePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradePriceTextFieldActionPerformed(evt);
            }
        });

        gatoradeUpdateButton.setText("update");
        gatoradeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradeUpdateButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(gatoradeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gatoradePanel1Layout = new javax.swing.GroupLayout(gatoradePanel1);
        gatoradePanel1.setLayout(gatoradePanel1Layout);
        gatoradePanel1Layout.setHorizontalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addComponent(gatoradeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(cokeInfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        coconutWaterPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterPriceTextFieldActionPerformed(evt);
            }
        });

        coconutWaterUpdateButton.setText("update");
        coconutWaterUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterUpdateButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(coconutWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout coconutWaterPanelLayout = new javax.swing.GroupLayout(coconutWaterPanel);
        coconutWaterPanel.setLayout(coconutWaterPanelLayout);
        coconutWaterPanelLayout.setHorizontalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        sparklingWaterPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterPriceTextFieldActionPerformed(evt);
            }
        });

        sparklingWaterUpdateButton.setText("update");
        sparklingWaterUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterUpdateButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(sparklingWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        cokePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokePriceTextFieldActionPerformed(evt);
            }
        });

        updateCokeButton.setText("update");
        updateCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCokeButtonActionPerformed(evt);
            }
        });

        cokeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coke.jpg"))); // NOI18N

        javax.swing.GroupLayout cokePanelLayout = new javax.swing.GroupLayout(cokePanel);
        cokePanel.setLayout(cokePanelLayout);
        cokePanelLayout.setHorizontalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokePanelLayout.createSequentialGroup()
                        .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateCokeButton))
                    .addComponent(jLabel9))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        cokePanelLayout.setVerticalGroup(
            cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cokePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cokePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateCokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel7.setText("Price");

        proteinSmoothiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinSmoothiePriceTextFieldActionPerformed(evt);
            }
        });

        updateProteinSmoothieButton.setText("update");
        updateProteinSmoothieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProteinSmoothieButtonActionPerformed(evt);
            }
        });

        proteinSmoothieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinSmoothie.jpg"))); // NOI18N

        javax.swing.GroupLayout proteinSmoothiePanelLayout = new javax.swing.GroupLayout(proteinSmoothiePanel);
        proteinSmoothiePanel.setLayout(proteinSmoothiePanelLayout);
        proteinSmoothiePanelLayout.setHorizontalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateProteinSmoothieButton))
                    .addComponent(jLabel7))
                .addContainerGap())
        );
        proteinSmoothiePanelLayout.setVerticalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProteinSmoothieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        jLabel23.setText("Price");

        granolaPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaPriceTextFieldActionPerformed(evt);
            }
        });

        granolaUpdateButton.setText("update");
        granolaUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaUpdateButtonActionPerformed(evt);
            }
        });

        granolaShakeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/granola.jpg"))); // NOI18N

        javax.swing.GroupLayout granolaShakePanelLayout = new javax.swing.GroupLayout(granolaShakePanel);
        granolaShakePanel.setLayout(granolaShakePanelLayout);
        granolaShakePanelLayout.setHorizontalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaUpdateButton))
                    .addComponent(jLabel23))
                .addContainerGap())
        );
        granolaShakePanelLayout.setVerticalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(granolaUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel25.setText("Price");

        proteinShakePriceTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakePriceTextField1ActionPerformed(evt);
            }
        });

        proteinShakeUpdateButton1.setText("update");
        proteinShakeUpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakeUpdateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proteinShakePanel1Layout = new javax.swing.GroupLayout(proteinShakePanel1);
        proteinShakePanel1.setLayout(proteinShakePanel1Layout);
        proteinShakePanel1Layout.setHorizontalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proteinShakeUpdateButton1)
                .addContainerGap())
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        proteinShakePanel1Layout.setVerticalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteinShakeUpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel27.setText("Price");

        chipsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsPriceTextFieldActionPerformed(evt);
            }
        });

        chipsUpdateButton.setText("update");
        chipsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsUpdateButtonActionPerformed(evt);
            }
        });

        chipsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chips.jpg"))); // NOI18N

        javax.swing.GroupLayout chipsShakePanelLayout = new javax.swing.GroupLayout(chipsShakePanel);
        chipsShakePanel.setLayout(chipsShakePanelLayout);
        chipsShakePanelLayout.setHorizontalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chipsUpdateButton))
                    .addComponent(jLabel27))
                .addContainerGap())
        );
        chipsShakePanelLayout.setVerticalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel29.setText("Price");

        nutsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsPriceTextFieldActionPerformed(evt);
            }
        });

        nutsUpdateButton.setText("update");
        nutsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsUpdateButtonActionPerformed(evt);
            }
        });

        nutsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuts.jpg"))); // NOI18N

        javax.swing.GroupLayout nutsShakePanelLayout = new javax.swing.GroupLayout(nutsShakePanel);
        nutsShakePanel.setLayout(nutsShakePanelLayout);
        nutsShakePanelLayout.setHorizontalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(nutsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutsUpdateButton))
                    .addComponent(jLabel29))
                .addContainerGap())
        );
        nutsShakePanelLayout.setVerticalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(nutsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel31.setText("Price");

        cookiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiePriceTextFieldActionPerformed(evt);
            }
        });

        cookieUpdateButton.setText("update");
        cookieUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieUpdateButtonActionPerformed(evt);
            }
        });

        cookieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cookie.jpg"))); // NOI18N

        javax.swing.GroupLayout cookieShakePanelLayout = new javax.swing.GroupLayout(cookieShakePanel);
        cookieShakePanel.setLayout(cookieShakePanelLayout);
        cookieShakePanelLayout.setHorizontalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cookieImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieUpdateButton))
                    .addComponent(jLabel31))
                .addContainerGap())
        );
        cookieShakePanelLayout.setVerticalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cookieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel33.setText("Price");

        driedFruitsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsPriceTextFieldActionPerformed(evt);
            }
        });

        driedFruitsUpdateButton.setText("update");
        driedFruitsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsUpdateButtonActionPerformed(evt);
            }
        });

        driedFruitsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/driedFruits.jpg"))); // NOI18N

        javax.swing.GroupLayout driedFruitsPanelLayout = new javax.swing.GroupLayout(driedFruitsPanel);
        driedFruitsPanel.setLayout(driedFruitsPanelLayout);
        driedFruitsPanelLayout.setHorizontalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addComponent(driedFruitsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driedFruitsUpdateButton))
                    .addComponent(jLabel33))
                .addContainerGap())
        );
        driedFruitsPanelLayout.setVerticalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driedFruitsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel35.setText("Price");

        popcornPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornPriceTextFieldActionPerformed(evt);
            }
        });

        popcornUpdateButton.setText("update");
        popcornUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornUpdateButtonActionPerformed(evt);
            }
        });

        popcornImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popcorn.jpg"))); // NOI18N

        javax.swing.GroupLayout popcornPanelLayout = new javax.swing.GroupLayout(popcornPanel);
        popcornPanel.setLayout(popcornPanelLayout);
        popcornPanelLayout.setHorizontalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(popcornImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popcornUpdateButton))
                    .addComponent(jLabel35))
                .addContainerGap())
        );
        popcornPanelLayout.setVerticalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(popcornImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel37.setText("Price");

        crackersPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersPriceTextFieldActionPerformed(evt);
            }
        });

        crackersUpdateButton.setText("update");
        crackersUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersUpdateButtonActionPerformed(evt);
            }
        });

        crackersImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crackers.jpg"))); // NOI18N

        javax.swing.GroupLayout crackersPanelLayout = new javax.swing.GroupLayout(crackersPanel);
        crackersPanel.setLayout(crackersPanelLayout);
        crackersPanelLayout.setHorizontalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(crackersImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crackersUpdateButton))
                    .addComponent(jLabel37))
                .addContainerGap())
        );
        crackersPanelLayout.setVerticalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(crackersImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel39.setText("Price");

        veggieStrawsPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsPriceTextFieldActionPerformed(evt);
            }
        });

        veggieStrawsUpdateButton.setText("update");
        veggieStrawsUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsUpdateButtonActionPerformed(evt);
            }
        });

        veggieStrawsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veggieStraws.jpg"))); // NOI18N

        javax.swing.GroupLayout veggieStrawsPanelLayout = new javax.swing.GroupLayout(veggieStrawsPanel);
        veggieStrawsPanel.setLayout(veggieStrawsPanelLayout);
        veggieStrawsPanelLayout.setHorizontalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veggieStrawsUpdateButton))
                    .addComponent(jLabel39))
                .addContainerGap())
        );
        veggieStrawsPanelLayout.setVerticalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel41.setText("Price");

        greekYogurtPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtPriceTextFieldActionPerformed(evt);
            }
        });

        greekYogurtUpdateButton.setText("update");
        greekYogurtUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtUpdateButtonActionPerformed(evt);
            }
        });

        greekYogurtImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greekYogurt.jpg"))); // NOI18N

        javax.swing.GroupLayout greekYogurtPanelLayout = new javax.swing.GroupLayout(greekYogurtPanel);
        greekYogurtPanel.setLayout(greekYogurtPanelLayout);
        greekYogurtPanelLayout.setHorizontalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(greekYogurtImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greekYogurtUpdateButton))
                    .addComponent(jLabel41))
                .addContainerGap())
        );
        greekYogurtPanelLayout.setVerticalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dietPepsiPanelLayout = new javax.swing.GroupLayout(dietPepsiPanel);
        dietPepsiPanel.setLayout(dietPepsiPanelLayout);
        dietPepsiPanelLayout.setHorizontalGroup(
            dietPepsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dietPepsiPanelLayout.setVerticalGroup(
            dietPepsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pretzelPanelLayout = new javax.swing.GroupLayout(pretzelPanel);
        pretzelPanel.setLayout(pretzelPanelLayout);
        pretzelPanelLayout.setHorizontalGroup(
            pretzelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pretzelPanelLayout.setVerticalGroup(
            pretzelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cornPanelLayout = new javax.swing.GroupLayout(cornPanel);
        cornPanel.setLayout(cornPanelLayout);
        cornPanelLayout.setHorizontalGroup(
            cornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cornPanelLayout.setVerticalGroup(
            cornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lycheeJuicePanelLayout = new javax.swing.GroupLayout(lycheeJuicePanel);
        lycheeJuicePanel.setLayout(lycheeJuicePanelLayout);
        lycheeJuicePanelLayout.setHorizontalGroup(
            lycheeJuicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lycheeJuicePanelLayout.setVerticalGroup(
            lycheeJuicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        proteinShakeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinShake.jpg"))); // NOI18N

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lycheeJuicePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cornPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pretzelPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dietPepsiPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, itemsPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(itemsPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gatoradePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(granolaShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(greekYogurtPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crackersPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(popcornPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cookieShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nutsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chipsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(driedFruitsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(cokePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(282, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
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
                .addGap(18, 18, 18)
                .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
                .addGap(5, 5, 5)
                .addComponent(lycheeJuicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dietPepsiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pretzelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2905, Short.MAX_VALUE))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5509, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(cokePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5627, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(982, 982, 982)
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(4654, Short.MAX_VALUE)))
        );

        itemsScrollPane.setViewportView(itemsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proteinSmoothiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothiePriceTextFieldActionPerformed

    private void frappuccinoPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoPriceTextFieldActionPerformed

    private void updateProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(proteinSmoothiePriceTextField.getText());
        sendMessage("changePrice", 7, price);
        managerController.updatePrice(price,108);
    }//GEN-LAST:event_updateProteinSmoothieButtonActionPerformed

    private void frappuccinoUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(frappuccinoPriceTextField.getText());
        sendMessage("changeprice", 4, price);
        managerController.updatePrice(price,105);
    }//GEN-LAST:event_frappuccinoUpdateButtonActionPerformed

    private void lemonadePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadePriceTextFieldActionPerformed

    private void lemonadeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeUpdateButtonActionPerformed
        // TODO add your handling code here:        
        double price = Double.valueOf(lemonadePriceTextField.getText());
        sendMessage("changeprice", 2, price);
        managerController.updatePrice(price,103);
    }//GEN-LAST:event_lemonadeUpdateButtonActionPerformed

    private void gatoradePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradePriceTextFieldActionPerformed

    private void gatoradeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(gatoradePriceTextField.getText());
        sendMessage("changeprice", 3, price);
        managerController.updatePrice(price,104);
    }//GEN-LAST:event_gatoradeUpdateButtonActionPerformed

    private void coconutWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterPriceTextFieldActionPerformed

    private void coconutWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(coconutWaterPriceTextField.getText());
        sendMessage("changeprice", 5, price);
        managerController.updatePrice(price,106);
    }//GEN-LAST:event_coconutWaterUpdateButtonActionPerformed

    private void sparklingWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterPriceTextFieldActionPerformed

    private void sparklingWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(sparklingWaterPriceTextField.getText());
        sendMessage("changeprice", 6, price);
        managerController.updatePrice(price,107);
    }//GEN-LAST:event_sparklingWaterUpdateButtonActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void updateCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCokeButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(cokePriceTextField.getText());
        sendMessage("changeprice", 0, price);
        managerController.updatePrice(price,101);
    }//GEN-LAST:event_updateCokeButtonActionPerformed

    private void granolaPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaPriceTextFieldActionPerformed

    private void granolaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(granolaPriceTextField.getText());
        sendMessage("changeprice", 9, price);
        managerController.updatePrice(price,201);
    }//GEN-LAST:event_granolaUpdateButtonActionPerformed

    private void proteinShakePriceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakePriceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakePriceTextField1ActionPerformed

    private void proteinShakeUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeUpdateButton1ActionPerformed
        double price = Double.valueOf(proteinShakePriceTextField1.getText());
        sendMessage("changePrice", 8, price);
        managerController.updatePrice(price,109);
    }//GEN-LAST:event_proteinShakeUpdateButton1ActionPerformed

    private void chipsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsPriceTextFieldActionPerformed

    private void chipsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(chipsPriceTextField.getText());
        sendMessage("changeprice", 10, price);
        managerController.updatePrice(price,202);
    }//GEN-LAST:event_chipsUpdateButtonActionPerformed

    private void nutsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsPriceTextFieldActionPerformed

    private void nutsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(nutsPriceTextField.getText());
        sendMessage("changeprice", 11, price);
        managerController.updatePrice(price,203);
    }//GEN-LAST:event_nutsUpdateButtonActionPerformed

    private void cookiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiePriceTextFieldActionPerformed

    private void cookieUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(cookiePriceTextField.getText());
        sendMessage("changeprice", 12, price);
        managerController.updatePrice(price,204);
    }//GEN-LAST:event_cookieUpdateButtonActionPerformed

    private void driedFruitsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsPriceTextFieldActionPerformed

    private void driedFruitsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(driedFruitsPriceTextField.getText());
        sendMessage("changeprice", 13, price);
        managerController.updatePrice(price,205);
    }//GEN-LAST:event_driedFruitsUpdateButtonActionPerformed

    private void popcornPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornPriceTextFieldActionPerformed

    private void popcornUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(popcornPriceTextField.getText());
        sendMessage("changeprice", 14, price);
        managerController.updatePrice(price,206);
    }//GEN-LAST:event_popcornUpdateButtonActionPerformed

    private void crackersPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersPriceTextFieldActionPerformed

    private void crackersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(crackersPriceTextField.getText());
        sendMessage("changeprice", 15, price);
        managerController.updatePrice(price,207);
    }//GEN-LAST:event_crackersUpdateButtonActionPerformed

    private void veggieStrawsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsPriceTextFieldActionPerformed

    private void veggieStrawsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(veggieStrawsPriceTextField.getText());
        sendMessage("changeprice", 16, price);
        managerController.updatePrice(price,208);
    }//GEN-LAST:event_veggieStrawsUpdateButtonActionPerformed

    private void greekYogurtPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtPriceTextFieldActionPerformed

    private void greekYogurtUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(greekYogurtPriceTextField.getText());
        sendMessage("changeprice", 17, price);
        managerController.updatePrice(price,209);
    }//GEN-LAST:event_greekYogurtUpdateButtonActionPerformed

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
        else if(machine2CollectRadioButton.isSelected())
            nutritionalItemsSoldCount = managerController.getNutritionalItemSoldCount("machine2");
        else
           nutritionalItemsSoldCount = managerController.getNutritionalItemSoldCount("allMachines"); 
        
        
        PieChart pieChart = new PieChart();
        //for(int i=0;i<15;i++)
            //System.out.println(managerController.lowCalNames[i]);
        pieChart.nutritionalItemsSoldPieChart("Pie Chart","Items Sold Comparison",nutritionalItemsSoldCount,managerController.lowCalCount,managerController.lowCalNames,managerController.highProteinCount,managerController.highProteinNames,managerController.lowSugarsCount,managerController.lowSugarsNames);
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

    private void machine2CollectRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2CollectRadioButtonActionPerformed
        // TODO add your handling code here:
        beveragesSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("beverage","machine2")));
        snacksSoldTextField.setText(Integer.toString(managerController.getCategorySoldCount("snack","machine2")));
    }//GEN-LAST:event_machine2CollectRadioButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:
        String[] itemInfo = new String[12];
        itemInfo[0] = codeTextField.getText();
        itemInfo[1] = nameTextField.getText();
        itemInfo[2] = proteinTextField.getText();
        itemInfo[3] = sugarsTextField.getText();
        itemInfo[4] = carbohydratesTextField.getText();
        itemInfo[5] = caloriesTextField.getText();
        itemInfo[6] = priceTextField.getText();
        itemInfo[7] = countTextField.getText();
        itemInfo[8] = categoryTextField.getText();
        itemInfo[9] = machineIDTextField.getText();
        
        itemController.addNewItem(itemInfo);
        
        if(Integer.valueOf(codeTextField.getText()) == 110){
            LycheeJuice lycheeJuice = new LycheeJuice();
            lycheeJuicePanel.setLayout(new FlowLayout());
            lycheeJuicePanel.add(lycheeJuice);
            lycheeJuicePanel.setVisible(true);
            lycheeJuice.setPrice(Double.valueOf(priceTextField.getText()));
            lycheeJuice.setCount(Integer.valueOf(countTextField.getText()));
        }
        else if(Integer.valueOf(codeTextField.getText()) == 111){
            DietPepsi dietPepsi = new DietPepsi();
            dietPepsiPanel.setLayout(new FlowLayout());
            dietPepsiPanel.add(dietPepsi);
            dietPepsiPanel.setVisible(true);
            dietPepsi.setPrice(Double.valueOf(priceTextField.getText()));
            dietPepsi.setCount(Integer.valueOf(countTextField.getText()));
        }
        else if(Integer.valueOf(codeTextField.getText()) == 210){
            Pretzel pretzel = new Pretzel();
            pretzelPanel.setLayout(new FlowLayout());
            pretzelPanel.add(pretzel);
            pretzelPanel.setVisible(true);
            pretzel.setPrice(Double.valueOf(priceTextField.getText()));
            pretzel.setCount(Integer.valueOf(countTextField.getText()));
        }
        else {
            Corn pretzel = new Corn();
            cornPanel.setLayout(new FlowLayout());
            cornPanel.add(pretzel);
            cornPanel.setVisible(true);
            pretzel.setPrice(Double.valueOf(priceTextField.getText()));
            pretzel.setCount(Integer.valueOf(countTextField.getText()));
        }
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void collectMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectMoneyButtonActionPerformed
        // TODO add your handling code here:
        if(machine1CollectRadioButton.isSelected())
            collectMoneyTextField.setText(Double.toString(itemController.collectMoney(4201)));
        else
            collectMoneyTextField.setText(Double.toString(itemController.collectMoney(4202)));
    }//GEN-LAST:event_collectMoneyButtonActionPerformed

    private void machine1CollectRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1CollectRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_machine1CollectRadioButtonActionPerformed

    private void orangeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(orangePriceTextField.getText());
        sendMessage("changeprice", 1, price);
        managerController.updatePrice(price,102);
    }//GEN-LAST:event_orangeUpdateButtonActionPerformed

    private void orangePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangePriceTextFieldActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BevSnacksStatisticsPanel;
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel addNewItemPanel;
    private javax.swing.ButtonGroup allMachinesButtonGroup;
    private javax.swing.JRadioButton allMachinesRadioButton;
    private javax.swing.JButton bevSnackBarChartButton;
    private javax.swing.ButtonGroup bevSnackMachineButtonGroup;
    private javax.swing.JButton bevSnackPieChartButton;
    private javax.swing.JTextField beveragesSoldTextField;
    private javax.swing.JLabel caloriesLabel;
    private javax.swing.JTextField caloriesTextField;
    private javax.swing.JLabel carbohydratesLabel;
    private javax.swing.JTextField carbohydratesTextField;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JLabel chipsImageLabel;
    private javax.swing.JTextField chipsPriceTextField;
    private javax.swing.JPanel chipsShakePanel;
    private javax.swing.JButton chipsUpdateButton;
    private javax.swing.JLabel coconutWaterImageLabel;
    private javax.swing.JPanel coconutWaterPanel;
    private javax.swing.JTextField coconutWaterPriceTextField;
    private javax.swing.JButton coconutWaterUpdateButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeTextField;
    private javax.swing.JLabel cokeImageLabel1;
    private javax.swing.JPanel cokeInfoPanel1;
    private javax.swing.JPanel cokeInfoPanel2;
    private javax.swing.JPanel cokeInfoPanel3;
    private javax.swing.JPanel cokeInfoPanel4;
    private javax.swing.JPanel cokeInfoPanel5;
    private javax.swing.JPanel cokeInfoPanel6;
    private javax.swing.JPanel cokePanel;
    private javax.swing.JTextField cokePriceTextField;
    private javax.swing.JButton collectMoneyButton;
    private javax.swing.ButtonGroup collectMoneyButtonGroup;
    private javax.swing.JPanel collectMoneyPanel;
    private javax.swing.JTextField collectMoneyTextField;
    private javax.swing.JLabel cookieImageLabel;
    private javax.swing.JTextField cookiePriceTextField;
    private javax.swing.JPanel cookieShakePanel;
    private javax.swing.JButton cookieUpdateButton;
    private javax.swing.JPanel cornPanel;
    private javax.swing.JLabel countLabel;
    private javax.swing.JTextField countTextField;
    private javax.swing.JLabel crackersImageLabel;
    private javax.swing.JPanel crackersPanel;
    private javax.swing.JTextField crackersPriceTextField;
    private javax.swing.JButton crackersUpdateButton;
    private javax.swing.JPanel dietPepsiPanel;
    private javax.swing.JLabel driedFruitsImageLabel;
    private javax.swing.JPanel driedFruitsPanel;
    private javax.swing.JTextField driedFruitsPriceTextField;
    private javax.swing.JButton driedFruitsUpdateButton;
    private javax.swing.JLabel frappuccinoImageLabel;
    private javax.swing.JPanel frappuccinoPanel;
    private javax.swing.JTextField frappuccinoPriceTextField;
    private javax.swing.JButton frappuccinoUpdateButton;
    private javax.swing.JLabel gatoradeImageLabel1;
    private javax.swing.JPanel gatoradePanel1;
    private javax.swing.JTextField gatoradePriceTextField;
    private javax.swing.JButton gatoradeUpdateButton;
    private javax.swing.JTextField granolaPriceTextField;
    private javax.swing.JLabel granolaShakeImageLabel;
    private javax.swing.JPanel granolaShakePanel;
    private javax.swing.JButton granolaUpdateButton;
    private javax.swing.JLabel greekYogurtImageLabel;
    private javax.swing.JPanel greekYogurtPanel;
    private javax.swing.JTextField greekYogurtPriceTextField;
    private javax.swing.JButton greekYogurtUpdateButton;
    private javax.swing.JButton itemsBarChartButton;
    private javax.swing.ButtonGroup itemsMachineButtonGroup;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JButton itemsPieChartButton;
    private javax.swing.JScrollPane itemsScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lemonadeImageLabel1;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JTextField lemonadePriceTextField;
    private javax.swing.JButton lemonadeUpdateButton;
    private javax.swing.JPanel lycheeJuicePanel;
    private javax.swing.JRadioButton machine1CollectRadioButton;
    private javax.swing.JRadioButton machine1RadioButton;
    private javax.swing.JRadioButton machine2CollectRadioButton;
    private javax.swing.JLabel machineIDLabel;
    private javax.swing.JTextField machineIDTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nutritionalStatisticsButton;
    private javax.swing.ButtonGroup nutritionalStatisticsButtonGroup;
    private javax.swing.JPanel nutritionalStatisticsPanel;
    private javax.swing.JLabel nutsImageLabel;
    private javax.swing.JTextField nutsPriceTextField;
    private javax.swing.JPanel nutsShakePanel;
    private javax.swing.JButton nutsUpdateButton;
    private javax.swing.JLabel orangeImageLabel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JTextField orangePriceTextField;
    private javax.swing.JButton orangeUpdateButton;
    private javax.swing.JLabel popcornImageLabel;
    private javax.swing.JPanel popcornPanel;
    private javax.swing.JTextField popcornPriceTextField;
    private javax.swing.JButton popcornUpdateButton;
    private javax.swing.JPanel pretzelPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel proteinLabel;
    private javax.swing.JLabel proteinShakeImageLabel1;
    private javax.swing.JPanel proteinShakePanel1;
    private javax.swing.JTextField proteinShakePriceTextField1;
    private javax.swing.JButton proteinShakeUpdateButton1;
    private javax.swing.JLabel proteinSmoothieImageLabel;
    private javax.swing.JPanel proteinSmoothiePanel;
    private javax.swing.JTextField proteinSmoothiePriceTextField;
    private javax.swing.JTextField proteinTextField;
    private javax.swing.JTextField snacksSoldTextField;
    private javax.swing.JLabel sparklingWaterImageLabel;
    private javax.swing.JTextField sparklingWaterPriceTextField;
    private javax.swing.JButton sparklingWaterUpdateButton;
    private javax.swing.JPanel sparlkingWaterPanel;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JLabel sugarsLabel;
    private javax.swing.JTextField sugarsTextField;
    private javax.swing.JButton updateCokeButton;
    private javax.swing.JButton updateProteinSmoothieButton;
    private javax.swing.JLabel veggieStrawsImageLabel;
    private javax.swing.JPanel veggieStrawsPanel;
    private javax.swing.JTextField veggieStrawsPriceTextField;
    private javax.swing.JButton veggieStrawsUpdateButton;
    // End of variables declaration//GEN-END:variables
}
