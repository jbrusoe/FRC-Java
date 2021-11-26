import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String EnteredString = UserInput.nextLine();
        
        String ReversedString = "";
        for (int i = EnteredString.length() - 1; i >= 0; i--) {
            ReversedString += EnteredString.charAt(i);
        }
        System.out.println("The reverse of " + EnteredString + " is " + ReversedString + ".");
    }
}