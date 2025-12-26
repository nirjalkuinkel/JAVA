package week7.workshop;
public class main{
    
    public static void main(String[] N){
        
      
        Book b1=new Book();
      b1.title = "sensei";
      b1.price = 299;
      b1.author = "Umanga sir";
      
      System.out.println(b1.title);
      System.out.println(b1.price);
      System.out.println(b1.author);
      
        Book b2=new Book();
        b2.title="hello";
        b2.price=399;
        b2.author="you";
        
         System.out.println(b2.title);
      System.out.println(b2.price);
      System.out.println(b2.author);
      
        
        Book b3=new Book();
        b3.title="coffee with u";
        b3.price=499;
        b3.author="sir umanga";
        
         System.out.println(b3.title);
      System.out.println(b3.price);
      System.out.println(b3.author);
      

        //Question2
        Rectangle r1=new Rectangle();
        r1.length=5;
        r1.breadth=30;
        
        System.out.println(r1.length);
        System.out.println(r1.breadth);
        
        r1.area=r1.length*r1.breadth;
        System.out.println(r1.area);
        
        Rectangle r2=new Rectangle();
        r2.length=8;
        r2.breadth=10;
        
        System.out.println(r2.length);
        System.out.println(r2.breadth);
        
        r2.area=r2.length*r2.breadth;
        System.out.println(r2.area);
        
        //question3
        
        Employee e1=new Employee();
        e1.employeeId=1;
        e1.name="Sijan";
        e1.salary=80000;
        
        System.out.println(e1.employeeId);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        
        Employee e2=new Employee();
        e2.employeeId=2;
        e2.name="umanga";
        e2.salary=90000;
        
        System.out.println(e2.employeeId);
        System.out.println(e2.name);
        System.out.println(e2.salary);
        
        Employee e3=new Employee();
        e3.employeeId=3;
        e3.name="Superman";
        e3.salary=50000;
        
        System.out.println(e3.employeeId);
        System.out.println(e3.name);
        System.out.println(e3.salary);
        
        
        if(e1.salary>e2.salary && e1.salary>e3.salary)
        {
            System.out.println(e1.employeeId);
            System.out.println(e1.name);
            System.out.println(e1.salary);
        }
        else if(e2.salary>e1.salary && e2.salary>e3.salary)
        {
            System.out.println(e2.employeeId);
            System.out.println(e2.name);
            System.out.println(e2.salary);
        }
        
        else
        {
            System.out.println(e3.employeeId);
            System.out.println(e3.name);
            System.out.println(e3.salary);
        }


       Laptop l1=new Laptop("Acer",8,120000 );
        Laptop l2=new Laptop("Asus",16,200000 );
        Laptop l3=new Laptop("Lenovo",32,270000 );
     
        l1.check();
        
        //Q5
        mobile m1=new mobile();
        m1.brand="Redmi";
        m1.price=10000;
        
        mobile m2=new mobile();
        m2.brand="Realme";
        m2.price=50000;
        
        mobile m3=new mobile();
        m3.brand="Poco";
        m3.price=15000;
        
        m1.isAffordable();
        m2.isAffordable();
        m3.isAffordable();
        
         sub1 = 1;
        
    }
}