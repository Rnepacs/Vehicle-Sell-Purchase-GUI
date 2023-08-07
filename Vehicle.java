
/**
 * Write a description of class Vehicle here.
 *
 * Prince Adhikari, C12
 * COllege ID: NP01CP4S220007
 */

public class Vehicle  //class named Vehicle is created
{
    /* Vehicle class has five attributes which contains its
       id, name, weight, color, and speed; which are assigned
       below.*/
     
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    
    /*Vehicle id, Vehicle name, Vehicle color and Vehicle weight 
      are passed as constructor parameters and are initialized
      by assigning the parameters.*/
     
    
    public Vehicle(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor){  //constructor of Vehicle class
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleWeight = vehicleWeight;
        this.vehicleColor = vehicleColor;
    }
    
    public int getVehicleID(){ //getter method of vehicleID variable
        return this.vehicleID;
    }
    
    public String getVehicleName(){ //getter method of vehicleName variable
        return this.vehicleName;
    }
    
    public String getVehicleWeight(){ //getter method of vehicleWeight variable
        return this.vehicleWeight;
    }
    
    public String getVehicleColor(){ //getter method of vehicleColor variable
        return this.vehicleColor;
    }
    
    public String getVehicleSpeed(){ //getter method of vehicleSpeed variable
        return this.vehicleSpeed;
    }
    
    public void setVehicleSpeed(String vehicleSpeed){ //setter method of vehicleSpeed variable
        this.vehicleSpeed = vehicleSpeed;
    }
    
    public void setVehicleColor(String vehicleColor){ // setter method of vehicelColor variable
        this.vehicleColor = vehicleColor;
    }
    
    public void display(){  //display method made to show needed output
        System.out.println("The ID of the vehicle is "+vehicleID);
        System.out.println("The name of the vehicle is "+vehicleName);     
        System.out.println("The speed of the vehicle is "+vehicleSpeed);
        System.out.println("The color of the vehicle is "+vehicleColor);
        
        if(vehicleWeight == ""){ //condition to return empty message if vehicleWeight is empty
            System.out.println("The given attribute is empty!");
        }else{
            System.out.println("The weight of the vehicle is "+vehicleWeight);    
        }
    }
    
}
