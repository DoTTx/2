
//The class AutoRickShaw is called which is the sub class of class Vehicle
public class AutoRickshaw extends Vehicle{
    private int engine_Displacement;// Private methis are declare because it can be accesed otside the class
    private String torque;
    private int number_Seats;
    private int fuel_capacity;
    private String groundClearance;
    private int charge_Amount;
    private String bookedDate;
    private boolean  isBooked;
    // Constructor method AutoRickshaw is called to set parameter on the attribute
    public AutoRickshaw
    (int vehicleID,String vehiclename,String vehicleWeight,String vehicleColor,
    String vehicleSpeed, int engine_Displacement, String torque,String groundClearance, int fuelCapacity){
        super(vehicleID,vehiclename, vehicleWeight,vehicleColor);
        super.setVehicleColor(vehicleColor);
        super.setVehicle_Speed(vehicleSpeed);
        this.engine_Displacement = engine_Displacement;
        this.torque  = torque;
        this.fuel_capacity = fuelCapacity;
        this.groundClearance = groundClearance;
        this.isBooked  = false;
    }
     //Getter method is used tp reads the value of the variable or retrive the value
    public int getengine_Displacement(){
        return this.engine_Displacement;
    }

    public  String gettorque(){
        return this.torque;
    }

    

    public int getnumber_Seats(){
        return this.number_Seats;
    }

    public int getfuel_capacity(){
        return this.fuel_capacity;
    }

    public String getgroundClearance(){
        return this.groundClearance;
    }

    public int getcharge_Amount(){
        return this.charge_Amount;
    }

    public boolean getisBooked(){
        return this.isBooked;
    }
    //Setter methos takes a parameter and assigned it to the attribute 
    public  void Setcharge_Amount(int charge_Amount){
        this.charge_Amount= charge_Amount;
    }

    public void SetNumber_Seats(int number_Seats){
        this.number_Seats = number_Seats;
    }
    public void setIsBooked(boolean isbooked){
        this.isBooked = isBooked;
    }
    // Method book is called to set the bookeddate,seat numbers and charge amount if autorickshaw is not booked
    public void book(String newBookedDate,String chargeAmount,int number_Seats){
        if (isBooked == false){
            this.bookedDate= newBookedDate;
            SetNumber_Seats(number_Seats);
            Setcharge_Amount(charge_Amount);
            isBooked = true;
            System.out.println("You have booked the Vehicle");
        }else{
            System.out.println("The AutoRickshaw is already Booked " + super.getvehicleID() + " is Booked");
        }
    }
    
    //Method display is used to display the attributes of autorickshaw class with suitable notation
    public void AutoRickshaw_display(){
        super.display();
         if (isBooked == true){
            System.out.println("Engine Displacement of AutoRickshaw  " + engine_Displacement);
            System.out.println("The Torque of AutoRickshaw is " + torque);
            System.out.println("The Fuel Tank Capacity is " + fuel_capacity);
            System.out.println("The Ground Clearnce is " + groundClearance);
            System.out.println("The booking date of AutoRickshaw  " + bookedDate);
            if (charge_Amount == 0   ){
                System.out.println("Empty Charge Amount");

            }else{
                
                System.out.println("Charged Amount  " + charge_Amount);

            }
            if (number_Seats == 0){
                System.out.println("Empty number of seats");
            }
            else{
                System.out.println("Number of Seats  " + number_Seats);
            }

        }
    }

        
        
    
}