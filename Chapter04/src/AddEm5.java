
public class AddEm5 {

    public static void main(String[] args) {
        final int UPPER_LIMIT = 999;
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter numbers to add (999 ends): ");
        int input;
        while ((input = scan.nextInt()) <= UPPER_LIMIT) {
            sum += input;
        }
        scan.close();
        System.out.println("The sum is " + sum);
    }

}
