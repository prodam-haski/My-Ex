package components.elements;

import javax.swing.*;
import java.awt.*;

public class Snake extends Elements {
    private Image dot;
    private int dots;
    private int[] x =new int [getAll()];
    private int[] y =new int [getAll()];

    public Snake(){
        dots=3;
        for (int i=0;i<dots;i++) {
            x[i]=40-i*getSizeDot();
            y[i]=40;
        }
        loadSnakeImage();
    }

    private void loadSnakeImage(){
        ImageIcon iid=new ImageIcon("snake.png");
        dot=iid.getImage();

    }

    public void newSnake(){
        for (int i=0;i<dots;i++) {
            x[i]=0;
            y[i]=0;
        }
        dots=3;
        for (int i=0;i<dots;i++) {
            x[i]=40-i*getSizeDot();
            y[i]=40;
        }
    }

    public void increment(){dots++;}

    public int getDots(){return dots;}
    public int getX(int i){return x[i];}
    public int getY(int i){return y[i];}
    public Image getSnakeImage(){return dot;}

    public void setX(int i, int value){x[i]=value;}
    public void setY(int i, int value){y[i]=value;}
}
