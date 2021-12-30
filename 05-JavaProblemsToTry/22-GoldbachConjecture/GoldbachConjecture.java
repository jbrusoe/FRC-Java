import java.util.Scanner;
import java.util.ArrayList;

public class GoldbachConjecture {
    static final int MaxNumber = 10000;
    ArrayList<Integer> PrimeNumbers = new ArrayList<Integer>();
    
    public static GeneratePrimeNumberArray() {
        ArrrayList.add(2);

        for (int i = 3; i <= MaxNumber; i = i + 2; {
            PrimeNumbers.add(i);
        }

        System.out.println("Array List: ");
        for (int i = 0; i < PrimeNumbers.size(); i++) {
            System.out.println(PrimeNumbers.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Max Number: " + MaxNumber);
    }
}