public class SwapVariables {
	public static void main (String args[]) {
		
		int variable1 = 100, variable2 = 200;
		
		System.out.println("Before swap: ");
		System.out.println("Value of Variable1: " + variable1);
		System.out.println("Value of variable2: " + variable2);
		
		int temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		
		System.out.println("\nAfter swap: ");
		System.out.println("Value of Variable1: " + variable1);
		System.out.println("Value of variable2: " + variable2);
	}
}
