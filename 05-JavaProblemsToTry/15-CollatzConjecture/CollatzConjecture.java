import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int StepCount = 0;

        System.out.print("Enter a positive integer: ");
        int n = UserInput.nextInt();

        System.out.println("n: " + n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }

            System.out.println("Current n = " + n);
            StepCount++;
        }

        System.out.println("The number of steps is " + StepCount);
        UserInput.close();
    }
}