import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class GraphicalApplication extends JPanel {
    // The text intended to be displayed in the parent window's title bar
    private String title;
   // The size of the panel
    protected final Dimension PANEL_DIMENSION;

    @Override
    public Dimension getPreferredSize() {
        return PANEL_DIMENSION;
    }

    public GraphicalApplication(String title, int width, int height) {
        PANEL_DIMENSION = new Dimension(width, height);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void run() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // This window will exist while the graphical program executes
                JFrame window = new JFrame(title);
                window.add(GraphicalApplication.this);
                window.pack();
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
            }
        });
    }
}
