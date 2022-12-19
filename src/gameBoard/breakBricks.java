package gameBoard;

import resources.square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class breakBricks extends JPanel implements KeyListener {

    //store total bricks in array list
    ArrayList<square> currentBricks = new ArrayList<square>();

    square blue = new square(175,700,150,25, "C:/Users/zachp/OneDrive/Desktop/BS.png");

    //create a ball
    square breaker = new square(237,435, 25, 25, "C:/Users/zachp/OneDrive/Desktop/ball.png");

    breakBricks(){
        setBackground(Color.DARK_GRAY);
        //add squares
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 0, 25, 25, "src/resources/brick1.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 25, 25, 25, "src/resources/brick2.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 50, 25, 25, "src/resources/brick3.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 75, 25, 25, "src/resources/brick4.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 100, 25, 25, "src/resources/brick1.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 125, 25, 25, "src/resources/brick2.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 150, 25, 25, "src/resources/brick3.png"));
        }
        for(int index = 0; index < 32; index ++)
        {
            currentBricks.add(new square((index * 25), 175, 25, 25, "src/resources/brick4.png"));
        }

        addKeyListener(this);
        setFocusable(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        currentBricks.forEach(square -> {
            square.createSquare(graphics, this);
        });
        blue.createSquare(graphics, this);
    }

    public void update() {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            new Thread(() -> {
                while(true){
                    update();
                    try{
                        Thread.sleep(10);

                    } catch(InterruptedException error){
                        error.printStackTrace();
                    }
                }
            }).start();
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT && blue.x < getWidth() - blue.width){
            update();
            //move to the right
            blue.x = blue.x + 20;


            //reset size to avoid a trail

        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT && blue.x > 0){
            update();
            blue.x -= 20;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



}
