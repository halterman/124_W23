import java.util.Scanner;

public class TextTrafficLight {
    
    private static void showLight(TrafficLightLogic log) {
        TrafficLightLogic.Color c = log.getColor();
        
        if (c == TrafficLightLogic.Color.Red) {
            System.out.println("[(R) ( ) ( )]");
        } else if (c == TrafficLightLogic.Color.Yellow) {
            System.out.println("[( ) (Y) ( )]");
        } else {
            System.out.println("[( ) ( ) (G)]");            
        }
    }
    
    public static void main(String[] args) {
        var control = new TrafficLightLogic();
        var scan = new Scanner(System.in);
        while (true) {
            showLight(control);
            control.change();
            scan.nextLine();
        }
    }
}
