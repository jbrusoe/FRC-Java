public class ConvertDegreesToRadians {
    public static void main (String[] args) {
        System.out.println("Degrees\tRadians");

        for (int i=0; i<=360; i++) {
            double radians = Math.toRadians(i);
            System.out.println(i + "\t" + String.format("%.3f",radians));
        }
    }
}