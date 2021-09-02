import java.util.Scanner;

public class CollatzConjecture {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        System.out.println("Collatz Conjecture Demo in Java");
        
        while (n == -1) {
            System.out.print("Enter a positive integer: ");

            try {
                n = scanner.nextInt();
                scanner.next();

                if (n>0) {
                    System.out.println("Entered Value: " + n);
                }
                else {
                    System.out.println("Please enter a positive integer");
                    n = -1;
                }
            } catch (Exception e) {
                System.out.println("Please only enter a positive integer");
                n = -1;
            }

        }

        scanner.close();
    }
}