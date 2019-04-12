package Start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start_Window extends JFrame {
    public Start_Window(){
        setTitle("Welcom");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocation(500, 300);
        JButton start = new JButton("Start");
        ActionListener Click = new Click_on_Start();
        start.setSize(100, 50);
        start.setForeground(Color.green);
        start.setLocation(150, 20);
        start.addActionListener(Click);
        add(start);
        setVisible(true);
    }
    class Click_on_Start implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            Main_Window main=new Main_Window();

        }
    }


public static void main(String[] args){
        Start_Window start=new Start_Window();
        }
}

