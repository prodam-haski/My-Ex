package start;

import components.Field.DoubleField;
import components.Field.OneField;
import doing.LogicalIml;
import doing.LogicalIml2;

import javax.swing.*;

public class MainWindow extends JFrame implements Size {
    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDGHTWIN, HEIGHTMAINWIN);
        setLocation(WIDGHTWIN, HEIGHTWIN);
        OneField gameField = new OneField();
        LogicalIml logic = new LogicalIml();
        add(logic);
        add(gameField);
        setVisible(true);
        setResizable(false);
        setAlwaysOnTop( true );
        this.toFront();
    }

    public MainWindow(int i){
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDGHTWIN, HEIGHTMAINWIN);
        setLocation(WIDGHTWIN*2, HEIGHTWIN);
        DoubleField gameField2 = new DoubleField();
        LogicalIml2 logic = new LogicalIml2();
        add(logic);
        add(gameField2);
        setVisible(true);
        setResizable(false);
       // setAlwaysOnTop( true );

        this.toFront();
    }
}