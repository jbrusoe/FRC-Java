import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        int NumberToGuess = new Random().nextInt(100) + 1;

        System.out.println("Correct Number: " + NumberToGuess);
    }
}
