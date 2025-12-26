package week8;


/**
 * Write a description of class m here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class BillDisplay {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("Rahul",150);
        System.out.println("Consumer Name: " + bill.getconsumerName());
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Total Bill: ₹"+ bill.calculateBill());
    }
}   