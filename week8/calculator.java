package week8;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
 public void displayInfo()
 {
    System.out.println("Welcome to calculator app");
    }


public void add(int a, int b)
{
 System.out.println("The sum of two numbers are: "+ (a+b));   
}

//return type + no parameters

public int getFixedNumber()
{
    return 10;

}

public int multiply(int c, int d)
{
    int mul = c*d;
    return mul;
}

public static int square(int a){
    return a*a;
}

}