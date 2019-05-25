package start;

import components.GameField;
import doing.LogicalIml;

import javax.swing.*;

public class MainWindow extends JFrame implements Size {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDGHTWIN, HEIGHTMAINWIN);
        setLocation(WIDGHTWIN, HEIGHTWIN);
        GameField gameField = new GameField();
        LogicalIml logic = new LogicalIml();
        add(logic);
        add(gameField);
        setVisible(true);
        setResizable(false);

    }
}