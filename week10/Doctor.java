package week10;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person {

    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, String specialization, double consultationFee) {
        super(id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + consultationFee;
    }
    public double calculateSalary(int emergencyCases) {
        return calculateSalary() + (emergencyCases * 500);
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization +
               ", Fee: " + consultationFee;
    }
}

