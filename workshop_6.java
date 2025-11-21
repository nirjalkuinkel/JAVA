import java.util.*;

/**
 * Write a description of class workshop_6 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class workshop_6
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter current water level in liters:");
        double w = input.nextDouble();
        //double ma decimal store hunxa
        System.out.println("Current water level is " + w + "L");
        
        String status = (w >= 1000) 
                        ? "WARNING: Water level has reached 1000L or more!"
                        : "Status: Normal";
        
        System.out.println(status);
        
        input.close();
    }
}