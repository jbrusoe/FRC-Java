public class Methods3 {

    public static String PrintSomething(String MethodTest) {
        String ReturnValue = "Returning" + MethodTest;
        return ReturnValue;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Return Value: " + PrintSomething("Test1"));
        System.out.println("Return Value: " + PrintSomething("Test2"));
    }
}
