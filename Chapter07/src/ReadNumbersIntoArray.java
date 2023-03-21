import java.util.Arrays;

public class ReadNumbersIntoArray {

    public static void main(String[] args) {
        System.out.print("Please enter the number of values: ");
        var scan = new java.util.Scanner(System.in);
        int number = scan.nextInt();
        int[] values = new int[number];
        for (int count = 0; count < values.length; count++) {
            values[count] = scan.nextInt();
        }
//        for (int i = 0; i < values.length; i++) {
//            System.out.print(values[i] + " ");
//        }
//        System.out.println();
        System.out.println(values);  // Not too useful
        System.out.println(Arrays.toString(values));
    }
}
