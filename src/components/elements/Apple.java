package components.elements;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Apple extends Elements{
    private int appleX;
    private int appleY;

    private Image apple;

    public Apple(){
       createApple();
       loadAppleImage();
    }

    public void createApple(){ appleX=new Random().nextInt(38)* getSizeDot();
        appleY=new Random().nextInt(36)*getSizeDot();
       /* for (int i=0;i<blocks;i++){
            if (appleX==wallX[i]&&appleX==wallY[i]){
                create_Apple();
            }
        }
        for (int i=0;i<dots;i++){
            if (appleX==x[i]&&appleY==y[i]){
                create_Apple();
            }
        }*/

    }

    private void loadAppleImage() {
        ImageIcon iia = new ImageIcon("Apple.png");
        apple = iia.getImage();
    }

    public int getAppleX(){return appleX;}
    public int getAppleY(){return appleY;}
    public Image getAppleImage(){return apple;}
}
