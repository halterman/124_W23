
/**
 * Represents a mathematical rational number;
 * that is, the ratio of two integers.
 * Also known as a fraction.
 *
 */
public class Rational {
    private int numerator;
    private int denominator;
    
    /**
     * Initializes a Rational object.
     * @param n the numerator of the rational number
     * @param d the denominator of the rational number
     */
    public Rational(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException();
        }
    }
    

    public Rational reduce() {
        int factor = MyMath.gcd(numerator, denominator);
        return new Rational(numerator/factor, denominator/factor);
    }
    
    // The form that reduces the fraction itself
//    public void reduce() {
//        int factor = MyMath.gcd(numerator, denominator);
//
//        numerator /= factor;
//        denominator /= factor;
//    }
    
//    public String toString() {
//        return numerator + "/" + denominator;
//    }

}
