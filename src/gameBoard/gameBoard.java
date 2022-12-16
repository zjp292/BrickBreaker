package gameBoard;
import javax.swing.*;
import java.awt.*;


public class gameBoard {

    public void createWindow(){
        //initialize variables
        JButton testButton;

        //create a window for game
        JFrame window = new JFrame("Brick Breaka");

        //exit program on close
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create board and buttons
        JPanel board = new JPanel();

        testButton = new JButton("this is a button");

        board.add(testButton);

        //customize window
        board.setBackground(Color.DARK_GRAY);
        window.add(board);
        window.setResizable(false);
        window.pack();
        //window.setLocationRelativeTo(null);
        window.setSize(1200,800);



        window.show();
    }
}
