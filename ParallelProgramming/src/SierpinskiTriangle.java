import javax.swing.*;
import java.awt.*;

public class SierpinskiTriangle extends JPanel {

    private void drawTriangle(Graphics g, int x, int y, int size) {
        if (size < 1) {
            return;
        }

        int halfSize = size / 2;

        // Draw the main triangle
        g.drawLine(x, y, x + size, y);
        g.drawLine(x, y, x + halfSize, y - size);
        g.drawLine(x + size, y, x + halfSize, y - size);

        // Recursively draw the smaller triangles
        drawTriangle(g, x, y, halfSize);
        drawTriangle(g, x + halfSize, y, halfSize);
        drawTriangle(g, x + halfSize / 2, y - halfSize, halfSize);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = Math.min(getWidth(), getHeight()) - 20;
        drawTriangle(g, 10, getHeight() - 10, size);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sierpinski Triangle");
        SierpinskiTriangle panel = new SierpinskiTriangle();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
