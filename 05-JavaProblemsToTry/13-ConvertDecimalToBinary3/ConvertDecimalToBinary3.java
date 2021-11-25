import java.util.Scanner;
import java.util.ArrayList;

public class ConvertDecimalToBinary3 {

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        ArrayList<Integer> BinaryValue = new ArrayList<Integer>();
        int EnteredNumber;

        while(true) {
            System.out.print("\nEnter a positive integer: ");
            EnteredNumber = UserInput.nextInt();
            //UserInput.close();

            System.out.println("Initial Number: " + EnteredNumber);

            while (EnteredNumber > 0) {
                BinaryValue.add(EnteredNumber % 2);
                EnteredNumber = EnteredNumber/2;
            }

            System.out.print("Binary Value: ");
            for (int i = BinaryValue.size()-1 ; i >= 0; i--) {
                System.out.print(BinaryValue.get(i) + " ");
            }

            System.out.println("");
            BinaryValue.clear();
        }
    }
}