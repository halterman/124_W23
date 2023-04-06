import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Responder extends MouseAdapter {
    private ColorChanger target;
    
    public Responder(ColorChanger changer) {
        target = changer;
    }
    
    @Override
    public void mouseReleased(MouseEvent ev) {
        System.out.println("Mouse clicked");
        target.change();
    }
}


public class ColorChanger extends GraphicalApplication {

    private Color currentColor;
    
    public ColorChanger() {
        super("Color changer", 600, 400);
        addMouseListener(new Responder(this));
        currentColor = Color.RED;
    }
    
    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(currentColor);
        g.fillRect(100, 100, 400, 200);
    }
    
    public void change() {
        if (currentColor == Color.RED) {
            currentColor = Color.BLUE;
        } else {
            currentColor = Color.RED;
        }
        repaint();
    }
    
    public static void main(String[] args) {
        new ColorChanger().run();
    }

}
