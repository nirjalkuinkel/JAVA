package week7.workshop;

public class Laptop
{
    String Brand;
    int RAM;
    double Price;
    
    public Laptop(String brand,int RAM, double price)
    {
        this.Brand=brand;
        this.RAM=RAM;
        this.Price=price;
    }
    
        void check()
    {
        if (RAM>8){
        System.out.println("brand" + Brand);
    }
    }
}