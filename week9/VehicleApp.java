package week9;


/**
 * Write a description of class z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args)
    {
        
        Car c1= new Car(101, "Toyota", 2500000, 4, "Petrol");
        c1.displayCarDetails();
        //This belongs to Mr Umanga Sir 
       
        
        Bike b1= new Bike(201,"Honda", 300000, 320);
        b1.displayBikeDetails();
    }
}