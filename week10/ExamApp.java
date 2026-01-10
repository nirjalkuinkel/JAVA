package week10;


/**
 * Write a description of class j here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp {
    public static void main(String[] args) {

        ScienceStudent s1 = new ScienceStudent(1, "Sijan", 35);
        ManagementStudent m1 = new ManagementStudent(2, "Umanga", 45);

        System.out.println(s1);
        System.out.println("Result: " + s1.calculateResult());
        System.out.println("Result grace: " + s1.calculateResult(5));

        System.out.println();

        System.out.println(m1);
        System.out.println("Result: " + m1.calculateResult());
        System.out.println("Result grace: " + m1.calculateResult(3));
    }
}