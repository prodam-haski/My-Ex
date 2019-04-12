package Components.Elements;

import Components.Elements.Elements.Apple;
import Doing.Logical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game_field extends JPanel implements ActionListener, Logical {

    private Timer timer;

    public Game_field(){

        setBackground(Color.green);
        setFocusable(true);
        timer = new Timer(250,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(in_game){
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
               // in_game=true;
                repaint();
                //Main_Window restart = new Main_Window();
            }
        }
    }
}
