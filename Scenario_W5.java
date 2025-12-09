import java.util.Scanner;

public class Scenario_W5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char again='N';

        while(again=='N') {
            double P;   // depo
            double rate;    //a ko lagi
            double A;
            double monthlyRate;
            double years;
            double months;
            double fee;
            double finalAmount;
            

            System.out.print("ENTER DEPOSIT AMOUNT (min 1000):");
            P=sc.nextDouble();

            System.out.print("ENTER ANNUAL INTREST (8-12):");
            rate=sc.nextDouble();

            System.out.print("ENTER TIME IN YEARS (max 5):");
            years=sc.nextDouble();
            monthlyRate=rate/12/100;
            months=years*12;

            A=P*Math.pow(1+monthlyRate,months);
            fee=A*0.005;
            finalAmount=A-fee;
            System.out.println("Maturity Amount(before fee):"+A);
            System.out.println("Processing Fee:"+fee);
            System.out.println("Final Amount:"+finalAmount);

            System.out.print("Calculate again? (YES or no)");
            again = sc.next().charAt(0);
            
            
        }
        
        
    }
    
    
}