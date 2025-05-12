package UE3.ex2;

public class FleetDemo {
    public static void main(String[] args) {
    // TODO: create a Truck and an EVan, test methods as described
    

        Truck truck = new Truck("Truck1", 1000, 200); // id, maxLoad, tankCapacity
        EVan eVan = new EVan("EVan1", 800, 120); // id, maxLoad, batteryCapacity
        
        // Test Truck methods
        System.out.println("Truck ID: " + truck.getId());
        System.out.println("Truck Max Load: " + truck.getMaxLoad());
        System.out.println("Truck Fuel Level: " + truck.getFuelLevel() + " liters");
        System.out.println("Truck Range: " + truck.getRange() + " km");
        
        // Test EVan methods
        System.out.println("EVan ID: " + eVan.getId());
        System.out.println("EVan Max Load: " + eVan.getMaxLoad());
        System.out.println("EVan Battery Level: " + eVan.getBatteryLevel() + " kWh");
        System.out.println("EVan Range: " + eVan.getRange() + " km");


        // Test Truck refuel method
        truck.refuel(50);
        System.out.println("Truck Fuel Level after refueling: " + truck.getFuelLevel() + " liters");
        
        // Test EVan charge method
        eVan.charge(30);
        System.out.println("EVan Battery Level after charging: " + eVan.getBatteryLevel() + " kWh");
        
        // Test Truck canReach method
        double distance = 100;
        System.out.println("Truck can reach " + distance + " km: " + truck.canReach(distance));
        
        // Test EVan canReach method
        System.out.println("EVan can reach " + distance + " km: " + eVan.canReach(distance));

        
    }
        
}

