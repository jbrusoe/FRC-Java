//While Loop Java Demo #2 with Break Statement

public class WhileLoopJava 
{
	public static void main(String args[]) {
		int i = 10;

		System.out.println("While loop demo in Java");

		while(true) {
			System.out.println("T-" + i );
			i--;

			if (i < 0) {
				break;
			}
		}
	}
}
