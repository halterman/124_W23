import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BoxPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(100, 50, 100, 75);
    }
}
