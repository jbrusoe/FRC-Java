import java.util.Random;

public class IfThenDemo {
    public static void main(String[] args) {
        Random RandomNumber = new Random();

        for (int i = 1; i < 11; i++) {
            int Rand = RandomNumber.nextInt(100);

            System.out.println(i + " - " + Rand);

            if (Rand > 50) {
                System.out.println("Great than 50");
            }
            else if (Rand < 50) {
                System.out.println("Less than 50");
            }
            else {
                System.out.println("Equal to 50");
            }

            System.out.println("***********************");
        }
    }
}
