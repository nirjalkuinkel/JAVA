package week7;
public class Main{
    public static void main(String [] N){   
        Student n1= new Student();
        n1.collegeId="np014sp10";
        n1.name="Umanga";
        n1.age= 50;
        
        System.out.println(n1.collegeId);
        System.out.println(n1.name);
        System.out.println(n1.age);
        
        
        
        Student n2= new Student();
        n2.collegeId="np420sp07";
        n2.name="Sensei";
        n2.age= 100;
        
        System.out.println(n2.collegeId);
        System.out.println(n2.name);
        System.out.println(n2.age);
        
        Student n3= new Student();
        n3.name="SAGAR";
        n3.laugh();
        
        car c1= new car();
        c1.Brand="helicopter";
        c1.Model="M5";
        c1.Color="cyan";
        
    }  
}