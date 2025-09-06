package week4.d4.e8;

import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {
        // Heads up! This can be a bit tricky.
        // Create a Scanner object to read input from the console

        // Prompt the user to enter a value for x

        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        // Inside the loop, print the value of i followed by a space

        Scanner scanner=new Scanner(System.in);
        System.out.print("In: ");
        int x=scanner.nextInt();


        for (int i=x-1; i>=0;i--){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}