package doing;

import components.elements.Apple;
import components.elements.Snake;
import components.elements.Wall;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicalIml extends JPanel implements ActionListener, Logical {

    private Timer timer;



    public LogicalIml(){
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
