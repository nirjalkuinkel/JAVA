
/**
 * Write a description of class workshop_7 here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class workshop_7
{
    public static void main(String[] args) {

        String med1 = "Paracetamol";
        double price1 = 5.0;
        int qty1 = 120;
        boolean pres1 = false;

        String med2 = "Amoxicillin";
        double price2 = 12.5;
        int qty2 = 80;
        boolean pres2 = true;
        
// double le decimal, int le normal value aani boolean le T & F

        System.out.println("=== AUSHADHI PASAL INVENTORY REPORT ===");
        System.out.println("---------------------------------------");

        System.out.println("Medicine: " + med1);
        System.out.println("Price per tablet: NPR " + price1);
        System.out.println("Quantity: " + qty1);
        System.out.println("Prescription Required: " + pres1);
        System.out.println();

        System.out.println("Medicine: " + med2);
        System.out.println("Price per tablet: NPR " + price2);
        System.out.println("Quantity: " + qty2);
        System.out.println("Prescription Required: " + pres2);
    }
}
