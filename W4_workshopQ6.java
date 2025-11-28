
/**
 * Write a description of class Q6 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */

        import java.util.Scanner;
public class W4_workshopQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float mp, sp;
        char category;

        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();

        System.out.print("Enter category (A/B/C/D): ");
        category = sc.next().charAt(0);

        if(category == 'A') {
            
            
            sp = mp - (mp * 0.60f);
            
        } else if(category == 'B') {
            sp = mp - (mp * 0.40f);
            
            
        } else if(category == 'C') {
            sp = mp - (mp * 0.20f);
            
        } else if(category == 'D') {
            
            
            sp = mp - (mp * 0.10f);
        } else {
            
            sp = mp;
            
            System.out.println("Invalid category!");
        }

        System.out.println("Selling Price = " + sp);
    }
}