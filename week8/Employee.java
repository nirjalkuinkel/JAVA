package week8;


/**
 * Write a description of class employeeeeee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee {
    private double basicSalary;


    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
    public double calculateGrossSalary() {
        return basicSalary * 1.20; 
    }

    
    public double getBasicSalary() {
        return basicSalary;
    }
}   

