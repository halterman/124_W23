
public class Point {
    public double x;
    public double y;
    
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
