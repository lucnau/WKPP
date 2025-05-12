package hw4.ex1;

public class Milk extends PopularGrocery {
    public Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.householdLimit = 20;
        this.discountThreshold = discountThreshold;
    }


    @Override
    public int getBulkDiscout() {
        if (this.quantity > this.discountThreshold) {
            return 12;
        } else {
            return 0;
        }
    }
    
}
