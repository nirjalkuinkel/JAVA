package week8;


/**
 * Write a description of class z here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class Atm {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000.0, "Alice");

        System.out.println("Balance: " + account.getBalance());
        account.deposit(2000);
        System.out.println("After deposit: " + account.getBalance());
        boolean success = account.withdraw(1000);
        System.out.println("Withdrawal successful: " + success);
        System.out.println("Final balance: " + account.getBalance());
    }
}   