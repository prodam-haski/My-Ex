package doing;

import components.elements.Apple;
import components.elements.Snake;
import components.elements.Wall;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logical_Interface extends JPanel implements ActionListener, Logical {

    private Timer timer;

    protected Apple apple=new Apple();;
    protected Wall wall=new Wall();
    protected Snake snake=new Snake();

    public Logical_Interface(){


        timer = new Timer(250,this);
        timer.start();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (game.getInGame()){
        move.moveSnake();
        check.checkApple();
        check.checkCrash();
        }
    }


}
