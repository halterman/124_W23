/* 
 * This is a simple program that adds two integer values provided by the
 * user.
 */
public class UserInputExample3 {
    public static void main(String[] args) {
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter two integer values: ");
        int value1, value2;
        value1 = scan.nextInt();
        value2 = scan.nextInt();
        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        scan.close();
    }
}
