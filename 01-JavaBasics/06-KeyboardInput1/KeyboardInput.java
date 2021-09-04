//This file demonstrates how to enter a string value in Java with the keyboard
//Written by: Jeff Brusoe
//Last Updated: August 6, 2021

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner strScanner = new Scanner(System.in);

        System.out.print("Enter a string value: ");
        String UserInput = strScanner.nextLine();

        System.out.println("Entered Value: " + UserInput);

        strScanner.close();
    }
}