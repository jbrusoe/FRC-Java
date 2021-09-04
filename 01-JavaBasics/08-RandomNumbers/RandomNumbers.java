import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random RandomNumber = new Random();
        int rand = 0;
        for (int i = 0; i < 100; i++) {
            rand = RandomNumber.nextInt(10);
            System.out.println("Random Number: " + rand);
        }
        
    }
}