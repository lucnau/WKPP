package hw5.ex1;

    public class EComController {
        public static void main( String [] args) {
            ShippingInfo info =
            new ShippingInfo (" Munich", 80331 , " Germany ");
            Profile profile = new Profile (info );
            Customer customer = new Customer (profile , 123);
            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCity());
            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCountry());
            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getZip());

            System.out.println(" Customer ID: " + customer.getId());

            customer.getProfile().getShippingInfo().setCity("Kölle");
            customer.getProfile().getShippingInfo().setZip(50939);

            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCity());
            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getCountry());
            System.out.println(" Shipping to: " + customer.getProfile().getShippingInfo().getZip());
            


        }


        /*
         * Number 2:
         * 
         * No, this code is not an example of Dependency Injection.
         * 
         * Dependency Injection (DI) is a design pattern in which an object receives other objects it depends on, rather than creating them internally.
         * The purpose of DI is to reduce tight coupling between components and increase flexibility and testability.
         * 
         * Each object is manually instantiated inside the main() method. This is a form of manual composition, not dependency injection.

         * In Dependency Injection, a framework or external configuration (e.g., Spring in Java) typically injects the dependencies 
         * (like ShippingInfo, Profile, etc.) into a class rather than letting the class create them or be manually assembled.
         * 
         * 
         * - No container is injecting the dependencies.
         * - No abstraction or inversion of control is in place.
         * - Object creation is tightly coupled to business logic.
         * 
         * 
         * 
         * 
         * 
         * 
         * Number 3:
         * 
         * Yes, the code breaks the Law of Demeter (LoD).
         * 
         * We're chaining multiple method calls:
         * - customer → getProfile() → getShippingInfo() → getCity()
         * 
         * 
         * A classic violation of LoD, because the main method has to know the internal structure of Customer, Profile, and ShippingInfo.
         * 
         * This makes the code brittle — if any part of the chain changes (say, Profile no longer holds ShippingInfo), THIS LINE BREAKS! 
         * 
         * Fix:
         * Getters and Setters for things like city, zip, and country for a certain shipping Info can be within the Profile class
         * 
         * 
         */


    }
