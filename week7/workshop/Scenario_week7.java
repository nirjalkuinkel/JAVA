package week7.workshop;


/**
 * Write a description of class senario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario_week7 {
    public static void main(String[] N) {

        String[] categories = {"Fiction","Nepali"};

        String[][] titles =new String[2][1];
        double[][] prices =new double[2][1];
        titles[0][0] ="Asahamati";
        prices[0][0] = 750.0;
        titles[1][0] = "Seto Dharti";
        prices[1][0] = 550.0;

        for(int i = 0; i < 2; i++) {

            System.out.println("Category: "+categories[i]);

            for(int j = 0; j < 1; j++) {
                System.out.println("Title: "+titles[i][j]);
                System.out.printf("Price: %.2f\n",prices[i][j]);
            }

            System.out.println();
        }
    }
}
