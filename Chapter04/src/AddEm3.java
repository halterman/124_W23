
public class AddEm3 {

    public static void main(String[] args) {
        final int UPPER_LIMIT = 999;
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter numbers to add (999 ends): ");
        int input = scan.nextInt();
        while (input <= UPPER_LIMIT) {
            sum += input;
            input = scan.nextInt();
        }
        scan.close();
        System.out.println("The sum is " + sum);
    }

}
