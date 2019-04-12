package Components.Elements.Elements;

import javax.swing.*;
import java.awt.*;

public class Wall extends Elements{
    private int blocks;
    private int[] wallX=new int[getAll()/2]; //wX
    private int[] wallY=new int [getAll()/2];

    private Image block;

    public Wall(){
        //blocks=new Random().nextInt(20)*5;

        int j=0;
        for (;j<39;j++) {
            wallX[j] = j * getSize_dot();
            wallY[j] = 0;
        }
        for (int i=1;j<74;i++,j++){
            wallX[j] = 0;
            wallY[j] = i * getSize_dot();
        }
        for (int i=1;j<109;i++,j++){
            wallX[j] = 38 * getSize_dot();
            wallY[j] = i * getSize_dot();
        }
        for (int i=1;j<146;i++,j++){
            wallY[j] = 35 * getSize_dot();
            wallX[j] = i * getSize_dot();
        }
        load_BlockImage();
        blocks=j;
    }

    private void load_BlockImage(){
        ImageIcon iib=new ImageIcon("BLOCK.jpg");
        block=iib.getImage();
    }

    public int getBlocks(){return blocks;}
    public int getWallX(int i){return wallX[i];}
    public int getWallY(int i){return wallY[i];}
    public Image getWallImage(){return block;}
}
