package Doing;

import Components.Elements.Elements.Apple;
import Components.Elements.Elements.Snake;
import Components.Elements.Elements.Wall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Logical_Interface extends JPanel implements ActionListener, Logical {

    private Timer timer;

    protected Apple apple=new Apple();;
    protected Wall wall=new Wall();
    protected Snake snake=new Snake();

    public Logical_Interface(){

        addKeyListener(new MoveKeyListener());
        timer = new Timer(250,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {if (in_game){
        move.moveSnake();

    }


    }

    class MoveKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            super.keyPressed(e);
            int key=e.getKeyCode();
            if(key==KeyEvent.VK_LEFT && !move.getRight()){
                move.setLeft(true);
                move.setUp(false);
                move.setDown(false);
            }
            if(key==KeyEvent.VK_RIGHT && !move.getLeft()){
                move.setRight(true);
                move.setUp(false);
                move.setDown(false);
            }
            if(key==KeyEvent.VK_UP && !move.getDown()){
                move.setUp(true);
                move.setLeft(false);
                move.setRight(false);
            }
            if(key==KeyEvent.VK_DOWN && !move.getUp()){
                move.setDown(true);
                move.setLeft(false);
                move.setRight(false);
            }
        }
    }
}
