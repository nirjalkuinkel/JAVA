public class W6q6 {
    public static void main(String[] N) {

        int[][] marks = {
            {80, 75},
            {90, 85}
        };

        for(int i = 0; i < 2; i++) {
            System.out.print("Student " + (i+1) + ": ");
            int total = 0;

            for(int j = 0; j < 2; j++) {
                System.out.print(marks[i][j] + " ");
                total = total + marks[i][j];
            }

            System.out.print(" | Total = " + total);
            System.out.println();
        }
    }
}
