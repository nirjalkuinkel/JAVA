package week10;


/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student {

    public ManagementStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }
    @Override
    public String calculateResult() {
        return super.calculateResult();
    }
    public String calculateResult(int graceMarks) {
        double totalMarks = getMarks() + graceMarks;

        if(totalMarks >= 40) {
            return "Pass (with grace)";
        } else {
            return "Fail";
        }
    }
}
