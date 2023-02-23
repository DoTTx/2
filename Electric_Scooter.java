
// Eletric_Scooter class is called which set the attributes the of the electric scooter
public class Electric_Scooter extends Vehicle{
    private int Range;
    private int Battery_Capacity;
    private int Price;
    private String Charging_Time;
    private String Brand;
    private String Mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    // Constructor method is used to set the attributes with following parameter
    public Electric_Scooter
    (int vehicleID,String vehiclename,String vehicleWeight,String vehicleColor,String vehiclespeed,int Battery_Capacity){
        super( vehicleID, vehiclename, vehicleWeight, vehicleColor);
        super.setVehicle_Speed(vehiclespeed);
        super.setVehicleColor(vehicleColor);
        this.Battery_Capacity = Battery_Capacity;
        Range = 0;
        Price = 0;
        Brand = "";
        Charging_Time = "";
        hasPurchased = false;
        hasSold=false;
        }
        //Above attributes are assigned with accesor method
        
        public int getRange(){
            return this.Range;
        }
        public int getBattery_Capacit(){
            return this.Battery_Capacity;
        }
        public int getPrice(){
            return this.Price;
        }
        public String getCharging_Time(){
            return this.Charging_Time;
        }
        public String getBrand(){
            return this.Brand;
        }
        public String getMileage(){
            return this.Mileage;
        }
        public boolean gethasPurchased(){
            return this.hasPurchased;
        }
        public boolean gethasSold(){
            return this.hasSold;
        }
        
        
        public void setBrand(String Brand){
            if (hasPurchased = false){
                this.Brand = Brand;
            }else{
                System.out.println("Already Purchased");
                
            }
        }
        //Method purchase is called to called some attributes and if hasPurchased is false set the brand name 
        
        public void purchase(String Brand,int Price,String Charging_Time,String Mileage,int Range){
            this.Brand = Brand;
            this.Price = Price;
            this.Charging_Time = Charging_Time;
            this.Mileage = Mileage;
            this.Range = Range;
           
            
            if (hasPurchased = false){
                  setBrand(Brand);
                  
                }
            hasPurchased  = true;
        }
        //Method sell values to attribute when the hasSold is false
        
        public void sell(int newPrice){
            
            if(hasSold == false){
                Price = newPrice;
                Range = 0;
                Charging_Time = "";
                Mileage = "";
                Battery_Capacity = 0;
                hasSold = true;
                hasPurchased = true;
                
                
            }else {
                System.out.println("The Scooter is already sold");
            }
            
            }
            ///Method display is used to display the attributes of vehicle class with suitable notation
        public void ElectricScooter_display(){
            super.display();
            if ( hasPurchased == true){
                System.out.println("The brand of electric Scooter: " + Brand);
                System.out.println("The battery capacity of electric scooty is " + Battery_Capacity);
                System.out.println("Thec mileage of the Electric scooty is " + Mileage);
                System.out.println("The range of Electric Scooty is " + Range);
                System.out.println("The recharge time of electric Scooty is " + Charging_Time);
                        
            }
            
        }
        
        
}