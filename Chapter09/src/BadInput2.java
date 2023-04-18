import java.util.InputMismatchException;
import java.util.Scanner;

public class BadInput2 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter an integer: ");
            int x = 0;
            boolean badEntry = true;
            while (badEntry) {
                try {
                    x = scan.nextInt();
                    badEntry = false;
                } catch (InputMismatchException e) {
                    System.out.print("Not an integer, please try again: ");
                    scan.nextLine();
                }
            }
            System.out.println("You entered " + x);
        }
    }
}
