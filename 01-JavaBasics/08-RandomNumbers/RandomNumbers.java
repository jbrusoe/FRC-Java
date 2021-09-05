import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random RandomNumber = new Random();
        
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i + " - Random Number: " + RandomNumber.nextInt(10));
        }
        
    }
}