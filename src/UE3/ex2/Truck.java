package UE3.ex2;
 
    
    public class Truck extends Vehicle implements Refuelable {
        // TODO: add attributes , constants and implement required methods

        protected double fuelLevel; // in liters
        protected double consumption = 0.3; // liters/km
        private double tankCapacity; // in liters


        public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        // TODO: initialise attributes
        this.fuelLevel = tankCapacity;
        }
        @Override
        public double getRange() {
            return fuelLevel / consumption; // in km
        }
        @Override
        public double fuelNeeded(double distance) {
            return distance * consumption; // in liters
        }
        @Override
        public void refuel(double liters) {
            if (liters < 0) {
                throw new IllegalArgumentException("Cannot refuel negative amount of fuel.");
            }
            if (fuelLevel + liters > tankCapacity) {
                fuelLevel = tankCapacity;
            }
            fuelLevel += liters;
        }

        @Override
        public double getFuelLevel() {
            return fuelLevel;
        }
        @Override
        public boolean canReach(double distance) {
            return getRange() >= distance;
        }
        @Override
        public String toString() {
            return "Truck{" +
                    "id='" + id + '\'' +
                    ", maxLoad=" + maxLoad +
                    ", fuelLevel=" + fuelLevel +
                    ", consumption=" + consumption +
                    ", tankCapacity=" + tankCapacity +
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
    
    
    
    
    // TODO: implement Vehicle + Refuelable methods

