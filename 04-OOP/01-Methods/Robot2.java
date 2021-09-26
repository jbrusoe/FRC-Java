public class Robot2 {
    public static void main(String[] args) {
        //System.out.println("Creating a new robot");
        //Robot myRobot = new Robot();
        Robot myRobot = new Robot("FRC");
    
        myRobot.DriveForward();
        myRobot.DriveForward(50);
        myRobot.DriveBackward();
        myRobot.TurnLeft();
        myRobot.TurnRight();
        myRobot.Stop();
    }
}
