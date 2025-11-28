import java.util.Scanner;

/**
 * Write a description of class W4_workshopQ3 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if(number > 0) {
            System.out.println("Number is Positive");
        } else if(number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }
}
