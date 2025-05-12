package hw5.ex1;

public class Profile {

    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo info) {
        this.shippingInfo = info;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    
}
