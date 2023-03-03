
public class Point {
    public double x;
    public double y;

    /**
     * Initializes a geometric point object.
     * @param x the <em>x</em> coordinate of the point.
     * @param y the <em>y</em> coordinate of the point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public double distance(Point other) {
        return Math.sqrt((this.x - other.x)*(this.x - other.x) - (this.y - other.y)*(this.y - other.y));
    }
    
    
    public static double f() {
        return 55.5;
    }
}
