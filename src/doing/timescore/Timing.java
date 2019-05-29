package doing.timescore;

public class Timing {
    private int timing=200;

    public int getTiming(){return timing;}

    public void changeTiming(){
        if(timing>=60){
            timing-=20;
        }
    }
    public void newTiming(){timing=200;}
}
