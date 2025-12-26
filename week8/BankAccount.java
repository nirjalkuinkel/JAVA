package week8;


/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    
    public BankAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}   