/**
 * Rational objects correspond to mathematical rational numbers.
 * A rational number can be represented as the ratio of two integers
 * n/d, where d is not equal to zero.  The set of integers is a proper
 * subset of the set of rational numbers.
 *
 */
public class Rational {
    
    /** The numerator of the rational number */
    private int numerator;
    /** The denominator of the rational number */
    private int denominator;
    
    /** Represents the rational number 0/1 */
    public static final Rational ZERO = new Rational(0, 1);
    
    /** Represents the rational number 1/1 */
    public static final Rational ONE = new Rational(1, 1);
    
    /**
     * Create and initialize a fraction object
     * so that it is reduced to lowest terms.
     * Throws an {@code IllegalArgumentException}
     * if the client attempts to create an undefined
     * rational number (denominator equal to zero).
     * @param n the fraction's numerator
     * @param d the fraction's denominator
     */
    public Rational(int n, int d) {
        numerator = n;
        if (d != 0) {
            denominator = d;
        } else {
            throw new IllegalArgumentException();
        }
        reduce();
    }
    
    /**
     * Create and initialize a fraction object
     * from an integer.
     * @param val the integer from which to make the rational
     *        number
     */
    public Rational(int val) {
        this(val, 1);
    }
    
    /**
     * Reveals the numerator of the rational number
     * @return reveals the numerator of the rational number
     */
    public int getNumerator() {
        return numerator;
    }
    
    /**
     * Reveals the denominator of the rational number
     * @return reveals the numerator of the rational number
     */
    public int getDenominator() {
        return denominator;
    }
    
    /**
     * Computes the greatest common divisor of two
     * integers using Euclid's method
     * @param a one of the integers
     * @param b the other integer
     * @return the GCD(a, b)
     */
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;   
    }
    
    /**
     * Ensures the object represents a fraction reduces to 
     * lowest terms
     */
    private void reduce() {
        int divisor = gcd(numerator, denominator);
        numerator /= divisor;
        denominator /= divisor;
    }
    
    /**
     * Adds this rational number to another rational number object
     * @param other the other rational number to add
     * @return the sum of these rational objects
     */
    public Rational add(Rational other) {
        int a = numerator,
            b = denominator,
            c = other.numerator,
            d = other.denominator;
        return new Rational(a*d + c*b, b*d);
    }
    
    /**
     * Subtracts another rational number object from this rational object
     * @param other the other rational number to take away
     * @return the difference of these rational objects
     */
    public Rational subtract(Rational other) {
        return add(other.multiply(-1));
    }
    
    /**
     * Multiplies this rational number by another rational number object
     * @param other the other rational number to multiply
     * @return the product of these rational objects
     */
    public Rational multiply(Rational other) {
        return new Rational(numerator * other.numerator, 
                            denominator * other.denominator);
    }
    
    /**
     * Multiplies this rational number by an integer
     * @param n the integer multiplier
     * @return the product of these rational objects
     */
    public Rational multiply(int n) {
        return new Rational(numerator * n, denominator);
    }
    
    /**
     * Divides this rational number by another rational number object
     * @param other the other rational number to divide
     * @return the quotient of these rational objects
     */
    public Rational divide(Rational other) {
        return new Rational(numerator * other.denominator, 
                            denominator * other.numerator);
    }
    
    /**
     * Renders the rational object as a human-readable string
     */
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    /**
     * Returns the double-precision floating-point
     * approximation of the rational number
     * @return the double-precision floating-point
     *         approximation of the rational number
     */
    public double toDouble() {
        return (double)(numerator)/denominator;
    }

}
