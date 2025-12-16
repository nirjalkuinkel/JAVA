import java.util.Scanner;
public class W6q2 {
     public static void main(String[] N) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Saroj", "Sushant", "Ujjwal", "Sijan", "Sandesh"};
        for(int i = 0; i <names.length; i++) {
            
            
            System.out.println(names[i]);
        }
        System.out.println("Name at index 2: "+names[2]);
        names[4] = "Umanga Sir";
        System.out.println("Updated index 4: "+names[4]);
        System.out.print("Enter new name to replace index 3: ");
        names[3] = sc.nextLine();
        System.out.println("Finnal Updated Array:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

