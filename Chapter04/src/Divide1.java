// This is from Chapter 2
public class Divide1 {

    public static void main(String[] args) {
        System.out.print("Please enter two integers: ");
        int num1, num2;
        var scan = new java.util.Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        if (num2 != 0) {
            System.out.println(num1 + "/" + num2 + " = " + num1/num2);    
        }
        System.out.println("Program finished");
    }

}
