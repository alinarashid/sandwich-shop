package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard

        // Show user the menu
        System.out.println("Select a sandwich size:");
        System.out.println(" 1: Regular ($5.45)");
        System.out.println(" 2: Large ($8.95)");

        // Get user input for sandwich size
        System.out.print("Enter 1 or 2: ");
        int sandwichSize = scanner.nextInt();

        // Eat the line
        scanner.nextLine();

        //Get user input for sandwich loaded yes or no
        System.out.print("Do you want a loaded sandwich? yes or no: ");
        String loadedChoice = scanner.nextLine();


        // Get user's age for the discount
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();


        // initialize the variable for base price
        double basePrice;

        // Compare the input sandwichSize if it is the same as 1 so the base price for regular applies
        if (sandwichSize == 1){
            basePrice = 5.45;
        } else{ // else the base price of large will be applied
            basePrice = 8.95;
        }

        if (loadedChoice.equalsIgnoreCase("yes")){
            if (sandwichSize == 1){
                basePrice += 1;
            } else {
                basePrice += 1.75;
            }
        }


        // initialize the variable for total price after discount
        double totalPrice;

        if ( userAge <= 17 ){   // if the user is less than 17 or 17
            totalPrice = basePrice* 0.9; // the discount is 10 percent
        } else if (userAge >= 65){  // if the user is greater than 65 or 65
            totalPrice = basePrice* 0.8 ; // the discount is 20 percent
        } else{
            totalPrice = basePrice;  // else no discount applied
        }

        // $%.2f for price and %n for newline
        System.out.printf("Your sandwich costs $%.2f%n", totalPrice);



    }
}
