public class UserInputExample2 {
    public static void main(String[] args) {
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter two integer values: ");
        int value1, value2;
        value1 = scan.nextInt();
        value2 = scan.nextInt();
        System.out.print(value1);
        System.out.print(" + ");
        System.out.print(value2);
        System.out.print(" = ");
        System.out.println(value1 + value2);
        scan.close();
    }
}
