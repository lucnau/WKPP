package UE1;
import java.util.Scanner;

public class PizzaDeluxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] toppings = {"Salami", "Pineappele", "Cheese", "Spinach", "Garlic"};

        Double[] prices = {1.0, 1.5, 1.0, 0.0, 0.5};   

        System.err.println("Welcome to Pizza Deluxe!");

        for (int i = 0; i < toppings.length; i++) {
            System.out.println((i + 1) + ". " + toppings[i] + " - $" + prices[i]);
        }

        System.out.println("Choose your Toppings (e.g. 1 3 4)");
        String input = scanner.nextLine();
        String[] choices = input.split(" ");

        boolean[] selected = new boolean[toppings.length];
        double totalPrice = 0.0;

        for (String choice : choices) {
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < toppings.length) {
                selected[index] = true;
                totalPrice += prices[index];
            } else {
                System.out.println("Invalid choice: " + choice);
            }
        }
        System.out.println("You have selected the following toppings:");
        for (int i = 0; i < selected.length; i++) {
            if (selected[i]) {
                System.out.println(toppings[i] + " - $" + prices[i]);
            }
        }
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Thank you for ordering with Pizza Deluxe!");

    }
}
