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

    square blue = new square(175,480,150,25, "C:/Users/zachp/OneDrive/Desktop/BS.png");

    //create a ball
    square breaker = new square(237,435, 25, 25, "C:/Users/zachp/OneDrive/Desktop/ball.png");

    breakBricks(){
        addKeyListener(this);
        setFocusable(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
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

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            update();
            //move to the right
            blue.x = blue.x + 20;


            //reset size to avoid a trail

        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            blue.x -= 20;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



}
