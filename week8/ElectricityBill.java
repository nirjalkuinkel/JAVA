package week8;


/**
 * Write a description of class e here.
 *
 * @author (nirjal)
 * @version (a version number or a date)
 */
public class ElectricityBill {
    private String consumerName;
    private int unitsConsumed;

    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    public String getconsumerName()
    {
        return consumerName;
    }
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        if (unitsConsumed >= 0) {
            this.unitsConsumed = unitsConsumed;
        }
    }
    
    public double calculateBill() {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 5.0;
        } else {
            return (100 * 5.0) + ((unitsConsumed - 100) * 8.0);
        }
    }
}   