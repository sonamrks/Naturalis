/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import controller.Mediator;
import controller.UserLogController;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;
import main.Main;

/**
 *
 * @author AshitaRaghu
 */
public class AdminUI extends javax.swing.JFrame implements Collegue {
    
    private Integer machineID;
    private String collegueID;
    private ItemController itemController;
    private UserLogController userLogController;
    ArrayList<Integer> beverageCodeList;
    ArrayList<Integer> beverageCountList;
    ArrayList<String> beveragePictureList;
    ArrayList<Integer> snackCodeList;
    ArrayList<Integer> snackCountList;
    ArrayList<String> snackPictureList;   
    ArrayList<JLabel> itemLabels;
    ArrayList<JTextField> itemTextFields;
    ArrayList<JButton> itemButtons;
    
    /**
     * Creates new form LimitedView
     */
    public AdminUI(Integer machineID, String collegueID) {
        itemLabels = new ArrayList<JLabel>();
        itemTextFields = new ArrayList<JTextField>();
        itemButtons = new ArrayList<JButton>();
        initComponents();
        this.itemController = ItemController.getItemControllerInstance();
        this.machineID = machineID;
        this.collegueID = collegueID;
        machineIDLabel.setText("Machine ID : "+machineID);
        userLogController = new UserLogController();
        itemController.registerACollegue(this);
        itemController.generateCategoryItemInfo(machineID, "beverage");
        beverageCodeList = itemController.getCategoryCodeForMachine();
        beverageCountList = itemController.getCategoryCountForMachine();
        beveragePictureList = itemController.getCategoryPicturePathForMachine();
        itemController.generateCategoryItemInfo(machineID, "snack");
        snackCountList = itemController.getCategoryCountForMachine();
        snackCodeList = itemController.getCategoryCodeForMachine();
        snackPictureList = itemController.getCategoryPicturePathForMachine();
        setPicture();
        setCount();
    }
    
    public void sendMessage(String type, String product, Integer code, Double value) {
        itemController.sendMessageToAll(this, type, product, code, value);
    }
    
    public void receiveMessage(String type, String product, Integer code, Double value) {
        int index;
        if(type.equals("addtocart")) {
            if(product.equals("beverage")) {
                index = beverageCodeList.indexOf(code);
                beverageCountList.set(index, beverageCountList.get(index)-1);
            }
            if(product.equals("snack")) {
                index = snackCodeList.indexOf(code);
                snackCountList.set(index, snackCountList.get(index)-1);
            }
        }
        if(type.equals("removefromcart")) {
            if(product.equals("beverage")) {
            index = beverageCodeList.indexOf(code);                
                beverageCountList.set(index, beverageCountList.get(index)+1);
            }
            if(product.equals("snack")) {
            index = snackCodeList.indexOf(code);                
                snackCountList.set(index, snackCountList.get(index)+1);
            }
        }   
        setCount(); 
    }

    public void addMediator (Mediator mediator) {
    }
    
    public String getId() {
        return collegueID;
    }    
    
    public void setPicture(){
       int i = 0, j;
       for(j=0; j<beveragePictureList.size(); j++) {
            itemLabels.get(i).setIcon(new ImageIcon(this.getClass().getResource(beveragePictureList.get(j))));
            i+=1;
        }
        for(j=0; j<snackPictureList.size(); j++) {
            itemLabels.get(i).setIcon(new ImageIcon(this.getClass().getResource(snackPictureList.get(j))));
            i+=1;
        }
    }
    
    public void setCount(){
        int i = 0, j;

        for(j=0; j<beverageCountList.size(); j++) {
            itemTextFields.get(i).setText(Integer.toString(beverageCountList.get(j)));
            if(beverageCountList.get(j)==0){
                itemTextFields.get(i).setBackground(Color.red);
                itemTextFields.get(i).setForeground(Color.yellow);
            } 
            else if(beverageCountList.get(j)<=2){
                itemTextFields.get(i).setBackground(Color.blue);
                itemTextFields.get(i).setForeground(Color.yellow);
            }  
            i+=1;
        }
        
        for(j=0; j<snackCountList.size(); j++) {
            itemTextFields.get(i).setText(Integer.toString(snackCountList.get(j)));
            if(snackCountList.get(j)==0){
                itemTextFields.get(i).setBackground(Color.red);
                itemTextFields.get(i).setForeground(Color.yellow);
            } 
            else if(beverageCountList.get(j)<=2){
                itemTextFields.get(i).setBackground(Color.blue);
                itemTextFields.get(i).setForeground(Color.yellow);
            }  
            i+=1;         
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
        sparklingWaterImageLabel = new javax.swing.JLabel();
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
        machineIDLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        greekYogurtCountTextField1 = new javax.swing.JTextField();
        greekYogurtAddButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        greekYogurtCountTextField2 = new javax.swing.JTextField();
        greekYogurtAddButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        greekYogurtCountTextField3 = new javax.swing.JTextField();
        greekYogurtAddButton3 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(251, 247, 229));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        itemsPanel.setBackground(new java.awt.Color(114, 148, 36));

        itemLabels.add(frappuccinoImageLabel);

        jLabel12.setText("Count");

        itemTextFields.add(frappuccinoCountTextField);
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

        itemLabels.add(orangeImageLabel);

        jLabel14.setText("Count");

        itemTextFields.add(orangeCountTextField);
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
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cokeInfoPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orangeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        itemLabels.add(lemonadeImageLabel1);

        jLabel16.setText("Count");

        itemTextFields.add(lemonadeCountTextField);
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
                .addContainerGap(47, Short.MAX_VALUE))
        );
        lemonadePanelLayout.setVerticalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lemonadePanelLayout.createSequentialGroup()
                        .addComponent(cokeInfoPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(lemonadeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        itemLabels.add(gatoradeImageLabel1);

        jLabel18.setText("Count");

        itemTextFields.add(gatoradeCountTextField);
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
                .addContainerGap(34, Short.MAX_VALUE))
        );
        gatoradePanel1Layout.setVerticalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gatoradePanel1Layout.createSequentialGroup()
                        .addComponent(cokeInfoPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(gatoradeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        itemLabels.add(coconutWaterImageLabel);

        jLabel20.setText("Count");

        itemTextFields.add(coconutWaterCountTextField);
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

        jLabel22.setText("Count");

        itemTextFields.add(sparklingWaterCountTextField);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        itemLabels.add(sparklingWaterImageLabel);

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        jLabel10.setText("Count");

        itemTextFields.add(cokeCountTextField);
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

        itemLabels.add(cokeImageLabel1);

        javax.swing.GroupLayout cokeInfoPanel7Layout = new javax.swing.GroupLayout(cokeInfoPanel7);
        cokeInfoPanel7.setLayout(cokeInfoPanel7Layout);
        cokeInfoPanel7Layout.setHorizontalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addCokeButton))
                    .addComponent(jLabel10))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        cokeInfoPanel7Layout.setVerticalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCokeButton))
                .addGap(20, 20, 20))
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Count");

        itemTextFields.add(proteinSmoothieCountTextField);
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

        itemLabels.add(proteinSmoothieImageLabel);

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
                .addGap(0, 0, Short.MAX_VALUE))
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

        itemTextFields.add(granolaCountTextField);
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

        itemLabels.add(granolaShakeImageLabel);

        javax.swing.GroupLayout granolaShakePanelLayout = new javax.swing.GroupLayout(granolaShakePanel);
        granolaShakePanel.setLayout(granolaShakePanelLayout);
        granolaShakePanelLayout.setHorizontalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaAddButton))
                    .addComponent(jLabel24))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(0, 29, Short.MAX_VALUE))
        );

        jLabel26.setText("Count");

        itemTextFields.add(proteinShakeCountTextField);
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

        itemLabels.add(proteinShakeImageLabel1);

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
                .addGap(0, 39, Short.MAX_VALUE))
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
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel28.setText("Count");

        itemTextFields.add(chipsCountTextField);
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

        itemLabels.add(chipsImageLabel);

        javax.swing.GroupLayout chipsShakePanelLayout = new javax.swing.GroupLayout(chipsShakePanel);
        chipsShakePanel.setLayout(chipsShakePanelLayout);
        chipsShakePanelLayout.setHorizontalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(chipsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsAddButton))
                    .addComponent(jLabel28))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel30.setText("Count");

        itemTextFields.add(nutsCountTextField);
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

        itemLabels.add(nutsImageLabel);

        javax.swing.GroupLayout nutsShakePanelLayout = new javax.swing.GroupLayout(nutsShakePanel);
        nutsShakePanel.setLayout(nutsShakePanelLayout);
        nutsShakePanelLayout.setHorizontalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(nutsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nutsAddButton))
                    .addComponent(jLabel30))
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(nutsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );

        jLabel32.setText("Count");

        itemTextFields.add(cookieCountTextField);
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

        itemLabels.add(cookieImageLabel);

        javax.swing.GroupLayout cookieShakePanelLayout = new javax.swing.GroupLayout(cookieShakePanel);
        cookieShakePanel.setLayout(cookieShakePanelLayout);
        cookieShakePanelLayout.setHorizontalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cookieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cookieAddButton))
                    .addComponent(jLabel32))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(0, 36, Short.MAX_VALUE))
            .addComponent(cookieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel34.setText("Count");

        itemTextFields.add(driedFruitsCountTextField);
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

        itemLabels.add(driedFruitsImageLabel);

        javax.swing.GroupLayout driedFruitsPanelLayout = new javax.swing.GroupLayout(driedFruitsPanel);
        driedFruitsPanel.setLayout(driedFruitsPanelLayout);
        driedFruitsPanelLayout.setHorizontalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(driedFruitsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(driedFruitsAddButton))
                    .addComponent(jLabel34))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel36.setText("Count");

        itemTextFields.add(popcornCountTextField);
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

        itemLabels.add(popcornImageLabel);

        javax.swing.GroupLayout popcornPanelLayout = new javax.swing.GroupLayout(popcornPanel);
        popcornPanel.setLayout(popcornPanelLayout);
        popcornPanelLayout.setHorizontalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popcornImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(popcornAddButton))
                    .addComponent(jLabel36))
                .addGap(0, 50, Short.MAX_VALUE))
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
                .addGap(0, 48, Short.MAX_VALUE))
            .addComponent(popcornImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setText("Count");

        itemTextFields.add(crackersCountTextField);
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

        itemLabels.add(crackersImageLabel);

        javax.swing.GroupLayout crackersPanelLayout = new javax.swing.GroupLayout(crackersPanel);
        crackersPanel.setLayout(crackersPanelLayout);
        crackersPanelLayout.setHorizontalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(crackersImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crackersAddButton))
                    .addComponent(jLabel38))
                .addGap(0, 56, Short.MAX_VALUE))
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
                .addGap(0, 28, Short.MAX_VALUE))
            .addComponent(crackersImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel40.setText("Count");

        itemTextFields.add(veggieStrawsCountTextField);
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

        itemLabels.add(veggieStrawsImageLabel);

        javax.swing.GroupLayout veggieStrawsPanelLayout = new javax.swing.GroupLayout(veggieStrawsPanel);
        veggieStrawsPanel.setLayout(veggieStrawsPanelLayout);
        veggieStrawsPanelLayout.setHorizontalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(veggieStrawsAddButton))
                    .addComponent(jLabel40))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(0, 23, Short.MAX_VALUE))
            .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel42.setText("Count");

        itemTextFields.add(greekYogurtCountTextField);
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

        itemLabels.add(greekYogurtImageLabel);

        javax.swing.GroupLayout greekYogurtPanelLayout = new javax.swing.GroupLayout(greekYogurtPanel);
        greekYogurtPanel.setLayout(greekYogurtPanelLayout);
        greekYogurtPanelLayout.setHorizontalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greekYogurtAddButton))
                    .addComponent(jLabel42))
                .addGap(0, 62, Short.MAX_VALUE))
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
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled.png"))); // NOI18N

        jLabel5.setText("Count 0");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue.png"))); // NOI18N

        jLabel7.setText("Count >3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        itemLabels.add(jLabel9);
        jLabel9.setText("jLabel9");

        jLabel43.setText("Count");

        itemTextFields.add(greekYogurtCountTextField1);
        greekYogurtCountTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextField1ActionPerformed(evt);
            }
        });

        greekYogurtAddButton1.setText("+");
        greekYogurtAddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtAddButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greekYogurtAddButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtCountTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtAddButton1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        itemLabels.add(jLabel11);
        jLabel11.setText("jLabel9");

        jLabel44.setText("Count");

        itemTextFields.add(greekYogurtCountTextField2);
        greekYogurtCountTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextField2ActionPerformed(evt);
            }
        });

        greekYogurtAddButton2.setText("+");
        greekYogurtAddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtAddButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greekYogurtAddButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtCountTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtAddButton2))
                .addGap(38, 38, 38))
        );

        itemLabels.add(jLabel13);
        jLabel13.setText("jLabel9");

        jLabel45.setText("Count");

        itemTextFields.add(greekYogurtCountTextField3);
        greekYogurtCountTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextField3ActionPerformed(evt);
            }
        });

        greekYogurtAddButton3.setText("+");
        greekYogurtAddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtAddButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(greekYogurtCountTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(greekYogurtAddButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtCountTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greekYogurtAddButton3))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemsPanelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(machineIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(itemsPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(frappuccinoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gatoradePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lemonadePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orangePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greekYogurtPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coconutWaterPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, itemsPanelLayout.createSequentialGroup()
                                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(chipsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(granolaShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(proteinShakePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(crackersPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(237, 237, 237))
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(popcornPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(driedFruitsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nutsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cookieShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addComponent(machineIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gatoradePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proteinShakePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(granolaShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chipsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cookieShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driedFruitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greekYogurtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3398, Short.MAX_VALUE))
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Money in the machine :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountToBeCollectedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(moneyTextField))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(43, Short.MAX_VALUE))
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
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectMoneyPanelLayout.createSequentialGroup()
                        .addGroup(collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, collectMoneyPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        collectMoneyPanelLayout.setVerticalGroup(
            collectMoneyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collectMoneyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOutButton)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(collectMoneyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collectMoneyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 2794, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        itemController.increaseItemCount(beverageCodeList.get(4), machineID);
        frappuccinoCountTextField.setText(Integer.toString(count));
        if(count>2){
            frappuccinoCountTextField.setBackground(Color.white);
            frappuccinoCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 4, null);
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
        itemController.increaseItemCount(beverageCodeList.get(1), machineID);
        if(count>2){            
            orangeCountTextField.setBackground(Color.white);
            orangeCountTextField.setForeground(Color.black);
        }
        orangeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "beverage", 1, null);
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
        itemController.increaseItemCount(beverageCodeList.get(2), machineID);
        lemonadeCountTextField.setText(Integer.toString(count));
        if(count>2){
            lemonadeCountTextField.setBackground(Color.white);
            lemonadeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 2, null);
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
        itemController.increaseItemCount(beverageCodeList.get(3), machineID);
        gatoradeCountTextField.setText(Integer.toString(count));
        if(count>2){
            gatoradeCountTextField.setBackground(Color.white);
            gatoradeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 3, null);
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
        itemController.increaseItemCount(beverageCodeList.get(5), machineID);
        System.out.println(count);
        coconutWaterCountTextField.setText(Integer.toString(count));
        if(count>2){
            coconutWaterCountTextField.setBackground(Color.white);
            coconutWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 5, null);
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
        itemController.increaseItemCount(beverageCodeList.get(6), machineID);
        sparklingWaterCountTextField.setText(Integer.toString(count));
         if(count>2){
            sparklingWaterCountTextField.setBackground(Color.white);
            sparklingWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 6, null);
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
        itemController.increaseItemCount(beverageCodeList.get(0), machineID);
        if(count>2){
            cokeCountTextField.setBackground(Color.white);
            cokeCountTextField.setForeground(Color.black);
        }
        cokeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "beverage", 0, null);
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
        itemController.increaseItemCount(beverageCodeList.get(7), machineID);;
        proteinSmoothieCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinSmoothieCountTextField.setBackground(Color.white);
            proteinSmoothieCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 7, null);
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
        itemController.increaseItemCount(snackCodeList.get(0), machineID);
        granolaCountTextField.setText(Integer.toString(count));
        if(count>2){
            granolaCountTextField.setBackground(Color.white);
            granolaCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 9, null);
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
        itemController.increaseItemCount(beverageCodeList.get(8), machineID);
        proteinShakeCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinShakeCountTextField.setBackground(Color.white);
            proteinShakeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 8, null);
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
        itemController.increaseItemCount(snackCodeList.get(1), machineID);
        chipsCountTextField.setText(Integer.toString(count));
        if(count>2){
            chipsCountTextField.setBackground(Color.white);
            chipsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 10, null);
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
        itemController.increaseItemCount(snackCodeList.get(2), machineID);
        nutsCountTextField.setText(Integer.toString(count));
        if(count>2){
            nutsCountTextField.setBackground(Color.white);
            nutsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 11, null);
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
        itemController.increaseItemCount(snackCodeList.get(3), machineID);
        if(count>2){
            cookieCountTextField.setBackground(Color.white);
            cookieCountTextField.setForeground(Color.black);
        }
        cookieCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "snack", 12, null);
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
        itemController.increaseItemCount(snackCodeList.get(4), machineID);
        if(count>2){
            driedFruitsCountTextField.setBackground(Color.white);
            driedFruitsCountTextField.setForeground(Color.black);
        }
        driedFruitsCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "snack", 13, null);
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
        itemController.increaseItemCount(snackCodeList.get(5), machineID);
        popcornCountTextField.setText(Integer.toString(count));
        if(count>2){
            popcornCountTextField.setBackground(Color.white);
            popcornCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 14, null);
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
        itemController.increaseItemCount(snackCodeList.get(6), machineID);
        crackersCountTextField.setText(Integer.toString(count));
        if(count>2){
            crackersCountTextField.setBackground(Color.white);
            crackersCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 15, null);
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
        itemController.increaseItemCount(snackCodeList.get(7), machineID);
        veggieStrawsCountTextField.setText(Integer.toString(count));
        if(count>2){
            veggieStrawsCountTextField.setBackground(Color.white);
            veggieStrawsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 16, null);
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
        itemController.increaseItemCount(snackCodeList.get(8), machineID);
        greekYogurtCountTextField.setText(Integer.toString(count));
        if(count>2){
            greekYogurtCountTextField.setBackground(Color.white);
            greekYogurtCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 17, null);
    }//GEN-LAST:event_greekYogurtAddButtonActionPerformed

    private void collectMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectMoneyButtonActionPerformed
        // TODO add your handling code here:
        double amountToBeCollected = Double.valueOf(amountToBeCollectedTextField.getText());
        double amountInMachine = Double.valueOf(moneyTextField.getText());
        
        if(amountToBeCollected>amountInMachine){
            JOptionPane.showMessageDialog(collectMoneyPanel,"The machine does not have the specified amount");
        }
        collectMoneyTextField.setText(Double.toString(amountToBeCollected));
        double moneyLeft = amountInMachine - amountToBeCollected;
         double roundOff = Math.round(moneyLeft * 100.0) / 100.0;
        moneyTextField.setText(Double.toString(roundOff));
    }//GEN-LAST:event_collectMoneyButtonActionPerformed

    private void machine1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine1RadioButtonActionPerformed
        // TODO add your handling code here:
        double moneyInMachine = itemController.getSales(4201);
        amountToBeCollectedTextField.setText("");
        collectMoneyTextField.setText("");
        double roundOff = Math.round(moneyInMachine * 100.0) / 100.0;
        moneyTextField.setText(Double.toString(roundOff));
    }//GEN-LAST:event_machine1RadioButtonActionPerformed

    private void machine2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_machine2RadioButtonActionPerformed
        // TODO add your handling code here:
      double moneyInMachine = itemController.getSales(4202);
      amountToBeCollectedTextField.setText("");
      collectMoneyTextField.setText("");
      double roundOff = Math.round(moneyInMachine * 100.0) / 100.0;
      moneyTextField.setText(Double.toString(roundOff));
    }//GEN-LAST:event_machine2RadioButtonActionPerformed

    private void amountToBeCollectedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountToBeCollectedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountToBeCollectedTextFieldActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Main.getCardLayout().show(Main.getCards(),"Navigation");
      //  NavigationPanel nav = new NavigationPanel(itemController);
      //  userLogController.addLogOutEntry(nav.getUserName(),"admin");
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirm close", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void greekYogurtCountTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextField1ActionPerformed

    private void greekYogurtAddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtAddButton1ActionPerformed

    private void greekYogurtCountTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextField2ActionPerformed

    private void greekYogurtAddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtAddButton2ActionPerformed

    private void greekYogurtCountTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextField3ActionPerformed

    private void greekYogurtAddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtAddButton3ActionPerformed

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
    private javax.swing.JButton greekYogurtAddButton1;
    private javax.swing.JButton greekYogurtAddButton2;
    private javax.swing.JButton greekYogurtAddButton3;
    private javax.swing.JTextField greekYogurtCountTextField;
    private javax.swing.JTextField greekYogurtCountTextField1;
    private javax.swing.JTextField greekYogurtCountTextField2;
    private javax.swing.JTextField greekYogurtCountTextField3;
    private javax.swing.JLabel greekYogurtImageLabel;
    private javax.swing.JPanel greekYogurtPanel;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JScrollPane itemsScrollPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lemonadeCountTextField;
    private javax.swing.JLabel lemonadeImageLabel1;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JRadioButton machine1RadioButton;
    private javax.swing.JRadioButton machine2RadioButton;
    private javax.swing.ButtonGroup machineButtonGroup;
    private javax.swing.JLabel machineIDLabel;
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
