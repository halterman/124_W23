import java.util.Scanner;

public class OneOrNone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();
        if (input == 1) {
            System.out.println("one");
        }
        System.out.println("Program done.");
    }
}
