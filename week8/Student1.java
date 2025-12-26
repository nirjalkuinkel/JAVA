package week8;


/**
 * Write a description of class mm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student1{

    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    static String collegeName = "islington";

    // parameterized constructor
    public Student1(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // method to display student details
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("College: " + collegeName);
    }
}
