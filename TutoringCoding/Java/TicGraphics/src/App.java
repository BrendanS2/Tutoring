import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int boardSize = 900;

        JFrame frame = new JFrame("Graphics");
        frame.setVisible(true);
        frame.setSize(boardSize, boardSize);
        frame.setLocationRelativeTo(null); // opens window in middle of screen
        frame.setResizable(false); // window size can't be changed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Paint graphics = new Paint(boardSize);
        frame.add(graphics);
        frame.pack(); // places JPanel inside frame with full dimensions
        // graphics.requestFocus(); // graphics is listening for key presses
    }
}