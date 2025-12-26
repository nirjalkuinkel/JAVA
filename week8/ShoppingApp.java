package week8;


/**
 * Write a description of class z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Laptop", 1000.0, 2);

        cart.displayCart();
        System.out.println("Discounted Total (10%): $" + cart.calculateDiscountedTotal(10));
        
        cart.setQuantity(3);
        System.out.println("Updated Quantity: " + cart.getQuantity());
        System.out.println("New Total: $" + cart.calculateTotal());
    }
}   