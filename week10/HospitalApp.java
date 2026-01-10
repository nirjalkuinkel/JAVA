package week10;


/**
 * Write a description of class l here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class HospitalApp {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Umanga Prasad", "Cardiologist", 20000);
        Nurse n1 = new Nurse(2, "Umanga mam", "Night", 5000);

        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary());
        System.out.println("Doctor Salary (with emergencies): " + d1.calculateSalary(3));

        System.out.println();

        System.out.println(n1);
        System.out.println("Nurse Salary: " + n1.calculateSalary());
    }
}