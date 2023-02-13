
public class ComputeSquareRoot2 {

    public static void main(String[] args) {
        for (double val = 1.0; val < 5.0; val += 0.1) {
            double root = 1.0;
            while (Math.abs(root * root - val) > 0.000000001) {
                root = (root + val / root) / 2;
            }
            System.out.printf("%4.1f:  %4.10f   %4.10f%n", 
                              val, root, Math.sqrt(val));
        }
    }
}
