package week8;


/**
 * Write a description of class zz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public ShoppingCart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double calculateTotal() {
        return itemPrice * quantity;
    }

    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        return total - (total * discountPercent / 100);
    }

    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + calculateTotal());
    }
}   