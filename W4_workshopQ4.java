
/**
 * Write a description of class Q4 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both");
        }
    }
}
