/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CartItemsController;
import controller.ItemController;
import controller.Mediator;
import controller.SmartCardController;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;

/**
 *
 * @author AshitaRaghu
 */
public class CustomerUI extends javax.swing.JFrame implements Collegue {
    
    private Integer machineID;
 //   private PriceController priceController;
    private ItemController itemController;
    private CartItemsController cartItemsController;
    private SmartCardController smartCardController;
  //  private double price;
    private CartItemsPanel cartItemsPanel;
    private PaymentPanel paymentPanel;
    private static CardLayout cardLayout;
    private WelcomePanel welcomePanel;
    private BeveragePanel beveragePanel;
    private SnackPanel snackPanel;
    private Timer timer;
    private int index=0;
    
  //  private static PaymentController paymentController;
    private Boolean[] checkedList = new Boolean[3];
    
    /**
     * Creates new form CustomerUI
     */
    public CustomerUI(Integer machineID) { 
        this.machineID= machineID;
        initComponents();    
 
        this.itemController = ItemController.getItemControllerInstance();
      //  priceController = new PriceController(this, machineID);
        cartItemsController = new CartItemsController(this);
      //  itemController = new ItemController(machineID);
        smartCardController = new SmartCardController(this);
        
        cartItemsPanel = new CartItemsPanel(this, cartItemsController, itemController, machineID);
        paymentPanel = new PaymentPanel(this, cartItemsController);
        cartPanel.setLayout(new FlowLayout());
        cartPanel.add(cartItemsPanel);
        rightPanel.setLayout(new FlowLayout());
        rightPanel.add(paymentPanel);
        
        cardLayout = new CardLayout();
        welcomePanel = new WelcomePanel();
        beveragePanel = new BeveragePanel(this, machineID);
        snackPanel = new SnackPanel(this, machineID);
        itemsPanel.setLayout(cardLayout);
        itemsPanel.add(welcomePanel,"Welcome");
        itemsPanel.add(beveragePanel,"Beverages");
        itemsPanel.add(snackPanel,"Snacks");

        itemController.registerACollegue(this);
        
    //    paymentController = new PaymentController(this);
        checkedList[0] = false;
        checkedList[1] = false;
        checkedList[2] = false;
    }
    
    public ItemController getItemController() { 
        return itemController;
    }
    
    public CartItemsController getCartItemsController() { 
        return cartItemsController;
    }
    
    public CartItemsPanel getCartItemsPanel() {
        return cartItemsPanel;
    }
    
    public PaymentPanel getPaymentPanel() {
        return paymentPanel;
    }
     
    public void setItemCodeTextField(String code) {
        itemCodeTextField.setText(code);
     }
     
    public void giveChange(String change) {
         changeTextField.setText(change);
    }
     
    public void dispense() {
        TimerHandler timerHandler = new TimerHandler();
        timer = new Timer(1000, timerHandler);
        timer.start();
        paymentPanel.setPaymentPanel();
    }
    class TimerHandler implements ActionListener {
        List<String> dispenserItemPicturePaths = cartItemsController.getPicturePath(); 
        int size =dispenserItemPicturePaths.size();
        public void actionPerformed(ActionEvent e) {
            if(index >= size) {
                timer.stop();
                item1DispensedLabel.setIcon(null);
                giveChange(Double.toString(0));
                cartItemsController.removeAllItems();
                index = 0;
            }
            else { 
                item1DispensedLabel.setIcon(new ImageIcon(this.getClass().getResource(dispenserItemPicturePaths.get(index++))));
            }
        }
   }
    
    @Override
    public void sendMessage(String type, String product, Integer index, Double value) {
        itemController.sendMessageToAll(this, type, product, index, value);
    }
    
    @Override
    public void receiveMessage(String type, String product, Integer index, Double value) {
                    System.out.println("rec");
        if(type.equals("changeprice")) {
            System.out.println("hello");
            if(product.equals("beverage")) {
                beveragePanel.changePrice(index, value);
                System.out.println("bev " + index);
            }
            if(product.equals("snack")) {
                snackPanel.changePrice(index, value);
                System.out.println("snacl " + index);
            }
        }
        if(type.equals("addtocount")) {
            if(product.equals("beverage")) {
                beveragePanel.getCount();
            }
            if(product.equals("snack")) {
                snackPanel.getCount();
            }
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

        paymentButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        selectButtonPanel = new javax.swing.JPanel();
        selectBeverageButton = new javax.swing.JButton();
        selectSnackButton = new javax.swing.JButton();
        dispenserPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        item1DispensedLabel = new javax.swing.JLabel();
        changeSlotPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        changeTextField = new javax.swing.JTextField();
        coinsImageLabel = new javax.swing.JLabel();
        itemsPanel = new javax.swing.JPanel();
        middlePanel = new javax.swing.JPanel();
        displayPanel = new javax.swing.JPanel();
        lowSugarsCheckBox = new javax.swing.JCheckBox();
        highProteinCheckBox = new javax.swing.JCheckBox();
        lowCaloriesCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        suggestionsTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        toTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        suggestionsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cartPanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemCodeTextField = new javax.swing.JTextField();
        getInfoButton = new javax.swing.JButton();
        nutritionFactsPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        proteinTextField = new javax.swing.JTextField();
        carbohydratesTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sugarsTextField = new javax.swing.JTextField();
        caloriesTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Machine ID: " + machineID);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        leftPanel.setBackground(new java.awt.Color(251, 247, 229));
        leftPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectBeverageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beverageLogo_burned.jpg"))); // NOI18N
        selectBeverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBeverageButtonActionPerformed(evt);
            }
        });

        selectSnackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/snacksLogo_burned.jpg"))); // NOI18N
        selectSnackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSnackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectButtonPanelLayout = new javax.swing.GroupLayout(selectButtonPanel);
        selectButtonPanel.setLayout(selectButtonPanelLayout);
        selectButtonPanelLayout.setHorizontalGroup(
            selectButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectButtonPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(selectBeverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectSnackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectButtonPanelLayout.setVerticalGroup(
            selectButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectBeverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectSnackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftPanel.add(selectButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 100));

        dispenserPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Collect Your Items ");

        javax.swing.GroupLayout dispenserPanelLayout = new javax.swing.GroupLayout(dispenserPanel);
        dispenserPanel.setLayout(dispenserPanelLayout);
        dispenserPanelLayout.setHorizontalGroup(
            dispenserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dispenserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dispenserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item1DispensedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dispenserPanelLayout.setVerticalGroup(
            dispenserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dispenserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1DispensedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftPanel.add(dispenserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 160, 160));

        changeSlotPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Collect Your Change");

        changeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeTextFieldActionPerformed(evt);
            }
        });

        coinsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coins.png"))); // NOI18N

        javax.swing.GroupLayout changeSlotPanelLayout = new javax.swing.GroupLayout(changeSlotPanel);
        changeSlotPanel.setLayout(changeSlotPanelLayout);
        changeSlotPanelLayout.setHorizontalGroup(
            changeSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeSlotPanelLayout.createSequentialGroup()
                .addGroup(changeSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeSlotPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coinsImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changeSlotPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)))
                .addGap(13, 21, Short.MAX_VALUE))
        );
        changeSlotPanelLayout.setVerticalGroup(
            changeSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeSlotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(changeSlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeSlotPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(changeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(coinsImageLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftPanel.add(changeSlotPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 210, 160));

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        leftPanel.add(itemsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 390));

        middlePanel.setBackground(new java.awt.Color(251, 247, 229));
        middlePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        middlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lowSugarsCheckBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lowSugarsCheckBox.setText("Low Sugars");
        lowSugarsCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lowSugarsCheckBoxItemStateChanged(evt);
            }
        });
        displayPanel.add(lowSugarsCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        highProteinCheckBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        highProteinCheckBox.setText("High Protein");
        highProteinCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                highProteinCheckBoxItemStateChanged(evt);
            }
        });
        displayPanel.add(highProteinCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        lowCaloriesCheckBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lowCaloriesCheckBox.setText("Low Calories");
        lowCaloriesCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lowCaloriesCheckBoxItemStateChanged(evt);
            }
        });
        lowCaloriesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowCaloriesCheckBoxActionPerformed(evt);
            }
        });
        displayPanel.add(lowCaloriesCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        suggestionsTextArea.setColumns(20);
        suggestionsTextArea.setRows(5);
        jScrollPane1.setViewportView(suggestionsTextArea);

        displayPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 420, 100));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("By Calorie Range:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("To :");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("From:");

        suggestionsButton.setText("Suggestions");
        suggestionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestionsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(suggestionsButton)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(suggestionsButton)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        displayPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("OR");
        displayPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel19.setText("Code");
        displayPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        Name.setText("Name");
        displayPanel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel21.setText("Protein");
        displayPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel22.setText("Sugars");
        displayPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel23.setText("Calories");
        displayPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Filter by category:");
        displayPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        middlePanel.add(displayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 440, 310));

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        middlePanel.add(cartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 170));

        infoPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("By Code:");

        itemCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeTextFieldActionPerformed(evt);
            }
        });

        getInfoButton.setText("Get Info");
        getInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInfoButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Protein:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Carbs:");

        proteinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Sugars:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Calories :");

        sugarsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugarsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nutritionFactsPanelLayout = new javax.swing.GroupLayout(nutritionFactsPanel);
        nutritionFactsPanel.setLayout(nutritionFactsPanelLayout);
        nutritionFactsPanelLayout.setHorizontalGroup(
            nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutritionFactsPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carbohydratesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutritionFactsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(sugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nutritionFactsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        nutritionFactsPanelLayout.setVerticalGroup(
            nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutritionFactsPanelLayout.createSequentialGroup()
                .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(proteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(sugarsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(nutritionFactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(carbohydratesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caloriesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Information for your diet");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(131, 131, 131))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getInfoButton))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(nutritionFactsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getInfoButton)
                    .addComponent(itemCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(nutritionFactsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        middlePanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 440, 160));

        rightPanel.setBackground(new java.awt.Color(251, 247, 229));
        rightPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(middlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(middlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectSnackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSnackButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(itemsPanel,"Snacks");
    }//GEN-LAST:event_selectSnackButtonActionPerformed

    private void selectBeverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBeverageButtonActionPerformed
        // TODO add your handling code here:
        
        cardLayout.show(itemsPanel,"Beverages");
    }//GEN-LAST:event_selectBeverageButtonActionPerformed

    private void changeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeTextFieldActionPerformed

    private void sugarsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugarsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sugarsTextFieldActionPerformed

    private void proteinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinTextFieldActionPerformed

    private void getInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInfoButtonActionPerformed
        // TODO add your handling code here:
        int[] nutritionalFacts = itemController.getInfo(itemCodeTextField.getText());
        proteinTextField.setText(Integer.toString(nutritionalFacts[0]));
        sugarsTextField.setText(Integer.toString(nutritionalFacts[1]));
        carbohydratesTextField.setText(Integer.toString(nutritionalFacts[2]));
        caloriesTextField.setText(Integer.toString(nutritionalFacts[3]));

        proteinTextField.setEditable(false);
        sugarsTextField.setEditable(false);
        carbohydratesTextField.setEditable(false);
        caloriesTextField.setEditable(false);

    }//GEN-LAST:event_getInfoButtonActionPerformed

    private void itemCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeTextFieldActionPerformed

    }//GEN-LAST:event_itemCodeTextFieldActionPerformed

    private void suggestionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestionsButtonActionPerformed
        // TODO add your handling code here:
        int low = Integer.parseInt(toTextField.getText());
        int high = Integer.parseInt(fromTextField.getText());
        String suggestions = itemController.getCalorieRangeSuggestions(low,high);
        suggestionsTextArea.setText(suggestions);
    }//GEN-LAST:event_suggestionsButtonActionPerformed

    private void lowCaloriesCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lowCaloriesCheckBoxItemStateChanged
        if(lowCaloriesCheckBox.isSelected()){
            checkedList[0] = true;
        }
        else{
            checkedList[0] = false;
        }
        suggestionsTextArea.setText(itemController.getSuggestionList(checkedList));
    }//GEN-LAST:event_lowCaloriesCheckBoxItemStateChanged

    private void highProteinCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_highProteinCheckBoxItemStateChanged
        if(highProteinCheckBox.isSelected()){
            checkedList[1] = true;
        }
        else{
            checkedList[1] = false;
        }
        suggestionsTextArea.setText(itemController.getSuggestionList(checkedList));
    }//GEN-LAST:event_highProteinCheckBoxItemStateChanged

    private void lowSugarsCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lowSugarsCheckBoxItemStateChanged
        if(lowSugarsCheckBox.isSelected()){
            checkedList[2] = true;
        }
        else{
            checkedList[2] = false;
        }
        suggestionsTextArea.setText(itemController.getSuggestionList(checkedList));
    }//GEN-LAST:event_lowSugarsCheckBoxItemStateChanged

    private void lowCaloriesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowCaloriesCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowCaloriesCheckBoxActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirm close", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            cartItemsController.removeAllItems();
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JTextField caloriesTextField;
    private javax.swing.JTextField carbohydratesTextField;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JPanel changeSlotPanel;
    private javax.swing.JTextField changeTextField;
    private javax.swing.JLabel coinsImageLabel;
    private javax.swing.JPanel dispenserPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton getInfoButton;
    private javax.swing.JCheckBox highProteinCheckBox;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel item1DispensedLabel;
    private javax.swing.JTextField itemCodeTextField;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JCheckBox lowCaloriesCheckBox;
    private javax.swing.JCheckBox lowSugarsCheckBox;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JPanel nutritionFactsPanel;
    private javax.swing.ButtonGroup paymentButtonGroup;
    private javax.swing.JTextField proteinTextField;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton selectBeverageButton;
    private javax.swing.JPanel selectButtonPanel;
    private javax.swing.JButton selectSnackButton;
    private javax.swing.JTextField sugarsTextField;
    private javax.swing.JButton suggestionsButton;
    private javax.swing.JTextArea suggestionsTextArea;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables
}
