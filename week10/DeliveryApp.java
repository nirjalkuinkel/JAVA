package week10;


/**
 * Write a description of class z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp {
    public static void main(String[] args) {

        BikeDelivery b1 = new BikeDelivery(1, "umanga", 8000);
        CarDelivery c1 = new CarDelivery(2, "Shyam", 10000);

        System.out.println(b1);
        System.out.println("Bike Payment: " + b1.calculatePayment());
        System.out.println("Bike Payment (with extra orders): " + b1.calculatePayment(5));

        System.out.println();

        System.out.println(c1);
        System.out.println("Car Payment: " + c1.calculatePayment());
        System.out.println("Car Payment (with extra orders): " + c1.calculatePayment(3));
    }
}
