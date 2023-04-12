import java.awt.Color;
import java.awt.Graphics;

public class GraphicalTrafficLight extends GraphicalApplication {

    private TrafficLightLogic controller;
    
    public GraphicalTrafficLight() {
        super("Traffic Light", 160, 600);
        controller = new TrafficLightLogic();
        // Add a mouse listener
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the light frame
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(4, 4, 140, 600);
        
        // Draw the red lamp
        g.setColor(Color.RED);
        g.fillOval(8, 8, 120, 120);
        
        // Draw the yellow lamp
        g.setColor(Color.YELLOW);
        g.fillOval(8, 152, 120, 120);
        
        // Draw the green lamp
        g.setColor(Color.GREEN);
        g.fillOval(8, 296, 120, 120);
        
    }

    public static void main(String[] args) {
        new GraphicalTrafficLight().run();
    }
}
