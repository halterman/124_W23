import java.util.Scanner;

public class MultiwayIf1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();
        if (input == 1) {
            System.out.println("one");
        } else if (input == 2) {
            System.out.println("two");
        } else if (input == 3) {
            System.out.println("three");
        } else if (input == 4) {
            System.out.println("four");
        } else if (input == 5) {
            System.out.println("five");
        }
        System.out.println("Program done.");
    }
}
