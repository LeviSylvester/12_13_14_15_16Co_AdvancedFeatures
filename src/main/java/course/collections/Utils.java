package course.collections;

public class Utils {
    private Utils() {
    }

    public static double getPointDistanceToOrigin(double p, double p2) {
        return Math.pow(p, 2) + Math.pow(p2, 2);
    }
}
