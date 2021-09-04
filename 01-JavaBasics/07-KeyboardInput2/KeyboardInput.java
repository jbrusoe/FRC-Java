//This file demonstrates how to enter a string value in Java with the keyboard
//Written by: Jeff Brusoe
//Last Updated: August 6, 2021

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter a string value: ");
        String StringInput = UserInput.nextLine();

        System.out.println("Entered String Value: " + StringInput);

        System.out.print("Enter an integer value: ");
        int IntegerInput = UserInput.nextInt();

        System.out.println("Entered Integer Value: " + IntegerInput);

        System.out.print("Enter a double value: ");
        double DoubleInput = UserInput.nextDouble();

        System.out.println("Entered Double Value: " + DoubleInput);
        UserInput.close();
    }
}