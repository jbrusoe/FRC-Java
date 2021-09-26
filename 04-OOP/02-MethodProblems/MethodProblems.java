public class MethodProblems {
    
    public boolean TestEven(int NumberToTest) {
        System.out.println("Testing: " + NumberToTest);
        return true;
    }

    public static void main(String[] args) {
        MethodProblems Methods = new MethodProblems();

        Methods.TestEven(15);
    }
}
