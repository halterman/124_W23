import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;




public class ColorChangerVersion2 extends GraphicalApplication {

    private Color currentColor;
    
    public ColorChangerVersion2() {
        super("Color changer Version 2", 600, 400);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent ev) {
                System.out.println("Mouse clicked");
                change();
            }
        });
        currentColor = Color.GREEN;
    }
    
    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(currentColor);
        g.fillRect(100, 100, 400, 200);
    }
    
    public void change() {
        if (currentColor == Color.GREEN) {
            currentColor = Color.YELLOW;
        } else {
            currentColor = Color.GREEN;
        }
        repaint();
    }
    
    public static void main(String[] args) {
        new ColorChangerVersion2().run();
    }

}
