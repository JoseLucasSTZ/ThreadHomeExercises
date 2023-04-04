package thread.Home02Restroom;

public class cleanTask implements Runnable {

    private Restroom restroom;

    public CleanTask(Restroom restroom){
        this.restroom = restroom;
    }

    @Override
    public void run() {
        restroom.clean();
    }

}
