import java.util.*;
import javafx.scene.control.Spinner;
import java.util.Scanner;

/**
 * Write a description of class w4_workshopQ1 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */

public class W4_workshopQ1{
    public static void main(String[] args) {
   
        Scanner input = new Scanner (System.in);
        System.out.println("ENTER YOUR MARKS");
        double marks = input.nextDouble();
        if (marks>=40)
        {
            System.out.println("PASSED!");
        }
        else {
            System.out.println("FAILED");
            
            
        }
    }
} 