
/**
 * Write a description of class literal_practice here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class LiteralPractice {
    public static void main(String[] args) {

        long longNumber = 9876543210L;  // requires L suffix
        float floatNumber = 12.34f;     // requires f suffix
        char copyright = '\u00A9';      // Unicode literal

        System.out.println("Long number: " + longNumber);
        System.out.println("Float number: " + floatNumber);
        System.out.println("Unicode char: " + copyright);
    }
}
