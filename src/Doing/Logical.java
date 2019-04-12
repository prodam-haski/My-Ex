package Doing;

import Components.Elements.Elements.Apple;
import Components.Elements.Elements.Snake;
import Components.Elements.Elements.Wall;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public interface Logical {

    Apple apple=new Apple();;
    Wall wall=new Wall();
    Snake snake=new Snake();
    Moving move=new Moving();

    boolean in_game=true;

 class Moving {
        private boolean right= true;
        private boolean left;
        private boolean up;
        private boolean down;

        public void moveSnake() {
            for (int i = snake.getDots(); i > 0; i--) {
                snake.setX(i, snake.getX(i - 1));
                snake.setY(i, snake.getY(i - 1));
            }
            if (left) {
                snake.setX(0, snake.getX(0) - 10);
            }
            if (right) {
                snake.setX(0, snake.getX(0) + 10);
            }
            if (up) {
                snake.setY(0, snake.getY(0) - 10);
            }
            if (down) {
                snake.setY(0, snake.getY(0) + 10);
            }
        }

        public void setLeft ( boolean value){
            left = value;
        }

            public void setRight ( boolean value){
            right = value;
        }

            ;

            public void setUp ( boolean value){
            up = value;
        }

            ;

            public void setDown ( boolean value){
            down = value;
        }

            public boolean getLeft () {
            return left;
        }

            public boolean getRight () {
            return right;
        }

            public boolean getUp () {
            return left;
        }

            public boolean getDown () {
            return down;
        }
    }
}
