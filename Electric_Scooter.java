
/**
 * Write a description of class Electric_Scooter here.
 *
 * Prince Adhikari, C12
 * COllege ID: NP01CP4S220007
 */
public class Electric_Scooter extends Vehicle //Class named Electric_Scooter is created which is a subclass of Vehicle
{
    /*Electric_Scooter class has eight attributes which contains 
      its range, battery capacity, price, charging time, brand,
      mileage, purchased value, and sold value which are listed
      below*/
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    //constructor of Electric_Scooter class
    public Electric_Scooter(int vehicleID, String vehicleName, String vehicleWeight, String vehicleSpeed, String vehicleColor,int batteryCapacity){
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor);  
        this.batteryCapacity = batteryCapacity;
        range = 0;
        price = 0;
        brand ="";
        mileage ="";
        chargingTime ="";
        hasPurchased = false;
        hasSold = false;
        super.setVehicleSpeed(vehicleSpeed); //setter method of vehicleSpeed from parent class is called
        super.setVehicleColor(vehicleColor); //setter method of vehicleColor from parent class is called
    }
    
    public int getRange(){ //getter method of range variable
        return this.range;
    }
    
    public int getBatteryCapacity(){ //getter method of batteryCapacity variable
        return this.batteryCapacity;
    }
    
    public int getPrice(){ //getter method of price variable
        return this.price;
    }
    
    public String getChargingTime(){ //getter method of chargingTime variable
        return this.chargingTime;
    }
    
    public String getBrand(){ //getter method of brand variable
        return this.brand;
    }
    
    public String getMileage(){ //getter method of mileage variable
        return this.mileage;
    }
    
    public boolean getHasPurchased(){ //getter method of hasPurchased variable
        return this.hasPurchased;
    }
    
    public boolean getHasSold(){ //getter method of hasSold variable
        return this.hasSold;
    }
    
    public void setBrand(String brand){ //setter method of brand variable
        
        /*condition to check if brand is already purchased;
          if it is then suitable message is printed else
          brand value of class is updated with this method
          brand value*/
        if(hasPurchased == false){
            this.brand = brand;
        }else{
            System.out.println("The brand is already purchased,"+"\n"+" so it is not possible to change the brand.");
        }
    }
    
    public void purchase(String brand,int price,String chargingTime, String mileage,int range){ //method to purchase electric scooter
        /*condition to chek if hasPurchased is false;
         if yes, call setBrand, and initialize price,
         chargingTime, mileage, range with parameter
         value and hasPurchased to true*/
        
         if(hasPurchased == false){ 
            setBrand(brand);
            this.price = price;
            this.chargingTime = chargingTime;
            this.mileage = mileage;
            this.range = range;
            this.hasPurchased = true;
        } 
        
    }
    
    public void sell(int price){ //method to sell electric scooter
        
        /*condition to check if hasSold status is false;
          if yes, range, batterycapacity, charging time,
          mileage is set to empty, and sold value is set
          to true, purchased value is set to false. */
        if(hasSold==false){
            this.price = price;
            range =0;
            batteryCapacity =0;
            chargingTime ="";
            mileage ="";
            hasSold = true;
            hasPurchased = false;
        }else{
            System.out.println("The electric scooter is already sold.");
        }
    }
    
    public void display(){ //method to display needed output
        super.display(); //display method of parent class is called
        
        /*condition to check if purchased value is true;
          if true then the brand, battery capacity, mileage,
          range, and recharge time of th electric scooter
          is displayed.*/
        if(hasPurchased == true){
            System.out.println("The brand of the electric scooter is "+brand);
            System.out.println("The battery capacity of the electric scooter is "+batteryCapacity);
            System.out.println("The electric scooter gives a mileage of "+mileage);
            System.out.println("The range of the electric scooter is "+range);
            System.out.println("The electric scooter takes "+chargingTime+" to recharge");   
        }
    }
    
}
