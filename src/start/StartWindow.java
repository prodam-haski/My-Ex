package start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame implements Size{
    public StartWindow(){
        setTitle("Welcom");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDGHTWIN, HEIGHTWIN);
        setLocation(WIDGHTWIN, HEIGHTWIN);

        JButton start = new JButton("Start");
        JButton two = new JButton("Two players");

        ActionListener click1 = new clickOnStart();
        ActionListener click2 = new clickOnTwoPlaeyrs();

        start.setSize(WIDGHTBUT, HEIGHTBUT );
        start.setForeground(Color.green);
        start.addActionListener(click1);

        two.setSize(WIDGHTBUT, HEIGHTBUT );
        two.setForeground(Color.red);
        two.setLocation(X,Y);
        two.addActionListener(click2);

        add(start);
        add(two);

        setVisible(true);
    }

    class clickOnStart implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            MainWindow main=new MainWindow();
        }
    }

    private class clickOnTwoPlaeyrs implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            TwoPlayers twoPlayers=new TwoPlayers();
            twoPlayers.run();
            twoPlayers.run();

        }
    }

    public static void main(String[] args){
        StartWindow start=new StartWindow();
        }

}

