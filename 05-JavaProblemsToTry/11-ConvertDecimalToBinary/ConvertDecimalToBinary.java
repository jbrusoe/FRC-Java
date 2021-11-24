import java.util.Scanner;

public class ConvertDecimalToBinary {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        int[] BinaryValue = new int[10]; //implies max decimal value is 33554432
        int BinaryIndex = 0;
        int EnteredNumber = 9;

        System.out.print("\nEnter a positive integer: ");
        EnteredNumber = UserInput.nextInt();
        //UserInput.close();

        System.out.println("Initial Number: " + EnteredNumber);

        while (EnteredNumber > 0) {
            BinaryValue[BinaryIndex] = EnteredNumber % 2;
            BinaryIndex++;
            EnteredNumber = EnteredNumber/2;
        }

        System.out.print("Binary Value: ");
        for (int i = BinaryIndex -1 ; i >= 0; i--) {
            System.out.print(BinaryValue[i] + " ");
        }

        System.out.println("");
    }
}