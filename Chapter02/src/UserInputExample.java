import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.print("Please enter an integer value: ");
        int userInput;
        userInput = scan.nextInt();
        System.out.print("You entered the value ");
        System.out.print(userInput);
        System.out.println(".");

    }

}
