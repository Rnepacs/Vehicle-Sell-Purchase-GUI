
/**
 * Write a description of class Auto_Rickshaw here.
 *
 * Prince Adhikari, C12
 * COllege ID: NP01CP4S220007
 */
public class Auto_Rickshaw extends Vehicle //Class named Auto_RickShaw is created which is a subclass of Vehicle
{
    /* Auto_Rickshaw class has eight attributes which contains its
       engine displacement, torque, number of seats,
       tank capacity, ground clearance, charging time, booked date
       and isbooked boolean value; which are assigned below. */
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargedAmount;
    private String bookedDate;
    private boolean isBooked;
 
    public Auto_Rickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor,String vehicleSpeed, int engineDisplacement, String torque, int fuelTankCapacity, String groundClearance){
        //constructor of Auto_Rickshaw class
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor); //Super class constructor is called
        this.engineDisplacement= engineDisplacement;
        this.torque =torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        this.isBooked = false;
        super.setVehicleSpeed(vehicleSpeed);  //setter method of vehicleSpeed from parent class is called
        super.setVehicleColor(vehicleColor);  //setter method  of vehicleColor from parent class is called
    }
  
    public int getEngineDisplacement(){ //getter method of engineDisplacemnet variable
        return this.engineDisplacement;
    }
    
    public String getTorque(){ //getter method of torque variable
        return this.torque;
    }
    
    public int getNumberOfSeats(){ //getter method of numberOfSeats variable
        return this.numberOfSeats;
    }
    
    public int getFuelTankCapacity(){ //getter method of fuelTankCapacity variable
        return this.fuelTankCapacity;
    }
    
    public String getGroundClearance(){ //getter method of groundClearance variable
        return this.groundClearance;
    }
    
    public int getChargedAmount(){ //getter method of chargedAmount variable
        return this.chargedAmount;
     }
     
    public String getBookedDate(){ //getter method of bookedDate variable
        return this.bookedDate;
     }
     
    public boolean getIsBooked(){ //getter method of isBooked variable
        return this.isBooked;
     }
     
    public void setChargedAmount(int chargedAmount){ //setter method of chargedAmount variable
        this.chargedAmount = chargedAmount;
    }
    
    public void setNumberOfSeats(int numberOfSeats){ //setter method of numberOfSeats variable
        this.numberOfSeats = numberOfSeats;
    }
    
    public void book(String bookedDate, int chargedAmount, int numberOfSeats){ //method to book an auto rickshaw
        
        /*condition to check if isBooked is empty, then 
          call setter method of chargedAmount and numberOfSeats
          and set isbooked value to true.
          If isBooked is not empty print out the status of 
          isBooked value and show proper message about booking.*/
        if(isBooked == false ){ 
            this.bookedDate = bookedDate;
            setChargedAmount(chargedAmount); //chargedAmount setter method is called
            setNumberOfSeats(numberOfSeats); //numberOfSeats setter method is called
            isBooked = true;
            System.out.println("The auto rickshaw with "+getVehicleID() +" is booked");
        }else{
            System.out.println("The status of booked value is "+isBooked);
           System.out.println("The auto rickshaw is already booked.");
           
        }
    }
    
    public void display(){ //display method made to show needed output
        super.display(); //parent class display method called
        
        /*condition to check if isBooked is true then engine displacement,
          torque, fuel capacity, ground clearance, and booking status of
          auto rickshaw is displayed.*/
        if(isBooked == true ){ 
            System.out.println("The engine displacement of auto rickshaw is "+engineDisplacement);
            System.out.println("The torque of auto rickshaw is "+torque);
            System.out.println("The fuel capacity of auto rickshaw is "+fuelTankCapacity);
            System.out.println("The ground clearance of auto rickshaw is "+groundClearance);
            System.out.println("The auto rickshaw was booked on "+bookedDate);
        }
        
        
        /*nested if condition to check chargedAmount and numberOfseats
          value and if they empty message displayed, otherwise
          given value printed with suitbale annotation*/
        if(chargedAmount == 0){  
            System.out.println("The charged amount is not set.");
            
            if(numberOfSeats == 0){
            System.out.println("The number of seats are empty.");
            
            }
        
        }else{
            System.out.println("The charged amount is "+chargedAmount);
            System.out.println("The number of seats are "+numberOfSeats);
        }
    
    }
    
    /* (Object Creation}
      public static void main(String[] args){
          Auto_Rickshaw a = new Auto_Rickshaw(1,"Auto","150kg","Red","100km/hr",12,"9",18,"18cm");
        
    }*/
}
     
   
     

     
   

