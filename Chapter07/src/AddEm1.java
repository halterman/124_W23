
public class AddEm1 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter five numbers to add: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4  
                           + " + " + num5 + " = " + sum);
    }

}
