import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();
        String word = switch (input) {
            case   1  -> "one";
            case   2  -> "two";
            case   3  -> "three";
            case   4  -> "four";
            case   5  -> "five";
            case 100  -> "one hundred";
            default -> "not a number I know";
        };
        System.out.println("The number is " + word);
    }
}
