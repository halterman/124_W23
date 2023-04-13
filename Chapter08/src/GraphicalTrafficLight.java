import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicalTrafficLight extends GraphicalApplication {

    private TrafficLightLogic controller;
    
    public GraphicalTrafficLight() {
        super("Traffic Light", 160, 550);
        controller = new TrafficLightLogic();
        // Add a mouse listener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent ev) {
                controller.change();
                repaint();
            }
        });
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the light frame
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(4, 4, 140, 450);
        
        // Draw the red lamp
        if (controller.get() == TrafficLightLogic.Color.Red) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(12, 23, 120, 120);
        
        // Draw the yellow lamp
        if (controller.get() == TrafficLightLogic.Color.Yellow) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(12, 167, 120, 120);
        
        // Draw the green lamp
        if (controller.get() == TrafficLightLogic.Color.Green) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(12, 311, 120, 120);
        
    }

    public static void main(String[] args) {
        new GraphicalTrafficLight().run();
    }
}
