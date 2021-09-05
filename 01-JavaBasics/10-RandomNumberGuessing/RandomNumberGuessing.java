import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        int NumberToGuess = new Random().nextInt(100) + 1;
        int GuessNumber = 1;
        Scanner UserInput = new Scanner(System.in);

        //System.out.println("Correct Number: " + NumberToGuess);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            int Guess = UserInput.nextInt();

            if (Guess == NumberToGuess) {
                System.out.println("You guessed the correct number!");
                break;
            }
            else if (Guess < NumberToGuess) {
                System.out.println("Your guess is too low!");
            }
            else {
                System.out.println("Your guess is too high!");
            }
        }

        UserInput.close();
    }
}
