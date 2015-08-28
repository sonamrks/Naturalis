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
    ArrayList<JLabel> itemCodeLabels;
    ArrayList<JTextField> itemTextFields;
    ArrayList<JButton> itemButtons;
    int size;
    
    /**
     * Creates new form LimitedView
     */
    public AdminUI(Integer machineID, String collegueID) {
        itemLabels = new ArrayList<JLabel>();
        itemCodeLabels = new ArrayList<JLabel>();
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
        size = beverageCodeList.size();
        itemController.generateCategoryItemInfo(machineID, "snack");
        snackCountList = itemController.getCategoryCountForMachine();
        snackCodeList = itemController.getCategoryCodeForMachine();
        snackPictureList = itemController.getCategoryPicturePathForMachine();
        setCode();
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
    
    public void setCode(){
       int i = 0, j;
       for(j=0; j<beverageCodeList.size(); j++) {
            itemCodeLabels.get(i).setText(Integer.toString(beverageCodeList.get(j)));
            i+=1;
        }
        for(j=0; j<snackCodeList.size(); j++) {
            itemCodeLabels.get(i).setText(Integer.toString(snackCodeList.get(j)));
            i+=1;
        }
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
        cokeInfoPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        countTextField1 = new javax.swing.JTextField();
        button1 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        codeLabel1 = new javax.swing.JLabel();
        orangePanel = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        cokeInfoPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        countTextField2 = new javax.swing.JTextField();
        button2 = new javax.swing.JButton();
        codeLabel2 = new javax.swing.JLabel();
        lemonadePanel = new javax.swing.JPanel();
        label3 = new javax.swing.JLabel();
        cokeInfoPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        countTextField3 = new javax.swing.JTextField();
        button3 = new javax.swing.JButton();
        codeLabel3 = new javax.swing.JLabel();
        gatoradePanel1 = new javax.swing.JPanel();
        label4 = new javax.swing.JLabel();
        cokeInfoPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        countTextField4 = new javax.swing.JTextField();
        button4 = new javax.swing.JButton();
        codeLabel4 = new javax.swing.JLabel();
        frappuccinoPanel = new javax.swing.JPanel();
        labe5 = new javax.swing.JLabel();
        cokeInfoPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        countTextField5 = new javax.swing.JTextField();
        button5 = new javax.swing.JButton();
        codeLabel5 = new javax.swing.JLabel();
        coconutWaterPanel = new javax.swing.JPanel();
        label6 = new javax.swing.JLabel();
        cokeInfoPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        countTextField6 = new javax.swing.JTextField();
        button6 = new javax.swing.JButton();
        codeLabel6 = new javax.swing.JLabel();
        sparlkingWaterPanel = new javax.swing.JPanel();
        cokeInfoPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        countTextField7 = new javax.swing.JTextField();
        button7 = new javax.swing.JButton();
        codeLabel7 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        proteinSmoothiePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        countTextField8 = new javax.swing.JTextField();
        button8 = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        codeLabel8 = new javax.swing.JLabel();
        proteinShakePanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        countTextField9 = new javax.swing.JTextField();
        button9 = new javax.swing.JButton();
        label9 = new javax.swing.JLabel();
        codeLabel9 = new javax.swing.JLabel();
        granolaShakePanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        countTextField10 = new javax.swing.JTextField();
        button10 = new javax.swing.JButton();
        label10 = new javax.swing.JLabel();
        codeLabel10 = new javax.swing.JLabel();
        chipsShakePanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        countTextField11 = new javax.swing.JTextField();
        button11 = new javax.swing.JButton();
        label11 = new javax.swing.JLabel();
        codeLabel11 = new javax.swing.JLabel();
        nutsShakePanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        countTextField12 = new javax.swing.JTextField();
        button12 = new javax.swing.JButton();
        label12 = new javax.swing.JLabel();
        codeLabel12 = new javax.swing.JLabel();
        cookieShakePanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        countTextField13 = new javax.swing.JTextField();
        button13 = new javax.swing.JButton();
        label13 = new javax.swing.JLabel();
        codeLabel13 = new javax.swing.JLabel();
        driedFruitsPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        countTextField14 = new javax.swing.JTextField();
        button14 = new javax.swing.JButton();
        label14 = new javax.swing.JLabel();
        codeLabel14 = new javax.swing.JLabel();
        popcornPanel = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        countTextField15 = new javax.swing.JTextField();
        button15 = new javax.swing.JButton();
        label15 = new javax.swing.JLabel();
        codeLabel15 = new javax.swing.JLabel();
        crackersPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        countTextField16 = new javax.swing.JTextField();
        button16 = new javax.swing.JButton();
        label16 = new javax.swing.JLabel();
        codeLabel16 = new javax.swing.JLabel();
        veggieStrawsPanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        countTextField17 = new javax.swing.JTextField();
        button17 = new javax.swing.JButton();
        label17 = new javax.swing.JLabel();
        codeLabel17 = new javax.swing.JLabel();
        greekYogurtPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        countTextField18 = new javax.swing.JTextField();
        button18 = new javax.swing.JButton();
        label18 = new javax.swing.JLabel();
        codeLabel18 = new javax.swing.JLabel();
        machineIDLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label19 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        countTextField19 = new javax.swing.JTextField();
        button19 = new javax.swing.JButton();
        codeLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        label20 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        countTextField20 = new javax.swing.JTextField();
        button20 = new javax.swing.JButton();
        codeLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        label21 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        countTextField21 = new javax.swing.JTextField();
        button21 = new javax.swing.JButton();
        codeLabel21 = new javax.swing.JLabel();
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

        jLabel10.setText("Count");

        itemTextFields.add(countTextField1);
        countTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField1ActionPerformed(evt);
            }
        });

        button1.setText("+");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        itemLabels.add(label1);

        itemCodeLabels.add(codeLabel1);
        codeLabel1.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel7Layout = new javax.swing.GroupLayout(cokeInfoPanel7);
        cokeInfoPanel7.setLayout(cokeInfoPanel7Layout);
        cokeInfoPanel7Layout.setHorizontalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                                .addComponent(countTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button1))
                            .addComponent(jLabel10)))
                    .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(codeLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cokeInfoPanel7Layout.setVerticalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1))
                .addGap(20, 20, 20))
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemLabels.add(label2);

        jLabel14.setText("Count");

        itemTextFields.add(countTextField2);
        countTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField2ActionPerformed(evt);
            }
        });

        button2.setText("+");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel2);
        codeLabel2.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel2Layout = new javax.swing.GroupLayout(cokeInfoPanel2);
        cokeInfoPanel2.setLayout(cokeInfoPanel2Layout);
        cokeInfoPanel2Layout.setHorizontalGroup(
            cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addGroup(cokeInfoPanel2Layout.createSequentialGroup()
                            .addComponent(countTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel2Layout.createSequentialGroup()
                        .addComponent(codeLabel2)
                        .addGap(70, 70, 70))))
        );
        cokeInfoPanel2Layout.setVerticalGroup(
            cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2))
                .addContainerGap())
        );

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        itemLabels.add(label3);

        jLabel16.setText("Count");

        itemTextFields.add(countTextField3);
        countTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField3ActionPerformed(evt);
            }
        });

        button3.setText("+");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel3);
        codeLabel3.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel3Layout = new javax.swing.GroupLayout(cokeInfoPanel3);
        cokeInfoPanel3.setLayout(cokeInfoPanel3Layout);
        cokeInfoPanel3Layout.setHorizontalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeLabel3)
                    .addComponent(jLabel16)
                    .addGroup(cokeInfoPanel3Layout.createSequentialGroup()
                        .addComponent(countTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button3))))
        );
        cokeInfoPanel3Layout.setVerticalGroup(
            cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3))
                .addContainerGap())
        );

        javax.swing.GroupLayout lemonadePanelLayout = new javax.swing.GroupLayout(lemonadePanel);
        lemonadePanel.setLayout(lemonadePanelLayout);
        lemonadePanelLayout.setHorizontalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        itemLabels.add(label4);

        jLabel18.setText("Count");

        itemTextFields.add(countTextField4);
        countTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField4ActionPerformed(evt);
            }
        });

        button4.setText("+");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel4);
        codeLabel4.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel4Layout = new javax.swing.GroupLayout(cokeInfoPanel4);
        cokeInfoPanel4.setLayout(cokeInfoPanel4Layout);
        cokeInfoPanel4Layout.setHorizontalGroup(
            cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                                .addComponent(countTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button4))))
                    .addGroup(cokeInfoPanel4Layout.createSequentialGroup()
                        .addComponent(codeLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        cokeInfoPanel4Layout.setVerticalGroup(
            cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4))
                .addContainerGap())
        );

        javax.swing.GroupLayout gatoradePanel1Layout = new javax.swing.GroupLayout(gatoradePanel1);
        gatoradePanel1.setLayout(gatoradePanel1Layout);
        gatoradePanel1Layout.setHorizontalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        itemLabels.add(labe5);

        jLabel12.setText("Count");

        itemTextFields.add(countTextField5);
        countTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField5ActionPerformed(evt);
            }
        });

        button5.setText("+");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel5);
        codeLabel5.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel1Layout = new javax.swing.GroupLayout(cokeInfoPanel1);
        cokeInfoPanel1.setLayout(cokeInfoPanel1Layout);
        cokeInfoPanel1Layout.setHorizontalGroup(
            cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                                .addComponent(countTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button5))))
                    .addGroup(cokeInfoPanel1Layout.createSequentialGroup()
                        .addComponent(codeLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        cokeInfoPanel1Layout.setVerticalGroup(
            cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codeLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5))
                .addContainerGap())
        );

        javax.swing.GroupLayout frappuccinoPanelLayout = new javax.swing.GroupLayout(frappuccinoPanel);
        frappuccinoPanel.setLayout(frappuccinoPanelLayout);
        frappuccinoPanelLayout.setHorizontalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labe5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(labe5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        itemLabels.add(label6);

        jLabel20.setText("Count");

        itemTextFields.add(countTextField6);
        countTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField6ActionPerformed(evt);
            }
        });

        button6.setText("+");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel6);
        codeLabel6.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel5Layout = new javax.swing.GroupLayout(cokeInfoPanel5);
        cokeInfoPanel5.setLayout(cokeInfoPanel5Layout);
        cokeInfoPanel5Layout.setHorizontalGroup(
            cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codeLabel6)
                    .addComponent(jLabel20)
                    .addGroup(cokeInfoPanel5Layout.createSequentialGroup()
                        .addComponent(countTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button6))))
        );
        cokeInfoPanel5Layout.setVerticalGroup(
            cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6))
                .addContainerGap())
        );

        javax.swing.GroupLayout coconutWaterPanelLayout = new javax.swing.GroupLayout(coconutWaterPanel);
        coconutWaterPanel.setLayout(coconutWaterPanelLayout);
        coconutWaterPanelLayout.setHorizontalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel22.setText("Count");

        itemTextFields.add(countTextField7);
        countTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField7ActionPerformed(evt);
            }
        });

        button7.setText("+");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel7);
        codeLabel7.setText("jLabel9");

        javax.swing.GroupLayout cokeInfoPanel6Layout = new javax.swing.GroupLayout(cokeInfoPanel6);
        cokeInfoPanel6.setLayout(cokeInfoPanel6Layout);
        cokeInfoPanel6Layout.setHorizontalGroup(
            cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(cokeInfoPanel6Layout.createSequentialGroup()
                        .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeLabel7)
                            .addComponent(countTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button7))))
        );
        cokeInfoPanel6Layout.setVerticalGroup(
            cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeInfoPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7))
                .addContainerGap())
        );

        itemLabels.add(label7);

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel8.setText("Count");

        itemTextFields.add(countTextField8);
        countTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField8ActionPerformed(evt);
            }
        });

        button8.setText("+");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        itemLabels.add(label8);

        itemCodeLabels.add(codeLabel8);
        codeLabel8.setText("jLabel9");

        javax.swing.GroupLayout proteinSmoothiePanelLayout = new javax.swing.GroupLayout(proteinSmoothiePanel);
        proteinSmoothiePanel.setLayout(proteinSmoothiePanelLayout);
        proteinSmoothiePanelLayout.setHorizontalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                            .addComponent(countTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button8))
                        .addComponent(jLabel8))
                    .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                        .addComponent(codeLabel8)
                        .addGap(70, 70, 70)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        proteinSmoothiePanelLayout.setVerticalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(codeLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );

        jLabel26.setText("Count");

        itemTextFields.add(countTextField9);
        countTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField9ActionPerformed(evt);
            }
        });

        button9.setText("+");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        itemLabels.add(label9);

        itemCodeLabels.add(codeLabel9);
        codeLabel9.setText("jLabel9");

        javax.swing.GroupLayout proteinShakePanel1Layout = new javax.swing.GroupLayout(proteinShakePanel1);
        proteinShakePanel1.setLayout(proteinShakePanel1Layout);
        proteinShakePanel1Layout.setHorizontalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                            .addComponent(countTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button9))
                        .addComponent(jLabel26))
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(codeLabel9)
                        .addGap(70, 70, 70)))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        proteinShakePanel1Layout.setVerticalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(codeLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button9))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel24.setText("Count");

        itemTextFields.add(countTextField10);
        countTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField10ActionPerformed(evt);
            }
        });

        button10.setText("+");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        itemLabels.add(label10);

        itemCodeLabels.add(codeLabel10);
        codeLabel10.setText("jLabel9");

        javax.swing.GroupLayout granolaShakePanelLayout = new javax.swing.GroupLayout(granolaShakePanel);
        granolaShakePanel.setLayout(granolaShakePanelLayout);
        granolaShakePanelLayout.setHorizontalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(codeLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                                .addComponent(countTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button10)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        granolaShakePanelLayout.setVerticalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel10)
                .addGap(18, 18, 18)
                .addGroup(granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(granolaShakePanelLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(9, 9, 9)
                        .addComponent(countTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setText("Count");

        itemTextFields.add(countTextField11);
        countTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField11ActionPerformed(evt);
            }
        });

        button11.setText("+");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        itemLabels.add(label11);

        itemCodeLabels.add(codeLabel11);
        codeLabel11.setText("jLabel9");

        javax.swing.GroupLayout chipsShakePanelLayout = new javax.swing.GroupLayout(chipsShakePanel);
        chipsShakePanel.setLayout(chipsShakePanelLayout);
        chipsShakePanelLayout.setHorizontalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chipsShakePanelLayout.createSequentialGroup()
                        .addComponent(countTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button11))
                    .addComponent(jLabel28)
                    .addComponent(codeLabel11))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        chipsShakePanelLayout.setVerticalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11))
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel30.setText("Count");

        itemTextFields.add(countTextField12);
        countTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField12ActionPerformed(evt);
            }
        });

        button12.setText("+");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        itemLabels.add(label12);

        itemCodeLabels.add(codeLabel12);
        codeLabel12.setText("jLabel9");

        javax.swing.GroupLayout nutsShakePanelLayout = new javax.swing.GroupLayout(nutsShakePanel);
        nutsShakePanel.setLayout(nutsShakePanelLayout);
        nutsShakePanelLayout.setHorizontalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(countTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(button12))
                    .addGroup(nutsShakePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(codeLabel12))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nutsShakePanelLayout.setVerticalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );

        jLabel32.setText("Count");

        itemTextFields.add(countTextField13);
        countTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField13ActionPerformed(evt);
            }
        });

        button13.setText("+");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        itemLabels.add(label13);

        itemCodeLabels.add(codeLabel13);
        codeLabel13.setText("jLabel9");

        javax.swing.GroupLayout cookieShakePanelLayout = new javax.swing.GroupLayout(cookieShakePanel);
        cookieShakePanel.setLayout(cookieShakePanelLayout);
        cookieShakePanelLayout.setHorizontalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(countTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button13))
                    .addGroup(cookieShakePanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeLabel13)
                            .addComponent(jLabel32))))
                .addGap(0, 95, Short.MAX_VALUE))
        );
        cookieShakePanelLayout.setVerticalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel13)
                .addGap(13, 13, 13)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13)
                    .addComponent(countTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
            .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel34.setText("Count");

        itemTextFields.add(countTextField14);
        countTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField14ActionPerformed(evt);
            }
        });

        button14.setText("+");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        itemLabels.add(label14);

        itemCodeLabels.add(codeLabel14);
        codeLabel14.setText("jLabel9");

        javax.swing.GroupLayout driedFruitsPanelLayout = new javax.swing.GroupLayout(driedFruitsPanel);
        driedFruitsPanel.setLayout(driedFruitsPanelLayout);
        driedFruitsPanelLayout.setHorizontalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                            .addComponent(countTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button14))
                        .addComponent(jLabel34))
                    .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                        .addComponent(codeLabel14)
                        .addGap(66, 66, 66)))
                .addGap(0, 86, Short.MAX_VALUE))
        );
        driedFruitsPanelLayout.setVerticalGroup(
            driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driedFruitsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(driedFruitsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button14)
                    .addComponent(countTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 33, Short.MAX_VALUE))
            .addComponent(label14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel36.setText("Count");

        itemTextFields.add(countTextField15);
        countTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField15ActionPerformed(evt);
            }
        });

        button15.setText("+");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        itemLabels.add(label15);

        itemCodeLabels.add(codeLabel15);
        codeLabel15.setText("jLabel9");

        javax.swing.GroupLayout popcornPanelLayout = new javax.swing.GroupLayout(popcornPanel);
        popcornPanel.setLayout(popcornPanelLayout);
        popcornPanelLayout.setHorizontalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(countTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button15))
                    .addComponent(jLabel36)
                    .addComponent(codeLabel15))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        popcornPanelLayout.setVerticalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(codeLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button15)
                    .addComponent(countTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
            .addComponent(label15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setText("Count");

        itemTextFields.add(countTextField16);
        countTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField16ActionPerformed(evt);
            }
        });

        button16.setText("+");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        itemLabels.add(label16);

        itemCodeLabels.add(codeLabel16);
        codeLabel16.setText("jLabel9");

        javax.swing.GroupLayout crackersPanelLayout = new javax.swing.GroupLayout(crackersPanel);
        crackersPanel.setLayout(crackersPanelLayout);
        crackersPanelLayout.setHorizontalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(crackersPanelLayout.createSequentialGroup()
                        .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeLabel16)
                            .addComponent(countTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(button16)))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        crackersPanelLayout.setVerticalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(codeLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button16))
                .addContainerGap())
            .addComponent(label16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel40.setText("Count");

        itemTextFields.add(countTextField17);
        countTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField17ActionPerformed(evt);
            }
        });

        button17.setText("+");
        button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button17ActionPerformed(evt);
            }
        });

        itemLabels.add(label17);

        itemCodeLabels.add(codeLabel17);
        codeLabel17.setText("jLabel9");

        javax.swing.GroupLayout veggieStrawsPanelLayout = new javax.swing.GroupLayout(veggieStrawsPanel);
        veggieStrawsPanel.setLayout(veggieStrawsPanelLayout);
        veggieStrawsPanelLayout.setHorizontalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addComponent(button17))
                    .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(codeLabel17)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        veggieStrawsPanelLayout.setVerticalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(codeLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button17))
                .addGap(27, 27, 27))
            .addComponent(label17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel42.setText("Count");

        itemTextFields.add(countTextField18);
        countTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField18ActionPerformed(evt);
            }
        });

        button18.setText("+");
        button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button18ActionPerformed(evt);
            }
        });

        itemLabels.add(label18);

        itemCodeLabels.add(codeLabel18);
        codeLabel18.setText("jLabel9");

        javax.swing.GroupLayout greekYogurtPanelLayout = new javax.swing.GroupLayout(greekYogurtPanel);
        greekYogurtPanel.setLayout(greekYogurtPanelLayout);
        greekYogurtPanelLayout.setHorizontalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                        .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeLabel18)
                            .addComponent(countTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(button18)))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        greekYogurtPanelLayout.setVerticalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(codeLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button18))
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

        itemLabels.add(label19);
        label19.setText("jLabel9");

        jLabel43.setText("Count");

        itemTextFields.add(countTextField19);
        countTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField19ActionPerformed(evt);
            }
        });

        button19.setText("+");
        button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button19ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel19);
        codeLabel19.setText("jLabel9");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(countTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button19))
                    .addComponent(jLabel43)
                    .addComponent(codeLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(codeLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button19))
                .addGap(21, 21, 21))
        );

        itemLabels.add(label20);
        label20.setText("jLabel9");

        jLabel44.setText("Count");

        itemTextFields.add(countTextField20);
        countTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField20ActionPerformed(evt);
            }
        });

        button20.setText("+");
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel20);
        codeLabel20.setText("jLabel9");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(countTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(codeLabel20)
                            .addComponent(jLabel44))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(codeLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button20)
                    .addComponent(countTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        itemLabels.add(label21);
        label21.setText("jLabel9");

        jLabel45.setText("Count");

        itemTextFields.add(countTextField21);
        countTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countTextField21ActionPerformed(evt);
            }
        });

        button21.setText("+");
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });

        itemCodeLabels.add(codeLabel21);
        codeLabel21.setText("jLabel9");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(countTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button21))
                    .addComponent(jLabel45)
                    .addComponent(codeLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(codeLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button21)
                    .addComponent(countTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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
                                    .addComponent(chipsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(granolaShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(proteinShakePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void countTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField5ActionPerformed

    private void frappuccinoUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoUpdateButtonActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField5.getText());
        count++;
        countTextField5.setText(Integer.toString(count));
        if(count==0){
            countTextField5.setBackground(Color.red);
            countTextField5.setForeground(Color.black);
        }
        if(count>0){
            countTextField5.setBackground(Color.blue);
            countTextField5.setForeground(Color.white);
        }
        if(count>2){
            countTextField5.setBackground(Color.white);
            countTextField5.setForeground(Color.black);
        }
        if(size > 4) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(4), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(4), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(4), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(4), null);
        } 
    }//GEN-LAST:event_button5ActionPerformed

    private void orangePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangePriceTextFieldActionPerformed

    private void countTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField2ActionPerformed

    private void orangeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeUpdateButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_orangeUpdateButtonActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField2.getText());
        count++;
        countTextField2.setText(Integer.toString(count));
        if(count==0){
            countTextField2.setBackground(Color.red);
            countTextField2.setForeground(Color.black);
        }
        if(count>0){
            countTextField2.setBackground(Color.blue);
            countTextField2.setForeground(Color.white);
        }
        if(count>2){
            countTextField2.setBackground(Color.white);
            countTextField2.setForeground(Color.black);
        }
        if(size > 1) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(1), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(1), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(1), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(1), null);
        } 
    }//GEN-LAST:event_button2ActionPerformed

    private void lemonadePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadePriceTextFieldActionPerformed

    private void countTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField3ActionPerformed

    private void lemonadeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadeUpdateButtonActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField3.getText());
        count++;
        countTextField3.setText(Integer.toString(count));
        if(count==0){
            countTextField3.setBackground(Color.red);
            countTextField3.setForeground(Color.black);
        }
        if(count>0){
            countTextField3.setBackground(Color.blue);
            countTextField3.setForeground(Color.white);
        }
        if(count>2){
            countTextField3.setBackground(Color.white);
            countTextField3.setForeground(Color.black);
        }
        if(size > 2) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(2), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(2), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(2), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(2), null);
        } 
    }//GEN-LAST:event_button3ActionPerformed

    private void gatoradePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradePriceTextFieldActionPerformed

    private void countTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField4ActionPerformed

    private void gatoradeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradeUpdateButtonActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField4.getText());
        count++;
        countTextField4.setText(Integer.toString(count));
        if(count==0){
            countTextField4.setBackground(Color.red);
            countTextField4.setForeground(Color.black);
        }
        if(count>0){
            countTextField4.setBackground(Color.blue);
            countTextField4.setForeground(Color.white);
        }
        if(count>2){
            countTextField4.setBackground(Color.white);
            countTextField4.setForeground(Color.black);
        }
        if(size > 3) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(3), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(3), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(3), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(3), null);
        } 
    }//GEN-LAST:event_button4ActionPerformed

    private void coconutWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterPriceTextFieldActionPerformed

    private void countTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField6ActionPerformed

    private void coconutWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterUpdateButtonActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField6.getText());
        count++;
        countTextField6.setText(Integer.toString(count));
        if(count==0){
            countTextField6.setBackground(Color.red);
            countTextField6.setForeground(Color.black);
        }
        if(count>0){
            countTextField6.setBackground(Color.blue);
            countTextField6.setForeground(Color.white);
        }
        if(count>2){
            countTextField6.setBackground(Color.white);
            countTextField6.setForeground(Color.black);
        }
        if(size > 5) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(5), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(5), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(5), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(5), null);
        } 
    }//GEN-LAST:event_button6ActionPerformed

    private void sparklingWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterPriceTextFieldActionPerformed

    private void countTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField7ActionPerformed

    private void sparklingWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterUpdateButtonActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField7.getText());
        count++;
        countTextField7.setText(Integer.toString(count));
        if(count==0){
            countTextField7.setBackground(Color.red);
            countTextField7.setForeground(Color.black);
        }
        if(count>0){
            countTextField7.setBackground(Color.blue);
            countTextField7.setForeground(Color.white);
        }
        if(count>2){
            countTextField7.setBackground(Color.white);
            countTextField7.setForeground(Color.black);
        }
        if(size > 6) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(6), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(6), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(6), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(6), null);
        } 
    }//GEN-LAST:event_button7ActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void countTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField1ActionPerformed

    private void updateCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCokeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateCokeButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField1.getText());
        count++;
        countTextField1.setText(Integer.toString(count));
        if(count==0){
            countTextField1.setBackground(Color.red);
            countTextField1.setForeground(Color.black);
        }
        if(count>0){
            countTextField1.setBackground(Color.blue);
            countTextField1.setForeground(Color.white);
        }
        if(count>2){
            countTextField1.setBackground(Color.white);
            countTextField1.setForeground(Color.black);
        }
        if(size > 2) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(0), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(0), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(0), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(0), null);
        } 
    }//GEN-LAST:event_button1ActionPerformed

    private void proteinSmoothiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothiePriceTextFieldActionPerformed

    private void countTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField8ActionPerformed

    private void updateProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateProteinSmoothieButtonActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField8.getText());
        count++;
        countTextField8.setText(Integer.toString(count));
        if(count==0){
            countTextField8.setBackground(Color.red);
            countTextField8.setForeground(Color.black);
        }
        if(count>0){
            countTextField8.setBackground(Color.blue);
            countTextField8.setForeground(Color.white);
        }
        if(count>2){
            countTextField8.setBackground(Color.white);
            countTextField8.setForeground(Color.black);
        }
        if(size > 7) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(7), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(7), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(7), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(7), null);
        } 
    }//GEN-LAST:event_button8ActionPerformed

    private void granolaPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaPriceTextFieldActionPerformed

    private void countTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField10ActionPerformed

    private void granolaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaUpdateButtonActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField10.getText());
        count++;
        countTextField10.setText(Integer.toString(count));
        if(count==0){
            countTextField10.setBackground(Color.red);
            countTextField10.setForeground(Color.black);
        }
        if(count>0){
            countTextField10.setBackground(Color.blue);
            countTextField10.setForeground(Color.white);
        }
        if(count>2){
            countTextField10.setBackground(Color.white);
            countTextField10.setForeground(Color.black);
        }
        if(size > 9) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(9), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(9), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(9), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(9), null);
        } 
    }//GEN-LAST:event_button10ActionPerformed

    private void proteinShakePriceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakePriceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakePriceTextField1ActionPerformed

    private void countTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField9ActionPerformed

    private void proteinShakeUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeUpdateButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakeUpdateButton1ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField9.getText());
        count++;
        countTextField9.setText(Integer.toString(count));
        if(count==0){
            countTextField9.setBackground(Color.red);
            countTextField9.setForeground(Color.black);
        }
        if(count>0){
            countTextField9.setBackground(Color.blue);
            countTextField9.setForeground(Color.white);
        }
        if(count>2){
            countTextField9.setBackground(Color.white);
            countTextField9.setForeground(Color.black);
        }
        if(size > 8) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(8), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(8), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(8), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(8), null);
        } 
    }//GEN-LAST:event_button9ActionPerformed

    private void chipsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsPriceTextFieldActionPerformed

    private void countTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField11ActionPerformed

    private void chipsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsUpdateButtonActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        int count = Integer.valueOf(countTextField11.getText());
        count++;
        countTextField11.setText(Integer.toString(count));
        if(count==0){
            countTextField11.setBackground(Color.red);
            countTextField11.setForeground(Color.black);
        }
        if(count>0){
            countTextField11.setBackground(Color.blue);
            countTextField11.setForeground(Color.white);
        }
        if(count>2){
            countTextField11.setBackground(Color.white);
            countTextField11.setForeground(Color.black);
        }
        if(size > 10) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(10), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(10), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(10), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(10), null);
        } 
    }//GEN-LAST:event_button11ActionPerformed

    private void nutsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsPriceTextFieldActionPerformed

    private void countTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField12ActionPerformed

    private void nutsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsUpdateButtonActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField12.getText());
        count++;
        countTextField12.setText(Integer.toString(count));
        if(count==0){
            countTextField12.setBackground(Color.red);
            countTextField12.setForeground(Color.black);
        }
        if(count>0){
            countTextField12.setBackground(Color.blue);
            countTextField12.setForeground(Color.white);
        }
        if(count>2){
            countTextField12.setBackground(Color.white);
            countTextField12.setForeground(Color.black);
        }
        if(size > 11) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(11), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(11), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(11), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(11), null);
        } 
    }//GEN-LAST:event_button12ActionPerformed

    private void cookiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiePriceTextFieldActionPerformed

    private void countTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField13ActionPerformed

    private void cookieUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieUpdateButtonActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField13.getText());
        count++;
        countTextField13.setText(Integer.toString(count));
        if(count==0){
            countTextField13.setBackground(Color.red);
            countTextField13.setForeground(Color.black);
        }
        if(count>0){
            countTextField13.setBackground(Color.blue);
            countTextField13.setForeground(Color.white);
        }
        if(count>2){
            countTextField13.setBackground(Color.white);
            countTextField13.setForeground(Color.black);
        }
        if(size > 12) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(12), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(12), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(12), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(12), null);
        } 
    }//GEN-LAST:event_button13ActionPerformed

    private void driedFruitsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsPriceTextFieldActionPerformed

    private void countTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField14ActionPerformed

    private void driedFruitsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsUpdateButtonActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField14.getText());
        count++;
        countTextField14.setText(Integer.toString(count));
        if(count==0){
            countTextField14.setBackground(Color.red);
            countTextField14.setForeground(Color.black);
        }
        if(count>0){
            countTextField14.setBackground(Color.blue);
            countTextField14.setForeground(Color.white);
        }
        if(count>2){
            countTextField14.setBackground(Color.white);
            countTextField14.setForeground(Color.black);
        }
        if(size > 13) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(13), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(13), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(13), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(13), null);
        } 
    }//GEN-LAST:event_button14ActionPerformed

    private void popcornPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornPriceTextFieldActionPerformed

    private void countTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField15ActionPerformed

    private void popcornUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornUpdateButtonActionPerformed

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField15.getText());
        count++;
        countTextField15.setText(Integer.toString(count));
        if(count==0){
            countTextField15.setBackground(Color.red);
            countTextField15.setForeground(Color.black);
        }
        if(count>0){
            countTextField4.setBackground(Color.blue);
            countTextField4.setForeground(Color.white);
        }
        if(count>2){
            countTextField4.setBackground(Color.white);
            countTextField4.setForeground(Color.black);
        }
        if(size > 14) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(14), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(14), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(14), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(14), null);
        } 
    }//GEN-LAST:event_button15ActionPerformed

    private void crackersPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersPriceTextFieldActionPerformed

    private void countTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField16ActionPerformed

    private void crackersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersUpdateButtonActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField16.getText());
        count++;
        countTextField16.setText(Integer.toString(count));
        if(count==0){
            countTextField16.setBackground(Color.red);
            countTextField16.setForeground(Color.black);
        }
        if(count>0){
            countTextField16.setBackground(Color.blue);
            countTextField16.setForeground(Color.white);
        }
        if(count>2){
            countTextField16.setBackground(Color.white);
            countTextField16.setForeground(Color.black);
        }
        if(size > 15) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(15), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(15), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(15), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(15), null);
        } 
    }//GEN-LAST:event_button16ActionPerformed

    private void veggieStrawsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsPriceTextFieldActionPerformed

    private void countTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField17ActionPerformed

    private void veggieStrawsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsUpdateButtonActionPerformed

    private void button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button17ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField17.getText());
        count++;
        countTextField17.setText(Integer.toString(count));
        if(count==0){
            countTextField17.setBackground(Color.red);
            countTextField4.setForeground(Color.black);
        }
        if(count>0){
            countTextField17.setBackground(Color.blue);
            countTextField17.setForeground(Color.white);
        }
        if(count>2){
            countTextField17.setBackground(Color.white);
            countTextField17.setForeground(Color.black);
        }
        if(size > 16) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(16), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(16), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(16), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(16), null);
        } 
    }//GEN-LAST:event_button17ActionPerformed

    private void greekYogurtPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtPriceTextFieldActionPerformed

    private void countTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField18ActionPerformed

    private void greekYogurtUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtUpdateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtUpdateButtonActionPerformed

    private void button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button18ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(countTextField18.getText());
        count++;
        countTextField18.setText(Integer.toString(count));
        if(count==0){
            countTextField18.setBackground(Color.red);
            countTextField18.setForeground(Color.black);
        }
        if(count>0){
            countTextField18.setBackground(Color.blue);
            countTextField18.setForeground(Color.white);
        }
        if(count>2){
            countTextField18.setBackground(Color.white);
            countTextField18.setForeground(Color.black);
        }
        if(size > 17) {
            beverageCountList.set(4, count);
            itemController.increaseItemCount(beverageCodeList.get(17), machineID);
            sendMessage("addtocount", "beverage", beverageCodeList.get(17), null);
        }
        else {
            snackCountList.set(4, count);
            itemController.increaseItemCount(snackCodeList.get(17), machineID);
            sendMessage("addtocount", "snack", snackCodeList.get(17), null);
        } 
    }//GEN-LAST:event_button18ActionPerformed

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
      
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirm close", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void countTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField19ActionPerformed

    private void button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button19ActionPerformed

    private void countTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField20ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button20ActionPerformed

    private void countTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countTextField21ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button21ActionPerformed

    /**
     * @param args the command line arguments
     */
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountToBeCollectedTextField;
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button14;
    private javax.swing.JButton button15;
    private javax.swing.JButton button16;
    private javax.swing.JButton button17;
    private javax.swing.JButton button18;
    private javax.swing.JButton button19;
    private javax.swing.JButton button2;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JPanel chipsShakePanel;
    private javax.swing.JPanel coconutWaterPanel;
    private javax.swing.JLabel codeLabel1;
    private javax.swing.JLabel codeLabel10;
    private javax.swing.JLabel codeLabel11;
    private javax.swing.JLabel codeLabel12;
    private javax.swing.JLabel codeLabel13;
    private javax.swing.JLabel codeLabel14;
    private javax.swing.JLabel codeLabel15;
    private javax.swing.JLabel codeLabel16;
    private javax.swing.JLabel codeLabel17;
    private javax.swing.JLabel codeLabel18;
    private javax.swing.JLabel codeLabel19;
    private javax.swing.JLabel codeLabel2;
    private javax.swing.JLabel codeLabel20;
    private javax.swing.JLabel codeLabel21;
    private javax.swing.JLabel codeLabel3;
    private javax.swing.JLabel codeLabel4;
    private javax.swing.JLabel codeLabel5;
    private javax.swing.JLabel codeLabel6;
    private javax.swing.JLabel codeLabel7;
    private javax.swing.JLabel codeLabel8;
    private javax.swing.JLabel codeLabel9;
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
    private javax.swing.JPanel cookieShakePanel;
    private javax.swing.JTextField countTextField1;
    private javax.swing.JTextField countTextField10;
    private javax.swing.JTextField countTextField11;
    private javax.swing.JTextField countTextField12;
    private javax.swing.JTextField countTextField13;
    private javax.swing.JTextField countTextField14;
    private javax.swing.JTextField countTextField15;
    private javax.swing.JTextField countTextField16;
    private javax.swing.JTextField countTextField17;
    private javax.swing.JTextField countTextField18;
    private javax.swing.JTextField countTextField19;
    private javax.swing.JTextField countTextField2;
    private javax.swing.JTextField countTextField20;
    private javax.swing.JTextField countTextField21;
    private javax.swing.JTextField countTextField3;
    private javax.swing.JTextField countTextField4;
    private javax.swing.JTextField countTextField5;
    private javax.swing.JTextField countTextField6;
    private javax.swing.JTextField countTextField7;
    private javax.swing.JTextField countTextField8;
    private javax.swing.JTextField countTextField9;
    private javax.swing.JPanel crackersPanel;
    private javax.swing.JPanel driedFruitsPanel;
    private javax.swing.JPanel frappuccinoPanel;
    private javax.swing.JPanel gatoradePanel1;
    private javax.swing.JPanel granolaShakePanel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labe5;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label17;
    private javax.swing.JLabel label18;
    private javax.swing.JLabel label19;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label20;
    private javax.swing.JLabel label21;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JRadioButton machine1RadioButton;
    private javax.swing.JRadioButton machine2RadioButton;
    private javax.swing.ButtonGroup machineButtonGroup;
    private javax.swing.JLabel machineIDLabel;
    private javax.swing.JTextField moneyTextField;
    private javax.swing.JPanel nutsShakePanel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JPanel popcornPanel;
    private javax.swing.JPanel proteinShakePanel1;
    private javax.swing.JPanel proteinSmoothiePanel;
    private javax.swing.JPanel sparlkingWaterPanel;
    private javax.swing.JPanel veggieStrawsPanel;
    // End of variables declaration//GEN-END:variables
}
