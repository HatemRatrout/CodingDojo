import java.lang.Math;

public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        double c = Math.sqrt((legA *legA) + (legB *legB));
        return c;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        double c = calculateHypotenuse(a, b);
        System.out.println(c);
    }
}
