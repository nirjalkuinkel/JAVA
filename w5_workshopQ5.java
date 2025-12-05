
/**
 * Write a description of class w5_workshopQ6 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class w5_workshopQ5
{
    public static void main(String[] args) {
        
        int i;
        int j;
        int b;

        for(i = 1; i <= 5; i++) {

            for(b = 5; b> i; b--) {
                System.out.print("");
            }

            for(j = 1; j <= i; j++) {
                System.out.print(j+"");
            }

            System.out.println();
        }
    }
}

