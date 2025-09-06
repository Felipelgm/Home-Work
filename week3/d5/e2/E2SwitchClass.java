package week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = input.nextInt();

        switch (mealType) {
            case 1 :
                System.out.println("Breakfast costs $5.00");
                break;
            case 2 :
                System.out.println("Lunch costs $10,00");
                break;
            case 3 :
                System.out.println("Dinner costs $15.00");
                break;
            default:
                System.out.println("Invalid meal type entered");

                input.close();
        }


        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt and capture meal type
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = scanner.nextInt();

        // Step 3: Calculate Price using Switch
        double price = 0.0;
        boolean valid = true;

        switch (mealType) {
            case 1:
                price = 5.0;
                break;
            case 2:
                price = 10.0;
                break;
            case 3:
                price = 15.0;
                break;
            default:
                valid = false;
                System.out.println("Invalid meal type entered");
                break;
        }

        // Step 4: Print the price if input was valid
        if (valid) {
            System.out.println("The price of your meal is $" + price);
        }

    }
}
