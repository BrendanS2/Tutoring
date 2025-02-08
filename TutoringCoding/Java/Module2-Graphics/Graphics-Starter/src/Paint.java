import java.awt.*;
import javax.swing.*;

public class Paint extends JPanel {
    
    int boardWidth;
    int boardHeight;

    Paint(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.WHITE);
        // addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // this is where you will draw stuff!
        g.setColor(Color.BLACK);
        g.fillRect(20, 20, 40, 40);
    }
}
