package gameBoard;

import javax.swing.*;
import java.net.http.WebSocket;


public class gameBoard {

    public void createWindow(){
        //initialize variables

        //create a window for game
        JFrame window = new JFrame("Brick Breaka");

        //create the main game panel
        breakBricks panel = new breakBricks();

        //init start screen
        JFrame start = new JFrame();
        JButton startButton = new JButton("Click here to start, please press space " +
                "once inside the game to begin");
        startButton.addActionListener(listener ->{
            start.setVisible(false);
            window.setVisible(true);
        });

        //start screen config
        //config window settings
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setVisible(true);
        start.setResizable(false);
        start.setSize(800,800);

        start.getContentPane().add(startButton);


        //config window settings
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(false);
        window.setResizable(false);
        window.setSize(800,800);

        //add panel to window
        window.getContentPane().add(panel);
    }
}
