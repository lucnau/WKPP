package hw5.ex1;

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
    
    
}
