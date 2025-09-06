package week2.d5.e3;

public class E3ElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it

        // Hint: Use if-else if statements to check grades A, B, C, D, F in order
        // Hint: Print the grade using System.out.println()

        // Expected output: "Your grade is: B"
        int score=85;

        if (score>=90){
            System.out.println("Your grade is: A");
        } else if (score>=80) {
            System.out.println("Your grade is: B");
        } else if (score>=70) {
            System.out.println("Your grade is: C");
        } else if (score>=60) {
            System.out.println("Your grade is: D");
        } else if (score>=50) {
            System.out.println("Your grade is: F");
        }
    }
}