package UE3;
import java.lang.Character;

public class Wrapper {
    public static void main(String[] args) {
        
        char[] values = {'1', 'a', '3', 'z', '9'};

        // Task A: Count number of digits in the array only using primitive operations

        int digitCount = 0;
        for (char value : values) {
            if (value >= '0' && value <= '9') {
                digitCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);


        // Task B: Count number of digits using isDigit method
        int digitCountUsingMethod = 0;
        for (char value : values) {
            if (Character.isDigit(value)) {
                digitCountUsingMethod++;
            }
        }
        System.out.println("Number of digits using isDigit method: " + digitCountUsingMethod);





        int[] nums = {10, 0, -4, 20, 5};

        //Task C1: Find the maximum number in the array using primitive operations
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        System.out.println("Maximum number using primitive operations: " + maxNum);

        //Task C2: Find the maximum number in the array using Math.max method
        int maxNumUsingMath = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxNumUsingMath = Math.max(maxNumUsingMath, nums[i]);
        }
        System.out.println("Maximum number using Math.max method: " + maxNumUsingMath);


        //Task D: Find the maximum number using Integer.compare method
        int maxNumUsingMethod = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxNumUsingMethod = Integer.compare(maxNumUsingMethod, nums[i]) > 0 ? maxNumUsingMethod : nums[i];
        }
        System.out.println("Maximum number using Integer.compare method: " + maxNumUsingMethod);


        // Ich hab das alles jetzt nicht in Methoden gemacht, weil ich mich verlesen habe haha
        // Hier ist nur zu bedenken, dass man die am Anfang einfach mit 'int max = Integer.MIN_VALUE;' initialisieren kann für nums.length == 0


    }
}