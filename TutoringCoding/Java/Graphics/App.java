import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        int boardWidth = 600; // number of pixels
        int boardHeight = 600;

        JFrame frame = new JFrame("Basic Shapes");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); // opens window in middle of screen
        frame.setResizable(false); // window can't be resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BasicShapes basicShapes = new BasicShapes(boardWidth, boardHeight);
        frame.add(basicShapes);
        //KeyListener l = new KeyListener(); 
  
        //frame.addKeyListener(KeyListener);
        frame.pack();
        basicShapes.requestFocus();
    }
}