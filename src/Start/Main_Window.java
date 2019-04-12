package Start;

import Components.Elements.Game_field;
import Doing.Logical_Interface;

import javax.swing.*;

public class Main_Window extends JFrame {
    public Main_Window() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(405, 395);
        setLocation(300, 300);
        Game_field Game_field = new Game_field();
        Logical_Interface Logic = new Logical_Interface();
        add(Logic);
        add(Game_field);
        setVisible(true);
        setResizable(false);

    }
}