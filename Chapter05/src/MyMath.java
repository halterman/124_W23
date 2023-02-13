
public class MyMath {
    public static double squareRoot(double x) {
        double root = 1.0;
        while (Math.abs(root * root - x) > 0.000000001) {
            root = (root + x / root) / 2;
        }
        return root;
    }

}
