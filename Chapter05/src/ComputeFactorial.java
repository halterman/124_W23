
public class ComputeFactorial {

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("%2d:  %10d%n", i, MyMath.factorial(i));
        }
        
        int x = MyMath.factorial(-1);
        System.out.println(x);

    }

}
