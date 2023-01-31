
public class AddEm4 {

    public static void main(String[] args) {
        final int UPPER_LIMIT = 999;
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter numbers to add (999 ends): ");
        int input = 0;
        while (input <= UPPER_LIMIT) {
            input = scan.nextInt();
            if (input <= UPPER_LIMIT) {
                sum += input;
            }
        }
        scan.close();
        System.out.println("The sum is " + sum);
    }

}
