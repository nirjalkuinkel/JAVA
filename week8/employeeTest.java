package week8;


/**
 * Write a description of class zz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class employeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(30000);
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
    }
}   
