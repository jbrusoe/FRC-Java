public class EulersNumber {
    public static void main(String[] args) {

        System.out.println("n" + "\t" + "e");

        for (int n = 1; n < 100000; n++) {
            double e = Math.pow((1.0+(1.0/n)),n);
            System.out.println(n + "\t" + e);
        }
    }
}