import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Plots trend data over time.
 * @author Rick Halterman
 * @date 2021-03-10
 */
public class Plotter {
    
    @SuppressWarnings("serial")
    private static class PlotPanel extends JPanel {
        private Dimension dimension;
        private double[] dataSet;

        public PlotPanel(double[] data, int width, int height) {
            dataSet = data;
            dimension = new Dimension(width, height);
            setBackground(Color.WHITE);
        }

        @Override
        public Dimension getPreferredSize() {
            return dimension;
        }
        
        private static double minimum(double[] data) {
            double min = Double.MAX_VALUE;
            for (double elem : data) {
                if (elem < min) {
                    min = elem;
                }
            }
            return min;
        }

        private static double maximum(double[] data) {
            double max = Double.MIN_VALUE;
            for (double elem : data) {
                if (elem > max) {
                    max = elem;
                }
            }
            return max;
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int height = getHeight();
            int width = getWidth();
            // Compute the vertical size of the data
            double min = minimum(dataSet);
            double max = maximum(dataSet);
            double dataHeight = max - min; //range(dataSet); 
            double widthScale = (double) width/(dataSet.length - 1);
            double heightScale = height/dataHeight;
            // Draw baseline at y = 0
            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(0, (int)(height + min*heightScale), 
                       width, (int)(height + min*heightScale));
            
            // Plot data
            g.setColor(Color.RED);
            for (int i = 1; i < dataSet.length; i++) {
                int x1 = (int) Math.round((i - 1) * widthScale), 
                    y1 = height - (int) Math.round((dataSet[i - 1] - min) * heightScale),
                    x2 = (int) Math.round(i * widthScale), 
                    y2 = height - (int) Math.round((dataSet[i] - min) * heightScale);
                if (y1 < 1) {
                    y1 = 1;
                }
                if (y2 < 1) {
                    y2 = 1;
                }
                g.drawLine(x1, y1, x2, y2);
//                Original line drawing:
//                g.drawLine((int) Math.round((i - 1) * widthScale), 
//                           height - (int) Math.round((dataSet[i - 1] - min) * heightScale),
//                           (int) Math.round(i * widthScale), 
//                           height - (int) Math.round((dataSet[i] - min) * heightScale));
            }
        }
    }

    /**
     * Plots the data stored in an array in a graphical window
     * with a given size.  The plot fills the window horizontally
     * and vertically.
     * @param data the data set to plot
     * @param left the <em>x</em> position of the plot window's left-top corner
     * @param top the <em>y</em> position of the plot window's left-top corner
     * @param width the width of the graphical window, in pixels
     * @param width the width of the graphical window, in pixels
     * @param height the height of the graphical window, in pixels
     */
    public static void plot(double[] data, int left, int top, int width, int height) {
        JFrame window = new JFrame("Plot");
        JPanel panel = new PlotPanel(data, width, height);
        window.add(panel);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(left, top);
        window.setVisible(true);
    }
    
    
    /**
     * Plots the data stored in an array in a graphical window
     * with a given size.  The plot fills the window horizontally
     * and vertically.
     * @param data the data set to plot
     * @param width the width of the graphical window, in pixels
     * @param height the height of the graphical window, in pixels
     */
    public static void plot(double[] data, int width, int height) {
        plot(data, 50, 50, width, height);
    }
    
    /**
     * Plots the data stored in an array in a graphical window
     * with a given size.  The plot fills the window horizontally
     * and vertically.  This overloaded method accepts an array of integers.
     * @param data the data set to plot
     * @param width the width of the graphical window, in pixels
     * @param height the height of the graphical window, in pixels
     */
    public static void plot(int[] data, int width, int height) {
        plot(data, 100, 50, width, height);
    }

    /**
     * Plots the data stored in an array in a graphical window
     * with a given size.  The plot fills the window horizontally
     * and vertically.  This overloaded method accepts an array of integers.
     * @param data the data set to plot
     * @param left the <em>x</em> position of the plot window's left-top corner
     * @param top the <em>y</em> position of the plot window's left-top corner
     * @param width the width of the graphical window, in pixels
     * @param height the height of the graphical window, in pixels
     */
    public static void plot(int[] data, int left, int top, int width, int height) {
        // Works, but not as efficient
        //plot(Arrays.stream(data).asDoubleStream().toArray(), width, height);
        
        // More efficient for this application
        double[] doubleData = new double[data.length];
        for (int i = 0; i < doubleData.length; i++) {
            doubleData[i] = data[i];
        }
        plot(doubleData, left, top, width, height);
    }
}
