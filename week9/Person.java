package week9;


/**
 * Write a description of class z here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // id,name,basicSalary,static String collegeName
    protected int id;
    protected String name;
    protected double basicSalary;
    protected static String collegeName="Islington College";
    
    public Person(int id, String name, double basicSalary)
    {
        this.id= id;
        this.name= name;
        this.basicSalary= basicSalary;
    }
    
    public double calculateAnnualSalary()
    {
        return this.basicSalary * 12;
    }
}