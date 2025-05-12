package hw4.ex1;

public class Flour extends PopularGrocery{

    public Flour(int quantity, int discountThreshold, int popularityLevel) {
    
        super(popularityLevel);
        this.quantity = quantity;
        this.householdLimit = 15;
        this.discountThreshold = discountThreshold;
    }

    @Override
    public int getBulkDiscout() {
        if (this.quantity >= this.discountThreshold) {
            return 5;
        } else {
            return 0;
        }
    }
    
}
