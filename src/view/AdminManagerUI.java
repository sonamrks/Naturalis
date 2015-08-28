/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ItemController;
import controller.UserLogController;
import java.awt.Color;
import java.util.ArrayList;
import controller.ItemController;
import java.awt.FlowLayout;

/**
 *
 * @author Sonam
 */
public class AdminManagerUI extends javax.swing.JFrame {

    private ItemController itemController;
    private UserLogController userLogController;
    Integer machineID;
    ArrayList<Integer> beverageCodeList;
    ArrayList<Double> beveragePriceList;
    ArrayList<Integer> beverageCountList;
    ArrayList<Integer> snackCodeList;
    ArrayList<Double> snackPriceList;
    ArrayList<Integer> snackCountList;
    /**
     * Creates new form AdminManagerUI
     */
    public AdminManagerUI(ItemController itemController, Integer machineID) {
        initComponents();
        this.itemController = itemController;
        this.machineID = machineID;
        machineIDLabel.setText("Machine ID : "+machineID);
        userLogController = new UserLogController();
    //    itemController.registerACollegue(this);
        itemController.generateCategoryItemInfo(machineID, "beverage");
        beverageCodeList = itemController.getCategoryCodeForMachine();
        beverageCountList = itemController.getCategoryCountForMachine();
        itemController.generateCategoryItemInfo(machineID, "snack");
        snackCountList = itemController.getCategoryCountForMachine();
        snackCodeList = itemController.getCategoryCodeForMachine();

        setCount();
    }
    public AdminManagerUI(ItemController itemController) {
        initComponents();
        this.itemController = itemController;
    //    itemController.registerACollegue(this);
        userLogController = new UserLogController();
        
        itemController.generateCategoryItemInfo(4201, "beverage");
        beverageCodeList = itemController.getCategoryCodeForMachine();
        beveragePriceList = itemController.getCategoryPriceForMachine();
        itemController.generateCategoryItemInfo(4201, "snack");
        snackCodeList = itemController.getCategoryCodeForMachine();
        snackPriceList = itemController.getCategoryPriceForMachine();
        
        lycheeJuicePanel.setVisible(false);
        dietPepsiPanel.setVisible(false);
        pretzelPanel.setVisible(false);
        cornPanel.setVisible(false);
        
        setPrice();  
    }
    
    public void sendMessage(String type, String product, Integer index, Double value) {
//        itemController.sendMessageToAll(this, type, product, index, value);
    }
    
    public void receiveMessage(String type, String product, Integer index, Double value) {
        if(type.equals("addtocart")) {
            if(product.equals("beverage")) {
                beverageCountList.set(index, beverageCountList.get(index)-1);
            }
            if(product.equals("snack")) {
                snackCountList.set(index, snackCountList.get(index)-1);
            }
        }
        if(type.equals("removefromcart")) {
            if(product.equals("beverage")) {
                index = index-101;
                beverageCountList.set(index, beverageCountList.get(index)+1);
            }
            if(product.equals("snack")) {
                index = index-201;
                snackCountList.set(index, snackCountList.get(index)+1);
            }
        }   
        setCount(); 
    }
    
    public void setCount(){
        cokeCountTextField.setText(Integer.toString(beverageCountList.get(0)));
        if(beverageCountList.get(0)==2){
            cokeCountTextField.setBackground(Color.red);
            cokeCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(0)<=2){
            cokeCountTextField.setBackground(Color.blue);
            cokeCountTextField.setForeground(Color.yellow);
        } 
        orangeCountTextField.setText(Integer.toString(beverageCountList.get(1)));
        if(beverageCountList.get(1)==2){
            orangeCountTextField.setBackground(Color.red);
            orangeCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(1)<=2){
            orangeCountTextField.setBackground(Color.blue);
            orangeCountTextField.setForeground(Color.yellow);
        } 
        lemonadeCountTextField.setText(Integer.toString(beverageCountList.get(2)));
        if(beverageCountList.get(2)==2){
            lemonadeCountTextField.setBackground(Color.red);
            lemonadeCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(2)<=2){
            lemonadeCountTextField.setBackground(Color.blue);
            lemonadeCountTextField.setForeground(Color.yellow);
        } 
        gatoradeCountTextField.setText(Integer.toString(beverageCountList.get(3)));
        if(beverageCountList.get(3)==2){
            gatoradeCountTextField.setBackground(Color.red);
            gatoradeCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(3)<=2){
            gatoradeCountTextField.setBackground(Color.blue);
            gatoradeCountTextField.setForeground(Color.yellow);
        } 
        frappuccinoCountTextField.setText(Integer.toString(beverageCountList.get(4)));
        if(beverageCountList.get(4)==2){
            frappuccinoCountTextField.setBackground(Color.red);
            frappuccinoCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(4)<=2){
            frappuccinoCountTextField.setBackground(Color.blue);
            frappuccinoCountTextField.setForeground(Color.yellow);
        } 
        coconutWaterCountTextField.setText(Integer.toString(beverageCountList.get(5)));
        if(beverageCountList.get(5)==2){
            coconutWaterCountTextField.setBackground(Color.red);
            coconutWaterCountTextField.setForeground(Color.yellow);
        }
        if(beverageCountList.get(5)<=2){
            coconutWaterCountTextField.setBackground(Color.blue);
            coconutWaterCountTextField.setForeground(Color.yellow);
        }
        sparklingWaterCountTextField.setText(Integer.toString(beverageCountList.get(6)));
        if(beverageCountList.get(6)==2){
            sparklingWaterCountTextField.setBackground(Color.red);
            sparklingWaterCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(6)<=2){
            sparklingWaterCountTextField.setBackground(Color.blue);
            sparklingWaterCountTextField.setForeground(Color.yellow);
        } 
        proteinSmoothieCountTextField.setText(Integer.toString(beverageCountList.get(7)));
        if(beverageCountList.get(7)==2){
            proteinSmoothieCountTextField.setBackground(Color.red);
            proteinSmoothieCountTextField.setForeground(Color.yellow);
        } 
        if(beverageCountList.get(7)<=2){
            proteinSmoothieCountTextField.setBackground(Color.blue);
            proteinSmoothieCountTextField.setForeground(Color.yellow);
        } 
        proteinShakeCountTextField.setText(Integer.toString(beverageCountList.get(8)));
        if(beverageCountList.get(8)==2){
            proteinShakeCountTextField.setBackground(Color.red);
            proteinShakeCountTextField.setForeground(Color.yellow);
        }
        if(beverageCountList.get(8)<=2){
            proteinShakeCountTextField.setBackground(Color.blue);
            proteinShakeCountTextField.setForeground(Color.yellow);
        }
        granolaCountTextField.setText(Integer.toString(snackCountList.get(0)));
        if(snackCountList.get(0)==2){
            granolaCountTextField.setBackground(Color.red);
            granolaCountTextField.setForeground(Color.yellow);
        }
        if(snackCountList.get(0)<=2){
            granolaCountTextField.setBackground(Color.blue);
            granolaCountTextField.setForeground(Color.yellow);
        }
        chipsCountTextField.setText(Integer.toString(snackCountList.get(1)));
        if(snackCountList.get(1)==2){
            chipsCountTextField.setBackground(Color.red);
            chipsCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(1)<=2){
            chipsCountTextField.setBackground(Color.blue);
            chipsCountTextField.setForeground(Color.yellow);
        } 
        nutsCountTextField.setText(Integer.toString(snackCountList.get(2)));
        if(snackCountList.get(2)==2){
            nutsCountTextField.setBackground(Color.red);
            nutsCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(2)<=2){
            nutsCountTextField.setBackground(Color.blue);
            nutsCountTextField.setForeground(Color.yellow);
        } 
        cookieCountTextField.setText(Integer.toString(snackCountList.get(3)));
        if(snackCountList.get(3)==2){
            cookieCountTextField.setBackground(Color.red);
            cookieCountTextField.setForeground(Color.yellow);
        }
        if(snackCountList.get(3)<=2){
            cookieCountTextField.setBackground(Color.blue);
            cookieCountTextField.setForeground(Color.yellow);
        } 
        driedFruitsCountTextField.setText(Integer.toString(snackCountList.get(4)));
        if(snackCountList.get(4)==2){
            driedFruitsCountTextField.setBackground(Color.red);
            driedFruitsCountTextField.setForeground(Color.yellow);
        }
        if(snackCountList.get(4)<=2){
            driedFruitsCountTextField.setBackground(Color.blue);
            driedFruitsCountTextField.setForeground(Color.yellow);
        }
        popcornCountTextField.setText(Integer.toString(snackCountList.get(5)));
        if(snackCountList.get(5)==2){
            popcornCountTextField.setBackground(Color.red);
            popcornCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(5)<=2){
            popcornCountTextField.setBackground(Color.blue);
            popcornCountTextField.setForeground(Color.yellow);
        } 
        crackersCountTextField.setText(Integer.toString(snackCountList.get(6)));
        if(snackCountList.get(6)==2){
            crackersCountTextField.setBackground(Color.red);
            crackersCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(6)<=2){
            crackersCountTextField.setBackground(Color.blue);
            crackersCountTextField.setForeground(Color.yellow);
        } 
        veggieStrawsCountTextField.setText(Integer.toString(snackCountList.get(7)));
        if(snackCountList.get(7)==2){
            veggieStrawsCountTextField.setBackground(Color.red);
            veggieStrawsCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(7)<=2){
            veggieStrawsCountTextField.setBackground(Color.blue);
            veggieStrawsCountTextField.setForeground(Color.yellow);
        } 
        greekYogurtCountTextField.setText(Integer.toString(snackCountList.get(8)));
        if(snackCountList.get(8)==2){
            greekYogurtCountTextField.setBackground(Color.red);
            greekYogurtCountTextField.setForeground(Color.yellow);
        } 
        if(snackCountList.get(8)<=2){
            greekYogurtCountTextField.setBackground(Color.blue);
            greekYogurtCountTextField.setForeground(Color.yellow);
        } 
    }
    
    public void setPrice(){               
        cokePriceTextField.setText(Double.toString(beveragePriceList.get(0)));
        orangePriceTextField.setText(Double.toString(beveragePriceList.get(1)));
        lemonadePriceTextField.setText(Double.toString(beveragePriceList.get(2)));
        gatoradePriceTextField.setText(Double.toString(beveragePriceList.get(3)));
        frappuccinoPriceTextField.setText(Double.toString(beveragePriceList.get(4)));
        coconutWaterPriceTextField.setText(Double.toString(beveragePriceList.get(5)));
        sparklingWaterPriceTextField.setText(Double.toString(beveragePriceList.get(6)));
        proteinSmoothiePriceTextField.setText(Double.toString(beveragePriceList.get(7)));
        proteinShakePriceTextField1.setText(Double.toString(beveragePriceList.get(8)));
        
        granolaPriceTextField.setText(Double.toString(snackPriceList.get(0)));
        chipsPriceTextField.setText(Double.toString(snackPriceList.get(1)));
        nutsPriceTextField.setText(Double.toString(snackPriceList.get(2)));
        cookiePriceTextField.setText(Double.toString(snackPriceList.get(3)));
      //driedFruitsPriceTextField.setText(Double.toString(snackPriceList.get(4)));
        popcornPriceTextField.setText(Double.toString(snackPriceList.get(5)));
        crackersPriceTextField.setText(Double.toString(snackPriceList.get(6)));
        veggieStrawsPriceTextField.setText(Double.toString(snackPriceList.get(7)));
        greekYogurtPriceTextField.setText(Double.toString(snackPriceList.get(8)));   
    }
    
    public void addNewItem(String[] itemInfo){
        itemController.addNewItem(itemInfo);
        
        if(Integer.valueOf(itemInfo[0]) == 110){
            LycheeJuice lycheeJuice = new LycheeJuice();
            lycheeJuicePanel.setLayout(new FlowLayout());
            lycheeJuicePanel.add(lycheeJuice);
            lycheeJuicePanel.setVisible(true);
        //    lycheeJuice.setPrice(Double.valueOf(priceTextField.getText()));
        }
        else if(Integer.valueOf(itemInfo[0]) == 111){
            DietPepsi dietPepsi = new DietPepsi();
            dietPepsiPanel.setLayout(new FlowLayout());
            dietPepsiPanel.add(dietPepsi);
            dietPepsiPanel.setVisible(true);
        //    dietPepsi.setPrice(Double.valueOf(priceTextField.getText()));
        }
        else if(Integer.valueOf(itemInfo[0]) == 210){
            Pretzel pretzel = new Pretzel();
            pretzelPanel.setLayout(new FlowLayout());
            pretzelPanel.add(pretzel);
            pretzelPanel.setVisible(true);
        //    pretzel.setPrice(Double.valueOf(priceTextField.getText()));
        }
        else {
            Corn pretzel = new Corn();
            cornPanel.setLayout(new FlowLayout());
            cornPanel.add(pretzel);
            cornPanel.setVisible(true);
        //    pretzel.setPrice(Double.valueOf(priceTextField.getText()));
        }
    }
    public void filterManagerView(){
        cokeCountPanel.setVisible(false);
        orangeCountPanel.setVisible(false);
        lemonadeCountPanel.setVisible(false);
        gatoradeCountPanel.setVisible(false);
        frappuccinoCountPanel.setVisible(false);
        coconutWaterCountPanel.setVisible(false);
        sparklingWaterCountPanel.setVisible(false);
        proteinSmoothieCountPanel.setVisible(false);
        proteinShakeCountPanel.setVisible(false);
        
        
        granolaCountPanel.setVisible(false);
        nutsCountPanel.setVisible(false);
        chipsCountPanel.setVisible(false);
        cookieCountPanel.setVisible(false);
        popcornCountPanel.setVisible(false);
        veggieStrawsCountPanel.setVisible(false);
        greekYogurtCountPanel.setVisible(false);
        crackersCountPanel.setVisible(false);
        
     /*   ManagerControlPanel adminControl = new ManagerControlPanel(itemController);
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(adminControl);
        controlPanel.setVisible(true);*/
        
    }
    
    public void filterAdminView(){
        cokePricePanel.setVisible(false);
        orangePricePanel.setVisible(false);
        lemonadePricePanel.setVisible(false);
        gatoradePricePanel.setVisible(false);
        frappuccinoPricePanel.setVisible(false);
        coconutWaterPricePanel.setVisible(false);
        sparklingWaterPricePanel.setVisible(false);
        proteinSmoothiePricePanel.setVisible(false);
        proteinShakePricePanel.setVisible(false);
        
        
        granolaPricePanel.setVisible(false);
        nutsPricePanel.setVisible(false);
        chipsPricePanel.setVisible(false);
        cookiePricePanel.setVisible(false);
        popcornPricePanel.setVisible(false);
        veggieStrawsPricePanel.setVisible(false);
        greekYogurtPricePanel.setVisible(false);
        crackersPricePanel.setVisible(false);
        
        AdminControlPanel adminControl = new AdminControlPanel(itemController,machineID);
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(adminControl);
        controlPanel.setVisible(true);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlPanel = new javax.swing.JPanel();
        itemScrollPane = new javax.swing.JScrollPane();
        itemsPanel = new javax.swing.JPanel();
        frappuccinoPanel = new javax.swing.JPanel();
        frappuccinoImageLabel = new javax.swing.JLabel();
        frappuccinoCountPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        frappuccinoCountTextField = new javax.swing.JTextField();
        addFrappuccinoButton = new javax.swing.JButton();
        frappuccinoPricePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        frappuccinoPriceTextField = new javax.swing.JTextField();
        frappuccinoUpdateButton = new javax.swing.JButton();
        orangePanel = new javax.swing.JPanel();
        orangeImageLabel = new javax.swing.JLabel();
        orangeCountPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        orangeCountTextField = new javax.swing.JTextField();
        addOrangeButton = new javax.swing.JButton();
        orangePricePanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        orangePriceTextField = new javax.swing.JTextField();
        orangeUpdateButton = new javax.swing.JButton();
        lemonadePanel = new javax.swing.JPanel();
        lemonadeImageLabel1 = new javax.swing.JLabel();
        lemonadeCountPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lemonadeCountTextField = new javax.swing.JTextField();
        addLemonadeButton = new javax.swing.JButton();
        lemonadePricePanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lemonadePriceTextField = new javax.swing.JTextField();
        lemonadeUpdateButton = new javax.swing.JButton();
        gatoradePanel1 = new javax.swing.JPanel();
        gatoradeImageLabel1 = new javax.swing.JLabel();
        gatoradeCountPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        gatoradeCountTextField = new javax.swing.JTextField();
        addGatoradeButton = new javax.swing.JButton();
        gatoradePricePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        gatoradePriceTextField = new javax.swing.JTextField();
        gatoradeUpdateButton = new javax.swing.JButton();
        coconutWaterPanel = new javax.swing.JPanel();
        coconutWaterImageLabel = new javax.swing.JLabel();
        coconutWaterCountPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        coconutWaterCountTextField = new javax.swing.JTextField();
        addCoconutWaterButton = new javax.swing.JButton();
        coconutWaterPricePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        coconutWaterPriceTextField = new javax.swing.JTextField();
        coconutWaterUpdateButton = new javax.swing.JButton();
        sparlkingWaterPanel = new javax.swing.JPanel();
        sparklingWaterCountPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        sparklingWaterCountTextField = new javax.swing.JTextField();
        addSparklingWaterButton = new javax.swing.JButton();
        sparklingWaterImageLabel = new javax.swing.JLabel();
        sparklingWaterPricePanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        sparklingWaterPriceTextField = new javax.swing.JTextField();
        sparklingWaterUpdateButton = new javax.swing.JButton();
        cokeInfoPanel7 = new javax.swing.JPanel();
        cokeImageLabel1 = new javax.swing.JLabel();
        cokeCountPanel = new javax.swing.JPanel();
        addCokeButton = new javax.swing.JButton();
        cokeCountTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cokePricePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cokePriceTextField = new javax.swing.JTextField();
        updateCokeButton = new javax.swing.JButton();
        proteinSmoothiePanel = new javax.swing.JPanel();
        proteinSmoothieImageLabel = new javax.swing.JLabel();
        proteinSmoothieCountPanel = new javax.swing.JPanel();
        proteinSmoothieCountTextField = new javax.swing.JTextField();
        addProteinSmoothieButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        proteinSmoothiePricePanel = new javax.swing.JPanel();
        proteinSmoothiePriceTextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        updateProteinSmoothieButton = new javax.swing.JButton();
        granolaShakePanel = new javax.swing.JPanel();
        granolaShakeImageLabel = new javax.swing.JLabel();
        granolaCountPanel = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        granolaCountTextField = new javax.swing.JTextField();
        granolaAddButton = new javax.swing.JButton();
        granolaPricePanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        granolaPriceTextField = new javax.swing.JTextField();
        granolaUpdateButton = new javax.swing.JButton();
        proteinShakePanel1 = new javax.swing.JPanel();
        proteinShakeImageLabel1 = new javax.swing.JLabel();
        proteinShakeCountPanel = new javax.swing.JPanel();
        addproteinShakeButton1 = new javax.swing.JButton();
        proteinShakeCountTextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        proteinShakePricePanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        proteinShakePriceTextField1 = new javax.swing.JTextField();
        proteinShakeUpdateButton1 = new javax.swing.JButton();
        chipsShakePanel = new javax.swing.JPanel();
        chipsImageLabel = new javax.swing.JLabel();
        chipsCountPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        chipsCountTextField = new javax.swing.JTextField();
        chipsAddButton = new javax.swing.JButton();
        chipsPricePanel = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        chipsPriceTextField = new javax.swing.JTextField();
        chipsUpdateButton = new javax.swing.JButton();
        nutsShakePanel = new javax.swing.JPanel();
        nutsImageLabel = new javax.swing.JLabel();
        nutsCountPanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        nutsCountTextField = new javax.swing.JTextField();
        nutsAddButton = new javax.swing.JButton();
        nutsPricePanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        nutsPriceTextField = new javax.swing.JTextField();
        nutsUpdateButton = new javax.swing.JButton();
        cookieShakePanel = new javax.swing.JPanel();
        cookieImageLabel = new javax.swing.JLabel();
        cookieCountPanel = new javax.swing.JPanel();
        cookieAddButton = new javax.swing.JButton();
        cookieCountTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cookiePricePanel = new javax.swing.JPanel();
        cookiePriceTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cookieUpdateButton = new javax.swing.JButton();
        driedFruitsPanel = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        driedFruitsCountTextField = new javax.swing.JTextField();
        driedFruitsAddButton = new javax.swing.JButton();
        driedFruitsImageLabel = new javax.swing.JLabel();
        popcornPanel = new javax.swing.JPanel();
        popcornImageLabel = new javax.swing.JLabel();
        popcornCountPanel = new javax.swing.JPanel();
        popcornAddButton = new javax.swing.JButton();
        popcornCountTextField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        popcornPricePanel = new javax.swing.JPanel();
        popcornPriceTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        popcornUpdateButton = new javax.swing.JButton();
        crackersPanel = new javax.swing.JPanel();
        crackersImageLabel = new javax.swing.JLabel();
        crackersCountPanel = new javax.swing.JPanel();
        crackersAddButton = new javax.swing.JButton();
        crackersCountTextField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        crackersPricePanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        crackersPriceTextField = new javax.swing.JTextField();
        crackersUpdateButton = new javax.swing.JButton();
        veggieStrawsPanel = new javax.swing.JPanel();
        veggieStrawsImageLabel = new javax.swing.JLabel();
        veggieStrawsCountPanel = new javax.swing.JPanel();
        veggieStrawsAddButton = new javax.swing.JButton();
        veggieStrawsCountTextField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        veggieStrawsPricePanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        veggieStrawsPriceTextField = new javax.swing.JTextField();
        veggieStrawsUpdateButton = new javax.swing.JButton();
        greekYogurtPanel = new javax.swing.JPanel();
        greekYogurtImageLabel = new javax.swing.JLabel();
        greekYogurtCountPanel = new javax.swing.JPanel();
        greekYogurtAddButton = new javax.swing.JButton();
        greekYogurtCountTextField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        greekYogurtPricePanel = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        greekYogurtPriceTextField = new javax.swing.JTextField();
        greekYogurtUpdateButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lycheeJuicePanel = new javax.swing.JPanel();
        dietPepsiPanel = new javax.swing.JPanel();
        pretzelPanel = new javax.swing.JPanel();
        cornPanel = new javax.swing.JPanel();
        machineIDLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        itemsPanel.setBackground(new java.awt.Color(114, 148, 36));

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

        javax.swing.GroupLayout frappuccinoCountPanelLayout = new javax.swing.GroupLayout(frappuccinoCountPanel);
        frappuccinoCountPanel.setLayout(frappuccinoCountPanelLayout);
        frappuccinoCountPanelLayout.setHorizontalGroup(
            frappuccinoCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoCountPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(frappuccinoCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(frappuccinoCountPanelLayout.createSequentialGroup()
                        .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addFrappuccinoButton))))
        );
        frappuccinoCountPanelLayout.setVerticalGroup(
            frappuccinoCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frappuccinoCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frappuccinoCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frappuccinoCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFrappuccinoButton))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout frappuccinoPricePanelLayout = new javax.swing.GroupLayout(frappuccinoPricePanel);
        frappuccinoPricePanel.setLayout(frappuccinoPricePanelLayout);
        frappuccinoPricePanelLayout.setHorizontalGroup(
            frappuccinoPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPricePanelLayout.createSequentialGroup()
                .addGroup(frappuccinoPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frappuccinoPricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frappuccinoPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frappuccinoUpdateButton))
                    .addGroup(frappuccinoPricePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frappuccinoPricePanelLayout.setVerticalGroup(
            frappuccinoPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frappuccinoPricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frappuccinoPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frappuccinoPricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frappuccinoUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(frappuccinoCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(frappuccinoPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frappuccinoPanelLayout.setVerticalGroup(
            frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frappuccinoImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frappuccinoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frappuccinoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frappuccinoPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frappuccinoCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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

        javax.swing.GroupLayout orangeCountPanelLayout = new javax.swing.GroupLayout(orangeCountPanel);
        orangeCountPanel.setLayout(orangeCountPanelLayout);
        orangeCountPanelLayout.setHorizontalGroup(
            orangeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangeCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(orangeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(orangeCountPanelLayout.createSequentialGroup()
                        .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addOrangeButton))))
        );
        orangeCountPanelLayout.setVerticalGroup(
            orangeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangeCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orangeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orangeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrangeButton))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout orangePricePanelLayout = new javax.swing.GroupLayout(orangePricePanel);
        orangePricePanel.setLayout(orangePricePanelLayout);
        orangePricePanelLayout.setHorizontalGroup(
            orangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orangePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangeUpdateButton))
            .addGroup(orangePricePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13))
        );
        orangePricePanelLayout.setVerticalGroup(
            orangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orangePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orangePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orangeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(orangeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orangePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        orangePanelLayout.setVerticalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orangePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeImageLabel)
                    .addComponent(orangeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout lemonadeCountPanelLayout = new javax.swing.GroupLayout(lemonadeCountPanel);
        lemonadeCountPanel.setLayout(lemonadeCountPanelLayout);
        lemonadeCountPanelLayout.setHorizontalGroup(
            lemonadeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadeCountPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(lemonadeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(lemonadeCountPanelLayout.createSequentialGroup()
                        .addComponent(lemonadeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addLemonadeButton))))
        );
        lemonadeCountPanelLayout.setVerticalGroup(
            lemonadeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lemonadeCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lemonadeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lemonadeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLemonadeButton))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout lemonadePricePanelLayout = new javax.swing.GroupLayout(lemonadePricePanel);
        lemonadePricePanel.setLayout(lemonadePricePanelLayout);
        lemonadePricePanelLayout.setHorizontalGroup(
            lemonadePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePricePanelLayout.createSequentialGroup()
                .addGroup(lemonadePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lemonadePricePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lemonadePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lemonadeUpdateButton))
                    .addGroup(lemonadePricePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lemonadePricePanelLayout.setVerticalGroup(
            lemonadePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lemonadePricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lemonadePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonadeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonadePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lemonadePanelLayout.setVerticalGroup(
            lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lemonadePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lemonadePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lemonadePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lemonadeImageLabel1)
                    .addComponent(lemonadeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout gatoradeCountPanelLayout = new javax.swing.GroupLayout(gatoradeCountPanel);
        gatoradeCountPanel.setLayout(gatoradeCountPanelLayout);
        gatoradeCountPanelLayout.setHorizontalGroup(
            gatoradeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradeCountPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(gatoradeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(gatoradeCountPanelLayout.createSequentialGroup()
                        .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addGatoradeButton))))
        );
        gatoradeCountPanelLayout.setVerticalGroup(
            gatoradeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gatoradeCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gatoradeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gatoradeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGatoradeButton))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout gatoradePricePanelLayout = new javax.swing.GroupLayout(gatoradePricePanel);
        gatoradePricePanel.setLayout(gatoradePricePanelLayout);
        gatoradePricePanelLayout.setHorizontalGroup(
            gatoradePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePricePanelLayout.createSequentialGroup()
                .addGroup(gatoradePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gatoradePricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gatoradePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gatoradeUpdateButton))
                    .addGroup(gatoradePricePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gatoradePricePanelLayout.setVerticalGroup(
            gatoradePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gatoradePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gatoradePricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gatoradeUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(gatoradeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gatoradePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gatoradePanel1Layout.setVerticalGroup(
            gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gatoradePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gatoradePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gatoradePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatoradeImageLabel1)
                    .addComponent(gatoradeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout coconutWaterCountPanelLayout = new javax.swing.GroupLayout(coconutWaterCountPanel);
        coconutWaterCountPanel.setLayout(coconutWaterCountPanelLayout);
        coconutWaterCountPanelLayout.setHorizontalGroup(
            coconutWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterCountPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(coconutWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(coconutWaterCountPanelLayout.createSequentialGroup()
                        .addComponent(coconutWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addCoconutWaterButton))))
        );
        coconutWaterCountPanelLayout.setVerticalGroup(
            coconutWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coconutWaterCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coconutWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coconutWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCoconutWaterButton))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout coconutWaterPricePanelLayout = new javax.swing.GroupLayout(coconutWaterPricePanel);
        coconutWaterPricePanel.setLayout(coconutWaterPricePanelLayout);
        coconutWaterPricePanelLayout.setHorizontalGroup(
            coconutWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPricePanelLayout.createSequentialGroup()
                .addGroup(coconutWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coconutWaterPricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coconutWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coconutWaterUpdateButton))
                    .addGroup(coconutWaterPricePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coconutWaterPricePanelLayout.setVerticalGroup(
            coconutWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coconutWaterPricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coconutWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout coconutWaterPanelLayout = new javax.swing.GroupLayout(coconutWaterPanel);
        coconutWaterPanel.setLayout(coconutWaterPanelLayout);
        coconutWaterPanelLayout.setHorizontalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(coconutWaterCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coconutWaterPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        coconutWaterPanelLayout.setVerticalGroup(
            coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addComponent(coconutWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
            .addGroup(coconutWaterPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(coconutWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coconutWaterPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coconutWaterCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout sparklingWaterCountPanelLayout = new javax.swing.GroupLayout(sparklingWaterCountPanel);
        sparklingWaterCountPanel.setLayout(sparklingWaterCountPanelLayout);
        sparklingWaterCountPanelLayout.setHorizontalGroup(
            sparklingWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparklingWaterCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sparklingWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(sparklingWaterCountPanelLayout.createSequentialGroup()
                        .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSparklingWaterButton))))
        );
        sparklingWaterCountPanelLayout.setVerticalGroup(
            sparklingWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sparklingWaterCountPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sparklingWaterCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sparklingWaterCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSparklingWaterButton))
                .addContainerGap())
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

        javax.swing.GroupLayout sparklingWaterPricePanelLayout = new javax.swing.GroupLayout(sparklingWaterPricePanel);
        sparklingWaterPricePanel.setLayout(sparklingWaterPricePanelLayout);
        sparklingWaterPricePanelLayout.setHorizontalGroup(
            sparklingWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparklingWaterPricePanelLayout.createSequentialGroup()
                .addGroup(sparklingWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sparklingWaterPricePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sparklingWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sparklingWaterUpdateButton))
                    .addGroup(sparklingWaterPricePanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sparklingWaterPricePanelLayout.setVerticalGroup(
            sparklingWaterPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparklingWaterPricePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sparklingWaterPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sparklingWaterPricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sparklingWaterUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sparlkingWaterPanelLayout = new javax.swing.GroupLayout(sparlkingWaterPanel);
        sparlkingWaterPanel.setLayout(sparlkingWaterPanelLayout);
        sparlkingWaterPanelLayout.setHorizontalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sparklingWaterCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sparklingWaterPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sparlkingWaterPanelLayout.setVerticalGroup(
            sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sparklingWaterImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sparlkingWaterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sparlkingWaterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sparklingWaterPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sparklingWaterCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cokeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coke.jpg"))); // NOI18N

        addCokeButton.setText("+");
        addCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCokeButtonActionPerformed(evt);
            }
        });

        cokeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cokeCountTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Count");

        javax.swing.GroupLayout cokeCountPanelLayout = new javax.swing.GroupLayout(cokeCountPanel);
        cokeCountPanel.setLayout(cokeCountPanelLayout);
        cokeCountPanelLayout.setHorizontalGroup(
            cokeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeCountPanelLayout.createSequentialGroup()
                .addGroup(cokeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokeCountPanelLayout.createSequentialGroup()
                        .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addCokeButton))
                    .addGroup(cokeCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cokeCountPanelLayout.setVerticalGroup(
            cokeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeCountPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cokeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCokeButton)
                    .addComponent(cokeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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

        javax.swing.GroupLayout cokePricePanelLayout = new javax.swing.GroupLayout(cokePricePanel);
        cokePricePanel.setLayout(cokePricePanelLayout);
        cokePricePanelLayout.setHorizontalGroup(
            cokePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokePricePanelLayout.createSequentialGroup()
                .addGroup(cokePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cokePricePanelLayout.createSequentialGroup()
                        .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateCokeButton))
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cokePricePanelLayout.setVerticalGroup(
            cokePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokePricePanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cokePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateCokeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout cokeInfoPanel7Layout = new javax.swing.GroupLayout(cokeInfoPanel7);
        cokeInfoPanel7.setLayout(cokeInfoPanel7Layout);
        cokeInfoPanel7Layout.setHorizontalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cokeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cokePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cokeInfoPanel7Layout.setVerticalGroup(
            cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cokeInfoPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cokeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cokeInfoPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(cokeInfoPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cokeCountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cokePricePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        proteinSmoothieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinSmoothie.jpg"))); // NOI18N

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

        jLabel8.setText("Count");

        javax.swing.GroupLayout proteinSmoothieCountPanelLayout = new javax.swing.GroupLayout(proteinSmoothieCountPanel);
        proteinSmoothieCountPanel.setLayout(proteinSmoothieCountPanelLayout);
        proteinSmoothieCountPanelLayout.setHorizontalGroup(
            proteinSmoothieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothieCountPanelLayout.createSequentialGroup()
                .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProteinSmoothieButton)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(proteinSmoothieCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        proteinSmoothieCountPanelLayout.setVerticalGroup(
            proteinSmoothieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinSmoothieCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinSmoothieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinSmoothieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProteinSmoothieButton))
                .addGap(27, 27, 27))
        );

        proteinSmoothiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinSmoothiePriceTextFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("Price");

        updateProteinSmoothieButton.setText("update");
        updateProteinSmoothieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProteinSmoothieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout proteinSmoothiePricePanelLayout = new javax.swing.GroupLayout(proteinSmoothiePricePanel);
        proteinSmoothiePricePanel.setLayout(proteinSmoothiePricePanelLayout);
        proteinSmoothiePricePanelLayout.setHorizontalGroup(
            proteinSmoothiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(proteinSmoothiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proteinSmoothiePricePanelLayout.createSequentialGroup()
                        .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateProteinSmoothieButton))
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        proteinSmoothiePricePanelLayout.setVerticalGroup(
            proteinSmoothiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePricePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(proteinSmoothiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinSmoothiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateProteinSmoothieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout proteinSmoothiePanelLayout = new javax.swing.GroupLayout(proteinSmoothiePanel);
        proteinSmoothiePanel.setLayout(proteinSmoothiePanelLayout);
        proteinSmoothiePanelLayout.setHorizontalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinSmoothiePanelLayout.createSequentialGroup()
                .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(proteinSmoothieCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proteinSmoothiePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        proteinSmoothiePanelLayout.setVerticalGroup(
            proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(proteinSmoothieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinSmoothiePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(proteinSmoothiePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proteinSmoothiePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteinSmoothieCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        granolaShakeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/granola.jpg"))); // NOI18N

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

        jLabel27.setText("Price");

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

        javax.swing.GroupLayout granolaPricePanelLayout = new javax.swing.GroupLayout(granolaPricePanel);
        granolaPricePanel.setLayout(granolaPricePanelLayout);
        granolaPricePanelLayout.setHorizontalGroup(
            granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(granolaPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(granolaPricePanelLayout.createSequentialGroup()
                            .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(granolaUpdateButton))
                        .addComponent(jLabel27))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        granolaPricePanelLayout.setVerticalGroup(
            granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(granolaPricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel27)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(granolaPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(granolaUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(granolaPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout granolaCountPanelLayout = new javax.swing.GroupLayout(granolaCountPanel);
        granolaCountPanel.setLayout(granolaCountPanelLayout);
        granolaCountPanelLayout.setHorizontalGroup(
            granolaCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(granolaCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(granolaCountPanelLayout.createSequentialGroup()
                        .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(granolaAddButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(granolaPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        granolaCountPanelLayout.setVerticalGroup(
            granolaCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaCountPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(granolaCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(granolaCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(granolaAddButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(granolaCountPanelLayout.createSequentialGroup()
                .addComponent(granolaPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout granolaShakePanelLayout = new javax.swing.GroupLayout(granolaShakePanel);
        granolaShakePanel.setLayout(granolaShakePanelLayout);
        granolaShakePanelLayout.setHorizontalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(granolaShakeImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(granolaCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        granolaShakePanelLayout.setVerticalGroup(
            granolaShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(granolaShakeImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(granolaShakePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(granolaCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        proteinShakeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proteinShake.jpg"))); // NOI18N

        addproteinShakeButton1.setText("+");
        addproteinShakeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproteinShakeButton1ActionPerformed(evt);
            }
        });

        proteinShakeCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinShakeCountTextFieldActionPerformed(evt);
            }
        });

        jLabel26.setText("Count");

        javax.swing.GroupLayout proteinShakeCountPanelLayout = new javax.swing.GroupLayout(proteinShakeCountPanel);
        proteinShakeCountPanel.setLayout(proteinShakeCountPanelLayout);
        proteinShakeCountPanelLayout.setHorizontalGroup(
            proteinShakeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinShakeCountPanelLayout.createSequentialGroup()
                .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addproteinShakeButton1)
                .addContainerGap())
            .addGroup(proteinShakeCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        proteinShakeCountPanelLayout.setVerticalGroup(
            proteinShakeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinShakeCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinShakeCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addproteinShakeButton1)
                    .addComponent(proteinShakeCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

        javax.swing.GroupLayout proteinShakePricePanelLayout = new javax.swing.GroupLayout(proteinShakePricePanel);
        proteinShakePricePanel.setLayout(proteinShakePricePanelLayout);
        proteinShakePricePanelLayout.setHorizontalGroup(
            proteinShakePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinShakePricePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(proteinShakePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, proteinShakePricePanelLayout.createSequentialGroup()
                        .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proteinShakeUpdateButton1)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(proteinShakePricePanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        proteinShakePricePanelLayout.setVerticalGroup(
            proteinShakePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePricePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(proteinShakePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proteinShakePriceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proteinShakeUpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout proteinShakePanel1Layout = new javax.swing.GroupLayout(proteinShakePanel1);
        proteinShakePanel1.setLayout(proteinShakePanel1Layout);
        proteinShakePanel1Layout.setHorizontalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proteinShakeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(proteinShakePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        proteinShakePanel1Layout.setVerticalGroup(
            proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(proteinShakeCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                .addGroup(proteinShakePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proteinShakeImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(proteinShakePanel1Layout.createSequentialGroup()
                        .addComponent(proteinShakePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        chipsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chips.jpg"))); // NOI18N

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

        javax.swing.GroupLayout chipsCountPanelLayout = new javax.swing.GroupLayout(chipsCountPanel);
        chipsCountPanel.setLayout(chipsCountPanelLayout);
        chipsCountPanelLayout.setHorizontalGroup(
            chipsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsCountPanelLayout.createSequentialGroup()
                .addGroup(chipsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(chipsCountPanelLayout.createSequentialGroup()
                        .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chipsAddButton)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        chipsCountPanelLayout.setVerticalGroup(
            chipsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsCountPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chipsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chipsAddButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel29.setText("Price");

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

        javax.swing.GroupLayout chipsPricePanelLayout = new javax.swing.GroupLayout(chipsPricePanel);
        chipsPricePanel.setLayout(chipsPricePanelLayout);
        chipsPricePanelLayout.setHorizontalGroup(
            chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
            .addGroup(chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chipsPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(chipsPricePanelLayout.createSequentialGroup()
                            .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chipsUpdateButton))
                        .addComponent(jLabel29))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        chipsPricePanelLayout.setVerticalGroup(
            chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(chipsPricePanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(chipsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chipsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chipsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout chipsShakePanelLayout = new javax.swing.GroupLayout(chipsShakePanel);
        chipsShakePanel.setLayout(chipsShakePanelLayout);
        chipsShakePanelLayout.setHorizontalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chipsShakePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chipsImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chipsCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chipsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        chipsShakePanelLayout.setVerticalGroup(
            chipsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chipsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chipsShakePanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(chipsCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chipsShakePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chipsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        nutsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuts.jpg"))); // NOI18N

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

        javax.swing.GroupLayout nutsCountPanelLayout = new javax.swing.GroupLayout(nutsCountPanel);
        nutsCountPanel.setLayout(nutsCountPanelLayout);
        nutsCountPanelLayout.setHorizontalGroup(
            nutsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nutsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nutsCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(nutsCountPanelLayout.createSequentialGroup()
                        .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nutsAddButton))))
        );
        nutsCountPanelLayout.setVerticalGroup(
            nutsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsCountPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nutsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsAddButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel31.setText("Price");

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

        javax.swing.GroupLayout nutsPricePanelLayout = new javax.swing.GroupLayout(nutsPricePanel);
        nutsPricePanel.setLayout(nutsPricePanelLayout);
        nutsPricePanelLayout.setHorizontalGroup(
            nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(nutsPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nutsPricePanelLayout.createSequentialGroup()
                            .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nutsUpdateButton))
                        .addComponent(jLabel31))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        nutsPricePanelLayout.setVerticalGroup(
            nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(nutsPricePanelLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel31)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(nutsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nutsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nutsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout nutsShakePanelLayout = new javax.swing.GroupLayout(nutsShakePanel);
        nutsShakePanel.setLayout(nutsShakePanelLayout);
        nutsShakePanelLayout.setHorizontalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(nutsImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nutsCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nutsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        nutsShakePanelLayout.setVerticalGroup(
            nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nutsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nutsShakePanelLayout.createSequentialGroup()
                .addGroup(nutsShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nutsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nutsCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cookieImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cookie.jpg"))); // NOI18N

        cookieAddButton.setText("+");
        cookieAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieAddButtonActionPerformed(evt);
            }
        });

        cookieCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieCountTextFieldActionPerformed(evt);
            }
        });

        jLabel32.setText("Count");

        javax.swing.GroupLayout cookieCountPanelLayout = new javax.swing.GroupLayout(cookieCountPanel);
        cookieCountPanel.setLayout(cookieCountPanelLayout);
        cookieCountPanelLayout.setHorizontalGroup(
            cookieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cookieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cookieCountPanelLayout.createSequentialGroup()
                        .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cookieAddButton))
                    .addGroup(cookieCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        cookieCountPanelLayout.setVerticalGroup(
            cookieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cookieCountPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cookieCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cookieAddButton)
                    .addComponent(cookieCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        cookiePriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookiePriceTextFieldActionPerformed(evt);
            }
        });

        jLabel33.setText("Price");

        cookieUpdateButton.setText("update");
        cookieUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cookiePricePanelLayout = new javax.swing.GroupLayout(cookiePricePanel);
        cookiePricePanel.setLayout(cookiePricePanelLayout);
        cookiePricePanelLayout.setHorizontalGroup(
            cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cookiePricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cookiePricePanelLayout.createSequentialGroup()
                            .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cookieUpdateButton))
                        .addComponent(jLabel33))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cookiePricePanelLayout.setVerticalGroup(
            cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cookiePricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(cookiePricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cookiePriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cookieUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout cookieShakePanelLayout = new javax.swing.GroupLayout(cookieShakePanel);
        cookieShakePanel.setLayout(cookieShakePanelLayout);
        cookieShakePanelLayout.setHorizontalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cookieShakePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(cookieImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cookieCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(cookiePricePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cookieShakePanelLayout.setVerticalGroup(
            cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cookieImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cookieShakePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cookieShakePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cookiePricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookieCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(driedFruitsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        popcornImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/popcorn.jpg"))); // NOI18N

        popcornAddButton.setText("+");
        popcornAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornAddButtonActionPerformed(evt);
            }
        });

        popcornCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornCountTextFieldActionPerformed(evt);
            }
        });

        jLabel36.setText("Count");

        javax.swing.GroupLayout popcornCountPanelLayout = new javax.swing.GroupLayout(popcornCountPanel);
        popcornCountPanel.setLayout(popcornCountPanelLayout);
        popcornCountPanelLayout.setHorizontalGroup(
            popcornCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(popcornCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popcornCountPanelLayout.createSequentialGroup()
                        .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(popcornAddButton))
                    .addGroup(popcornCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        popcornCountPanelLayout.setVerticalGroup(
            popcornCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popcornCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popcornCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popcornAddButton)
                    .addComponent(popcornCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        popcornPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel35.setText("Price");

        popcornUpdateButton.setText("update");
        popcornUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popcornUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popcornPricePanelLayout = new javax.swing.GroupLayout(popcornPricePanel);
        popcornPricePanel.setLayout(popcornPricePanelLayout);
        popcornPricePanelLayout.setHorizontalGroup(
            popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(popcornPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(popcornPricePanelLayout.createSequentialGroup()
                            .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(popcornUpdateButton))
                        .addComponent(jLabel35))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        popcornPricePanelLayout.setVerticalGroup(
            popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(popcornPricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel35)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(popcornPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(popcornPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(popcornUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout popcornPanelLayout = new javax.swing.GroupLayout(popcornPanel);
        popcornPanel.setLayout(popcornPanelLayout);
        popcornPanelLayout.setHorizontalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(popcornImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(popcornCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(popcornPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        popcornPanelLayout.setVerticalGroup(
            popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(popcornImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(popcornPanelLayout.createSequentialGroup()
                .addGroup(popcornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(popcornCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(popcornPanelLayout.createSequentialGroup()
                        .addComponent(popcornPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        crackersImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crackers.jpg"))); // NOI18N

        crackersAddButton.setText("+");
        crackersAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersAddButtonActionPerformed(evt);
            }
        });

        crackersCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crackersCountTextFieldActionPerformed(evt);
            }
        });

        jLabel38.setText("Count");

        javax.swing.GroupLayout crackersCountPanelLayout = new javax.swing.GroupLayout(crackersCountPanel);
        crackersCountPanel.setLayout(crackersCountPanelLayout);
        crackersCountPanelLayout.setHorizontalGroup(
            crackersCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crackersCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crackersCountPanelLayout.createSequentialGroup()
                        .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(crackersAddButton))
                    .addGroup(crackersCountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        crackersCountPanelLayout.setVerticalGroup(
            crackersCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crackersCountPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(crackersCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crackersAddButton)
                    .addComponent(crackersCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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

        javax.swing.GroupLayout crackersPricePanelLayout = new javax.swing.GroupLayout(crackersPricePanel);
        crackersPricePanel.setLayout(crackersPricePanelLayout);
        crackersPricePanelLayout.setHorizontalGroup(
            crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crackersPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(crackersPricePanelLayout.createSequentialGroup()
                            .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crackersUpdateButton))
                        .addComponent(jLabel37))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        crackersPricePanelLayout.setVerticalGroup(
            crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crackersPricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel37)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(crackersPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crackersPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(crackersUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout crackersPanelLayout = new javax.swing.GroupLayout(crackersPanel);
        crackersPanel.setLayout(crackersPanelLayout);
        crackersPanelLayout.setHorizontalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(crackersImageLabel)
                .addGap(18, 18, 18)
                .addComponent(crackersCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crackersPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        crackersPanelLayout.setVerticalGroup(
            crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crackersImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(crackersPanelLayout.createSequentialGroup()
                .addGroup(crackersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crackersCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crackersPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        veggieStrawsImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veggieStraws.jpg"))); // NOI18N

        veggieStrawsAddButton.setText("+");
        veggieStrawsAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsAddButtonActionPerformed(evt);
            }
        });

        veggieStrawsCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veggieStrawsCountTextFieldActionPerformed(evt);
            }
        });

        jLabel40.setText("Count");

        javax.swing.GroupLayout veggieStrawsCountPanelLayout = new javax.swing.GroupLayout(veggieStrawsCountPanel);
        veggieStrawsCountPanel.setLayout(veggieStrawsCountPanelLayout);
        veggieStrawsCountPanelLayout.setHorizontalGroup(
            veggieStrawsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, veggieStrawsCountPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veggieStrawsAddButton))
            .addGroup(veggieStrawsCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        veggieStrawsCountPanelLayout.setVerticalGroup(
            veggieStrawsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, veggieStrawsCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veggieStrawsCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veggieStrawsAddButton)
                    .addComponent(veggieStrawsCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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

        javax.swing.GroupLayout veggieStrawsPricePanelLayout = new javax.swing.GroupLayout(veggieStrawsPricePanel);
        veggieStrawsPricePanel.setLayout(veggieStrawsPricePanelLayout);
        veggieStrawsPricePanelLayout.setHorizontalGroup(
            veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(veggieStrawsPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(veggieStrawsPricePanelLayout.createSequentialGroup()
                            .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(veggieStrawsUpdateButton))
                        .addComponent(jLabel39))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        veggieStrawsPricePanelLayout.setVerticalGroup(
            veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(veggieStrawsPricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel39)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(veggieStrawsPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(veggieStrawsPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(veggieStrawsUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout veggieStrawsPanelLayout = new javax.swing.GroupLayout(veggieStrawsPanel);
        veggieStrawsPanel.setLayout(veggieStrawsPanelLayout);
        veggieStrawsPanelLayout.setHorizontalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(veggieStrawsImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(veggieStrawsCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(veggieStrawsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        veggieStrawsPanelLayout.setVerticalGroup(
            veggieStrawsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(veggieStrawsImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(veggieStrawsPanelLayout.createSequentialGroup()
                .addComponent(veggieStrawsPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(veggieStrawsCountPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        greekYogurtImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/greekYogurt.jpg"))); // NOI18N

        greekYogurtAddButton.setText("+");
        greekYogurtAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtAddButtonActionPerformed(evt);
            }
        });

        greekYogurtCountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greekYogurtCountTextFieldActionPerformed(evt);
            }
        });

        jLabel42.setText("Count");

        javax.swing.GroupLayout greekYogurtCountPanelLayout = new javax.swing.GroupLayout(greekYogurtCountPanel);
        greekYogurtCountPanel.setLayout(greekYogurtCountPanelLayout);
        greekYogurtCountPanelLayout.setHorizontalGroup(
            greekYogurtCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greekYogurtCountPanelLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greekYogurtAddButton))
            .addGroup(greekYogurtCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        greekYogurtCountPanelLayout.setVerticalGroup(
            greekYogurtCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greekYogurtCountPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greekYogurtCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(greekYogurtAddButton)
                    .addComponent(greekYogurtCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

        javax.swing.GroupLayout greekYogurtPricePanelLayout = new javax.swing.GroupLayout(greekYogurtPricePanel);
        greekYogurtPricePanel.setLayout(greekYogurtPricePanelLayout);
        greekYogurtPricePanelLayout.setHorizontalGroup(
            greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
            .addGroup(greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(greekYogurtPricePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(greekYogurtPricePanelLayout.createSequentialGroup()
                            .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(greekYogurtUpdateButton))
                        .addComponent(jLabel41))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        greekYogurtPricePanelLayout.setVerticalGroup(
            greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(greekYogurtPricePanelLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel41)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(greekYogurtPricePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(greekYogurtPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(greekYogurtUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout greekYogurtPanelLayout = new javax.swing.GroupLayout(greekYogurtPanel);
        greekYogurtPanel.setLayout(greekYogurtPanelLayout);
        greekYogurtPanelLayout.setHorizontalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greekYogurtPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(greekYogurtImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greekYogurtCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greekYogurtPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        greekYogurtPanelLayout.setVerticalGroup(
            greekYogurtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(greekYogurtImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greekYogurtPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(greekYogurtCountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greekYogurtPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(greekYogurtPricePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout lycheeJuicePanelLayout = new javax.swing.GroupLayout(lycheeJuicePanel);
        lycheeJuicePanel.setLayout(lycheeJuicePanelLayout);
        lycheeJuicePanelLayout.setHorizontalGroup(
            lycheeJuicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lycheeJuicePanelLayout.setVerticalGroup(
            lycheeJuicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dietPepsiPanelLayout = new javax.swing.GroupLayout(dietPepsiPanel);
        dietPepsiPanel.setLayout(dietPepsiPanelLayout);
        dietPepsiPanelLayout.setHorizontalGroup(
            dietPepsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dietPepsiPanelLayout.setVerticalGroup(
            dietPepsiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pretzelPanelLayout = new javax.swing.GroupLayout(pretzelPanel);
        pretzelPanel.setLayout(pretzelPanelLayout);
        pretzelPanelLayout.setHorizontalGroup(
            pretzelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pretzelPanelLayout.setVerticalGroup(
            pretzelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cornPanelLayout = new javax.swing.GroupLayout(cornPanel);
        cornPanel.setLayout(cornPanelLayout);
        cornPanelLayout.setHorizontalGroup(
            cornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cornPanelLayout.setVerticalGroup(
            cornPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        machineIDLabel.setText("jLabel1");

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(popcornPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crackersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 690, Short.MAX_VALUE)
                        .addComponent(driedFruitsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(378, 378, 378))
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(coconutWaterPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(itemsPanelLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(frappuccinoPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(gatoradePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lemonadePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(orangePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(granolaShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proteinShakePanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proteinSmoothiePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sparlkingWaterPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chipsShakePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(itemsPanelLayout.createSequentialGroup()
                        .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cornPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pretzelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dietPepsiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lycheeJuicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nutsShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cookieShakePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(greekYogurtPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(machineIDLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(machineIDLabel)
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cokeInfoPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lemonadePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gatoradePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frappuccinoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coconutWaterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(popcornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crackersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veggieStrawsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greekYogurtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lycheeJuicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dietPepsiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pretzelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cornPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(driedFruitsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(551, Short.MAX_VALUE))
        );

        itemScrollPane.setViewportView(itemsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frappuccinoCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoCountTextFieldActionPerformed

    private void addFrappuccinoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFrappuccinoButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(frappuccinoCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(4),machineID);
        frappuccinoCountTextField.setText(Integer.toString(count));
        if(count>2){
            frappuccinoCountTextField.setBackground(Color.white);
            frappuccinoCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 4, null);
    }//GEN-LAST:event_addFrappuccinoButtonActionPerformed

    private void orangeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangeCountTextFieldActionPerformed

    private void addOrangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrangeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(orangeCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(1),machineID);
        if(count>2){
            orangeCountTextField.setBackground(Color.white);
            orangeCountTextField.setForeground(Color.black);
        }
        orangeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "beverage", 1, null);
    }//GEN-LAST:event_addOrangeButtonActionPerformed

    private void lemonadeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadeCountTextFieldActionPerformed

    private void addLemonadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLemonadeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(lemonadeCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(2),machineID);
        lemonadeCountTextField.setText(Integer.toString(count));
        if(count>2){
            lemonadeCountTextField.setBackground(Color.white);
            lemonadeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 2, null);
    }//GEN-LAST:event_addLemonadeButtonActionPerformed

    private void gatoradeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradeCountTextFieldActionPerformed

    private void addGatoradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGatoradeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(gatoradeCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(3),machineID);
        gatoradeCountTextField.setText(Integer.toString(count));
        if(count>2){
            gatoradeCountTextField.setBackground(Color.white);
            gatoradeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 3, null);
    }//GEN-LAST:event_addGatoradeButtonActionPerformed

    private void coconutWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterCountTextFieldActionPerformed

    private void addCoconutWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoconutWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(coconutWaterCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(5),machineID);
        System.out.println(count);
        coconutWaterCountTextField.setText(Integer.toString(count));
        if(count>2){
            coconutWaterCountTextField.setBackground(Color.white);
            coconutWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 5, null);
    }//GEN-LAST:event_addCoconutWaterButtonActionPerformed

    private void sparklingWaterCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterCountTextFieldActionPerformed

    private void addSparklingWaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSparklingWaterButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(sparklingWaterCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(6),machineID);
        sparklingWaterCountTextField.setText(Integer.toString(count));
        if(count>2){
            sparklingWaterCountTextField.setBackground(Color.white);
            sparklingWaterCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 6, null);
    }//GEN-LAST:event_addSparklingWaterButtonActionPerformed

    private void cokeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokeCountTextFieldActionPerformed

    private void addCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCokeButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cokeCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(0),machineID);
        if(count>2){
            cokeCountTextField.setBackground(Color.white);
            cokeCountTextField.setForeground(Color.black);
        }
        cokeCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "beverage", 0, null);
    }//GEN-LAST:event_addCokeButtonActionPerformed

    private void proteinSmoothieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothieCountTextFieldActionPerformed

    private void addProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(proteinSmoothieCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(7),machineID);
        proteinSmoothieCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinSmoothieCountTextField.setBackground(Color.white);
            proteinSmoothieCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 7, null);
    }//GEN-LAST:event_addProteinSmoothieButtonActionPerformed

    private void granolaCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaCountTextFieldActionPerformed

    private void granolaAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(granolaCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(0),machineID);
        granolaCountTextField.setText(Integer.toString(count));
        if(count>2){
            granolaCountTextField.setBackground(Color.white);
            granolaCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 9, null);
    }//GEN-LAST:event_granolaAddButtonActionPerformed

    private void proteinShakeCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakeCountTextFieldActionPerformed

    private void addproteinShakeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproteinShakeButton1ActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(proteinShakeCountTextField.getText());
        count++;
        itemController.increaseItemCount(beverageCodeList.get(8),machineID);
        proteinShakeCountTextField.setText(Integer.toString(count));
        if(count>2){
            proteinShakeCountTextField.setBackground(Color.white);
            proteinShakeCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "beverage", 8, null);
    }//GEN-LAST:event_addproteinShakeButton1ActionPerformed

    private void chipsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsCountTextFieldActionPerformed

    private void chipsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(chipsCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(1),machineID);
        chipsCountTextField.setText(Integer.toString(count));
        if(count>2){
            chipsCountTextField.setBackground(Color.white);
            chipsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 10, null);
    }//GEN-LAST:event_chipsAddButtonActionPerformed

    private void nutsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsCountTextFieldActionPerformed

    private void nutsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(nutsCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(2),machineID);
        nutsCountTextField.setText(Integer.toString(count));
        if(count>2){
            nutsCountTextField.setBackground(Color.white);
            nutsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 11, null);
    }//GEN-LAST:event_nutsAddButtonActionPerformed

    private void cookieCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookieCountTextFieldActionPerformed

    private void cookieAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(cookieCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(3),machineID);
        if(count>2){
            cookieCountTextField.setBackground(Color.white);
            cookieCountTextField.setForeground(Color.black);
        }
        cookieCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "snack", 12, null);
    }//GEN-LAST:event_cookieAddButtonActionPerformed

    private void driedFruitsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driedFruitsCountTextFieldActionPerformed

    private void driedFruitsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driedFruitsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(driedFruitsCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(4),machineID);
        if(count>2){
            driedFruitsCountTextField.setBackground(Color.white);
            driedFruitsCountTextField.setForeground(Color.black);
        }
        driedFruitsCountTextField.setText(Integer.toString(count));
        sendMessage("addtocount", "snack", 13, null);
    }//GEN-LAST:event_driedFruitsAddButtonActionPerformed

    private void popcornCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornCountTextFieldActionPerformed

    private void popcornAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(popcornCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(5),machineID);
        popcornCountTextField.setText(Integer.toString(count));
        if(count>2){
            popcornCountTextField.setBackground(Color.white);
            popcornCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 14, null);
    }//GEN-LAST:event_popcornAddButtonActionPerformed

    private void crackersCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersCountTextFieldActionPerformed

    private void crackersAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(crackersCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(6),machineID);
        crackersCountTextField.setText(Integer.toString(count));
        if(count>2){
            crackersCountTextField.setBackground(Color.white);
            crackersCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 15, null);
    }//GEN-LAST:event_crackersAddButtonActionPerformed

    private void veggieStrawsCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsCountTextFieldActionPerformed

    private void veggieStrawsAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(veggieStrawsCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(7),machineID);
        veggieStrawsCountTextField.setText(Integer.toString(count));
        if(count>2){
            veggieStrawsCountTextField.setBackground(Color.white);
            veggieStrawsCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 16, null);
    }//GEN-LAST:event_veggieStrawsAddButtonActionPerformed

    private void greekYogurtCountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtCountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtCountTextFieldActionPerformed

    private void greekYogurtAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtAddButtonActionPerformed
        // TODO add your handling code here:
        int count = Integer.valueOf(greekYogurtCountTextField.getText());
        count++;
        itemController.increaseItemCount(snackCodeList.get(8),machineID);
        greekYogurtCountTextField.setText(Integer.toString(count));
        if(count>2){
            greekYogurtCountTextField.setBackground(Color.white);
            greekYogurtCountTextField.setForeground(Color.black);
        }
        sendMessage("addtocount", "snack", 17, null);
    }//GEN-LAST:event_greekYogurtAddButtonActionPerformed

    private void cokePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cokePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cokePriceTextFieldActionPerformed

    private void updateCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCokeButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(cokePriceTextField.getText());
        sendMessage("changeprice", "beverage", 0, price);
        itemController.updatePrice(price,beverageCodeList.get(1));
    }//GEN-LAST:event_updateCokeButtonActionPerformed

    private void orangePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangePriceTextFieldActionPerformed

    private void orangeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(orangePriceTextField.getText());
        sendMessage("changeprice", "beverage", 1, price);
        itemController.updatePrice(price,102);
    }//GEN-LAST:event_orangeUpdateButtonActionPerformed

    private void lemonadePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lemonadePriceTextFieldActionPerformed

    private void lemonadeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lemonadeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(lemonadePriceTextField.getText());
        sendMessage("changeprice", "beverage", 2, price);
        itemController.updatePrice(price,beverageCodeList.get(2));
    }//GEN-LAST:event_lemonadeUpdateButtonActionPerformed

    private void gatoradePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gatoradePriceTextFieldActionPerformed

    private void gatoradeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gatoradeUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(gatoradePriceTextField.getText());
        sendMessage("changeprice", "beverage", 3, price);
        itemController.updatePrice(price,beverageCodeList.get(3));
    }//GEN-LAST:event_gatoradeUpdateButtonActionPerformed

    private void frappuccinoPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frappuccinoPriceTextFieldActionPerformed

    private void frappuccinoUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frappuccinoUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(frappuccinoPriceTextField.getText());
        sendMessage("changeprice", "beverage", 4, price);
        itemController.updatePrice(price,beverageCodeList.get(4));
    }//GEN-LAST:event_frappuccinoUpdateButtonActionPerformed

    private void coconutWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coconutWaterPriceTextFieldActionPerformed

    private void coconutWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coconutWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(coconutWaterPriceTextField.getText());
        sendMessage("changeprice", "beverage", 5, price);
        itemController.updatePrice(price,beverageCodeList.get(5));
    }//GEN-LAST:event_coconutWaterUpdateButtonActionPerformed

    private void sparklingWaterPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sparklingWaterPriceTextFieldActionPerformed

    private void sparklingWaterUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparklingWaterUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(sparklingWaterPriceTextField.getText());
        sendMessage("changeprice", "beverage", 6, price);
        itemController.updatePrice(price,beverageCodeList.get(6));
    }//GEN-LAST:event_sparklingWaterUpdateButtonActionPerformed

    private void proteinSmoothiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinSmoothiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinSmoothiePriceTextFieldActionPerformed

    private void updateProteinSmoothieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProteinSmoothieButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(proteinSmoothiePriceTextField.getText());
        sendMessage("changePrice", "beverage", 7, price);
        itemController.updatePrice(price,beverageCodeList.get(7));
    }//GEN-LAST:event_updateProteinSmoothieButtonActionPerformed

    private void proteinShakePriceTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakePriceTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinShakePriceTextField1ActionPerformed

    private void proteinShakeUpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinShakeUpdateButton1ActionPerformed
        double price = Double.valueOf(proteinShakePriceTextField1.getText());
        sendMessage("changePrice", "beverage", 8, price);
        itemController.updatePrice(price,109);
    }//GEN-LAST:event_proteinShakeUpdateButton1ActionPerformed

    private void granolaPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_granolaPriceTextFieldActionPerformed

    private void granolaUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_granolaUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(granolaPriceTextField.getText());
        sendMessage("changeprice", "snack", 9, price);
        itemController.updatePrice(price,snackCodeList.get(0));
    }//GEN-LAST:event_granolaUpdateButtonActionPerformed

    private void chipsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chipsPriceTextFieldActionPerformed

    private void chipsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chipsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(chipsPriceTextField.getText());
        sendMessage("changeprice", "snack", 10, price);
        itemController.updatePrice(price,snackCodeList.get(1));
    }//GEN-LAST:event_chipsUpdateButtonActionPerformed

    private void nutsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsPriceTextFieldActionPerformed

    private void nutsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(nutsPriceTextField.getText());
        sendMessage("changeprice", "snack", 11, price);
        itemController.updatePrice(price,snackCodeList.get(2));
    }//GEN-LAST:event_nutsUpdateButtonActionPerformed

    private void cookiePriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookiePriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cookiePriceTextFieldActionPerformed

    private void cookieUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(cookiePriceTextField.getText());
        sendMessage("changeprice", "snack", 12, price);
        itemController.updatePrice(price,snackCodeList.get(3));
    }//GEN-LAST:event_cookieUpdateButtonActionPerformed

    private void popcornPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popcornPriceTextFieldActionPerformed

    private void popcornUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popcornUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(popcornPriceTextField.getText());
        sendMessage("changeprice", "snack", 14, price);
        itemController.updatePrice(price,snackCodeList.get(5));
    }//GEN-LAST:event_popcornUpdateButtonActionPerformed

    private void crackersPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crackersPriceTextFieldActionPerformed

    private void crackersUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crackersUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(crackersPriceTextField.getText());
        sendMessage("changeprice", "snack", 15, price);
        itemController.updatePrice(price,snackCodeList.get(6));
    }//GEN-LAST:event_crackersUpdateButtonActionPerformed

    private void veggieStrawsPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veggieStrawsPriceTextFieldActionPerformed

    private void veggieStrawsUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veggieStrawsUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(veggieStrawsPriceTextField.getText());
        sendMessage("changeprice", "snack", 16, price);
        itemController.updatePrice(price,snackCodeList.get(7));
    }//GEN-LAST:event_veggieStrawsUpdateButtonActionPerformed

    private void greekYogurtPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greekYogurtPriceTextFieldActionPerformed

    private void greekYogurtUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greekYogurtUpdateButtonActionPerformed
        // TODO add your handling code here:
        double price = Double.valueOf(greekYogurtPriceTextField.getText());
        sendMessage("changeprice", "snack", 17, price);
        itemController.updatePrice(price,snackCodeList.get(8));
    }//GEN-LAST:event_greekYogurtUpdateButtonActionPerformed
  

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
    private javax.swing.JButton chipsAddButton;
    private javax.swing.JPanel chipsCountPanel;
    private javax.swing.JTextField chipsCountTextField;
    private javax.swing.JLabel chipsImageLabel;
    private javax.swing.JPanel chipsPricePanel;
    private javax.swing.JTextField chipsPriceTextField;
    private javax.swing.JPanel chipsShakePanel;
    private javax.swing.JButton chipsUpdateButton;
    private javax.swing.JPanel coconutWaterCountPanel;
    private javax.swing.JTextField coconutWaterCountTextField;
    private javax.swing.JLabel coconutWaterImageLabel;
    private javax.swing.JPanel coconutWaterPanel;
    private javax.swing.JPanel coconutWaterPricePanel;
    private javax.swing.JTextField coconutWaterPriceTextField;
    private javax.swing.JButton coconutWaterUpdateButton;
    private javax.swing.JPanel cokeCountPanel;
    private javax.swing.JTextField cokeCountTextField;
    private javax.swing.JLabel cokeImageLabel1;
    private javax.swing.JPanel cokeInfoPanel7;
    private javax.swing.JPanel cokePricePanel;
    private javax.swing.JTextField cokePriceTextField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton cookieAddButton;
    private javax.swing.JPanel cookieCountPanel;
    private javax.swing.JTextField cookieCountTextField;
    private javax.swing.JLabel cookieImageLabel;
    private javax.swing.JPanel cookiePricePanel;
    private javax.swing.JTextField cookiePriceTextField;
    private javax.swing.JPanel cookieShakePanel;
    private javax.swing.JButton cookieUpdateButton;
    private javax.swing.JPanel cornPanel;
    private javax.swing.JButton crackersAddButton;
    private javax.swing.JPanel crackersCountPanel;
    private javax.swing.JTextField crackersCountTextField;
    private javax.swing.JLabel crackersImageLabel;
    private javax.swing.JPanel crackersPanel;
    private javax.swing.JPanel crackersPricePanel;
    private javax.swing.JTextField crackersPriceTextField;
    private javax.swing.JButton crackersUpdateButton;
    private javax.swing.JPanel dietPepsiPanel;
    private javax.swing.JButton driedFruitsAddButton;
    private javax.swing.JTextField driedFruitsCountTextField;
    private javax.swing.JLabel driedFruitsImageLabel;
    private javax.swing.JPanel driedFruitsPanel;
    private javax.swing.JPanel frappuccinoCountPanel;
    private javax.swing.JTextField frappuccinoCountTextField;
    private javax.swing.JLabel frappuccinoImageLabel;
    private javax.swing.JPanel frappuccinoPanel;
    private javax.swing.JPanel frappuccinoPricePanel;
    private javax.swing.JTextField frappuccinoPriceTextField;
    private javax.swing.JButton frappuccinoUpdateButton;
    private javax.swing.JPanel gatoradeCountPanel;
    private javax.swing.JTextField gatoradeCountTextField;
    private javax.swing.JLabel gatoradeImageLabel1;
    private javax.swing.JPanel gatoradePanel1;
    private javax.swing.JPanel gatoradePricePanel;
    private javax.swing.JTextField gatoradePriceTextField;
    private javax.swing.JButton gatoradeUpdateButton;
    private javax.swing.JButton granolaAddButton;
    private javax.swing.JPanel granolaCountPanel;
    private javax.swing.JTextField granolaCountTextField;
    private javax.swing.JPanel granolaPricePanel;
    private javax.swing.JTextField granolaPriceTextField;
    private javax.swing.JLabel granolaShakeImageLabel;
    private javax.swing.JPanel granolaShakePanel;
    private javax.swing.JButton granolaUpdateButton;
    private javax.swing.JButton greekYogurtAddButton;
    private javax.swing.JPanel greekYogurtCountPanel;
    private javax.swing.JTextField greekYogurtCountTextField;
    private javax.swing.JLabel greekYogurtImageLabel;
    private javax.swing.JPanel greekYogurtPanel;
    private javax.swing.JPanel greekYogurtPricePanel;
    private javax.swing.JTextField greekYogurtPriceTextField;
    private javax.swing.JButton greekYogurtUpdateButton;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JPanel itemsPanel;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel lemonadeCountPanel;
    private javax.swing.JTextField lemonadeCountTextField;
    private javax.swing.JLabel lemonadeImageLabel1;
    private javax.swing.JPanel lemonadePanel;
    private javax.swing.JPanel lemonadePricePanel;
    private javax.swing.JTextField lemonadePriceTextField;
    private javax.swing.JButton lemonadeUpdateButton;
    private javax.swing.JPanel lycheeJuicePanel;
    private javax.swing.JLabel machineIDLabel;
    private javax.swing.JButton nutsAddButton;
    private javax.swing.JPanel nutsCountPanel;
    private javax.swing.JTextField nutsCountTextField;
    private javax.swing.JLabel nutsImageLabel;
    private javax.swing.JPanel nutsPricePanel;
    private javax.swing.JTextField nutsPriceTextField;
    private javax.swing.JPanel nutsShakePanel;
    private javax.swing.JButton nutsUpdateButton;
    private javax.swing.JPanel orangeCountPanel;
    private javax.swing.JTextField orangeCountTextField;
    private javax.swing.JLabel orangeImageLabel;
    private javax.swing.JPanel orangePanel;
    private javax.swing.JPanel orangePricePanel;
    private javax.swing.JTextField orangePriceTextField;
    private javax.swing.JButton orangeUpdateButton;
    private javax.swing.JButton popcornAddButton;
    private javax.swing.JPanel popcornCountPanel;
    private javax.swing.JTextField popcornCountTextField;
    private javax.swing.JLabel popcornImageLabel;
    private javax.swing.JPanel popcornPanel;
    private javax.swing.JPanel popcornPricePanel;
    private javax.swing.JTextField popcornPriceTextField;
    private javax.swing.JButton popcornUpdateButton;
    private javax.swing.JPanel pretzelPanel;
    private javax.swing.JPanel proteinShakeCountPanel;
    private javax.swing.JTextField proteinShakeCountTextField;
    private javax.swing.JLabel proteinShakeImageLabel1;
    private javax.swing.JPanel proteinShakePanel1;
    private javax.swing.JPanel proteinShakePricePanel;
    private javax.swing.JTextField proteinShakePriceTextField1;
    private javax.swing.JButton proteinShakeUpdateButton1;
    private javax.swing.JPanel proteinSmoothieCountPanel;
    private javax.swing.JTextField proteinSmoothieCountTextField;
    private javax.swing.JLabel proteinSmoothieImageLabel;
    private javax.swing.JPanel proteinSmoothiePanel;
    private javax.swing.JPanel proteinSmoothiePricePanel;
    private javax.swing.JTextField proteinSmoothiePriceTextField;
    private javax.swing.JPanel sparklingWaterCountPanel;
    private javax.swing.JTextField sparklingWaterCountTextField;
    private javax.swing.JLabel sparklingWaterImageLabel;
    private javax.swing.JPanel sparklingWaterPricePanel;
    private javax.swing.JTextField sparklingWaterPriceTextField;
    private javax.swing.JButton sparklingWaterUpdateButton;
    private javax.swing.JPanel sparlkingWaterPanel;
    private javax.swing.JButton updateCokeButton;
    private javax.swing.JButton updateProteinSmoothieButton;
    private javax.swing.JButton veggieStrawsAddButton;
    private javax.swing.JPanel veggieStrawsCountPanel;
    private javax.swing.JTextField veggieStrawsCountTextField;
    private javax.swing.JLabel veggieStrawsImageLabel;
    private javax.swing.JPanel veggieStrawsPanel;
    private javax.swing.JPanel veggieStrawsPricePanel;
    private javax.swing.JTextField veggieStrawsPriceTextField;
    private javax.swing.JButton veggieStrawsUpdateButton;
    // End of variables declaration//GEN-END:variables
}
