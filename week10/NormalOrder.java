package week10;


/**
 * Write a description of class n here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order {

    public NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount(); // no extra charge
    }
    public double calculateFinalAmount(double discountAmount) {
        return getAmount() - discountAmount;
    }
}
