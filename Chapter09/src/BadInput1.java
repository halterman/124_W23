import java.util.InputMismatchException;
import java.util.Scanner;

public class BadInput1 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter an integer: ");
            int x;
            try {
                x = scan.nextInt();
                System.out.println("You entered " + x);
            } catch (InputMismatchException e) {
                System.out.println("Bad input!");
            }
        }
    }
}
