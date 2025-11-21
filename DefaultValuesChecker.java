
/**
 * Write a description of class default_value_checker here.
 *
 * @author (Nirjal)
 * @version (a version number or a date)
 */
public class DefaultValuesChecker {
    
    byte b;
    short s;
    int i;
    long l;

    float f;
    double d;

    char c;
    boolean bool;

    public static void main(String[] args) {
        DefaultValuesChecker obj = new DefaultValuesChecker();

        System.out.println("Default byte: " + obj.b);
        System.out.println("Default short: " + obj.s);
        System.out.println("Default int: " + obj.i);
        System.out.println("Default long: " + obj.l);
        System.out.println("Default float: " + obj.f);
        System.out.println("Default double: " + obj.d);
        System.out.println("Default char: '" + obj.c + "'");
        System.out.println("Default boolean: " + obj.bool);
    }
}
