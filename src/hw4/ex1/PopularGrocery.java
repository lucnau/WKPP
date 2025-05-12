package hw4.ex1;

public abstract class PopularGrocery extends GroceryItem {
    
    protected int popularityLevel;
    protected int quantity;

    public PopularGrocery(int popularityLevel) {
        this.isPopular = true;
        this.popularityLevel = popularityLevel;
        this.quantity = 0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean showWarning() {
        return this.quantity > this.householdLimit;
    }
    
}
