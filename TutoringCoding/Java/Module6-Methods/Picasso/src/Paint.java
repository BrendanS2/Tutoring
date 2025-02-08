import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Paint extends JPanel implements ActionListener { int boardWidth;int boardHeight;int maxShapeWidth;int maxShapeHeight;int TimeinSec;Timer timerLoop; Paint(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.maxShapeWidth = boardWidth / 3;
        this.maxShapeHeight = boardHeight / 3;

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        // addKeyListener(this);
        setFocusable(true);

        timerLoop = new Timer(5000, this);
        timerLoop.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
        TimeinSec = 5;
        for (int i = 0; i < 5; i++) {
            TimeinSec= TimeinSec - 1;
    


        }
    }
    

    public void draw(Graphics g) {
        // this is where you will draw stuff!
        g.setColor(Color.BLACK);
        
        for (int i = 0; i < 100; i += 1) {
            setRandomColor(g);
            drawRandomRectangle(g);
            setRandomColor(g);
            drawrandomOval(g);
            setRandomColor(g);
            drawRandomPolygon(g);
        }

        
        
    }



    public void drawRandomRectangle(Graphics g) {
        int randomX = ((int)(Math.random()*boardWidth))-50;
        int randomY = ((int)(Math.random()*boardHeight))-50;
        int ranHeight = ((int) (Math.random()*maxShapeHeight));
        int ranWidth =((int) (Math.random()*maxShapeWidth));
        g.fillRect(randomX, randomY, ranWidth, ranHeight);
    }

    public void setRandomColor(Graphics g) {
        // how to create color?
        int red = ((int)(Math.random()*230));
        int green = ((int)(Math.random()*200));
        int blue = ((int)(Math.random()*255));
        Color myColor = new Color(red, green, blue);
        // red, green, and blue should be random numbers between 0 and 255
        g.setColor(myColor);
    }
    public void drawrandomOval(Graphics g) {
        int randomX = ((int)(Math.random()*boardWidth));
        int randomY = ((int)(Math.random()*boardHeight));
        int ranHeight = ((int) (Math.random()*maxShapeHeight));
        int ranWidth =((int) (Math.random()*maxShapeWidth));
        g.fillOval(randomX, randomY, ranWidth, ranHeight);
    }
    public void drawRandomPolygon(Graphics g) {
        int randomPoints = ((int)(Math.random()*6))+3;
        int[] xPoints = new int[8];
        int[] yPoints = new int[8];
        for (int i = 0; i < 8; i++) {
            int randomCordinates = ((int)(Math.random()*boardWidth));
            xPoints[i] = randomCordinates;
            int yRandomCordinates = ((int)(Math.random()*boardHeight));
            yPoints[i] = yRandomCordinates;
        }


        // int[] xPoints = {0, 50, 50, 0};
        // int[] yPoints = {0, 0, 50, 50};
        g.fillPolygon(xPoints, yPoints, randomPoints);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}
