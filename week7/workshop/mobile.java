package week7.workshop;
public class mobile{
    
    int price;
    String brand;
    
void isAffordable()
    {
        if (price<20000){
            System.out.println(brand + "'s price is less than 20000");
        }
    }
}