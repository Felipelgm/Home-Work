package week3.d4.e2;

import java.util.Scanner;

public class E2LogicalOperators {
    public static void main(String[] args) {

// Personal Budgeting Helper - Step-by-Step Guide
//
// Step 1: Create a Scanner object.
        Scanner input=new Scanner(System.in);

// Step 2: Capture Monthly Expenses.
//   - Ask the user for their monthly rent expense and store it in a variable 'rentExpense'.
//   - Ask for the monthly food expense and store it in 'foodExpense'.
//   - Ask for the monthly transportation expense and store it in 'transportationExpense'.
//   - Ask for the monthly entertainment expense and store it in 'entertainmentExpense'.
        System.out.println("Please enter your monthly rent expense");
        double rentExpense=input.nextDouble();
        System.out.println("Please enter your monthly food expense");
        double foodExpense=input.nextDouble();
        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense= input.nextDouble();
        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense= input.nextDouble();

//
// Step 3: Analyze Expenses Using Logical &&.
//   - Use an if-else statement with the && operator to compare expenses.
//   - If rentExpense is greater than foodExpense AND transportationExpense is greater than entertainmentExpense:
//       - Print: "You are prioritizing essentials well."
//   - Else:
//       - Print: "You need to rethink your spending priorities."
        if (rentExpense>foodExpense && transportationExpense>entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");
        }else {
            System.out.println("You need to rethink your spending priorities.");

        }
//
// Reminder:
//   - Write your code step by step, and test it to see that the output matches the expected results.


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your monthly rent expense");
        int rentExpense = input.nextInt();

        System.out.println("Please enter your monthly food expense");
        int foodExpense = input.nextInt();

        System.out.println("Please enter your monthly transportation expense");
        int transportationExpense = input.nextInt();

        System.out.println("Please enter your monthly entertainment expense");
        int entertainment = input.nextInt();

        if (rentExpense>foodExpense && transportationExpense>entertainment) {
            System.out.println("You are prioritizing essentials well.");

        } else {
            System.out.println("You need to rethink your spending priorities.");
        }

        input.close();

    }
}
