import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intEnteredNumber = -1;
        while (intEnteredNumber <= 0) {
            System.out.print("Enter a positive number: ");
            intEnteredNumber = scan.nextInt();

            if (intEnteredNumber > 0) {
                break;
            }
            else {
                System.out.println("Please enter a positive number.");
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(intEnteredNumber + " x " + i + " = " + intEnteredNumber * i);
        }

        scan.close();
    }
}