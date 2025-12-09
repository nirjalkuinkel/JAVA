import java.util.Scanner;

public class Rickshaw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseFare = 50;
        double perKm = 15;
        double perMin = 2;

        System.out.println("Enter distance in km:");
        double distance = sc.nextDouble();

        System.out.println("Enter time in minutes:");
        double time = sc.nextDouble();

        System.out.println("Is the customer local? (y/n)");
        char isLocal = sc.next().charAt(0);

        System.out.println("Is it night time? (y/n)");
        char isNight = sc.next().charAt(0);


        double fare = baseFare + (perKm * distance) + (perMin * time);

 
        double discount = 0;
        if (isLocal == 'y' && distance >= 10) {
            discount = fare * 0.10;    // 10% discount deko
        }

        fare = fare - discount;

        double surcharge = (isNight == 'y') ? fare * 0.20 : 0;

        fare = fare + surcharge;

        System.out.println("Final Fare: Rs. " + fare);
    }
}