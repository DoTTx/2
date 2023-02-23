

//

/**
 Name:Saugat Basnet
 Id = np014s220042
 
 The class Vehicle is call following attributes and to set accersor and 
 mutator method
 within the class
**/
public class Vehicle {
    private int vehicleID;// Id assigned to the Vehicle
    private String vehiclename;// Name of the Vehicle
    private String vehicleWeight;//Weight of the Vehicle
    private String vehicleColor;//Color of the Vehicle
    private String vehiclespeed;// Speed of the Vehicle 
    
    
    /* The class vehicles attribute are assigned with value using 
     * Constructor parameter*/
    public Vehicle 
    (int vehicleID,String vehiclename,String vehicleWeight,String vehicleColor)
    {
    this.vehicleID = vehicleID;
    this.vehicleWeight = vehicleWeight;
    this.vehicleColor = vehicleColor;
    this.vehiclespeed = vehiclespeed;
    this.vehiclename = vehiclename;
   }
   //Getter method is used tp reads the value of the variable or retrieve the value
   public int getvehicleID(){
       return this.vehicleID;
   }
   public String getvehicleweight(){
       return this.vehicleWeight;
   }
   public String getvehiclecolor(){
       return this.vehicleColor;
   }
   public String getvehicle_Speed(){
       return this.vehiclespeed;
   }
   public String getvehicleName(){
       return this.vehiclename;
   }
   //Setter methos takes a parameter and assigned it to the attribute 
   //Setter method to set Speed of the vehicle
   public void setVehicle_Speed(String newSpeed){
       vehiclespeed = newSpeed;
   }
   //Setter method to set Color of the Vehicle
   public void setVehicleColor(String newvehicle_Color){
       vehicleColor = newvehicle_Color;
   }
   ////Method display is used to display the attributes of vehicle class with suitable notation
   public void display(){
       System.out.println("Vehicle Id =" + vehicleID);
       System.out.println("Vehicle Name = " + vehiclename);
       System.out.println("Speed of the Vehicle = " + vehiclespeed);
       System.out.println("Colour of the Vehicle = " + vehicleColor);
       
       if (vehicleWeight == " "){
           System.out.println("Empty");
           
       }else{
           System.out.println("Weight of the Vehicle=" + vehicleWeight);
        }
   }
   
       
   }
       
       
       
       
       
       
   
   
     
