package week4.d4.e7;

import java.util.Scanner;

public class E7ForLoop {
    public static void main(String[] args) {
        // Heads up! This can be a bit tricky.
        // Create a Scanner object to read input from the console
        // Prompt the user to enter a value for x
        // Use a for loop that starts with i = 0 and continues while i < x
        // Inside the loop, print the value of i followed by a space
        // Create a Scanner object to read input from the console

        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        int x= scanner.nextInt();

        for (int i=0; i<x; i++){
            System.out.print(i+" ");

        }
        System.out.println();



    }
}
