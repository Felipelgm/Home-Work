package week3.d4.e5;

import java.util.Scanner;

public class E5LogicalOperators {
    public static void main(String[] args) {
        // No comments are provided here, so you can write the code independently.
        // If you encounter issues, review the previous exercises.
        // Re-watch the recorded videos on "else if" and logical AND operators.
        // If you continue facing issues, please ask the Technical Support team.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks=input.nextInt();
        if (marks >= 1 && marks <= 25) {
            System.out.println("Your grade is F");
        } else if (marks >= 26 && marks <= 45) {
            System.out.println("Your grade is E");
        } else if (marks >= 46 && marks <= 50) {
            System.out.println("Your grade is D");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Your grade is C");
        } else if (marks >= 61 && marks <= 80) {
            System.out.println("Your grade is B");
        } else if (marks > 80 && marks <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Please enter valid mark");
        }
    }
}