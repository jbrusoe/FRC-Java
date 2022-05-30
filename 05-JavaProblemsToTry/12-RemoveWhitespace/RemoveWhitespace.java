public class RemoveWhitespace{
    public static void main(String[] args){
        String test = "  test test2   ";

        System.out.println("Initial String: " + test);
        System.out.println("String Length: " + test.length());

        test = test.trim();
        System.out.println("\nString with whitespace removed: " + test);
        System.out.println("String Length: " + test.length());
    }
}