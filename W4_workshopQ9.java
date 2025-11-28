
/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa;
        int attendance, attitude;

        System.out.print("Enter GPA: ");
        gpa = sc.nextDouble();

        System.out.print("Enter attendance (%): ");
        attendance = sc.nextInt();

        System.out.print("Enter attitude score (1-10): ");
        attitude = sc.nextInt();

        if(gpa >= 3.2) {
            
            
            if(attendance > 80) {
                
                
                if(attitude < 5) {
                    System.out.println("Eligible for scholarship");
                } else {
                    
                    
                    System.out.println("Not eligible");
                }
            } else {
                System.out.println("Not eligible");
            }
        } else {
            
            
            System.out.println("Not eligible");
        }
    }
}
