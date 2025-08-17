import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Paint extends JPanel implements MouseListener{
    private int boardSize;
    private Game game;

    public Paint(int boardSize) {
        this.boardSize = boardSize;
        this.game = new Game();
        setPreferredSize(new Dimension(boardSize, boardSize));
        setBackground(new Color(181, 134, 94));
        addMouseListener(this);
        setFocusable(true); // allows the JPanel to receive focus for key events -- will register a click
    }

    public void draw(Graphics g) {
        // This method can be used to perform any drawing operations
        // For example, you can call repaint() to trigger paintComponent
        g.setColor(Color.BLACK);
        g.fillRect(boardSize/3 - 40, 0, 20, boardSize);
        g.fillRect(boardSize*2/3, 0, 20, boardSize);
        g.fillRect(0, boardSize/3 - 40, boardSize, 20);
        g.fillRect(0, boardSize*2/3, boardSize, 20);
        
        // Add more drawing code as needed
        repaint();
    }
    public void mousePressed(MouseEvent event) {

    }

    public void mouseEntered(MouseEvent event){

    }
    public void mouseReleased(MouseEvent event){

    }
    
    public void mouseClicked(MouseEvent event){
        System.out.println(event.getX() + ", " + event.getY());
        int x = checkX(event);
        int y = checkY(event);
        game.placeMarker(x, y, 'X');
        game.print();
    }
    public int checkY(MouseEvent event){
        if(event.getY() >=0 && event.getY() < boardSize/3){
            return 0;
        }
        if(event.getY() >=boardSize/3 && event.getY() < boardSize * 2/3){
            return 1;
        }
        else{
            return 2;
        }
        
    }
    public int checkX(MouseEvent event){
        if(event.getX() >= 0 && event.getX() < boardSize/3 - 40){
            return 0;
        }
        if(event.getX() >= boardSize/3 - 40 && event.getX() <= boardSize*2/3){
            return 1;
        }
        else{
            return 2;
        }
    }
    public void mouseExited(MouseEvent event){

    }
    public void paintComponent(Graphics g) {
        // We need this function in order to draw on the JPanel. That's why autofill added this function for us
        super.paintComponent(g);
        // Drawing logic goes here
        draw(g);
    }
}
