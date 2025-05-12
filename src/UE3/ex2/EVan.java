package UE3.ex2;

public class EVan extends Vehicle implements Electrified {
    // TODO: add attributes , constants and implement required methods
    protected double getBatteryLevel;
    protected double consumption = 0.25; // kWh/km
    private double MAX_BATTERY_KWH = 120.0; // in kWh
    private double batteryCapacity; // in kWh


    public EVan(String id, double maxLoad, double batteryCapacity) {
        super(id, maxLoad);
        // TODO: initialise attributes
        this.getBatteryLevel = batteryCapacity;
        
    }
    // TODO: implement Vehicle + Electrified methods

    @Override
    public double getRange() {
        return getBatteryLevel / consumption; // in km
    }
    @Override
    public double fuelNeeded(double distance) {
        return distance * consumption; // in kWh
    }
    

    public void charge(double kWh) {
        if (kWh < 0) {
            throw new IllegalArgumentException("Cannot charge negative amount of energy.");
        }
        if (getBatteryLevel + kWh > MAX_BATTERY_KWH) {
            getBatteryLevel = MAX_BATTERY_KWH;
        }
        getBatteryLevel += kWh;
    }
    
    public double getBatteryLevel() {
        return getBatteryLevel;
    }
    
    public boolean canReach(double distance) {
        return getRange() >= distance;
    }
    @Override
    public String toString() {
        return "EVan{" +
                "id='" + id + '\'' +
                ", maxLoad=" + maxLoad +
                ", getBatteryLevel=" + getBatteryLevel +
                ", consumption=" + consumption +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public String getMaxLoad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMaxLoad'");
    }


}
