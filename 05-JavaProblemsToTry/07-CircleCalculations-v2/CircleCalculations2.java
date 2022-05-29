import java.util.Scanner;

public class CircleCalculations2 {
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

        System.out.println("\n\nRadius (cm): " + Radius);

        double Circumference = 2 * Math.PI * Radius;
        System.out.println("\nCircumference(cm): " + Circumference);
        System.out.println("Circumference(cm): " + String.format("%.2f", Circumference));

        double Area = Math.PI * Math.pow(Radius, 2);
        System.out.println("\nArea(cm^2): " + Area);
        System.out.println("Area(cm^2): " + String.format("%.2f", Area));
    }
}