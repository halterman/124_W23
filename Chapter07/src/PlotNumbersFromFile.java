import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;

public class PlotNumbersFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser dialog = new JFileChooser();
        dialog.showOpenDialog(null);
        File f = dialog.getSelectedFile();
        var scan = new java.util.Scanner(f);
        int number = scan.nextInt();
        int[] values = new int[number];
        for (int count = 0; count < values.length; count++) {
            values[count] = scan.nextInt();
        }
        scan.close();
        Plotter.plot(values, 500, 500);
    }
}
