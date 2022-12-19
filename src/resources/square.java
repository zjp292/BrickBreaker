package resources;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class square extends Rectangle {
    public boolean broken;
    Image squarePNG;
    public int moveX, moveY;


    public square(int x, int y, int w, int h, String location){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        moveX = 3;
        moveY = 3;

        try {
            squarePNG = ImageIO.read(new File(location));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void createSquare(Graphics g, Component comp){
        if(!broken)
            g.drawImage(squarePNG, x, y, width, height, comp);
    }



}
