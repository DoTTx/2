//Importing the packages

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

/**
 * @author (Lonmetid Firstname Lastname)
 * @version (1.0.0)
 * 
 */


public class Transport_GUI implements ActionListener{
    //Defining the UI components in the class Vehicle
    private JFrame myFrame;
    private JPanel panelTitle,panelAutoRickshaw,panelElectricScooter,panelAutoRickshaw_Add,
                   panelAutoRickshaw_Book,panelElectricScooter_Add,panelElectricScooter_Purchased;
    
    
    private JLabel titleLabel,Addtitle,
                 idLabel,nameLabel,weightLabel,
                 colorLabel,speedLabel,engineLabel,
                 torqueLabel,fuelLabel,groundLabel
                 ,charge_Label,seats_Label,booked_Label,idLabel_Book,
                 addTitle_Electric,bookTitle_Eletric,
                 
                 
                 
                 
                 idLabel_Electric,nameLabel_Electric,weightLabel_Electric,
                 colorLabel_Electric,speedLabel_Electric,batteryLabel_Electric,
                 priceLabel_Electric,brandLabel_Electric,mileageLabel_Electric,
                 rangeLabel_Electric,chargeLabel_Electric,idLabel_Purchase_Electric,
                 bookTitle_Purchased,bookTitle,sellLabel_Electric,priceSell_Label
                 ;
    private JTextField 
                  idField,nameField,weightField,colorField,
                  speedField,engineField,torqueField,fuelField,
                  groundField,seats_Field,charge_Field,idField_Book,
                  
                  idField_Electric,nameField_Electric,weightField_Electric,
                  speedField_Electric,batteryField_Electric,colorField_Electric,
                  priceField_Electric,brandField_Electric,mileageField_Electric,
                  rangeField_Electric,chargeField_Electric,idField_Purchase_Electric,
                  sellField_Electric,priceSell_Field
                  
                  
                  
                  ;
    private JButton btnAutoRickshaw,btnElectricScooter,btnAdd_AutoRickshaw,
           btnBook_AutoRickshaw,btnDisplay,btnClear,btnAdd_Electric
           ,btnPurchase_Electric,btnDisplay_Electric,btnClear_Electric,btnSell_Electric
           ;
    
           
    private JComboBox<String> dayCombo,monthCombo,yearCombo;
    
    ArrayList<Vehicle> AutoRickshawList = new ArrayList<Vehicle>();
     ArrayList<Vehicle> ElectricScooterList = new ArrayList<Vehicle>();
    
    
     int fuelTxt,engineTxt,id_Text,id_Electric,battery_Electric,
          seats_FieldTxt,rangeTxt_Electric,priceTxt_Electric,priceSell_Txt
         ;
  
    
     Vehicle AutoRickshawObj,ElectricScooterObj;
     
     
     
     
     
    
    
    Transport_GUI(){
        
        //Frame
        myFrame= new JFrame("Vehicle Details");
        myFrame.setLayout(null);
        myFrame.setVisible(true);
        myFrame.setSize(1000, 720);
        myFrame.setResizable(false);//Unable to change the size of frame
        myFrame.getContentPane().setBackground(Color.decode("#2E4053"));
        
        //Panel for Title
        panelTitle = new JPanel();
        panelTitle.setBounds(0,0,980,70);
        panelTitle.setLayout(null);
        panelTitle.setBackground(Color.decode("#2E4053"));
        myFrame.add(panelTitle);
        
        //Panel for AutoRickshaw
        panelAutoRickshaw = new JPanel();
        panelAutoRickshaw.setBounds(22,50,950,600);
        panelAutoRickshaw.setLayout(null);
        panelAutoRickshaw.setVisible(true);
        panelAutoRickshaw.setBackground(Color.decode("#2E4053"));
        myFrame.add(panelAutoRickshaw);
          //Panel to Add an AutoRickshaw
          panelAutoRickshaw_Add = new JPanel();
          panelAutoRickshaw_Add.setBounds(10,40,440,550);
          panelAutoRickshaw_Add.setLayout(null);
          panelAutoRickshaw_Add.setBackground(Color.decode("#212F3D"));
          panelAutoRickshaw.add(panelAutoRickshaw_Add);
          //Panel to Book an Autorickshaw
          panelAutoRickshaw_Book = new JPanel();
          panelAutoRickshaw_Book.setBounds(460,40,480,460);
          panelAutoRickshaw_Book.setLayout(null);
          panelAutoRickshaw_Book.setBackground(Color.decode("#212F3D"));
          panelAutoRickshaw.add(panelAutoRickshaw_Book);
                
        
        
        //Fonts used in the GUI
        Font f_70 = new Font("Calibri",Font.BOLD,50);
        Font f_30 = new Font("Calibri",Font.BOLD,30);
        Font f_16 = new Font("Calibri",Font.BOLD,18);
        
        //Button for TitlePanel
        btnAutoRickshaw =new JButton("AutoRickshaw");
        btnAutoRickshaw.setBounds(50,20,180,40);
        btnAutoRickshaw.setFont(f_16);
        btnAutoRickshaw.setLayout(null);
        btnAutoRickshaw.addActionListener(this);
        panelTitle.add(btnAutoRickshaw);
        
        btnElectricScooter = new JButton("ElectricScooter");
        btnElectricScooter.setBounds(730,20,180,40);
        btnElectricScooter.setFont(f_16);
        btnElectricScooter.setLayout(null);
        btnElectricScooter.addActionListener(this);
        panelTitle.add(btnElectricScooter);
       
        
      
       
        //Title label add
        Addtitle = new JLabel("Add AutoRickshaw");
        Addtitle.setBounds(90,10,300,30);
        Addtitle.setFont(f_30);
        Addtitle.setForeground(Color.white);
        panelAutoRickshaw_Add.add(Addtitle);
        
        
                                                            //AutoRickshaw Add 
         idLabel = new JLabel("Vehicle ID");
         idField = new JTextField();
         idLabel.setBounds(30,60,120,30);
         idField.setBounds(200,60,180,27);
         idLabel.setFont(f_16);
         idField.setFont(f_16);
         idLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(idLabel);
         panelAutoRickshaw_Add.add(idField);
         
         //Vehcile Name
         nameLabel = new JLabel("Vehicle Name");
         nameField = new JTextField();
         nameLabel.setBounds(30,105,120,30);
         nameField.setBounds(200,105,180,27);
         nameLabel.setFont(f_16);
         nameField.setFont(f_16);
         nameLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(nameLabel);
         panelAutoRickshaw_Add.add(nameField);
         
         // Vehicle Weight
         weightLabel = new JLabel("Vehicle Weight");
         weightField = new JTextField();
         weightLabel.setBounds(30,150,120,30);
         weightField.setBounds(200,150,180,27);
         weightLabel.setForeground(Color.white);
         weightLabel.setFont(f_16);
         weightField.setFont(f_16);
         panelAutoRickshaw_Add.add(weightLabel);
         panelAutoRickshaw_Add.add(weightField);
         
       
         colorLabel = new JLabel("Vehicle Color");
         colorField = new JTextField();
         colorLabel.setBounds(30,195,100,30);
         colorField.setBounds(200,195,180,25);
         colorLabel.setFont(f_16);
         colorField.setFont(f_16);
         colorLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(colorLabel);
         panelAutoRickshaw_Add.add(colorField);
         
         
         
         //Vehicle Speed
         speedLabel = new JLabel("Speed");
         speedField = new JTextField();
         speedLabel.setBounds(30,240,100,30);
         speedField.setBounds(200,240,180,25);
         speedLabel.setFont(f_16);
         speedField.setFont(f_16);
         speedLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(speedLabel);
         panelAutoRickshaw_Add.add(speedField);
         
         //vehicle Engine
         engineLabel = new JLabel("Engine Displace");
         engineField = new JTextField();
         engineLabel.setBounds(30,285,150,30);
         engineField.setBounds(200,285,180,25);
         engineLabel.setFont(f_16);
         engineField.setFont(f_16);
         engineLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(engineLabel);
          panelAutoRickshaw_Add.add(engineField);
         
         //Vehicle Torque
         torqueLabel = new JLabel("Torque");
         torqueField = new JTextField();
         torqueLabel.setBounds(30,330,100,30);
         torqueField.setBounds(200,330,180,25);
         torqueLabel.setFont(f_16);
         torqueField.setFont(f_16);
         torqueLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(torqueLabel);
         panelAutoRickshaw_Add.add(torqueField);
         
         fuelLabel  = new JLabel("Fuel Capacity");
         fuelField = new JTextField();
         fuelLabel.setBounds(30,375,100,20);
         fuelField.setBounds(200,375,180,25);
         fuelLabel.setFont(f_16);
         fuelField.setFont(f_16);
         fuelLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(fuelLabel);
         panelAutoRickshaw_Add.add(fuelField);
         
         // Ground clearance of the vehicle
         groundLabel =  new JLabel("Ground Clearance");
         groundField = new JTextField();
         groundLabel.setBounds(30,420,150,20);
         groundField.setBounds(200,420,180,25);
         groundLabel.setFont(f_16);
         groundField.setFont(f_16);
         groundLabel.setForeground(Color.white);
         panelAutoRickshaw_Add.add(groundLabel);
         panelAutoRickshaw_Add.add(groundField);
         
         //Add Button in AutoRickshaw
        btnAdd_AutoRickshaw = new JButton("Add");
        btnAdd_AutoRickshaw.setBounds(140,480,150,40);
        btnAdd_AutoRickshaw.setFont(f_16);
        btnAdd_AutoRickshaw.setFocusable(false);
        btnAdd_AutoRickshaw.addActionListener(this);
        panelAutoRickshaw_Add.add( btnAdd_AutoRickshaw);

        
        
        
         
         //Booking part in the vehicle GUI
        idLabel_Book = new JLabel("Vehicle ID");
        idField_Book = new JTextField();
        idLabel_Book.setBounds(30,60,120,30);
        idField_Book.setBounds(200,60,180,25);
        idLabel_Book.setFont(f_16);
        idField_Book.setFont(f_16);
        idLabel_Book.setForeground(Color.WHITE);
        panelAutoRickshaw_Book.add(idLabel_Book);
        panelAutoRickshaw_Book.add(idField_Book);
        
        //Number of Seats
        seats_Label = new JLabel("No. of seats");
        seats_Field = new JTextField();
        seats_Label.setBounds(30,105,120,30);
        seats_Field.setBounds(200,105,180,25);
        seats_Label.setFont(f_16);
        seats_Field.setFont(f_16);
        seats_Label.setForeground(Color.white);
        panelAutoRickshaw_Book.add(seats_Label);
        panelAutoRickshaw_Book.add(seats_Field);
        
        //Booking date
           //booking Label
            booked_Label =new JLabel("Booked Date");
            booked_Label.setBounds(20,150,120,30);
            booked_Label.setFont(f_16);
            booked_Label.setForeground(Color.white);
            panelAutoRickshaw_Book.add(booked_Label);
            
            //Year Combo Box
            String year[] ={"1990","1991"};
            yearCombo = new JComboBox<String>(year);
            yearCombo.setBounds(350,150,80,20);
            panelAutoRickshaw_Book.add(yearCombo);
            
            //Month Combo Box
            String month[] = {"Jan","Feb","March","April","Jun","July","August","September","Octuber","November"};
            monthCombo = new JComboBox<String>(month);
            monthCombo.setBounds(250,150,60,20);
            panelAutoRickshaw_Book.add(monthCombo);
            
            //Day Combo Box
            String day[] = {"1","2","3","4","5","6","7","8","9","10","12"};
            dayCombo = new JComboBox<String>(day);
            dayCombo.setBounds(200,150,40,20);
            panelAutoRickshaw_Book.add(dayCombo);
        
        
        //Booking button
        btnBook_AutoRickshaw =new JButton("Book");
        btnBook_AutoRickshaw.setBounds(140,350,140,35);
        btnBook_AutoRickshaw.setFont(f_16);
        btnBook_AutoRickshaw.addActionListener(this);
        panelAutoRickshaw_Book.add(btnBook_AutoRickshaw);
            
        //Charge Amount for Booking
        
        charge_Label = new JLabel("Charge Amont");
        charge_Field = new JTextField();
        charge_Label.setBounds(30,195,120,30);
        charge_Field.setBounds(200,195 ,180,25);
        charge_Label.setFont(f_16);
        charge_Field.setFont(f_16);
        charge_Label.setForeground(Color.white);
        panelAutoRickshaw_Book.add(charge_Label);
        panelAutoRickshaw_Book.add(charge_Field);
                                                                                 
        
        //Title of the Book panel
        bookTitle = new JLabel("Book AutoRickshaw");
        bookTitle.setBounds(90,10,300,30);
        bookTitle.setFont(f_30);
        bookTitle.setForeground(Color.white);
        panelAutoRickshaw_Book.add(bookTitle);
        
        //Display Button
        btnDisplay = new JButton("Display");
        btnDisplay.setBounds(550,530,140,35);
        btnDisplay.addActionListener(this);
        panelAutoRickshaw.add(btnDisplay);
        
        //Clear Button
        btnClear = new JButton("Clear");
        btnClear.setBounds(750,530,140,35);
        btnClear.addActionListener(this);
        panelAutoRickshaw.add(btnClear);
        
        
        
        //For ElectricScooter
        panelElectricScooter  = new JPanel();
        panelElectricScooter.setBounds(22,50,950,600);
        panelElectricScooter.setLayout(null);
        panelElectricScooter.setVisible(false);
        panelElectricScooter.setBackground(Color.decode("#2E4053"));
        myFrame.add(panelElectricScooter);        
        
          //Panel Add for ElectricScooter
          panelElectricScooter_Add = new JPanel();
          panelElectricScooter_Add.setBounds(10,40,440,550);
          panelElectricScooter_Add.setLayout(null);
          panelElectricScooter_Add.setBackground(Color.decode("#212F3D"));
          panelElectricScooter.add(panelElectricScooter_Add);
          //Panel to Book an Autorickshaw
          panelElectricScooter_Purchased = new JPanel();
          panelElectricScooter_Purchased .setBounds(460,40,480,490);
          panelElectricScooter_Purchased .setLayout(null);
          panelElectricScooter_Purchased .setBackground(Color.decode("#212F3D"));
          panelElectricScooter.add(panelElectricScooter_Purchased );
                                                                                     
        //Component inside the Add panle in electricScooter
        
        
        
         idLabel_Electric = new JLabel("Vehicle Id");
         idField_Electric = new JTextField();
         idLabel_Electric.setBounds(30,60,120,30);
         idField_Electric.setBounds(200,60,180,27);
         idLabel_Electric.setFont(f_16);
         idField_Electric.setFont(f_16);
         idLabel_Electric.setForeground(Color.white);
         panelElectricScooter_Add.add(idLabel_Electric);
         panelElectricScooter_Add.add(idField_Electric);
         
         //Vehcile Name
         nameLabel_Electric = new JLabel("Vehicle Name");
         nameField_Electric = new JTextField();
         nameLabel_Electric.setBounds(30,105,120,30);
         nameField_Electric.setBounds(200,105,180,27);
         nameLabel_Electric.setFont(f_16);
         nameField_Electric.setFont(f_16);
         nameLabel_Electric.setForeground(Color.white);
         panelElectricScooter_Add.add(nameLabel_Electric);
         panelElectricScooter_Add.add(nameField_Electric);
         
         // Vehicle Weight
         weightLabel_Electric = new JLabel("Vehicle Weight");
         weightField_Electric= new JTextField();
         weightLabel_Electric.setBounds(30,150,120,30);
         weightField_Electric.setBounds(200,150,180,27);
         weightLabel_Electric.setForeground(Color.white);
         weightLabel_Electric.setFont(f_16);
         weightField_Electric.setFont(f_16);
         panelElectricScooter_Add.add(weightLabel_Electric);
         panelElectricScooter_Add.add(weightField_Electric);
         
       
         colorLabel_Electric = new JLabel("Vehicle Color");
         colorField_Electric = new JTextField();
         colorLabel_Electric.setBounds(30,195,100,30);
         colorField_Electric.setBounds(200,195,180,25);
         colorLabel_Electric.setFont(f_16);
         colorField_Electric.setFont(f_16);
         colorLabel_Electric.setForeground(Color.white);
         panelElectricScooter_Add.add(colorLabel_Electric);
         panelElectricScooter_Add.add(colorField_Electric);
         
         
         
         //Vehicle Speed
         speedLabel_Electric = new JLabel("Speed");
         speedField_Electric = new JTextField();
         speedLabel_Electric.setBounds(30,240,100,30);
         speedField_Electric.setBounds(200,240,180,25);
         speedLabel_Electric.setFont(f_16);
         speedField_Electric.setFont(f_16);
         speedLabel_Electric.setForeground(Color.white);
         panelElectricScooter_Add.add(speedLabel_Electric);
         panelElectricScooter_Add.add(speedField_Electric);
         
         //vehicle Engine
         batteryLabel_Electric = new JLabel("Battery Capacity");
         batteryField_Electric = new JTextField();
         batteryLabel_Electric.setBounds(30,285,150,30);
         batteryField_Electric.setBounds(200,285,180,25);
         batteryLabel_Electric.setFont(f_16);
         batteryField_Electric.setFont(f_16);
         batteryLabel_Electric.setForeground(Color.white);
         panelElectricScooter_Add.add(batteryLabel_Electric);
         panelElectricScooter_Add.add(batteryField_Electric);
        
         //Title in ElectricScooter Add
        addTitle_Electric = new JLabel("Add ElectricScooter");
        addTitle_Electric.setBounds(90,10,300,30);
        addTitle_Electric.setFont(f_30);
        addTitle_Electric.setForeground(Color.white);
        panelElectricScooter_Add.add(addTitle_Electric);
         
         //Button for Adding ElectricScooter in panel add of electric Scooter
        btnAdd_Electric = new JButton("Add");
        btnAdd_Electric.setBounds(140,480,150,40);
        btnAdd_Electric.setFont(f_16);
        btnAdd_Electric.setFocusable(false);
        btnAdd_Electric.addActionListener(this);
        panelElectricScooter_Add.add( btnAdd_Electric);
         
        
        
        
        //Purchased and selling in Electric Scooter
         mileageLabel_Electric= new JLabel("Mileage");
        mileageField_Electric = new JTextField();
        mileageLabel_Electric.setBounds(30,195,120,30);
        mileageField_Electric.setBounds(200,195,180,27);
        mileageLabel_Electric.setFont(f_16);
        mileageField_Electric.setFont(f_16);
        mileageLabel_Electric.setForeground(Color.white);
        panelElectricScooter_Purchased.add(mileageLabel_Electric);
        panelElectricScooter_Purchased.add(mileageField_Electric);
        
        //range of Electric SCOOTER
        rangeLabel_Electric = new JLabel("Range");
        rangeField_Electric = new JTextField();
        rangeLabel_Electric.setBounds(30,150,120,30);
        rangeField_Electric.setBounds(200,150,180,27);
        rangeLabel_Electric.setFont(f_16);
        rangeField_Electric.setFont(f_16);
        rangeLabel_Electric.setForeground(Color.white);
        panelElectricScooter_Purchased.add(rangeLabel_Electric);
        panelElectricScooter_Purchased.add(rangeField_Electric);
         
        //Charge Time of Electric
        chargeLabel_Electric = new JLabel("Charging Time");
        chargeField_Electric = new JTextField();
        chargeLabel_Electric.setBounds(30,105,120,30);
        chargeField_Electric.setBounds(200,105,180,27);
        chargeLabel_Electric.setFont(f_16);
        chargeField_Electric.setFont(f_16);
        chargeLabel_Electric.setForeground(Color.white);
        panelElectricScooter_Purchased.add(chargeLabel_Electric);
        panelElectricScooter_Purchased.add(chargeField_Electric);
        
        
        
        //VehicleID for purchasing the electric Scooter
        idLabel_Purchase_Electric= new JLabel("Vehicle ID");
        idField_Purchase_Electric  = new JTextField();
        idLabel_Purchase_Electric.setBounds(30,60,120,30);
        idField_Purchase_Electric.setBounds(200,60,180,27);
        idLabel_Purchase_Electric.setFont(f_16);
        idField_Purchase_Electric.setFont(f_16);
        idLabel_Purchase_Electric.setForeground(Color.white);
        panelElectricScooter_Purchased.add(idLabel_Purchase_Electric);
        panelElectricScooter_Purchased.add(idField_Purchase_Electric);
        
        
        //Brand of Electric Vehicle
        brandLabel_Electric = new JLabel("Brand  ");
        brandField_Electric = new JTextField();
        brandLabel_Electric.setBounds(30,240,120,30);
        brandField_Electric.setBounds(200,240,180,27);
        brandLabel_Electric.setFont(f_16);
        brandField_Electric.setFont(f_16);
        brandLabel_Electric.setForeground(Color.WHITE);
        panelElectricScooter_Purchased.add(brandLabel_Electric);
        panelElectricScooter_Purchased.add(brandField_Electric);
         
        // Price of of the Electric Scooter
        priceLabel_Electric = new JLabel("Price");
        priceField_Electric = new JTextField();
        priceLabel_Electric.setBounds(30,285,120,30);
        priceField_Electric.setBounds(200,285,180,27);
        priceLabel_Electric.setFont(f_16);
        priceField_Electric.setFont(f_16);
        priceLabel_Electric.setForeground(Color.WHITE);
        panelElectricScooter_Purchased.add(priceLabel_Electric);
        panelElectricScooter_Purchased.add(priceField_Electric);
        
        // Purchase Button of Electric Scooter
        btnPurchase_Electric =new JButton("Purchase");
        btnPurchase_Electric.setBounds(140,330,140,35);
        btnPurchase_Electric.setFont(f_16);
        btnPurchase_Electric.setLayout(null);
        btnPurchase_Electric.addActionListener(this);
        
        panelElectricScooter_Purchased.add(btnPurchase_Electric);
        
        //Sell of ElectricScooter 
          sellLabel_Electric = new JLabel("Vehicle ID for sell");
          sellField_Electric = new JTextField();
          sellLabel_Electric.setBounds(30,380,150,30);
          sellField_Electric.setBounds(200,380,180,20);
          sellLabel_Electric.setFont(f_16);
         
          sellLabel_Electric.setForeground(Color.white);
          panelElectricScooter_Purchased.add(sellLabel_Electric);
          panelElectricScooter_Purchased.add(sellField_Electric);

          //Price for Selling
          priceSell_Label = new JLabel("Price for sell");
          priceSell_Field = new JTextField();
          priceSell_Label .setBounds(30,405,150,30);
          priceSell_Field.setBounds(200,405,180,20);
          priceSell_Label .setFont(f_16);
          priceSell_Label.setForeground(Color.white);
          panelElectricScooter_Purchased.add(priceSell_Label );
          panelElectricScooter_Purchased.add(priceSell_Field);
          //Button for selling the the vehicle
          btnSell_Electric = new JButton("Sell");
          btnSell_Electric.setFont(f_16);
          btnSell_Electric.setBounds(140,445,140,30);
          btnSell_Electric.addActionListener(this);
          panelElectricScooter_Purchased.add(btnSell_Electric);
          
          
          
        
        
        //Title label add
        bookTitle_Purchased = new JLabel("Pruchased and Sell ");
        bookTitle_Purchased.setBounds(90,10,300,30);
        bookTitle_Purchased.setFont(f_30);
        bookTitle_Purchased.setForeground(Color.white);
        panelElectricScooter_Purchased.add(bookTitle_Purchased);
            
        
         //Display Button
        btnDisplay_Electric = new JButton("Display");
        btnDisplay.setFont(f_16);
        btnDisplay_Electric.setBounds(550,560,140,35);
        btnDisplay_Electric.addActionListener(this);
        panelElectricScooter.add(btnDisplay_Electric);
        
        //Clear Button
        btnClear_Electric = new JButton("Clear");
        btnClear.setFont(f_16);
        btnClear_Electric.setBounds(750,560,140,35);
        btnClear_Electric.addActionListener(this);
        panelElectricScooter.add(btnClear_Electric);
        
        
        
          
        
        }
    public static void main(String[] args){
        
        
        
        
         new Transport_GUI();
        
        
             
    }
    
    //Implements the methods of the ActionListner
     public void actionPerformed(ActionEvent e){
           if(e.getSource() == btnAutoRickshaw){
            panelAutoRickshaw.setVisible(true);
            panelElectricScooter.setVisible(false);
            btnAutoRickshaw.setBackground(Color.red);
            btnAutoRickshaw.setForeground(Color.BLACK);
            btnElectricScooter.setBackground(new JButton().getBackground());
            btnElectricScooter.setForeground(new JButton().getForeground());
        }
         if(e.getSource() == btnElectricScooter){
            panelElectricScooter.setVisible(true);
            panelAutoRickshaw.setVisible(false);
            btnElectricScooter.setBackground(Color.red);
            btnElectricScooter.setForeground(Color.BLACK);
            btnAutoRickshaw.setBackground(new JButton().getBackground());
            btnAutoRickshaw.setForeground(new JButton().getForeground());
            
        }
        if(e.getSource() == btnAdd_AutoRickshaw){
            if(idField.getText().isEmpty() || nameField.getText().isEmpty() || colorField.getText().isEmpty() || engineField.getText().isEmpty() ||
               speedField.getText().isEmpty() || torqueField.getText().isEmpty() || groundField.getText().isEmpty() || fuelField.getText().isEmpty() ||
                weightField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empty Field Found..");
                    
                   
               }else{
                   id_Text = Integer.parseInt(idField.getText());
                   for(int i = 0; i < AutoRickshawList.size();i++ ){
                       AutoRickshaw autoObj = (AutoRickshaw)AutoRickshawList.get(i);
                       if(autoObj.getvehicleID() == id_Text){
                           JOptionPane.showMessageDialog(null,"This Vehicle already exists");
                           idField.setText("");
                           return;
                       }
                       
                   }
                       
                      
                    
                   try{
                       engineTxt = Integer.parseInt(engineField.getText());
                       
                   }catch(Exception ex){
                       JOptionPane.showMessageDialog(null,"Enter engine Displacement in integer form");
                       
                   }
                   try{
                       fuelTxt = Integer.parseInt(fuelField.getText());
                       
                   }catch(Exception ex){
                       JOptionPane.showMessageDialog(null,"Enter fuel capacity in integer form");
                       
                   }
                   
                   AutoRickshawObj = new AutoRickshaw(id_Text,nameField.getText(),weightField.getText(),colorField.getText(),speedField.getText(),
                                                        engineTxt,torqueField.getText(),groundField.getText(),fuelTxt);
                                                        
                   AutoRickshawList.add(AutoRickshawObj);
                   JOptionPane.showMessageDialog(null,"Vehicle Added Successfully");
                   idField.setText("");
                          nameField.setText("");
                          speedField.setText("");
                          engineField.setText("");
                          torqueField.setText("");
                          weightField.setText("");
                          fuelField.setText("");
                          groundField.setText("");
                          colorField.setText("");

                   
                   
               }
        }
        if(e.getSource() ==btnBook_AutoRickshaw){
            if(idField_Book.getText().isEmpty() || seats_Field.getText().isEmpty() || charge_Field.getText().isEmpty() || 
               dayCombo.getSelectedItem() == null || monthCombo.getSelectedItem() == null || yearCombo.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null,"Empty Field Found");
            }
             else{
                   if(AutoRickshawList.size() == 0){
                    JOptionPane.showMessageDialog(null,"Please Add a List First..");
                }else{
                    try {
                         seats_FieldTxt = Integer.parseInt(seats_Field.getText());
                         
                          }catch(Exception ex){
                           JOptionPane.showMessageDialog(null,"Please Enter number of seats in int form");
                        }
                     String bookedDate = yearCombo.getSelectedItem() + "/"  + monthCombo.getSelectedItem() + "/" + dayCombo.getSelectedItem();
                       boolean check =false;
                      for(int i=0; i < AutoRickshawList.size();i++){
                            if((AutoRickshawList.get(i).getvehicleID()) == (Integer.parseInt(idField_Book.getText()))){
                              
                                AutoRickshaw obj = (AutoRickshaw)AutoRickshawList.get(i);
                                if(obj.getisBooked() == true ){
                                     
                                     JOptionPane.showMessageDialog(null,"Vehicle is already Booked");
                                     
                                    
                                }else{
                                    obj.book(bookedDate, charge_Field.getText(), seats_FieldTxt);
                                    JOptionPane.showMessageDialog(null,"Vehicle Booked Succesfully");
                                    
                                }
                                check = true;
                                    
                                
                            }
                            }
                        if(check ==false){
                                JOptionPane.showMessageDialog(null,"Vehicle doesn't exists");
                     }
                        idField_Book.setText("");
                        charge_Field.setText("");
                        brandField_Electric.setText("");
                        seats_Field.setText("");
                         }   
                }
            
        }
        
        if(e.getSource() == btnDisplay){
            
            for(int i =0;i<AutoRickshawList.size();i++){
                AutoRickshaw Obj = (AutoRickshaw)AutoRickshawList.get(i);
                Obj.AutoRickshaw_display();
                System.out.println("__________________________________________________________");
            }
            
        }
        
         
        if(e.getSource() == btnClear){
            idField_Book.setText("");
            charge_Field.setText("");
            brandField_Electric.setText("");
            seats_Field.setText("");
            idField.setText("");
            nameField.setText("");
            speedField.setText("");
            engineField.setText("");
            torqueField.setText("");
            weightField.setText("");
            fuelField.setText("");
            groundField.setText("");
            colorField.setText("");
            
        }
        
        if(e.getSource() == btnAdd_Electric){
        if(idField_Electric.getText().isEmpty()||nameField_Electric.getText().isEmpty()||colorField_Electric.getText().isEmpty()||speedField_Electric.getText().isEmpty()||
            weightField_Electric.getText().isEmpty()||batteryField_Electric.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Empty Field Found");
            
            
            }
            else{
            try{
            id_Electric = Integer.parseInt(idField_Electric.getText());
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Vehicle id needed in Integer form");
        } 
            
        try{ 
            battery_Electric = Integer.parseInt(batteryField_Electric.getText());
        }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Battery Capacity needed in Intger form");
            
        
        }
        for(int i =0 ; i < ElectricScooterList.size() ; i++){
            Electric_Scooter electricObj = (Electric_Scooter)ElectricScooterList.get(i);
            if(electricObj.getvehicleID() == Integer.parseInt(idField_Electric.getText())){
                JOptionPane.showMessageDialog(null,"Vehicle already exist");
                idField_Electric.setText("");
                return;
                
             }
        }
        ElectricScooterObj = new Electric_Scooter(id_Electric,nameField_Electric.getText(),colorField_Electric.getText(),speedField_Electric.getText(),weightField_Electric.getText(),
                                                 battery_Electric);
        ElectricScooterList.add(ElectricScooterObj);
        JOptionPane.showMessageDialog(null,"Vehicle added Successfully");
        idField_Electric.setText("");
        nameField_Electric.setText("");
        colorField_Electric.setText("");
        speedField_Electric.setText("");
        
        batteryField_Electric.setText("");
        weightField_Electric.setText("");
        
        
        
                                                 
                                                 
        
        
      }     
                   
    }   
        
        
        
        if(e.getSource() == btnPurchase_Electric){
            if(idField_Purchase_Electric.getText().isEmpty() || chargeField_Electric.getText().isEmpty() || rangeField_Electric.getText().isEmpty()||
               brandField_Electric.getText().isEmpty() || mileageField_Electric.getText().isEmpty() || priceField_Electric.getText().isEmpty()){
                   JOptionPane.showMessageDialog(null,"Empty Field found");
                   
                   
               }else{
                   if(ElectricScooterList.size() ==0){
                       JOptionPane.showMessageDialog(null,"No Vehicle is added");
                      
                       
                       
                   }else{
                        try{
                           int priceTxt_Electric = Integer.parseInt(priceField_Electric.getText());
                           
                       }catch(Exception ex){
                           JOptionPane.showMessageDialog(null,"Price in needed in Integerform");
                           
                           
                       }
                       try{
                           int rangeTxt_Electric = Integer.parseInt(rangeField_Electric.getText());
                           
                       }catch(Exception ex){
                           JOptionPane.showMessageDialog(null,"Range is needed in Integer form");
                           
                           
                       }
                       boolean check = false;
                       for(int i = 0;i < ElectricScooterList.size(); i++){
                           Electric_Scooter electricObj = (Electric_Scooter)ElectricScooterList.get(i);
                           if(electricObj.getvehicleID()== (Integer.parseInt(idField_Purchase_Electric.getText()))){
                               
                               if(electricObj.gethasPurchased() == true){
                                   JOptionPane.showMessageDialog(null,"Vehicle is already Purchased");
                                   
                               }
                           else{
                               electricObj.purchase(brandField_Electric.getText(), priceTxt_Electric,chargeField_Electric.getText() , mileageField_Electric.getText(), rangeTxt_Electric);
                               JOptionPane.showMessageDialog(null,"Vehicle purchased successfully");
                               
                           }
                           check = true;
                        }
                                                    
                        }
                        if(check ==false){
                             JOptionPane.showMessageDialog(null,"Vehicle doesn't exists");
                            
                        }
                        
                           
                           }
                           idField_Purchase_Electric.setText("");
                           chargeField_Electric.setText("");
                           rangeField_Electric.setText("");
                           brandField_Electric.setText("");
                           mileageField_Electric.setText("");
                           priceField_Electric.setText("");
                   }
               }
            
        
        
        if(e.getSource() ==btnSell_Electric){
            if(sellField_Electric.getText().isEmpty() || priceSell_Field.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Empty Field Found");
            }else{
                if(ElectricScooterList.size() == 0){
                    JOptionPane.showMessageDialog(null,"No vehicle is added");
                }else{
                    try{
                        priceSell_Txt = Integer.parseInt(priceSell_Field.getText());
                    }catch(Exception ex){
                         JOptionPane.showMessageDialog(null,"Price in needed in intger form");
                        
                    }
                    boolean check = false;
                    for(int i =0;i < ElectricScooterList.size();i++){
                        Electric_Scooter electricObj = (Electric_Scooter)ElectricScooterList.get(i);
                        if(electricObj.getvehicleID() == Integer.parseInt(sellField_Electric.getText())){
                            if(electricObj.gethasSold() == true){
                                 JOptionPane.showMessageDialog(null,"This Vehicle is already sold");
                            }else{
                                 electricObj.sell(priceSell_Txt);
                                 JOptionPane.showMessageDialog(null,"Vehicle Sold Successfully");
                            }
                            check = true;
                        }
                    }
                    if(check ==false){
                        
                             JOptionPane.showMessageDialog(null,"This Vehicle doesn't exists");
                    
                }
                sellField_Electric.setText("");
                priceSell_Field.setText("");
                
                
                
            }
            
            
        }
        
        
    }
    if(e.getSource() ==btnDisplay_Electric){
        for(int i = 0;i < ElectricScooterList.size();i++){
            Electric_Scooter Obj = (Electric_Scooter)ElectricScooterList.get(i);
            Obj.ElectricScooter_display();
            System.out.println("_________________________________________________________________");
        }
    }
    if(e.getSource() == btnClear_Electric){
        sellField_Electric.setText("");
        priceSell_Field.setText("");
        idField_Purchase_Electric.setText("");
        chargeField_Electric.setText("");
        rangeField_Electric.setText("");
        brandField_Electric.setText("");
        mileageField_Electric.setText("");
        priceField_Electric.setText("");
         idField_Electric.setText("");
        nameField_Electric.setText("");
        colorField_Electric.setText("");
        speedField_Electric.setText("");
        
        batteryField_Electric.setText("");
        weightField_Electric.setText("");
    }
    
    
    
    
}
}
