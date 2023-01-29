
public class AddEm2 {

    public static void main(String[] args) {
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter five numbers to add: ");
        int count = 0;
        while (count < 5) {
            sum += scan.nextInt();
            count++;
        }
        System.out.println("The sum is " + sum);
    }

}
