import java.util.regex.*;

public class StringIsDigits {
    public static void main (String[] args) {
        System.out.println("There are several ways to test");
        System.out.println("if a string is composed of only digits.");
        System.out.println("Several methods are shown here.");

        String[] StringsToTest = {"12345","12345abcd"};

        System.out.println("\nMethod 1: Using parseInt() from the Integer class");
        
        for (String StringToTest : StringsToTest) {
            try {
                System.out.println("Testing: " + StringToTest);
    
                Integer.parseInt(StringToTest);
    
                System.out.println("String contains only digits");
            }
            catch (Exception e) {
                System.out.println("String does not contain only digits");
            }  
        }

        System.out.println("\nMethod 2: Using Character.isDigit()");
        for (String StringToTest : StringsToTest) {
            try {
                System.out.println("Testing: " + StringToTest);
    
                for (int i = 0; i < StringToTest.length(); i++) {
                    if (!Character.isDigit(StringToTest.charAt(i))) {
                        throw new Exception();
                    }
                }
    
                System.out.println("String contains only digits");
            }
            catch (Exception e) {
                System.out.println("String does not contain only digits");
            }  
        }
        
        System.out.println("\nMethod 3: Using regex");
        String RegexString = "[0-9]+";
        Pattern RegexPattern = Pattern.compile(RegexString);

        for (String StringToTest : StringsToTest) {
            try {
                System.out.println("Testing: " + StringToTest);
    
                if (RegexPattern.matcher(StringToTest).matches()) {
                    System.out.println("String contains only digits");
                }
                else {
                    throw new Exception();
                }
            }
            catch (Exception e) {
                System.out.println("String does not contain only digits");
            }  
        }
    }
}