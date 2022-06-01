import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class MontyHall {

    public static void main (String[] args) {
        int Trials = 0;
        int GuessedDoor = 1;
        int CorrectCount = 0;
        int SwitchedCorrectCount = 0;
        int CorrectDoor = 0;
        int BlockedDoor = 0;
        double SwitchedPercentage = 0.0;
        double NoSwitchPercentage = 0.0;

        Random random = new Random();

        while (true) {
            System.out.print("How many trials would you like to run: ");
            Scanner UserInput = new Scanner(System.in);

            try {
                Trials = UserInput.nextInt();

                if (Trials <= 0) {
                    throw new Exception("NegativeIntegerException");
                }
                else {
                    UserInput.close();
                    break;
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Only positive integers are allowed");
            }
            catch(Exception e) {
                System.out.println("You entered a number less than 0");
                System.out.println("Only positive integers are allowed");
            }
        }

        for(int i=0; i<Trials;i++) {
            GuessedDoor = 1;
            System.out.println("Trial " + i);

            CorrectDoor = random.nextInt(3) + 1;
            System.out.println("Correct Door: " + CorrectDoor);

            if (GuessedDoor == CorrectDoor) {
                System.out.println("Correct - No Switch Required");
                CorrectCount++;

                BlockedDoor = random.nextInt(2) + 2;

                if (BlockedDoor == 2) {
                    GuessedDoor = 3;
                }
                else {
                    GuessedDoor = 2;
                }
            }
            else {
                System.out.println("Incorrect - Switch Required");

                if (CorrectDoor == 2) {
                    BlockedDoor = 3;
                    GuessedDoor = 2;
                }
                else {
                    BlockedDoor = 2;
                    GuessedDoor = 3;
                }

            }
            
            System.out.println("Switched Door: " + GuessedDoor);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

        if (GuessedDoor == CorrectDoor) {
            SwitchedCorrectCount++;
            System.out.println("Switched Correct");
        }
        else{
            System.out.println("Switched Incorrect");
        }

            System.out.println("********************");
        }

        System.out.println("Summary Information:");
        System.out.println("Total number of trials: " + Trials);

        System.out.println("\nCorrect Count - No Switch: " + CorrectCount);
        NoSwitchPercentage = 100*((double)CorrectCount/Trials);
        System.out.println("No switch percentage: " + String.format("%.1f", NoSwitchPercentage) + "%");

        System.out.println("\nCorrect Count - With Switch: " + SwitchedCorrectCount);
        SwitchedPercentage = 100*((double)SwitchedCorrectCount/(Trials));
        System.out.println("Switched percentage: " + String.format("%.1f", SwitchedPercentage) + "%");
    }
}

