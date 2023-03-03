
public class MyMath {
    /**
     * Computes the square of a given number.
     * @param x the number to compute the square root of
     * @return the square root of x
     */
    public static double squareRoot(double x) {
        double root = 1.0;
        while (Math.abs(root * root - x) > 0.000000001) {
            root = (root + x / root) / 2;
        }
        return root;
    }
    
    /**
     * Computes the factorial of a given integer.
     * @param n the value to compute the factorial of
     * @return n!
     */
    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    /**
     * Computes the distance between two points
     * @param x1 the x coordinate of the first point
     * @param y1 the y coordinate of the first point
     * @param x2 the x coordinate of the second point
     * @param y2 the y coordinate of the second point
     * @return the distance between (x1, y1) and (x2, y2)
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }
    
    /**
     * Computes the distance between two points
     * @param p1 the first point
     * @param p2 the second point
     * @return the distance between the two points
     */
    public static double distance(Point point1, Point point2) {
//        double x1 = point1.x, y1 = point1.y, x2 = point2.x, y2 = point2.y;
//        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        return Math.sqrt((point2.x - point1.x)*(point2.x - point1.x) 
                          + (point2.y - point1.y)*(point2.y - point1.y));
    }
    
    /**
     * Computes the greatest common divisor 
     * (AKA greatest common factor) of a and b.
     * @param a
     * @param bm
     * @return
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }


}
