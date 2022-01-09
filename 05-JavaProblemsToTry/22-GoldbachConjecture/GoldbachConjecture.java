import java.util.Scanner;
import java.util.ArrayList;

public class GoldbachConjecture {
    static final int MaxNumber = 10000;
    static ArrayList<Integer> PrimeNumbers = new ArrayList<Integer>();
    
    public static boolean isPrime(int n) 
    {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Max Number: " + MaxNumber);

        for (int i = 2; i <= MaxNumber; i++) {
            if (isPrime(i)) {
                PrimeNumbers.add(i);
            }
       }

        System.out.println("Prime Numbers: " + PrimeNumbers);
    }
}