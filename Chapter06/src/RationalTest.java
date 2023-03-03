
public class RationalTest {

    public static void main(String[] args) {
        Rational fract = new Rational(50, 100);
        
        System.out.println("Original: " + fract);
        
//        System.out.println(MyMath.gcd(24, 36));

        System.out.println("Once" + fract);
        System.out.println("Twice" + fract);
        fract = fract.reduce();
        System.out.println("After reducing" + fract);
        
        // The form that reduces the fraction object itself
        //fract.reduce();
        
        System.out.println("Reduced: " + fract);
        

    }

}
