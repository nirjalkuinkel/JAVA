import java.util.Scanner;

public class W6q4 {
    public static void main(String[] N) {
        Scanner sc = new Scanner(System.in);

        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        for(int i = 0; i < 4; i++) {
            System.out.println((i+1) + ". " + districts[i]);
        }

        System.out.print("Enter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] newDist = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter district name: ");
            newDist[i] = sc.nextLine();
        }

        System.out.println("Updated District List:");
        for(int i = 0; i < n; i++) {
            System.out.println((i+1) + ". " + newDist[i]);
        }
    }
}
