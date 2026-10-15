package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard
        System.out.println("Select a sandwich size:");
        System.out.println(" 1: Regular ($5.45)");
        System.out.println(" 2: Large ($8.95)");
        System.out.print(" Enter 1 or 2: ");
        int sandwichSize = scanner.nextInt();
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();



    }
}
