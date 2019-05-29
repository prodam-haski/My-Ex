package doing.timescore;

public class ScoreOfGame {
    private int score=0;
    private int progress=7;

    public void incrementScore(){score++;}
    public void incrementProgress(){progress+=7;}
    public int getScore(){return score;}
    public int getProgress(){return progress;}

    public void newScore(){
        score=0;
        progress=7;
    }
}
