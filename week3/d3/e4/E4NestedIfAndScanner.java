package week3.d3.e4;

import java.util.Scanner;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {



// Coffee Drink Recommendation Checker - Step-by-Step Guide
//
// Step 1: Create a Scanner object.
        Scanner input=new Scanner(System.in);

// Step 2: Ask the user for their coffee budget.
//   - Use System.out.println to display: "Please enter your coffee budget:"
        System.out.println("Please enter your coffee budget:");
//   - Read the budget using input.nextDouble() and store it in a variable 'budget' of type double.
        double budget= input.nextDouble();
//
// Step 3: Ask the user for their taste preference.
//   - "Do you prefer your coffee strong?"
        System.out.println("Do you prefer your coffee strong?");
//   - Read the preference using input.next() and store it in a variable 'preference' of type String.
        String preference= input.next();
//
// Step 4: Recommend a coffee drink based on the budget and preference.
//   - First, check if 'budget' is greater than or equal to 5.00.
        if (budget>=5.00){
            if (preference.equalsIgnoreCase("strong")){
                System.out.println("You should try an Espresso");
            }else{
                System.out.println("You should try a Latte");
            }
            }else {
                    System.out.println("You might enjoy a simple cup of Instant Coffee");
                }
        input.close();
            }
        }
//       - If true:
//           - Check if 'preference' equals "strong".
//               - If yes, print: "You should try an Espresso!"
//               - Else, print: "You should try a Latte!"
//       - Else (if budget is less than 5.00):
//           - Print: "You might enjoy a simple cup of Instant Coffee!"
//
// Step 5: Close the Scanner object after input is complete.
//   - Write: input.close();
//
// Reminder:
//   - Follow these steps and try writing the code yourself. Understand each part rather than copying everything directly.



