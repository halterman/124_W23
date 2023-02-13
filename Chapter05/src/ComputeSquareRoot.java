
public class ComputeSquareRoot {

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        double input;
        var scan = new java.util.Scanner(System.in);
        input = scan.nextDouble();
        double root = 1.0;
        while (Math.abs(root*root - input) > 0.0000001) {
            root = (root + input/root)/2;
        }
        
        System.out.println("The square root is " + root);

    }

}
