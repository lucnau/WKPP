package hw5.ex3;

public class Customer {

    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) {
        this.profile = profile;
        this.id = id;
    }


    public Profile getProfile() {
        return profile;
    }

    public int getId() {
        return id;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCustomerShippingCity() {
        return profile.getProfilesShippingCity();
    }

    public int getCustomerShippingZip() {
        return profile.getProfilesShippingZip();
    }

    public String getCustomerShippingCountry() {
        return profile.getProfilesShippingCountry();
    }

    public void setCustomerShippingCity(String city) {
        profile.setProfilesShippingCity(city);
    }

    public void setCustomerShippingZip(int zip) {
        profile.setProfilesShippingZip(zip);
    }

    public void setCustomerShippingCountry(String country) {
        profile.setProfilesShippingCountry(country);
    }
    
    
}
