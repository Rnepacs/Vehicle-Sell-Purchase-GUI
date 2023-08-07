
/**
 * Coursework-2 for porgramming module
 *
 * @author Prince Adhikari
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TransportGUI implements ActionListener{
    
    //declaration of JFrame
    private JFrame frame1, frame2;

    //declaration of JPanels
    private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
    
          //!!!!!!!!!!!!!!!!!AUTO RICKSHAW!!!!!!!!!!!!!!!!!
    
    //declaration of JLabels for AutoRickshaw
    private JLabel heading, bookHeading,addHeading,aVehicleName,aVehicleID,aVehicleWeight,aVehicleColor,aVehicleSpeed,engineDisplacement,
                   torque,noOfSeats,fuelTankCapacity,groundClearance,chargedAmount,bookedDate;

    //declaration of JTextFields for AutoRickshaw
    private JTextField vehicleName_tf,vehicleID_tf1,vehicleID_tf2,vehicleWeight_tf,vehicleColor_tf,vehicleSpeed_tf,engineDisplacement_tf,torque_tf,noOfSeats_tf,
                       fuelTankCapacity_tf,groundClearance_tf,chargedAmount_tf;

    //declaration of JButtons for AutoRickshaw
    private JButton autoAddButton,autoBookButton,clearButton,displayButton,scooterToggleButton;
    
    //declaration of JComboBox for AutoRickshaw
    private JComboBox cb1,cb2,cb3;

            //!!!!!!!!!!!!!!!!!Electric Scooter!!!!!!!!!!!!!!!!!
    
    //declaration of JLabels for Electric Scooter
    private JLabel eHeading,addEHeading,eVehicleID,eVehicleName,eVehicleWeight,eVehicleColor,eVehicleSpeed,batteryCapacity,sellPurchaseHeading,
                   brand,price,chargingTime,mileage,range;
    
    //declaration of JTextFields for Electric Scooter
    private JTextField eVehicleID_tf1,eVehicleID_tf2,eVehicleName_tf,eVehicleWeight_tf,eVehicleColor_tf,eVehicleSpeed_tf,batteryCapacity_tf,
                   brand_tf,price_tf,chargingTime_tf,mileage_tf,range_tf;
                   
    //declaration of JButtons for Electric Scooter
    private JButton eAddButton,eClearButton,eDisplayButton,autoToggleButton,ePurchaseButton,eSellButton;

    
    //array list of vehicle class
    ArrayList<Vehicle> array_1 = new ArrayList<Vehicle>(); //arraylist object

    public void gui1(){ //instance method to create the GUI for AutoRickshaw
        
        frame1 = new JFrame("Book Transport"); //creation of main JFrame
        //panel creation of Auto Rickshaw section
        panel1 = new JPanel(); 
        panel1.setBounds(0,0,900,550);
        panel1.setLayout(null);
        panel1.setBackground(Color.GRAY);
        frame1.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(10,70,550,400);
        panel2.setLayout(null);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel1.add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(580,70,340,400);
        panel3.setLayout(null);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel1.add(panel3);

        /*creation of JLabel, JTextField for Auto Rickshaw section with 
        their bounds*/
        Font f1 = new Font("Arial",Font.BOLD,20);//font object for heading
        Font f2 = new Font("Arial",Font.PLAIN,16);// font object for other Labels
        Font f3 = new Font("Arial",Font.BOLD,18); //font object for second heading

        //heading of AutoRickshaw section
        heading = new JLabel("AutoRickshaw");
        heading.setBounds(400,10,200,40);
        heading.setFont(f1);
        panel1.add(heading);

        //Add heading
        addHeading = new JLabel("Add AutoRickshaw");
        addHeading.setBounds(200,20,200,30);
        addHeading.setFont(f3);
        panel2.add(addHeading);

        //bounds and addition of vehicleID label and textfield to panel2
        aVehicleID = new JLabel("Vehicle ID:");
        aVehicleID.setBounds(350,80,120,30);
        aVehicleID.setFont(f2);
        panel2.add(aVehicleID);

        vehicleID_tf1 = new JTextField();
        vehicleID_tf1.setBounds(430,80,90,25);
        panel2.add(vehicleID_tf1);

        //bounds and addition of vehicleName label and textfield to panel2
        aVehicleName = new JLabel("Vehicle Name:");
        aVehicleName.setBounds(10,130,120,30);
        aVehicleName.setFont(f2);
        panel2.add(aVehicleName);

        vehicleName_tf = new JTextField();
        vehicleName_tf.setBounds(110,130,140,25);
        panel2.add(vehicleName_tf);    

        //bounds and addition of vehicleWeight label and textfield to panel2
        aVehicleWeight = new JLabel("Vehicle Weight:");
        aVehicleWeight.setBounds(270,130,120,30);
        aVehicleWeight.setFont(f2);
        panel2.add(aVehicleWeight);

        vehicleWeight_tf = new JTextField();
        vehicleWeight_tf.setBounds(380,130,140,25);
        panel2.add(vehicleWeight_tf);    

        //bounds and addition of vehicleColor label and textfield to panel2
        aVehicleColor = new JLabel("Vehicle Color:");
        aVehicleColor.setBounds(10,180,120,30);
        aVehicleColor.setFont(f2);
        panel2.add(aVehicleColor);

        vehicleColor_tf = new JTextField();
        vehicleColor_tf.setBounds(110,180,140,25);
        panel2.add(vehicleColor_tf);    

        //bounds and addition of vehicleSpeed label and textfield to panel2
        aVehicleSpeed = new JLabel("Vehicle Speed:");
        aVehicleSpeed.setBounds(270,180,120,30);
        aVehicleSpeed.setFont(f2);
        panel2.add(aVehicleSpeed);

        vehicleSpeed_tf = new JTextField();
        vehicleSpeed_tf.setBounds(380,180,140,25);
        panel2.add(vehicleSpeed_tf);  

        //bounds and addition of engineDisplacement label and textfield to panel2
        engineDisplacement = new JLabel("Engine Displacement:");
        engineDisplacement.setBounds(10,230,160,30);
        engineDisplacement.setFont(f2);
        panel2.add(engineDisplacement);

        engineDisplacement_tf = new JTextField();
        engineDisplacement_tf.setBounds(165,230,85,25);
        panel2.add(engineDisplacement_tf);

        //bounds and addition of torque label and textfield to panel2
        torque = new JLabel("Torque:");
        torque.setBounds(320,230,120,30);
        torque.setFont(f2);
        panel2.add(torque);

        torque_tf = new JTextField();
        torque_tf.setBounds(380,230,140,25);
        panel2.add(torque_tf);   

        //bounds and addition of fuelTankCapacity label and textfield to panel2
        fuelTankCapacity = new JLabel("Fuel Tank Capacity:");
        fuelTankCapacity.setBounds(10,280,140,30);
        fuelTankCapacity.setFont(f2);
        panel2.add(fuelTankCapacity);

        fuelTankCapacity_tf = new JTextField();
        fuelTankCapacity_tf.setBounds(150,280,100,25);
        panel2.add(fuelTankCapacity_tf);

        //bounds and addition of groundClearance label and textfield to panel2
        groundClearance = new JLabel("Ground Clearance:");
        groundClearance.setBounds(260,280,140,30);
        groundClearance.setFont(f2);
        panel2.add(groundClearance);

        groundClearance_tf = new JTextField();
        groundClearance_tf.setBounds(400,280,120,25);
        panel2.add(groundClearance_tf); 

        //add button of autorickshaw section
        autoAddButton = new JButton("Add");
        autoAddButton.setBounds(250,350,90,40);
        autoAddButton.addActionListener(this); //added to action listener
        panel2.add(autoAddButton);

        //book section heading
        bookHeading = new JLabel("Book AutoRickshaw");
        bookHeading.setBounds(80,20,200,30);
        bookHeading.setFont(f3);
        panel3.add(bookHeading);

        //bounds and addition of vehicle id label and textfield to panel3
        aVehicleID = new JLabel("Vehicle ID:");
        aVehicleID.setBounds(40,80,80,30);
        aVehicleID.setFont(f2);
        panel3.add(aVehicleID);

        vehicleID_tf2 = new JTextField();
        vehicleID_tf2.setBounds(140,80,120,25);
        panel3.add(vehicleID_tf2);

        //bounds and addition of chargedAmount label and textfield to panel3
        chargedAmount = new JLabel("Charged Amount:");
        chargedAmount.setBounds(10,140,140,30);
        chargedAmount.setFont(f2);
        panel3.add(chargedAmount);

        chargedAmount_tf = new JTextField();
        chargedAmount_tf.setBounds(140,140,120,25);
        panel3.add(chargedAmount_tf); 

        //bounds and addition of number of seats label and textfield to panel3
        noOfSeats = new JLabel("Number of Seats:");
        noOfSeats.setBounds(10,200,140,30);
        noOfSeats.setFont(f2);
        panel3.add(noOfSeats);

        noOfSeats_tf = new JTextField();
        noOfSeats_tf.setBounds(140,200,120,25);
        panel3.add(noOfSeats_tf);

        //Label for booked date
        bookedDate = new JLabel("Booked Date:");
        bookedDate.setBounds(10,260,120,30);
        bookedDate.setFont(f2);
        panel3.add(bookedDate);

        //combobox for booked date
        String y[]={"Year","1999","2000","2001","2002","2003","2004","2005","2006",
                "2007","2008","2009","2010","2011","2012","2013","2014",
                "2015","2016","2017","2018","2019","2020","2021","2022"};
        cb1 = new JComboBox(y);
        cb1.setBounds(110,260,60,30);
        panel3.add(cb1);

        String m[] ={"Month","January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        cb2 =new JComboBox(m);
        cb2.setBounds(180,260,70,30);
        panel3.add(cb2);

        String d[]={"Day","1","2","3","4","5","6","7","8","9","10","11","12",
                "13","14","15","16","17","18","19","20","21","22","23","24",
                "25","26","27","28","29","30","31"};
        cb3 = new JComboBox(d);
        cb3.setBounds(260,260,70,30);
        panel3.add(cb3);

        //book button of autorickshaw section
        autoBookButton = new JButton("Book");
        autoBookButton.setBounds(140,350,90,40);
        autoBookButton.addActionListener(this); //added to action listener
        panel3.add(autoBookButton);

        //Electirc scooter toggle button
        scooterToggleButton = new JButton("Go to Electric Scooter");
        scooterToggleButton.setBounds(20,500,180,40);
        scooterToggleButton.addActionListener(this);//added to action listener
        panel1.add(scooterToggleButton);
        

        //clear button of autorickshaw section
        clearButton = new JButton("Clear");
        clearButton.setBounds(820,500,90,40);
        clearButton.addActionListener(this);//added to action listener
        panel1.add(clearButton);

        //display button of autorickshaw section
        displayButton = new JButton("Display");
        displayButton.setBounds(720,500,90,40); 
        displayButton.addActionListener(this);//added to action listener
        panel1.add(displayButton);

        

        //bounds and attributes of the main JFrame
        frame1.setBounds(400,150,950,600);
        frame1.setVisible(true);
        frame1.setResizable(false);
    }
    
    
    
    public void gui2(){ //instance method creation for GUI of Electric Scoote Section
        frame2 = new JFrame("Book Transport"); //creation of main JFrame
        //panel creation of Auto Rickshaw section
        panel4 = new JPanel(); 
        panel4.setBounds(0,0,900,550);
        panel4.setLayout(null);
        panel4.setBackground(Color.GRAY);
        frame2.add(panel4);

        panel5 = new JPanel();
        panel5.setBounds(10,70,550,400);
        panel5.setLayout(null);
        panel5.setBackground(Color.LIGHT_GRAY);
        panel4.add(panel5);

        panel6 = new JPanel();
        panel6.setBounds(580,70,340,400);
        panel6.setLayout(null);
        panel6.setBackground(Color.LIGHT_GRAY);
        panel4.add(panel6);
        
        /*creation of JLabel, JTextField for Electric Scooter section with 
        their bounds*/

        Font f1 = new Font("Arial",Font.BOLD,20);//font object for heading
        Font f2 = new Font("Arial",Font.PLAIN,16);// font object for other Labels
        Font f3 = new Font("Arial",Font.BOLD,18);

        //heading of Electric Scooter section
        eHeading = new JLabel("Electric Scooter");
        eHeading.setBounds(400,10,200,40);
        panel4.add(eHeading);
        eHeading.setFont(f1);

        //Add heading
        addEHeading = new JLabel("Add Electric Scooter");
        addEHeading.setBounds(200,20,200,30);
        addEHeading.setFont(f3);
        panel5.add(addEHeading);
        
        //bounds and addition of vehicleID label and textfield to panel5
        eVehicleID = new JLabel("Vehicle ID:");
        eVehicleID.setBounds(10,80,120,30);
        eVehicleID.setFont(f2);
        panel5.add(eVehicleID);

        eVehicleID_tf1 = new JTextField();
        eVehicleID_tf1.setBounds(110,80,140,25);
        panel5.add(eVehicleID_tf1);

        //bounds and addition of vehicleName label and textfield to panel5
        eVehicleName = new JLabel("Vehicle Name:");
        eVehicleName.setBounds(270,80,120,30);
        eVehicleName.setFont(f2);
        panel5.add(eVehicleName);

        eVehicleName_tf = new JTextField();
        eVehicleName_tf.setBounds(380,80,140,25);
        panel5.add(eVehicleName_tf);    

        //bounds and addition of vehicleWeight label and textfield to panel5
        eVehicleWeight = new JLabel("Vehicle Weight:");
        eVehicleWeight.setBounds(270,140,120,30);
        eVehicleWeight.setFont(f2);
        panel5.add(eVehicleWeight);

        eVehicleWeight_tf = new JTextField();
        eVehicleWeight_tf.setBounds(380,140,140,25);
        panel5.add(eVehicleWeight_tf);    

        //bounds and addition of vehicleColor label and textfield to panel5
        eVehicleColor = new JLabel("Vehicle Color:");
        eVehicleColor.setBounds(10,140,120,30);
        eVehicleColor.setFont(f2);
        panel5.add(eVehicleColor);

        eVehicleColor_tf = new JTextField();
        eVehicleColor_tf.setBounds(110,140,140,25);
        panel5.add(eVehicleColor_tf);    

        //bounds and addition of vehicleSpeed label and textfield to panel5
        eVehicleSpeed = new JLabel("Vehicle Speed:");
        eVehicleSpeed.setBounds(10,200,120,30);
        eVehicleSpeed.setFont(f2);
        panel5.add(eVehicleSpeed);

        eVehicleSpeed_tf = new JTextField();
        eVehicleSpeed_tf.setBounds(110,200,140,25);
        panel5.add(eVehicleSpeed_tf);  

        //bounds and addition of battery capacity label and textfield to panel5
        batteryCapacity = new JLabel("Battery Capacity:");
        batteryCapacity.setBounds(270,200,160,30);
        batteryCapacity.setFont(f2);
        panel5.add(batteryCapacity);

        batteryCapacity_tf = new JTextField();
        batteryCapacity_tf.setBounds(400,200,120,25);
        panel5.add(batteryCapacity_tf);

        //add button of electric scooter section
        eAddButton = new JButton("Add");
        eAddButton.setBounds(250,350,90,40);
        eAddButton.addActionListener(this); ////added to action listener
        panel5.add(eAddButton);
        
        //sell/purchase section heading
        sellPurchaseHeading = new JLabel("Sell/Purchase Electric Scooter");
        sellPurchaseHeading.setBounds(30,20,280,30);
        sellPurchaseHeading.setFont(f3);
        panel6.add(sellPurchaseHeading);

        //bounds and addition of vehicle id label and textfield to panel6
        eVehicleID = new JLabel("Vehicle ID:");
        eVehicleID.setBounds(30,80,80,30);
        eVehicleID.setFont(f2);
        panel6.add(eVehicleID);

        eVehicleID_tf2 = new JTextField();
        eVehicleID_tf2.setBounds(140,80,80,25);
        panel6.add(eVehicleID_tf2);

        //bounds and addition of brand label and textfield to panel6
        brand = new JLabel("Brand:");
        brand.setBounds(30,180,140,30);
        brand.setFont(f2);
        panel6.add(brand);

        brand_tf = new JTextField();
        brand_tf.setBounds(140,180,160,25);
        panel6.add(brand_tf); 

        //bounds and addition of price label and textfield to panel6
        price = new JLabel("Price:");
        price.setBounds(30,120,140,30);
        price.setFont(f2);
        panel6.add(price);

        price_tf = new JTextField();
        price_tf.setBounds(140,120,80,25);
        panel6.add(price_tf);
        
        //bounds and addition of chargingTime label and textfield to panel6
        chargingTime = new JLabel("Charging Time:");
        chargingTime.setBounds(30,220,140,30);
        chargingTime.setFont(f2);
        panel6.add(chargingTime);

        chargingTime_tf = new JTextField();
        chargingTime_tf.setBounds(140,220,160,25);
        panel6.add(chargingTime_tf);
        
        //bounds and addition of mileage label and textfield to panel6
        mileage = new JLabel("Mileage:");
        mileage.setBounds(30,260,140,30);
        mileage.setFont(f2);
        panel6.add(mileage);

        mileage_tf = new JTextField();
        mileage_tf.setBounds(140,260,160,25);
        panel6.add(mileage_tf);
        
        //bounds and addition of range label and textfield to panel6
        range = new JLabel("Range:");
        range.setBounds(30,300,140,30);
        range.setFont(f2);
        panel6.add(range);

        range_tf = new JTextField();
        range_tf.setBounds(140,300,160,25);
        panel6.add(range_tf);
        
        //purchase button of electric scooter section
        ePurchaseButton = new JButton("Purchase");
        ePurchaseButton.setBounds(140,350,90,30);
        ePurchaseButton.addActionListener(this);//added to action listener
        panel6.add(ePurchaseButton);
        
        
        //sell button of electric scooter section
        eSellButton = new JButton("Sell");
        eSellButton.setBounds(240,100,70,30);
        eSellButton.addActionListener(this);//added to action listener
        panel6.add(eSellButton);
        
        //AutoRickshaw  toggle button
        autoToggleButton = new JButton("Go to AutoRickshaw");
        autoToggleButton.setBounds(20,500,180,40);
        autoToggleButton.addActionListener(this); //added to action listener
        panel4.add(autoToggleButton);
        

        //clear button of electric scooter section
        eClearButton = new JButton("Clear");
        eClearButton.setBounds(820,500,90,40);
        eClearButton.addActionListener(this); //added to action listener
        panel4.add(eClearButton);

        //display button of electric scooter section
        eDisplayButton = new JButton("Display");
        eDisplayButton.setBounds(720,500,90,40);
        eDisplayButton.addActionListener(this); //added to action listener
        panel4.add(eDisplayButton);
        
        //bounds and attributes of the main JFrame
        frame2.setBounds(400,150,950,600);
        frame2.setVisible(true);
        frame2.setResizable(false);
    }
    
    public void actionPerformed(ActionEvent e){
         //add AutoRickshaw
        if(e.getSource()==autoAddButton){ //condition to check if getSource is equal to autoAddButton
            try{
              //initialize variables with respective textfield values
              int vehicleID =Integer.parseInt(vehicleID_tf1.getText());
              String vehicleName = vehicleName_tf.getText();
              String vehicleWeight = vehicleWeight_tf.getText();
              String vehicleColor = vehicleColor_tf.getText();
              String vehicleSpeed = vehicleSpeed_tf.getText();
              int engineDisplacement = Integer.parseInt(engineDisplacement_tf.getText());
              String torque = torque_tf.getText();
              int fuelTankCapacity = Integer.parseInt(fuelTankCapacity_tf.getText());
              String groundClearance = groundClearance_tf.getText();
              //create new Auto_Rickshaw class object
              Auto_Rickshaw auto = new  Auto_Rickshaw(vehicleID,vehicleName,vehicleWeight,vehicleColor,vehicleSpeed,engineDisplacement,torque,fuelTankCapacity,groundClearance);
              array_1.add(auto); //add object to ArrayList
              JOptionPane.showMessageDialog(frame1, "New AutoRickshaw added.");
             }catch(NumberFormatException excep){
                JOptionPane.showMessageDialog(frame1,"Enter valid values in the box","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //book auto rickshaw
        else if(e.getSource()==autoBookButton){ //condition to check if getSource is equal to autoBookButton
            try{
                //initialize variables with respective textfield values
                int vehicleID = Integer.parseInt(vehicleID_tf2.getText());
                int chargedAmount = Integer.parseInt(chargedAmount_tf.getText());
                int noOfSeats = Integer.parseInt(noOfSeats_tf.getText());
                
                String year = String.valueOf(cb1.getSelectedItem());
                String month = String.valueOf(cb2.getSelectedItem());
                String day = String.valueOf(cb3.getSelectedItem());
                String bookedDate = year+"/"+month+"/"+day;
                
                for (Vehicle vobj: array_1){  //loop until object of Vehicle in ArrayList
                    if(vobj instanceof Auto_Rickshaw){ //condition to check if object or not of given class
                        Auto_Rickshaw autoobj = (Auto_Rickshaw)vobj; //downcasting
                        if(autoobj.getVehicleID() == vehicleID){ //condition to check entered vehicleID with available vehicleID
                            
                            //condition to book Auto Rickshaw
                            if(autoobj.getIsBooked() == true) {
                                    JOptionPane.showMessageDialog(frame1, "This auto rickshaw is already booked","ERROR",JOptionPane.WARNING_MESSAGE);
                                }else if (autoobj.getIsBooked() == false) {
                                    JOptionPane.showMessageDialog(frame1, "The auto rickshaw with ID " + vehicleID + " is, "+ "for "+ noOfSeats + " seat/s, \n" + " booked on "+ bookedDate + " for " + chargedAmount+" price");
                                    autoobj.book(bookedDate,chargedAmount,noOfSeats);
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame1, "Enter valid Vehicle ID");
                        }
                    }
                }
            }catch(NumberFormatException excep2){
                JOptionPane.showMessageDialog(frame1,"Enter valid values in the box","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //clear Auto Rickshaw section
        else if(e.getSource()==clearButton){ //condition to check if getSource is equal to clearButton
            
          //set textfield values to empty
          vehicleID_tf1.setText("");
          vehicleID_tf2.setText("");
          vehicleName_tf.setText("");
          vehicleWeight_tf.setText("");
          vehicleColor_tf.setText("");        
          vehicleSpeed_tf.setText("");
          engineDisplacement_tf.setText("");
          torque_tf.setText("");
          fuelTankCapacity_tf.setText("");
          groundClearance_tf.setText("");  
          chargedAmount_tf.setText("");
          noOfSeats_tf.setText("");
        }
        
        //display auto rickshaw
        else if(e.getSource()==displayButton){ //condition to check if getSource is equal to displayButton
            for(Vehicle obj2 : array_1){ //loop until object of Vehicle in ArrayList
                if (obj2 instanceof Auto_Rickshaw){ //condition to check if object or not of given class
                    Auto_Rickshaw aobj2 = (Auto_Rickshaw)obj2; //downcasting
                    aobj2.display();
                }
            }
        }
        
        //add Electric scooter
        else if(e.getSource()==eAddButton){ //condition to check if getSource is equal to eAddButton
            try{
              //initialize variables with respective textfield values
              int vehicleID =Integer.parseInt(eVehicleID_tf1.getText());
              String vehicleName = eVehicleName_tf.getText();
              String vehicleWeight = eVehicleWeight_tf.getText();
              String vehicleColor = eVehicleColor_tf.getText();
              String vehicleSpeed = eVehicleSpeed_tf.getText();
              int batteryCapacity = Integer.parseInt(batteryCapacity_tf.getText());
              Electric_Scooter scooter = new  Electric_Scooter(vehicleID,vehicleName,vehicleWeight,vehicleSpeed,vehicleColor,batteryCapacity);
              array_1.add(scooter);
              JOptionPane.showMessageDialog(panel4, "New Electric Scooter added.");  
            }catch(NumberFormatException excep3){
                JOptionPane.showMessageDialog(frame1,"Enter valid values in the box","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //purchase Electric scooter
        else if(e.getSource()==ePurchaseButton){ //condition to check if getSource is equal to ePurchaseButton
            try{
                //initialize variables with respective textfield values
                int vehicleID = Integer.parseInt(eVehicleID_tf2.getText());
                String brand = brand_tf.getText();
                int price = Integer.parseInt(price_tf.getText());
                String chargingTime = chargingTime_tf.getText();
                String mileage = mileage_tf.getText();
                int range = Integer.parseInt(range_tf.getText());
                
                for(Vehicle vobj2: array_1){ //loop until object of Vehicle in ArrayList
                    if(vobj2 instanceof Electric_Scooter){ //condition to check if object or not of given class
                        Electric_Scooter eobj1 = (Electric_Scooter)vobj2; //downcasting
                        if(eobj1.getVehicleID()==vehicleID){ //condition to check entered vehicleID with available vehicleID
                            
                            //condition to purchase Electric Scooter
                            if(eobj1.getHasPurchased() == true) {
                                JOptionPane.showMessageDialog(frame1, "This electric scooter is already purchased!","ERROR",JOptionPane.WARNING_MESSAGE);                                   
                            }else if(eobj1.getHasPurchased()==false){
                                JOptionPane.showMessageDialog(frame2, "The electric scooter with ID " + vehicleID + " is"+ "\n" + "succesfully purchased.");                               
                                eobj1.purchase(brand,price,chargingTime,mileage,range);
                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(frame1, "Enter valid Vehicle ID");
                        }
                    }
                }
            }catch(NumberFormatException excep3){
                JOptionPane.showMessageDialog(frame1,"Enter valid values in the box","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //sell electric scooter
        else if(e.getSource()==eSellButton){ //condition to check if getSource is equal to eSellButton
            try{
                //initialize variables with respective textfield values
                int vehicleID = Integer.parseInt(eVehicleID_tf2.getText());
                int price = Integer.parseInt(price_tf.getText());
                
                for(Vehicle vobj3: array_1){ //loop until object of Vehicle in ArrayList
                    if(vobj3 instanceof Electric_Scooter){ //condition to check if object or not of given class
                        Electric_Scooter eobj2 = (Electric_Scooter)vobj3; //downcasting
                        if(eobj2.getVehicleID()==vehicleID){ //condition to check entered vehicleID with available vehicleID
                            
                            //condition to sell Electric Scooter
                            if(eobj2.getHasSold() == true) {
                                JOptionPane.showMessageDialog(frame2, "This electric scooter is already sold!","ERROR",JOptionPane.WARNING_MESSAGE); 
                            }else if(eobj2.getHasSold()==false){
                                JOptionPane.showMessageDialog(frame2, "The electric scooter with ID " + vehicleID + " is"+ "\n" + "succesfully sold.");
                                eobj2.sell(price);
                            }
                        }else{
                            JOptionPane.showMessageDialog(frame1, "Enter valid Vehicle ID");
                        }
                    }
                }
            }catch(NumberFormatException excep3){
                JOptionPane.showMessageDialog(frame1,"Enter valid values in the box","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }        
        
        //display electric scooter
        else if(e.getSource()==eDisplayButton){ //condition to check if getSource is equal to eDisplayButton
            for(Vehicle obj3 : array_1){ //loop until object of Vehicle in ArrayList
                if (obj3 instanceof Electric_Scooter){
                    Electric_Scooter eobj3 = (Electric_Scooter)obj3; //downcasting
                    eobj3.display();
                }
            }
        }
        
        //clear Electric Scooter Section
        else if(e.getSource()==eClearButton){ //condition to check if getSource is equal to eClearButton
            
          //set textfield values to empty  
          eVehicleID_tf1.setText("");
          eVehicleID_tf2.setText("");
          eVehicleName_tf.setText("");
          eVehicleWeight_tf.setText("");            
          eVehicleColor_tf.setText("");
          eVehicleSpeed_tf.setText("");
          batteryCapacity_tf.setText("");
          brand_tf.setText("");
          price_tf.setText("");
          chargingTime_tf.setText("");
          mileage_tf.setText("");
          range_tf.setText("");
        }
        
        //Go to electric scooter panel
        else if(e.getSource()== scooterToggleButton){ //condition to check if getSource is equal to scooterToggleButton
           gui2();
           frame1.dispose();
        }
        
        
        //Go to auto rickshaw panel
        else if(e.getSource()== autoToggleButton){ //condition to check if getSource is equal to autoToggleButton
            gui1();
            frame2.dispose();
        }
        
    }

    public static void main(String[] args){ //main method use to create object of class
        TransportGUI obj = new TransportGUI();
        obj.gui1(); //call gui1 method
    }
}