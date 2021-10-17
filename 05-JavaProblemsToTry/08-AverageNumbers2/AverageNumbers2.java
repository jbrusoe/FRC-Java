package RoboticsExamples;
import java.util.Scanner;
public class AverageOfThreeNumbers {

	
	public static double FindAverage(double input1, double input2, double input3) {
		double Average = (input1+input2+input3)/3;
		
		return Average; 
	}
	
	public static void main(String args[]) {
		
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Please enter the first value for the average: ");
		double input1 = inputs.nextDouble();
		
		System.out.println("Please enter the second value for the average: ");
		double input2 = inputs.nextDouble();
		
		System.out.println("Please enter the third value for the average: ");
		double input3 = inputs.nextInt();
		
		
		System.out.println("The Average of the inputs is: " + FindAverage(input1, input2,input3));
		
		
		
	}
}
