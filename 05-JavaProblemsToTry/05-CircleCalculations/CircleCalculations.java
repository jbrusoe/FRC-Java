import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Radius  = -1;

        while (Radius <= 0) {
            try {
                System.out.print("Enter the circle's radius (in cm): ");
                Radius = scan.nextDouble();

                if (Radius > 0) {
                    break;
                }
                else {
                    System.out.println("Please enter a positive number for the radius.");
                }
            }
            catch (Exception e) {
                System.out.println("Please only enter a positive number for the radius.");
                scan.next();
            }
        }

        scan.close();

        System.out.println("Radius (cm): " + Radius);

        double Circumference = 2 * Math.PI * Radius;
        System.out.println("Circumference (cm): " + Circumference);

        double Area = Math.PI * Math.pow(Radius, 2);
        System.out.println("Area (cm^2): " + Area);
    }
}