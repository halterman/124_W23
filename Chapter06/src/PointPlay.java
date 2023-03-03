
public class PointPlay {

    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point(1, 7.5);
        
        p2 = new Point(0, 10);
        
        System.out.println(Point.f());
        
        
        // What we really do in Java
        double x = p1.distance(p2);
//        
//        
//        //System.out.println("(" + p1.x + "," + p1.y + ")");
//        System.out.println("p1 = " + p1 + ", p2 = " + p2);
//        
//        
//        //System.out.println(Point.toString());
//        //System.out.println(p1);
//        
//        System.out.println("--------------------");
//        Point p3 = new Point(0, 0), p4 = new Point(0, 2);
//        System.out.println(MyMath.distance(p3, p4));
    }
}
