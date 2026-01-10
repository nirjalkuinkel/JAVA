package week9;


/**
 * Write a description of class z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee {
    int workingDays;

    
    ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    
    double calculateTotalSalary() {
        return basicSalary * workingDays;
    }

    
    @Override
    void displayEmployee() {
        super.displayEmployee();
        System.out.println("Working Days: " + workingDays);
    }
}