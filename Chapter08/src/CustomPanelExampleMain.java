import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

public class CustomPanelExampleMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame window = new JFrame("Box Example");
                JPanel panel = new BoxPanel();
                panel.setPreferredSize(new Dimension(600, 400));
                window.add(panel);
                window.pack();
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
                
                for (var m : panel.getClass().getMethods()) {
                    System.out.println(m);
                }
                
                
            }
        });
    }
}

