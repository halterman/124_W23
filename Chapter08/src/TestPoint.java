import java.util.Arrays;
import java.util.Random;

public class TestPoint {

    public static void main(String[] args) {
        Point[] pts = { 
            new Point(),
            new Point(),
            new SpecialPoint(),
            new Point(),
            new Point()
        };
        
        System.out.println(Arrays.toString(pts));
        
        SpecialPointv1 sp = new SpecialPointv1();
        System.out.println(sp);
        
        Random rand = new Random();
        Point[] randomPoints = new Point[5];
        for (int i = 0; i < randomPoints.length; i++) {
            int choice = rand.nextInt(3);
            switch (choice) {
                case 0: randomPoints[i] = new Point(); break;
                case 1: randomPoints[i] = new SpecialPoint(); break;
                case 2: randomPoints[i] = new RawPoint(); break;
            }
        }
        System.out.println(Arrays.toString(randomPoints));

    }

}
