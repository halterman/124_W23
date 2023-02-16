
public class PassByValue {
    
    private static void increment(int n) {
        System.out.println("At the start of increment, n = " + n); // Prints 5
        n++;
        System.out.println("At the end of increment, n = " + n);  // Prints 6
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("At the start of main, x = " + x); // Prints 5
        increment(x);
        System.out.println("At the end of main, x = " + x);  // Prints 5
    }

}
