
/**
 * Write a description of class Q7 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class W4_workshopQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp = 0;
        char cat;

        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        cat = sc.next().charAt(0);

        switch(cat) {
            case 'A':
                sp = mp - (mp * 0.60f);
                
                break;
                
            case 'B':
                sp = mp - (mp * 0.40f);
                
                break;
                
            case 'C':
                
                sp = mp - (mp * 0.20f);
                break;
            case 'D':
                
                
                sp = mp - (mp * 0.10f);
                break;
                
            default:
                
                sp = mp;
                System.out.println("Invalid category!");
        }

        System.out.println("Selling Price = " + sp);
    }
}
