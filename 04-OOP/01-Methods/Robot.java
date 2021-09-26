public class Robot {

    public Robot() {
        System.out.println("Creating basic robot");
    }

    public Robot(String RobotType) {
        System.out.println("Creating a " + RobotType + " of robot");
    }

    public boolean DriveForward() {
        System.out.println("Driving forward");
        return true;
    }

    public boolean DriveForward(int Speed) {
        System.out.println("Driving forward at " + Speed + "% speed");
        return true;
    }
    
    public boolean DriveBackward() {
        System.out.println("Driving backward");
        return true;
    }

    public boolean TurnLeft() {
        System.out.println("Turning left");
        return true;
    }

    public boolean TurnRight() {
        System.out.println("Turning right");
        return true;
    }

    public boolean Stop() {
        System.out.println("Stopping");
        return true;
    }
}