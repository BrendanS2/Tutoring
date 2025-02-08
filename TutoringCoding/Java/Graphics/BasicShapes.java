import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.ArrayList;

public class BasicShapes extends JPanel implements ActionListener, KeyListener{

    public class Line {
        int x1;
        int y1;
        int x2;
        int y2;

        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public class Wall {
        int x;
        int y;
        int width;
        int height;

        Wall(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }


    int boardWidth;
    int boardHeight;

    // game and movement logic
    int velocityX;
    int velocityY;

    // chicken location
    int chickenX;
    int chickenY;

    // game timing
    Timer gameLoop;

    BasicShapes(int boardWidth, int boardHeight) { // constructor: the code that runs when we make an instance of a class
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        

        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));

        addKeyListener(this);

        // you can make any color you want using R, G, B values between 0 and 255!
        Color skyBlue = new Color(201, 241, 248);
        setBackground(skyBlue);
        setFocusable(true);

        this.velocityX = 0;
        this.velocityY = 0;

        this.chickenX = boardWidth/2 - 15;
        this.chickenY = 385;

        // game logic
        gameLoop = new Timer(100, this);
        gameLoop.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        // make shapes!
        // fillReact() takes in x, y, width, height
        g.setColor(new Color(0, 250, 10));
        g.fillRect(boardWidth / 2-150, boardHeight / 2-200, 300, 400);        //wall
        // fillOval() takes in x, y, width, height
        g.setColor(new Color(255, 250, 255));
        g.fillOval(this.chickenX, this.chickenY, 30, 30); // x and y location of chicken are variable
        g.setColor(new Color(195, 233, 145));
        g.fillRect(boardWidth/2 - 150, boardHeight/2 - 200, 300, 50);        //wall
        g.setColor(new Color(203, 144, 77));
        g.fillRect(boardWidth/2 - 50, boardHeight/2 + 30, 200, 30);
        g.setColor(new Color(203, 144, 77));
        g.fillRect(boardWidth/2 - 150, boardHeight/2 - 50, 150, 30);        // horizontal wall on left
        g.setColor(new Color(203, 144, 77));
        g.fillRect(boardWidth/2 - 50, boardHeight/2 - 150, 200, 30);        //wallTopRight
        g.setColor(Color.red);
        g.fillRect(boardWidth/2+18, boardHeight/2 +60, 130, 140);
        g.setColor(Color.black);
        g.fillRect(boardWidth/2 +50, boardHeight/2 +120, 60,50);
        
        // fillArc() takes in x, y, width, height, startAngle, endAngle
        // g.fillArc(100, 100, 80, 80, 45, 270);
        Stroke newStroke = new BasicStroke(40);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(newStroke);
        //g.drawRect(boardWidth/2 - 150,  boardHeight/2 - 200, 301, 400); //
        // x1, y1: boardWidth/2-150, boardHeigth/2 x2, y2: boardWidth/2, boardHeight/2
        Line line1 = new Line(boardWidth/2-150, boardHeight/2-20, boardWidth/2, boardHeight/2-20);
    }

    public void move() { // updates the position of our chicken
        // depending on velocity (direction and speed), position updates
        // Line line1 = new Line(boardWidth/2-150, boardHeight/2-20, boardWidth/2, boardHeight/2-20);
        // Line line2 = new Line(boardWidth/2-50, boardHeight/2-120, boardWidth/2+150, boardHeight/2-120);
        Wall wall1 = new Wall(boardWidth/2 - 150, boardHeight/2 - 50, 150, 30);

        ArrayList<Wall> walls = new ArrayList<>();
        // upwardLines.add(line1);
        // upwardLines.add(line2);
        walls.add(wall1);
        for (Wall wall : walls) {
            if (checkWallCollision(wall)) {
                velocityX = 0;
                velocityY = 0;
                this.chickenX = boardWidth/2 - 15;
                this.chickenY = 385;
            }
        }

        // for (Line line : upwardLines) { // enhanced for loop
        //     if (checkUpwardCollision(line)) {
        //         velocityX = 0;
        //         velocityY = 0;
    
        //     }
        // }

        chickenX += velocityX;
        chickenY += velocityY;
    }

    public boolean checkWallCollision(Wall wall) {
        // chicken is within the x bounds of the wall
        boolean withinX = chickenX > wall.x && chickenX < wall.x + wall.width;
        boolean withinY = chickenY > wall.y && chickenY < wall.y + wall.height;
        if (withinX && withinY) {
            return true;
        }
        return false;
    }

    public boolean checkUpwardCollision(Line line) {
        boolean vertical = line.x1 == line.x2;

        if (velocityX == 0 && velocityY < 0) { // if chicken traveling up
            if (!vertical && chickenY < line.y1 && chickenX > line.x1 && chickenX < line.x2) {
                System.out.println("collision!");
                return true;
            }
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    // implement key listener functions
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed");
        // retrieve the keycode from the key event. based on what it is we change the direction of the chicken
        if (e.getKeyCode() == KeyEvent.VK_A) {
            velocityX = -10;
            velocityY = 0;
            System.out.println("A key");
        } else if (e.getKeyCode() == KeyEvent.VK_D){
            velocityX = 10;
            velocityY = 0;
            System.out.println("D key");
        }else if (e.getKeyCode() == KeyEvent.VK_W){
            velocityX = 0;
            velocityY = -5;
            System.out.println("W key");
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            velocityX = 0;
            velocityY = 5;
            System.out.println("S key");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    
    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
