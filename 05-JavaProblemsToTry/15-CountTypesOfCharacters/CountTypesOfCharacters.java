import java.util.Scanner;

public class CountTypesOfCharacters {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String UserInput = scan.nextLine();
    
        int Letters = 0;
        int Numbers = 0;
        int Spaces = 0;
        int OtherCharacters = 0;

        for (int i = 0; i < UserInput.length(); i++) {
             if (Character.isLetter(UserInput.charAt(i))) {
                 Letters++;
             }
             else if (Character.isDigit(UserInput.charAt(i))) {
                 Numbers++;
             }
             else if (Character.isSpaceChar(UserInput.charAt(i))) {
                 Spaces++;
             }
             else {
                 OtherCharacters++;
             }
        }

        System.out.println("Number of Letters: " + Letters);
        System.out.println("Number of Numbers: " + Numbers);
        System.out.println("Number of Spaces: " + Spaces);
        System.out.println("Number of Other Characters: " + OtherCharacters);
   }
}
