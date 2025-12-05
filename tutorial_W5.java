import java.util.*;

/**
 * Write a description of class tutorial_5 here.
 *
 * @author (Nirjal)
 * @version (a version number or a date)
 */
public class tutorial_W5

{

public static void main(String[] args){
    
    Scanner input= new Scanner(System.in);
    System.out.println("ask for n number: ");
    int n= input.nextInt();
    
    
    
   int sum= 0;
   for (int i=1; i<=10; i++)
   {
       sum=sum + i;
       System.out.println(sum);
   }
    
    System.out.println("TOTAL SUM: "+ sum);
    
    
    
    
    int z=1;
    while(z<=5)
    {
        System.out.println(z);
        z= z+2;
    }
    
    int p;
    p=input.nextInt();
    
    if(p==5)
    {
        System.out.println("OoooO");
}
    else
    System.out.println("N/A");
    
    
}


}