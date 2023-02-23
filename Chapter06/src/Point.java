
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
}
