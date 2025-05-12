package hw5.ex3;

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

    public String getProfilesShippingCity() {
        return shippingInfo.getCity();
    }

    public int getProfilesShippingZip() {
        return shippingInfo.getZip();
    }

    public String getProfilesShippingCountry() {
        return shippingInfo.getCountry();
    }

    public void setProfilesShippingCity(String city) {
        shippingInfo.setCity(city);
    }

    public void setProfilesShippingZip(int zip) {
        shippingInfo.setZip(zip);
    }

    public void setProfilesShippingCountry(String country) {
        shippingInfo.setCountry(country);
    }

    

    
}
