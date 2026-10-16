package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard

        /*
         * Price decision tree:
         *
         *                 Size?
         *              /         \
         *       1: Regular      2: Large
         *        ($5.45)         ($8.95)
         *           |               |
         *        Loaded?         Loaded?
         *        /     \         /     \
         *      yes      no     yes      no
         *    +$1.00    +$0   +$1.75    +$0
         *        \      |       |      /
         *         \     |       |     /
         *          Age discount:
         *            17 or under -> 10% off
         *            65 or older -> 20% off
         *            everyone else -> no discount
         *                   |
         *              Display cost
         */


        // Show user the menu
        System.out.println("""
        Select a sandwich size:
         1: Regular ($5.45)
         2: Large ($8.95)""");


        // Get user input for sandwich size
        System.out.print("Enter 1 or 2: ");
        int sandwichSize = scanner.nextInt();


        // Eat the line   number --> text
        scanner.nextLine();


        // Get user input for sandwich loaded yes or no
        System.out.print("Do you want a loaded sandwich? yes or no: ");
        String loadedChoice = scanner.nextLine();


        // Get user's age for the discount
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();


        // Initialize the variable for base price
        double basePrice;


        // Compare the input sandwichSize if it is the same as 1 so the base price for regular applies
        if (sandwichSize == 1){
            basePrice = 5.45;
        } else{                         // Else the base price of large will be applied
            basePrice = 8.95;
        }


        // Compare the input for loaded choice and add the price accordingly
        if (loadedChoice.equalsIgnoreCase("Yes")){
            if (sandwichSize == 1){         // For regular
                basePrice += 1;
            } else {
                basePrice += 1.75;          // For large
            }
        }


        // Initialize the variable for total price after discount
        double totalPrice;


        if ( userAge <= 17 ){   // If the user is less than 17 or 17 discount is 10 percent
            totalPrice = basePrice* 0.9;
        } else if (userAge >= 65){  // If the user is greater than 65 or 65 discount is 20 percent
            totalPrice = basePrice* 0.8 ;
        } else{
            totalPrice = basePrice;  // Else no discount applied
        }



        // $%.2f for price and %n for newline
        System.out.printf("Your sandwich costs $%.2f%n", totalPrice);



    }
}
