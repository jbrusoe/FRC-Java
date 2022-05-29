import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int FirstNumber = scan.nextInt();

        System.out.print("Enter second number: ");
        int SecondNumber = scan.nextInt();

        System.out.print("Enter third number: ");
        int ThirdNumber = scan.nextInt();

        System.out.println("First Number: " + FirstNumber);
        System.out.println("Second Number: " + SecondNumber);
        System.out.println("Third Number: " + ThirdNumber);

        double Average = (FirstNumber + SecondNumber + ThirdNumber)/3.0;

        System.out.println("Average: " + Average);
        scan.close();
    }
}