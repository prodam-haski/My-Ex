package doing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicalIml2 extends JPanel implements ActionListener, Logical2 {

    private Timer timer;



    public LogicalIml2(){
        timer = new Timer(time.getTiming(),this);
        timer.start();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (game.getInGame()){
            move.moveSnake();
            check.checkApple();
            check.checkCrash();
            check.checkScore();
            timer.stop();
            timer = new Timer(time.getTiming(),this);
            timer.start();
        }
    }
}
