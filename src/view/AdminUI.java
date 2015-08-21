/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AshitaRaghu
 */
public class AdminUI extends javax.swing.JFrame implements Colleague {
    private ItemController itemController;
    ArrayList<Integer> countList;
    ArrayList<Double> priceList;
    private static double salesCollected;
    /**
     * Creates new form LimitedView
     */
    public AdminUI(ItemController itemController) {
        initComponents();
        this.itemController = itemController;
        itemController.registerAColleague(this);
        //setPrice();
        setCount();
    }
    
    public void sendMessage(String type, Integer index, Double value) {
        itemController.sendMessageToAll(this, type, index, value);
    }
    
    public void receiveMessage(String type, Integer index, Double value) {
        if(type.equals("addtocart")) 
            countList.set(index, countList.get(index)-1);
        if(type.equals("removefromcart"))
            countList.set(index, countList.get(index)+1);
        if(type.equals("changeprice"))
            priceList.set(index, value); 
       // setPrice();
        setCount(); 
    }
    
    public void setPrice(){
        //priceList = itemController.setPrice();
        
        /*cokePriceTextField.setText(Double.toString(priceList.get(0)));
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
        greekYogurtPriceTextField.setText(Double.toString(priceList.get(17)));*/
    }
    public void setCount(){
        countList = itemController.setCount();
        cokeCountTextField.setText(Integer.toString(countList.get(0)));
        if(countList.get(0)<=2){
            cokeCountTextField.setBackground(Color.red);
            cokeCountTextField.setForeground(Color.yellow);
        } 
        orangeCountTextField.setText(Integer.toString(countList.get(1)));
        if(countList.get(1)<=2){
            orangeCountTextField.setBackground(Color.red);
            orangeCountTextField.setForeground(Color.yellow);
        } 
        lemonadeCountTextField.setText(Integer.toString(countList.get(2)));
        if(countList.get(2)<=2){
            lemonadeCountTextField.setBackground(Color.red);
            lemonadeCountTextField.setForeground(Color.yellow);
        } 
        gatoradeCountTextField.setText(Integer.toString(countList.get(3)));
        if(countList.get(3)<=2){
            gatoradeCountTextField.setBackground(Color.red);
            gatoradeCountTextField.setForeground(Color.yellow);
        } 
        frappuccinoCountTextField.setText(Integer.toString(countList.get(4)));
        if(countList.get(4)<=2){
            frappuccinoCountTextField.setBackground(Color.red);
            frappuccinoCountTextField.setForeground(Color.yellow);
        } 
        coconutWaterCountTextField.setText(Integer.toString(countList.get(5)));
        if(countList.get(5)<=2){
            coconutWaterCountTextField.setBackground(Color.red);
            coconutWaterCountTextField.setForeground(Color.yellow);
        } 
        sparklingWaterCountTextField.setText(Integer.toString(countList.get(6)));
        if(countList.get(6)<=2){
            sparklingWaterCountTextField.setBackground(Color.red);
            sparklingWaterCountTextField.setForeground(Color.yellow);
        } 
        proteinSmoothieCountTextField.setText(Integer.toString(countList.get(7)));
        if(countList.get(7)<=2){
            proteinSmoothieCountTextField.setBackground(Color.red);
            proteinSmoothieCountTextField.setForeground(Color.yellow);
        } 
        proteinShakeCountTextField.setText(Integer.toString(countList.get(8)));
        if(countList.get(8)<=2){
            proteinShakeCountTextField.setBackground(Color.red);
            proteinShakeCountTextField.setForeground(Color.yellow);
        } 
        granolaCountTextField.setText(Integer.toString(countList.get(9)));
        if(countList.get(9)<=2){
            granolaCountTextField.setBackground(Color.red);
            granolaCountTextField.setForeground(Color.yellow);
        } 
        chipsCountTextField.setText(Integer.toString(countList.get(10)));
        if(countList.get(10)<=2){
            chipsCountTextField.setBackground(Color.red);
            chipsCountTextField.setForeground(Color.yellow);
        } 
        nutsCountTextField.setText(Integer.toString(countList.get(11)));
        if(countList.get(11)<=2){
            nutsCountTextField.setBackground(Color.red);
            nutsCountTextField.setForeground(Color.yellow);
        } 
        cookieCountTextField.setText(Integer.toString(countList.get(12)));
        if(countList.get(12)<=2){
            cookieCountTextField.setBackground(Color.red);
            cookieCountTextField.setForeground(Color.yellow);
        } 
        driedFruitsCountTextField.setText(Integer.toString(countList.get(13)));
        if(countList.get(13)<=2){
            driedFruitsCountTextField.setBackground(Color.red);
            driedFruitsCountTextField.setForeground(Color.yellow);
        } 
        popcornCountTextField.setText(Integer.toString(countList.get(14)));
        if(countList.get(14)<=2){
            popcornCountTextField.setBackground(Color.red);
            popcornCountTextField.setForeground(Color.yellow);
        } 
        crackersCountTextField.setText(Integer.toString(countList.get(15)));
        if(countList.get(15)<=2){
            crackersCountTextField.setBackground(Color.red);
            crackersCountTextField.setForeground(Color.yellow);
        } 
        veggieStrawsCountTextField.setText(Integer.toString(countList.get(16)));
        if(countList.get(16)<=2){
            veggieStrawsCountTextField.setBackground(Color.red);
            veggieStrawsCountTextField.setForeground(Color.yellow);
        } 
        greekYogurtCountTextField.setText(Integer.toString(countList.get(17)));
        if(countList.get(17)<=2){
            greekYogurtCountTextField.setBackground(Color.red);
            greekYogurtCountTextField.setForeground(Color.yellow);
        } 
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        machineButtonGroup = new javax.swing.ButtonGroup();
        itemsScrollPanel = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();
        frappuccinoPanel = new javax.swing.JPanel();
        frappuccinoImageLabel = new javax.swing.JLabel();
        cokeInfoPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        frappuccinoCountTextField = new javax.swing.JTextField();
        addFrappuccinoButton = new javax.swing.JButton();
        orangePanel = new javax.swing.JPanel();
        orangeImageLabel = new javax.swing.JLabel();
        cokeInfoPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        orangeCountTextField = new javax.swing.JTextField();
        addOrangeButton = new javax.swing.JButton();
        lemonadePanel = new javax.swing.JPanel();
        lemonadeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lemonadeCountTextField = new javax.swing.JTextField();
        addLemonadeButton = new javax.swing.JButton();
        gatoradePanel1 = new javax.swing.JPanel();
        gatoradeImageLabel1 = new javax.swing.JLabel();
        cokeInfoPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        gatoradeCountTextField = new javax.swing.JTextField();
        addGatoradeButton = new javax.swing.JButton();
        coconutWaterPanel = new javax.swing.JPanel();
        coconutWaterImageLabel = new javax.swing.JLabel();
        cokeInfoPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        coconutWaterCountTextField = new javax.swing.JTextField();
        addCoconutWaterButton = new javax.swing.JButton();
        sparlkingWaterPanel = new javax.swing.JPanel();
        cokeInfoPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        sparklingWaterCountTextField = new javax.swing.JTextField();
        addSparklingWaterButton = new javax.swing.JButton();
        cokeInfoPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cokeCountTextField = new javax.swing.JTextField();
        addCokeButton = new javax.swing.JButton();
        cokeImageLabel1 = new javax.swing.JLabel();
        proteinSmoothiePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        proteinSmoothieCountTextField = new javax.swing.JTextField();
        addProteinSmoothieButton = new javax.swing.JButton();
        proteinSmoothieImageLabel = new javax.swing.JLabel();
        granolaShakePanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        granolaCountTextField = new javax.swing.JTextField();
        granolaAddButton = new javax.swing.JButton();
        granolaShakeImageLabel = new javax.swing.JLabel();
        proteinShakePanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        proteinShakeCountTextField = new javax.swing.JTextField();
        addproteinShakeButton1 = new javax.swing.JButton();
        proteinShakeImageLabel1 = new javax.swing.JLabel();
        chipsShakePanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        chipsCountTextField = new javax.swing.JTextField();
        chipsAddButton = new javax.swing.JButton();
        chipsImageLabel = new javax.swing.JLabel();
        nutsShakePanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        nutsCountTextField = new javax.swing.JTextField();
        nutsAddButton = new javax.swing.JButton();
        nutsImageLabel = new javax.swing.JLabel();
        cookieShakePanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        cookieCountTextField = new javax.swing.JTextField();
        cookieAddButton = new javax.swing.JButton();
        cookieImageLabel = new javax.swing.JLabel();
        driedFruitsPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        driedFruitsCountTextField = new javax.swing.JTextField();
        driedFruitsAddButton = new javax.swing.JButton();
        driedFruitsImageLabel = new javax.swing.JLabel();
        popcornPanel = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        popcornCountTextField = new javax.swing.JTextField();
        popcornAddButton = new javax.swing.JButton();
        popcornImageLabel = new javax.swing.JLabel();
        crackersPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        crackersCountTextField = new javax.swing.JTextField();
        crackersAddButton = new javax.swing.JButton();
        crackersImageLabel = new javax.swing.JLabel();
        veggieStrawsPanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        veggieStrawsCountTextField = new javax.swing.JTextField();
        veggieStrawsAddButton = new javax.swing.JButton();
        veggieStrawsImageLabel = new javax.swing.JLabel();
        greekYogurtPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        greekYogurtCountTextField = new javax.swing.JTextField();
        greekYogurtAddButton = new javax.swing.JButton();
        greekYogurtImageLabel = new javax.swing.JLabel();
        sparklingWaterImageLabel = new javax.swing.JLabel();
        collectMoneyPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        machine1RadioButton = new javax.swing.JRadioButton();
        machine2RadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moneyTextField = new javax.swing.JTextField();
        amountToBeCollectedTextField = new javax.swing.JTextField();
        collectMoneyButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        collectMoneyTextField = new javax.swing.JTextField();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frappuccinoImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frappuccino.jpg"))); // NOI18N

        jLabel12.setText("Count");

        frappuccinoCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frappuccinoCountTextFieldActionPerformed(evt);
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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                        .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFrappuccinoButton))))
        );
        cokeInfoPanel1Layout.setVerticalGroup(
            cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFrappuccinoButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout frappuccinoPanelLayout = new javax.swing.GroupLayout(frappuccinoPanel);
        frappuccinoPanel.setLayout(frappuccinoPanelLayout);
        frappuccinoPanelLayout.setHorizontalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(frappuccinoImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cokeInfoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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

        jLabel14.setText("Count");

        orangeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeCountTextFieldActionPerformed(evt);
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
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                        .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addOrangeButton))))
        );
        cokeInfoPanel2Layout.setVerticalGroup(
            cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrangeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orangeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
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

        jLabel16.setText("Count");

        lemonadeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lemonadeCountTextFieldActionPerformed(evt);
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
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                        .addComponent(lemonadeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addLemonadeButton))))
        );
        cokeInfoPanel3Layout.setVerticalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(34, Short.MAX_VALUE))
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

        jLabel18.setText("Count");

        gatoradeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gatoradeCountTextFieldActionPerformed(evt);
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
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                        .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addGatoradeButton))))
        );
        cokeInfoPanel4Layout.setVerticalGroup(
            cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGatoradeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout gatoradePanel1Layout = new javax.swing.GroupLayout(gatoradePanel1);
        gatoradePanel1.setLayout(gatoradePanel1Layout);
        gatoradePanel1Layout.setHorizontalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(gatoradeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

        jLabel20.setText("Count");

        coconutWaterCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coconutWaterCountTextFieldActionPerformed(evt);
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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                        .addComponent(coconutWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCoconutWaterButton))))
        );
        cokeInfoPanel5Layout.setVerticalGroup(
            cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cokeInfoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        coconutWaterPanelLayout.setVerticalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeInfoPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel22.setText("Count");

        sparklingWaterCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparklingWaterCountTextFieldActionPerformed(evt);
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
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                        .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSparklingWaterButton))))
        );
        cokeInfoPanel6Layout.setVerticalGroup(
            cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSparklingWaterButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(cokeInfoPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        sparlkingWaterPanelLayout.setVerticalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeInfoPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel10.setText("Count");

        cokeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCountTextFieldActionPerformed(evt);
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
                .addGap(37, 37, 37)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCokeButton))
                    .addComponent(jLabel10))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        cokeInfoPanel7Layout.setVerticalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCokeButton))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel8.setText("Count");

        proteinSmoothieCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinSmoothieCountTextFieldActionPerformed(evt);
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
                .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addProteinSmoothieButton))
                    .addComponent(jLabel8))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        proteinSmoothiePanelLayout.setVerticalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProteinSmoothieButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        jLabel24.setText("Count");

        granolaCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                granolaCountTextFieldActionPerformed(evt);
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
                .addComponent(granolaShakeImageLabel)
                .addGap(18, 18, 18)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaAddButton))
                    .addComponent(jLabel24))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        granolaShakePanelLayout.setVerticalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(granolaAddButton)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel26.setText("Count");

        proteinShakeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakeCountTextFieldActionPerformed(evt);
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
                .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addproteinShakeButton1))
                    .addComponent(jLabel26))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        proteinShakePanel1Layout.setVerticalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addproteinShakeButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel28.setText("Count");

        chipsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chipsCountTextFieldActionPerformed(evt);
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
                .addComponent(chipsImageLabel)
                .addGap(18, 18, 18)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsAddButton))
                    .addComponent(jLabel28))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        chipsShakePanelLayout.setVerticalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel30.setText("Count");

        nutsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsCountTextFieldActionPerformed(evt);
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
                .addComponent(nutsImageLabel)
                .addGap(22, 22, 22)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutsAddButton))
                    .addComponent(jLabel30))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        nutsShakePanelLayout.setVerticalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(nutsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel32.setText("Count");

        cookieCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieCountTextFieldActionPerformed(evt);
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
                .addComponent(cookieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieAddButton))
                    .addComponent(jLabel32))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        cookieShakePanelLayout.setVerticalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cookieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel34.setText("Count");

        driedFruitsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driedFruitsCountTextFieldActionPerformed(evt);
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
                .addComponent(driedFruitsImageLabel)
                .addGap(18, 18, 18)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(driedFruitsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driedFruitsAddButton))
                    .addComponent(jLabel34))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        driedFruitsPanelLayout.setVerticalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(driedFruitsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driedFruitsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel36.setText("Count");

        popcornCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornCountTextFieldActionPerformed(evt);
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
                .addComponent(popcornImageLabel)
                .addGap(18, 18, 18)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(popcornAddButton))
                    .addComponent(jLabel36))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        popcornPanelLayout.setVerticalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(popcornAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(popcornImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setText("Count");

        crackersCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersCountTextFieldActionPerformed(evt);
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
                .addComponent(crackersImageLabel)
                .addGap(18, 18, 18)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crackersAddButton))
                    .addComponent(jLabel38))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        crackersPanelLayout.setVerticalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(crackersImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel40.setText("Count");

        veggieStrawsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsCountTextFieldActionPerformed(evt);
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
                .addComponent(veggieStrawsImageLabel)
                .addGap(18, 18, 18)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(veggieStrawsAddButton))
                    .addComponent(jLabel40))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        veggieStrawsPanelLayout.setVerticalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veggieStrawsAddButton))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel42.setText("Count");

        greekYogurtCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextFieldActionPerformed(evt);
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
                .addComponent(greekYogurtImageLabel)
                .addGap(18, 18, 18)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greekYogurtAddButton))
                    .addComponent(jLabel42))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        greekYogurtPanelLayout.setVerticalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greekYogurtAddButton)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sparklingWaterImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sparklingWater.jpg"))); // NOI18N

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, itemsPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(itemsPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(gatoradePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(granolaShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chipsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nutsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cookieShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(driedFruitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greekYogurtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(273, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
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
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greekYogurtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3520, Short.MAX_VALUE))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5368, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(5486, Short.MAX_VALUE)))
            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(itemsPanelLayout.createSequentialGroup()
                    .addGap(982, 982, 982)
                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(4513, Short.MAX_VALUE)))
        );

        itemsScrollPanel.setViewportView(itemsPanel);

        machineButtonGroup.add(machine1RadioButton);
        machine1RadioButton.setText("Machine 1");
        machine1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine1RadioButtonActionPerformed(evt);
            }
        });

        machineButtonGroup.add(machine2RadioButton);
        machine2RadioButton.setText("Machine 2");
        machine2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                machine2RadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(machine1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(machine2RadioButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(machine1RadioButton)
                    .addComponent(machine2RadioButton)))
        );

        jLabel1.setText("Money in the machine :");

        jLabel3.setText("Amount to be collected :");

        amountToBeCollectedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountToBeCollectedTextFieldActionPerformed(evt);
            }
        });

        collectMoneyButton.setText("Collect Money");
        collectMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectMoneyButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coins.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(moneyTextField))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amountToBeCollectedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collectMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collectMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(moneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amountToBeCollectedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(collectMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(collectMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout collectMoneyPanelLayout = new javax.swing.GroupLayout(collectMoneyPanel);
        collectMoneyPanel.setLayout(collectMoneyPanelLayout);
        collectMoneyPanelLayout.setHorizontalGroup(
            collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectMoneyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logOutButton)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        collectMoneyPanelLayout.setVerticalGroup(
            collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(collectMoneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collectMoneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frappuccinoPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoPriceTextFieldActionPerformed

    private void frappuccinoCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoCountTextFieldActionPerformed

    private void frappuccinoUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(frappuccinoPriceTextField.getText());
        //itemController.updatePrice(price,105);
    }//GEN-LAST:event_frappuccinoUpdateButtonActionPerformed

    private void addFrappuccinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFrappuccinoButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(frappuccinoCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,105);
        frappuccinoCountTextField.setText(Integer.toString(count));
        if(count>2){
            frappuccinoCountTextField.setBackground(Color.white);
            frappuccinoCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 4, null);
    }//GEN-LAST:event_addFrappuccinoButtonActionPerformed

    private void orangePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangePriceTextFieldActionPerformed

    private void orangeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangeCountTextFieldActionPerformed

    private void orangeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(orangePriceTextField.getText());
        //itemController.updatePrice(price,102);
    }//GEN-LAST:event_orangeUpdateButtonActionPerformed

    private void addOrangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrangeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(orangeCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,102);
        if(count>2){            orangeCountTextField.setBackground(Color.white);

            orangeCountTextField.setForeground(Color.black);
        }
        orangeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", 1, null);
    }//GEN-LAST:event_addOrangeButtonActionPerformed

    private void lemonadePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadePriceTextFieldActionPerformed

    private void lemonadeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadeCountTextFieldActionPerformed

    private void lemonadeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeUpdateButtonActionPerformed
        // TODO add your handling code here:

        //double price = Double.valueOf(lemonadePriceTextField.getText());
        //itemController.updatePrice(price,103);
    }//GEN-LAST:event_lemonadeUpdateButtonActionPerformed

    private void addLemonadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLemonadeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(lemonadeCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,103);
        lemonadeCountTextField.setText(Integer.toString(count));
        if(count>2){
            lemonadeCountTextField.setBackground(Color.white);
            lemonadeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 2, null);
    }//GEN-LAST:event_addLemonadeButtonActionPerformed

    private void gatoradePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradePriceTextFieldActionPerformed

    private void gatoradeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradeCountTextFieldActionPerformed

    private void gatoradeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(gatoradePriceTextField.getText());
        //itemController.updatePrice(price,104);
    }//GEN-LAST:event_gatoradeUpdateButtonActionPerformed

    private void addGatoradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGatoradeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(gatoradeCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,104);
        gatoradeCountTextField.setText(Integer.toString(count));
        if(count>2){
            gatoradeCountTextField.setBackground(Color.white);
            gatoradeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 3, null);
    }//GEN-LAST:event_addGatoradeButtonActionPerformed

    private void coconutWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterPriceTextFieldActionPerformed

    private void coconutWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterCountTextFieldActionPerformed

    private void coconutWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(coconutWaterPriceTextField.getText());
        //itemController.updatePrice(price,106);
    }//GEN-LAST:event_coconutWaterUpdateButtonActionPerformed

    private void addCoconutWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoconutWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(coconutWaterCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,106);
        System.out.println(count);
        coconutWaterCountTextField.setText(Integer.toString(count));
        if(count>2){
            coconutWaterCountTextField.setBackground(Color.white);
            coconutWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 5, null);
    }//GEN-LAST:event_addCoconutWaterButtonActionPerformed

    private void sparklingWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterPriceTextFieldActionPerformed

    private void sparklingWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterCountTextFieldActionPerformed

    private void sparklingWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(sparklingWaterPriceTextField.getText());
        //itemController.updatePrice(price,107);
    }//GEN-LAST:event_sparklingWaterUpdateButtonActionPerformed

    private void addSparklingWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSparklingWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(sparklingWaterCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,107);
        sparklingWaterCountTextField.setText(Integer.toString(count));
         if(count>2){
            sparklingWaterCountTextField.setBackground(Color.white);
            sparklingWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 6, null);
    }//GEN-LAST:event_addSparklingWaterButtonActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void cokeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCountTextFieldActionPerformed

    private void updateCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCokeButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(cokePriceTextField.getText());
        //itemController.updatePrice(price,101);
    }//GEN-LAST:event_updateCokeButtonActionPerformed

    private void addCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCokeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cokeCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,101);
        if(count>2){
            cokeCountTextField.setBackground(Color.white);
            cokeCountTextField.setForeground(Color.black);
        }
        cokeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", 0, null);
    }//GEN-LAST:event_addCokeButtonActionPerformed

    private void proteinSmoothiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothiePriceTextFieldActionPerformed

    private void proteinSmoothieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothieCountTextFieldActionPerformed

    private void updateProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(proteinSmoothiePriceTextField.getText());
        //itemController.updatePrice(price,108);
    }//GEN-LAST:event_updateProteinSmoothieButtonActionPerformed

    private void addProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(proteinSmoothieCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,108);
        proteinSmoothieCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinSmoothieCountTextField.setBackground(Color.white);
            proteinSmoothieCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 7, null);
    }//GEN-LAST:event_addProteinSmoothieButtonActionPerformed

    private void granolaPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaPriceTextFieldActionPerformed

    private void granolaCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaCountTextFieldActionPerformed

    private void granolaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(granolaPriceTextField.getText());
        //itemController.updatePrice(price,201);
    }//GEN-LAST:event_granolaUpdateButtonActionPerformed

    private void granolaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(granolaCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,201);
        granolaCountTextField.setText(Integer.toString(count));
        if(count>2){
            granolaCountTextField.setBackground(Color.white);
            granolaCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 9, null);
    }//GEN-LAST:event_granolaAddButtonActionPerformed

    private void proteinShakePriceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakePriceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakePriceTextField1ActionPerformed

    private void proteinShakeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakeCountTextFieldActionPerformed

    private void proteinShakeUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeUpdateButton1ActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(proteinShakePriceTextField1.getText());
        //itemController.updatePrice(price,109);
    }//GEN-LAST:event_proteinShakeUpdateButton1ActionPerformed

    private void addproteinShakeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproteinShakeButton1ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(proteinShakeCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,109);
        proteinShakeCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinShakeCountTextField.setBackground(Color.white);
            proteinShakeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 8, null);
    }//GEN-LAST:event_addproteinShakeButton1ActionPerformed

    private void chipsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsPriceTextFieldActionPerformed

    private void chipsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsCountTextFieldActionPerformed

    private void chipsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(chipsPriceTextField.getText());
        //itemController.updatePrice(price,202);
    }//GEN-LAST:event_chipsUpdateButtonActionPerformed

    private void chipsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(chipsCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,202);
        chipsCountTextField.setText(Integer.toString(count));
        if(count>2){
            chipsCountTextField.setBackground(Color.white);
            chipsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 10, null);
    }//GEN-LAST:event_chipsAddButtonActionPerformed

    private void nutsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsPriceTextFieldActionPerformed

    private void nutsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsCountTextFieldActionPerformed

    private void nutsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(nutsPriceTextField.getText());
        //itemController.updatePrice(price,203);
    }//GEN-LAST:event_nutsUpdateButtonActionPerformed

    private void nutsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(nutsCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,203);
        nutsCountTextField.setText(Integer.toString(count));
        if(count>2){
            nutsCountTextField.setBackground(Color.white);
            nutsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 11, null);
    }//GEN-LAST:event_nutsAddButtonActionPerformed

    private void cookiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiePriceTextFieldActionPerformed

    private void cookieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieCountTextFieldActionPerformed

    private void cookieUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(cookiePriceTextField.getText());
        //itemController.updatePrice(price,204);
    }//GEN-LAST:event_cookieUpdateButtonActionPerformed

    private void cookieAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cookieCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,204);
        if(count>2){
            cookieCountTextField.setBackground(Color.white);
            cookieCountTextField.setForeground(Color.black);
        }
        cookieCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", 12, null);
    }//GEN-LAST:event_cookieAddButtonActionPerformed

    private void driedFruitsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsPriceTextFieldActionPerformed

    private void driedFruitsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsCountTextFieldActionPerformed

    private void driedFruitsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(driedFruitsPriceTextField.getText());
        //itemController.updatePrice(price,205);
    }//GEN-LAST:event_driedFruitsUpdateButtonActionPerformed

    private void driedFruitsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(driedFruitsCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,205);
        if(count>2){
            driedFruitsCountTextField.setBackground(Color.white);
            driedFruitsCountTextField.setForeground(Color.black);
        }
        driedFruitsCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", 13, null);
    }//GEN-LAST:event_driedFruitsAddButtonActionPerformed

    private void popcornPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornPriceTextFieldActionPerformed

    private void popcornCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornCountTextFieldActionPerformed

    private void popcornUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(popcornPriceTextField.getText());
        //itemController.updatePrice(price,206);
    }//GEN-LAST:event_popcornUpdateButtonActionPerformed

    private void popcornAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(popcornCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,206);
        popcornCountTextField.setText(Integer.toString(count));
        if(count>2){
            popcornCountTextField.setBackground(Color.white);
            popcornCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 14, null);
    }//GEN-LAST:event_popcornAddButtonActionPerformed

    private void crackersPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersPriceTextFieldActionPerformed

    private void crackersCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersCountTextFieldActionPerformed

    private void crackersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(crackersPriceTextField.getText());
        //itemController.updatePrice(price,207);
    }//GEN-LAST:event_crackersUpdateButtonActionPerformed

    private void crackersAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(crackersCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,207);
        crackersCountTextField.setText(Integer.toString(count));
        if(count>2){
            crackersCountTextField.setBackground(Color.white);
            crackersCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 15, null);
    }//GEN-LAST:event_crackersAddButtonActionPerformed

    private void veggieStrawsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsPriceTextFieldActionPerformed

    private void veggieStrawsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsCountTextFieldActionPerformed

    private void veggieStrawsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(veggieStrawsPriceTextField.getText());
        //itemController.updatePrice(price,208);
    }//GEN-LAST:event_veggieStrawsUpdateButtonActionPerformed

    private void veggieStrawsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(veggieStrawsCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,208);
        veggieStrawsCountTextField.setText(Integer.toString(count));
        if(count>2){
            veggieStrawsCountTextField.setBackground(Color.white);
            veggieStrawsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 16, null);
    }//GEN-LAST:event_veggieStrawsAddButtonActionPerformed

    private void greekYogurtPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtPriceTextFieldActionPerformed

    private void greekYogurtCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextFieldActionPerformed

    private void greekYogurtUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtUpdateButtonActionPerformed
        // TODO add your handling code here:
        //double price = Double.valueOf(greekYogurtPriceTextField.getText());
        //itemController.updatePrice(price,209);
    }//GEN-LAST:event_greekYogurtUpdateButtonActionPerformed

    private void greekYogurtAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(greekYogurtCountTextField.getText());
        count++;
        itemController.increaseItemCount(count,209);
        greekYogurtCountTextField.setText(Integer.toString(count));
        if(count>2){
            greekYogurtCountTextField.setBackground(Color.white);
            greekYogurtCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", 17, null);
    }//GEN-LAST:event_greekYogurtAddButtonActionPerformed

    private void collectMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectMoneyButtonActionPerformed
        // TODO add your handling code here:
        double amountToBeCollected = Double.valueOf(amountToBeCollectedTextField.getText());
        double amountInMachine = Double.valueOf(moneyTextField.getText());
        
        if(amountToBeCollected>amountInMachine){
            JOptionPane.showMessageDialog(collectMoneyPanel,"The machine does not have the specified amount");
        }
        collectMoneyTextField.setText(Double.toString(amountToBeCollected));
        salesCollected =  amountToBeCollected;
        double moneyLeft = amountInMachine - amountToBeCollected;
        moneyTextField.setText(Double.toString(moneyLeft));
    }//GEN-LAST:event_collectMoneyButtonActionPerformed

    private void machine1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1RadioButtonActionPerformed
        // TODO add your handling code here:
        double moneyInMachine = itemController.getSales(4201)-salesCollected;
        moneyTextField.setText(Double.toString(moneyInMachine));
    }//GEN-LAST:event_machine1RadioButtonActionPerformed

    private void machine2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2RadioButtonActionPerformed
        // TODO add your handling code here:
      double moneyInMachine = itemController.getSales(4202)-salesCollected;
      moneyTextField.setText(Double.toString(moneyInMachine));
    }//GEN-LAST:event_machine2RadioButtonActionPerformed

    private void amountToBeCollectedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountToBeCollectedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountToBeCollectedTextFieldActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoconutWaterButton;
    private javax.swing.JButton addCokeButton;
    private javax.swing.JButton addFrappuccinoButton;
    private javax.swing.JButton addGatoradeButton;
    private javax.swing.JButton addLemonadeButton;
    private javax.swing.JButton addOrangeButton;
    private javax.swing.JButton addProteinSmoothieButton;
    private javax.swing.JButton addSparklingWaterButton;
    private javax.swing.JButton addproteinShakeButton1;
    private javax.swing.JTextField amountToBeCollectedTextField;
    private javax.swing.JButton chipsAddButton;
    private javax.swing.JTextField chipsCountTextField;
    private javax.swing.JLabel chipsImageLabel;
    private javax.swing.JPanel chipsShakePanel;
    private javax.swing.JTextField coconutWaterCountTextField;
    private javax.swing.JLabel coconutWaterImageLabel;
    private javax.swing.JPanel coconutWaterPanel;
    private javax.swing.JTextField cokeCountTextField;
    private javax.swing.JLabel cokeImageLabel1;
    private javax.swing.JPanel cokeInfoPanel1;
    private javax.swing.JPanel cokeInfoPanel2;
    private javax.swing.JPanel cokeInfoPanel3;
    private javax.swing.JPanel cokeInfoPanel4;
    private javax.swing.JPanel cokeInfoPanel5;
    private javax.swing.JPanel cokeInfoPanel6;
    private javax.swing.JPanel cokeInfoPanel7;
    private javax.swing.JButton collectMoneyButton;
    private javax.swing.JPanel collectMoneyPanel;
    private javax.swing.JTextField collectMoneyTextField;
    private javax.swing.JButton cookieAddButton;
    private javax.swing.JTextField cookieCountTextField;
    private javax.swing.JLabel cookieImageLabel;
    private javax.swing.JPanel cookieShakePanel;
    private javax.swing.JButton crackersAddButton;
    private javax.swing.JTextField crackersCountTextField;
    private javax.swing.JLabel crackersImageLabel;
    private javax.swing.JPanel crackersPanel;
    private javax.swing.JButton driedFruitsAddButton;
    private javax.swing.JTextField driedFruitsCountTextField;
    private javax.swing.JLabel driedFruitsImageLabel;
    private javax.swing.JPanel driedFruitsPanel;
    private javax.swing.JTextField frappuccinoCountTextField;
    private javax.swing.JLabel frappuccinoImageLabel;
    private javax.swing.JPanel frappuccinoPanel;
    private javax.swing.JTextField gatoradeCountTextField;
    private javax.swing.JLabel gatoradeImageLabel1;
    private javax.swing.JPanel gatoradePanel1;
    private javax.swing.JButton granolaAddButton;
    private javax.swing.JTextField granolaCountTextField;
    private javax.swing.JLabel granolaShakeImageLabel;
    private javax.swing.JPanel granolaShakePanel;
    private javax.swing.JButton greekYogurtAddButton;
    private javax.swing.JTextField greekYogurtCountTextField;
    private javax.swing.JLabel greekYogurtImageLabel;
    private javax.swing.JPanel greekYogurtPanel;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JScrollPane itemsScrollPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lemonadeCountTextField;
    private javax.swing.JLabel lemonadeImageLabel1;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JRadioButton machine1RadioButton;
    private javax.swing.JRadioButton machine2RadioButton;
    private javax.swing.ButtonGroup machineButtonGroup;
    private javax.swing.JTextField moneyTextField;
    private javax.swing.JButton nutsAddButton;
    private javax.swing.JTextField nutsCountTextField;
    private javax.swing.JLabel nutsImageLabel;
    private javax.swing.JPanel nutsShakePanel;
    private javax.swing.JTextField orangeCountTextField;
    private javax.swing.JLabel orangeImageLabel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JButton popcornAddButton;
    private javax.swing.JTextField popcornCountTextField;
    private javax.swing.JLabel popcornImageLabel;
    private javax.swing.JPanel popcornPanel;
    private javax.swing.JTextField proteinShakeCountTextField;
    private javax.swing.JLabel proteinShakeImageLabel1;
    private javax.swing.JPanel proteinShakePanel1;
    private javax.swing.JTextField proteinSmoothieCountTextField;
    private javax.swing.JLabel proteinSmoothieImageLabel;
    private javax.swing.JPanel proteinSmoothiePanel;
    private javax.swing.JTextField sparklingWaterCountTextField;
    private javax.swing.JLabel sparklingWaterImageLabel;
    private javax.swing.JPanel sparlkingWaterPanel;
    private javax.swing.JButton veggieStrawsAddButton;
    private javax.swing.JTextField veggieStrawsCountTextField;
    private javax.swing.JLabel veggieStrawsImageLabel;
    private javax.swing.JPanel veggieStrawsPanel;
    // End of variables declaration//GEN-END:variables
}
