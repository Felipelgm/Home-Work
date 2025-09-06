package week3.d5.e1;

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter the name of the instructor
        System.out.println("Enter name of the instructor");
        // Capture the instructor name input
        String instructorName = input.nextLine();
        // Determine the responsibility based on the instructor's name using a switch statement
        String responsibility;

        switch (instructorName) {

                case "Asghar":
                    responsibility = "Will take care of Java Assignment";
                    break;
                case "Sohail":
                    responsibility = "Will take care of SDLC Assignment";
                    break;
                case "Moazzam":
                    responsibility = "Will take care of Selenium Assignment";
                    break;
                case "Asel":
                    responsibility = "Will take care of every Assignment";
                    break;
                default:
                    responsibility = "Invalid instructor selected";
                    break;
        }
            // Print the responsibility
            System.out.println(responsibility);
        input.close();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the instructor");
        String instructorName = input.next();

        switch (instructorName) {
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Sohail":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "Moazzam" :
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel" :
                System.out.println("will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");


        }



    }
}
