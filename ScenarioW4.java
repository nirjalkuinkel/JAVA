
import java.util.Scanner;

public class ScenarioW4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String ageGroup, lang;
        
        char student, festival;
        

        int price = 0;
        

        System.out.print("Enter age group (child/adult/senior): ");
        ageGroup = sc.next();

        if(ageGroup.equals("child")) {
            
            price = 150;
            
        } else if(ageGroup.equals("adult")) {
            price = 250;
            
            
        } else if(ageGroup.equals("senior")) {
            price = 200;
        }

        System.out.print("Enter movie language (nepali/hindi/english): ");
        lang = sc.next();
        

        if(lang.equals("hindi")) {
            
            price = price + 50;
        } else if(lang.equals("english")) {
            
            price = price + 100;
            
        }

        System.out.print("Are you a student? (y/n): ");
        
        student = sc.next().charAt(0);
        

        if(student == 'y') {
            price = price - (price * 20 / 100);
            
        }

        System.out.print("Is it festival day? (y/n): ");
        festival = sc.next().charAt(0);
        

        if(festival == 'y') {
            
            price = price - (price *15 / 100);
        }

        System.out.println("Final Ticket Price = Rs. " + price);
        
    }
    
    
}