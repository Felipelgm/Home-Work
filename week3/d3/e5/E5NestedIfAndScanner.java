package week3.d3.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {

// Note: Less comments in this File so that slowly you can start writing code independently.

// Car Rental Eligibility Checker - Step-by-Step Guide

// Step 1: Create a Scanner object.
        Scanner input=new Scanner(System.in);

// Step 2: Ask the user for their age.
        System.out.println("Please enter your age: ");
        int age= input.nextInt();

// Step 3: Ask the user if they have a valid driver's license.
        System.out.println("Do you have a valid driver's license? (yes/no): ");

        String licenseStatues= input.next();

// Step 4: Check if the user is eligible to rent a car.

                if(age>=21){
                    if (licenseStatues.equalsIgnoreCase("yes")){
                        System.out.println("You are eligible to rent a car.");
                    }else {
                        System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
                    }
                    }else {
                    System.out.println("You are not eligible to rent a car because you are too young.");

                }





        Scanner input= new Scanner(System.in);


        System.out.println("Please enter your age");
        int age= input.nextInt();

        System.out.println("Do you have a valid driver's license?");
        String driveLicense = input.next();

        if (age>=21) {
            if (driveLicense.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to rent a car.");
            }else {
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
            }


        } else {
            System.out.println("You are not eligible to rent a car because you are too young.");
        }

        input.close();


    }
}
