
public class TemperatureConvert {

    public static void main(String[] args) {
        double degreesF, degreesC;
        var scan = new java.util.Scanner(System.in);
        degreesF = scan.nextDouble();
        scan.close();
        degreesC = 5.0/9*(degreesF - 32);
        System.out.println(degreesC);
        
        System.out.println("Max integer is " + Integer.MAX_VALUE);
        int x = Integer.MAX_VALUE - 3;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
        System.out.println(x);
        x++;
    }

}
