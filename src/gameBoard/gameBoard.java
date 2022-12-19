package gameBoard;

import javax.swing.*;


public class gameBoard {

    public void createWindow(){
        //initialize variables

        //create a window for game
        JFrame window = new JFrame("Brick Breaka");


        breakBricks panel = new breakBricks();

        //add panel to window
        window.getContentPane().add(panel);

        //config window settings
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
        window.setSize(800,800);
    }
}
