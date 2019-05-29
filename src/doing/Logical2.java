package doing;

import components.elements.Apple;
import components.elements.Snake;
import components.elements.Wall;
import doing.timescore.Score;
import doing.timescore.Score2;

public interface Logical2 extends Score2 {
    Apple apple=new Apple();;
    Wall wall=new Wall();
    Snake snake=new Snake();
    Moving move=new Moving();
    InGame game=new InGame();
    Checking check=new Checking();

    class InGame {
        private boolean inGame=true;

        public void setInGame(boolean value){inGame=value; }
        public boolean getInGame(){return inGame;}
    }


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
        public void newMoving(){
            right=true;
            left=false;
            up=false;
            down=false;
        }

        public void setLeft ( boolean value){
            left = value;
        }
        public void setRight ( boolean value){
            right = value;
        }
        public void setUp ( boolean value){
            up = value;
        }
        public void setDown ( boolean value){
            down = value;
        }

        public boolean getLeft () { return left; }
        public boolean getRight () { return right; }
        public boolean getUp () { return up; }
        public boolean getDown () { return down; }
    }

    class Checking  {


        public void checkApple(){
            if(snake.getX(0)==apple.getAppleX()&&snake.getY(0)==apple.getAppleY()){
                snake.increment();
                apple.createApple();
                score.incrementScore();
            }

            for (int i=0;i<wall.getBlocks();i++){
                if (apple.getAppleX()==wall.getWallX(i)&&apple.getAppleY()==wall.getWallY(i)){
                    apple.createApple();
                }
            }
        }

        public void checkScore() {
            if (score.getScore() == score.getProgress()) {
                time.changeTiming();
                score.incrementScore();
                score.incrementScore();
            }
        }

        public void checkCrash(){
            for (int i=snake.getDots();i>0;i--){
                if (snake.getDots()>3&&snake.getX(0)==snake.getX(i)&&snake.getY(0)==snake.getY(i)){
                    game.setInGame(false);
                }
            }
            for (int i=0;i<wall.getBlocks();i++){
                if(snake.getX(0)==wall.getWallX(i)&&snake.getY(0)==wall.getWallY(i)){
                    game.setInGame(false);
                }
            }
        }
    }
}
