package snakegame;

import snakegame.Board;

import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack(); // frame refresh

       // setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
      //  setVisible(true);
    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);

    }
}
