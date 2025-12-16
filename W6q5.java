import java.util.Scanner;

public class W6q5 {
    public static void main(String[] N) {
        Scanner sc = new Scanner(System.in);
        int[] scores = {10,20,30,40,50};

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        int sum = 0;
        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("Sum = " +sum);
        double avg = sum / 5.0;
        System.out.println("Average = " +avg);
        int high = scores[0];
        int low = scores[0];
        for(int i = 1; i < scores.length; i++) {
            if(scores[i] > high) {
                high = scores[i];
            }
            if(scores[i] < low) {
                low = scores[i];
            }
        }
        System.out.println("Highest = "+high);
        System.out.println("Lowest = "+low);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] newScores = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i+1) + ": ");
            newScores[i] = sc.nextInt();
        }
        System.out.println("Updated Score Array:");
        for(int i = 0; i < n; i++) {
            System.out.println(newScores[i]);
        }
    }
}
