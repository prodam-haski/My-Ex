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
        ActionListener click = new clickOnStart();
        start.setSize(WIDGHTBUT, HEIGHTBUT );
        start.setForeground(Color.green);
        start.setLocation(X,Y);
        start.addActionListener(click);
        add(start);
        setVisible(true);
    }
    class clickOnStart implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            MainWindow main=new MainWindow();

        }
    }


public static void main(String[] args){
        StartWindow start=new StartWindow();
        }
}

