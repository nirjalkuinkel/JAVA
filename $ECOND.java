
/**
 * Write a description of class $ECOND here.
 *
 * @author (nirjal)
 * @version (0.2)
 */
public class $ECOND
{ 
    int qty;
    static int rrt;
    
    public static void main(String[] args){
        
        int age=18; 
        
        System.out.println(age);
        System.out.println($ECOND.rrt);
        
        // implicit typecasting = sano bata thulo value store garni
        
        double dtr= age;
        System.out.println(dtr);
        
        //Explicit Typecasting = thulo bata sano value store garni
        
        double db= 10.09;
        int itr= (int)db;
        System.out.println(itr);
        
        //Exception in arthmetic
        
        byte b1 = 10;
        byte b2 = 11;
        
        byte sum = (byte)(b1+b2);
        
        //short, char
        
        
        //Minimum, maximum, size, bytes
        
        
        System.out.println(Byte.MAX_VALUE); //Maximum value
        System.out.println(Byte.MIN_VALUE); //Minimum value
        System.out.println(Byte.SIZE); //BITS
        System.out.println(Byte.BYTES); //BYTES
        
        //Escape Sequence
        
        System.out.println("Hello\nWorld");
        System.out.println("Hamro\tNepal");
        System.out.println("She said \" Hi \" ");
        
        //Unicode Escape Sequence
        
        System.out.println("\u2764");
        
        
    }
}