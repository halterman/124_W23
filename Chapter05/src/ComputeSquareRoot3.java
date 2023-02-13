
public class ComputeSquareRoot3 {

    public static void main(String[] args) {
        for (double val = 1.0; val < 5.0; val += 0.1) {
            System.out.printf("%4.2f:  %4.10f   %4.10f%n", 
                              val, MyMath.squareRoot(val), Math.sqrt(val));
        }
    }
}
