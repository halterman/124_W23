import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNumbersIntoArrayFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data.text");
        var scan = new java.util.Scanner(f);
        int number = scan.nextInt();
        int[] values = new int[number];
        for (int count = 0; count < values.length; count++) {
            values[count] = scan.nextInt();
        }
        scan.close();
        System.out.println(Arrays.toString(values));
    }
}
