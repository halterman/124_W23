import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        scan.close();
        String word;
        switch (input) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            default:
                word = "not a number I know";
                break;
        }
        System.out.println("The number is " + word);
    }
}
