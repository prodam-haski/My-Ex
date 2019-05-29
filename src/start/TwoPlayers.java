package start;

public class TwoPlayers implements Runnable {
    private int flag=0;
    @Override
    public void run(){
        if(flag==0){
            MainWindow main1=new MainWindow();
            flag++;
        }
        else {
            MainWindow main2 = new MainWindow(0);
        }

    }
}
