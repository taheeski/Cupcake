package com.taha;

/**
* @author Taha
* @date 02/12/2024 cupcake
* cupcakeeeee
*/

import java.util.Scanner;
public class CupcakeParty {
   /**
    * This program calculates the remaining cupcakes after distributing them
    * among class students based on the number of regular and small boxes.
    */
   public static void main(String[] args) {
       // Number of students in the class
       int classStudents = 28;
       Scanner input = new Scanner(System.in);
       // Asking for the number of regular boxes
       System.out.println("Enter the amount of regular boxes:");
       System.out.print("> ");
       int reg = 0;
       while (!input.hasNextInt()) {
           // Prompting the user to enter a valid integer
           System.out.println("Please enter a valid integer for regular boxes:");
           System.out.print("> ");
           input.next();
       }
       reg = input.nextInt();
       // Asking for the number of small boxes
       System.out.println("Enter the amount of small boxes:");
       System.out.print("> ");
       int sml = 0;
       while (!input.hasNextInt()) {
           // Prompting the user to enter a valid integer
           System.out.println("Please enter a valid integer for small boxes:");
           System.out.print("> ");
           input.next();
       }
       sml = input.nextInt();
       // Calculating the total number of cupcakes
       int totalCupcakes = reg * 8 + sml * 3;
       // Calculating the remaining cupcakes after distribution
       int cupcakesRemain = totalCupcakes % classStudents;
       // Displaying the remaining cupcakes
       System.out.println("Remaining cupcakes after distribution: " + cupcakesRemain);
   }
}

