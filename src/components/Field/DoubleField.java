package components.Field;

import doing.Logical2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DoubleField extends JPanel implements Logical2, ActionListener {
    private Timer timer;
    public DoubleField(){
        addKeyListener(new AltMoveKeyListener());
        setBackground(Color.green);
        setFocusable(true);
        timer = new Timer(time.getTiming(),this);
        timer.start();
    }

    class AltMoveKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){
            super.keyPressed(e);
            int key=e.getKeyCode();
            if(key==KeyEvent.VK_A && !move.getRight()){
                move.setLeft(true);
                move.setUp(false);
                move.setDown(false);
            }
            if(key==KeyEvent.VK_D && !move.getLeft()){
                move.setRight(true);
                move.setUp(false);
                move.setDown(false);
            }
            if(key==KeyEvent.VK_W && !move.getDown()){
                move.setUp(true);
                move.setLeft(false);
                move.setRight(false);
            }
            if(key==KeyEvent.VK_S && !move.getUp()){
                move.setDown(true);
                move.setLeft(false);
                move.setRight(false);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
        timer.stop();
        timer = new Timer(time.getTiming(),this);
        timer.start();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(game.getInGame()){
            g.drawImage(apple.getAppleImage(),apple.getAppleX(),apple.getAppleY(),this);
            for (int i=0;i<snake.getDots();i++){
                g.drawImage(snake.getSnakeImage(),snake.getX(i),snake.getY(i),this);
            }

            for (int i=0;i<wall.getBlocks();i++){
                g.drawImage(wall.getWallImage(),wall.getWallX(i),wall.getWallY(i),this);
            }
        }
        else{
            String str="Game over. Press Space";
            g.setColor(Color.red);
            g.drawString(str,120,400/3);
            addKeyListener(new ClickKeyListener());

        }
    }

    class ClickKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_SPACE) {
                removeAll();
                game.setInGame(true);
                snake.newSnake();
                move.newMoving();
                score.newScore();
                time.newTiming();
                repaint();
            }
        }
    }
}
