//Collatz Conjecture in Java
//Written by: Jeff Brusoe
//Last Updated: September 3, 2021

import java.util.Scanner;

public class CollatzConjecture {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        System.out.println("Collatz Conjecture Demo in Java");
       
        n = GetPositiveInteger(scanner, n);

        CollatzConjectureCalc(n);
    }

    private static int GetPositiveInteger(Scanner scanner, int n) {
        while (true) {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();

            if (n > 0) {
                System.out.println("Entered Value: " + n);
                break;
            }
            else {
                System.out.println("Please enter a positive integer");
                n = -1;
            }
        }

        scanner.close();
        return n;
    }

    private static void CollatzConjectureCalc(int n) {
        System.out.println("Performing main part of Collatz calculation...");
        while (n != 1) {
            System.out.println("n = " + n);

            if (n % 2 == 0) {
                n = n / 2;
            }
            else { 
                n = 3*n + 1;
            }
        }
    }
}