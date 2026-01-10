package week10;


/**
 * Write a description of class n here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp {
    public static void main(String[] args) {

        NormalOrder n1 = new NormalOrder(1, "umanga", 3000);
        PremiumOrder p1 = new PremiumOrder(2, "sensei", 5000);

        System.out.println(n1);
        System.out.println("Normal Final Amount: " + n1.calculateFinalAmount());
        System.out.println("Normal Final Amount (after discount): " + n1.calculateFinalAmount(300));

        System.out.println();

        System.out.println(p1);
        System.out.println("Premium Final Amount: " + p1.calculateFinalAmount());
        System.out.println("Premium Final Amount (after discount): " + p1.calculateFinalAmount(500));
    }
}
