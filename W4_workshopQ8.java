
/**
 * Write a description of class Q8 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa;
        System.out.print("Enter GPA (0.0 - 4.0): ");
        gpa = sc.nextDouble();

        if(gpa < 0 || gpa > 4.0) {
            System.out.println("Invalid GPA!");
            
        } else if(gpa == 4.0) {
            System.out.println("Grade: A");
            
        } else if(gpa >= 3.0) {
            System.out.println("Grade: B");
            
        } else if(gpa >= 2.0) {
            System.out.println("Grade: C");
            
        } else if(gpa >= 1.0) {
            System.out.println("Grade: D");
            
        } else {
            System.out.println("Grade: F");
            
            
        }
    }
}
