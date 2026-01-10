package week9;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int VehicleId;
    protected String brand;
    protected double basePrice;
    
    public Vehicle(int vehicleId, String brand, double basePrice)
    {
        this.VehicleId= vehicleId;
        this.brand= brand;
        this.basePrice= basePrice;
    }
    
    public void displayVehicleInfo()
    {
        System.out.println("Vehicle Id: "+ this.VehicleId);
        System.out.println("Brand : "+ this.brand);
        System.out.println("Base Price: "+ this.basePrice);
    }
    
    public double calculateTax()
    {
        return 0.10 * this.basePrice;
    }
}