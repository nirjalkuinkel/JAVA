
/**
 * Write a description of class DD here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class w5_workshopQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice = 'y';

        while(choice =='y') {
            
            
            double a;
            
            double b;
            
            char op;

            System.out.print("Enter 1st number: ");
            a = sc.nextDouble();

            System.out.print("Enter 2nd number: ");
            b = sc.nextDouble();

            System.out.print("Enter (+-*/): ");
            op = sc.next().charAt(0);

            if(op=='+'){
                
                
                System.out.println("Result = "+(a+b));
                
            }
            else if(op=='-') {
                System.out.println("Result = " + (a-b));
                
                
            }
            else if(op=='*'){
                
                System.out.println("Result = " + (a*b));
            }
            else if(op=='/') {
                
                
                
                System.out.println("Result = " +(a/b));
            }
            else {
                
                System.out.println("Invalid operator!");
                
            }
            
            

            System.out.print("CONTINUE?: ");
            choice = sc.next().charAt(0);
        }
    }
}
