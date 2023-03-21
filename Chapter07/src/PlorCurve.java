
public class PlorCurve {

    public static void main(String[] args) {
        double[] numbers = new double[1000];
        for (int i= 0; i < numbers.length; i++) {
            int x = numbers.length/2 - i;
            //numbers[i] = 2 * x * x;
            numbers[i] = Math.sin(x/10);
        }
        Plotter.plot(numbers, 500, 500);
        

    }

}
