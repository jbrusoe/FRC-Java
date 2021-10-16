import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int intEnteredNumber = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(intEnteredNumber + " x " + i + " = " + intEnteredNumber * i);
        }

        scan.close();
    }
}