
public class AddEm6 {

    public static void main(String[] args) {
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter numbers to add (Ctrl-Z ends): ");
        int input;
        while (scan.hasNext()) {
            input = scan.nextInt();
            sum += input;
        }
        scan.close();
        System.out.println("The sum is " + sum);
    }

}
