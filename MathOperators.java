
/**
 * Write a description of class MathOperators here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class MathOperators
{ 
    public static void main(String[] args){
        System.out.println("---Arthmetic Operators---");
        
        int a = 20;
        int b = 10;
        
        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));
        
        System.out.println("\n---Unary Operators---");
        
        int x = 5;
        int y = 3;
        
        System.out.println("Post-increment: x++ = "+ (x++));
        System.out.println("Pre-increment: y++ = "+ y);
        
        System.out.println("\n---Assignment---");
        int c = 6;
        int d = 7;
        System.out.println("Value of c : "+c);
        System.out.println("Value of d : "+d);
        
        System.out.println("\n---Relational Operators---");
        int z = 2;
        int l = 4;
        System.out.println("z > x = " + (z > l));
        System.out.println("z == l = " + (z == l));
        
        System.out.println("\n---Logical Operations---");
        boolean p = true, q = false;
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));
        
        System.out.println("\n---Ternary Operation---");
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is " + result);
        
        
        
        
    }
}