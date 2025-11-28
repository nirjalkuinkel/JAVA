
/**
 * Write a description of class s here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income, tax = 0;
        
        System.out.print("Enter annual income: ");
        
        income = sc.nextDouble();
        

        if(income <= 500000) {
            
            
            tax = income * 0.01;
        }
        else if(income <= 700000) {
            tax = (500000 * 0.01) + ((income - 500000) * 0.10);
        }
        
        
        else {
            
            tax = (500000 * 0.01) + (200000 * 0.10) + ((income - 700000) * 0.20);
        }

        System.out.println("Total Tax = " + tax);
        
        
        
    }
}