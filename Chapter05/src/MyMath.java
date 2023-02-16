
public class MyMath {
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

}
