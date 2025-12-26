package week8;
public class main{
    
    public static void main(String [] N){
        
        calculator calc= new calculator();
        
        calc.displayInfo();
        calc.add(10,20);
        calc.add(30,40);
        calc.add(50,60);
        
        calc.getFixedNumber();
        int fixNum = calc.getFixedNumber();
        System.out.println("The fix number is: "+(fixNum));
        
        int multi=calc.multiply(10,20);
        int multi1=calc.multiply(30,40);
        
        System.out.println("The multiplication of first two numbers are: "+ multi);
    
    
    }
    
}