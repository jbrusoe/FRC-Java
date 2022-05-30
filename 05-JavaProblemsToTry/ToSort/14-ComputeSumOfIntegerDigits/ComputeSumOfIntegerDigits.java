import java.util.Scanner;

public class ComputeSumOfIntegerDigits {
    public static void main(String[] args) {
        int EnteredNumber = -1;
        int SumOfIntegerDigits = 0;

        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        EnteredNumber = UserInput.nextInt();

        System.out.println("Entered Number: " + EnteredNumber);

        while (EnteredNumber > 0) {
            SumOfIntegerDigits = SumOfIntegerDigits + (EnteredNumber % 10);
            EnteredNumber = EnteredNumber/10;
        }

        System.out.println("Sum of Integer Digits: " + SumOfIntegerDigits);
    }
}