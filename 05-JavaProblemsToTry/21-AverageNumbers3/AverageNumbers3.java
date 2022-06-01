import java.util.Scanner;

public class AverageNumbers3 {

	public static double FindAverage(double[] NumbersToAverage) {
		double Average = (NumbersToAverage[0] + NumbersToAverage[1] + NumbersToAverage[2])/3.0;
		
		return Average;
	}
	
	public static void main(String args[]) {
		
		Scanner inputs = new Scanner(System.in);
		double[] EnteredNumbers = new double[3];
		
		System.out.print("Please enter the first value for the average: ");
		EnteredNumbers[0] = inputs.nextDouble();
		
		System.out.print("Please enter the second value for the average: ");
		EnteredNumbers[1] = inputs.nextDouble();
		
		System.out.print("Please enter the third value for the average: ");
		EnteredNumbers[2] = inputs.nextDouble();
		
		System.out.println("The Average of the inputs is: " + FindAverage(EnteredNumbers));
		
	}
}
