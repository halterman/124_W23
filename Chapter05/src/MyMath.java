
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
    
    public static void showTimesTable(int size) {
        // 1st version
        //System.out.println("Times table of size " + size);
        // 2nd version 
//        for (int row = 1; row <= size; row++) {
//            System.out.println("Row #" + row);
//        }
        // 3rd version 
//        for (int row = 1; row <= size; row++) {
//            for (int column = 1; column <= size; column++) {
//                System.out.print(row*column + " ");
//            }
//            System.out.println();
//        }
//        // 4th version
//        for (int row = 1; row <= size; row++) {
//            for (int column = 1; column <= size; column++) {
//                System.out.printf("%5d", row*column);
//            }
//            System.out.println();
//        }
        
     // 5th version
        // Display the column titles
        System.out.print(" X  ");
        for (int column = 1; column <= size; column++) {
            System.out.printf("%4d", column);
        }
        System.out.println();
        System.out.print("   +");
        for (int column = 1; column <= size; column++) {
            System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= size; row++) {
            // Display the row title
            System.out.printf("%2d |", row);
            for (int column = 1; column <= size; column++) {
                System.out.printf("%4d", row*column);
            }
            System.out.println();
        }
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

}
