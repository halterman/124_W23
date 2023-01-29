// This is an enhancement of Divide1
public class Divide2 {

    public static void main(String[] args) {
        System.out.print("Please enter two integers: ");
        int num1, num2;
        var scan = new java.util.Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();
        if (num2 != 0) {
            System.out.println(num1 + "/" + num2 + " = " + num1/num2);    
        } else {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program finished");
    }

}
