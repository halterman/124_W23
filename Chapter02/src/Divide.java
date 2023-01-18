
public class Divide {

    public static void main(String[] args) {
        System.out.print("Please enter two integers: ");
        int num1, num2;
        var scan = new java.util.Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        System.out.println(num1 + "/" + num2 + " = " + num1/num2);

    }

}
