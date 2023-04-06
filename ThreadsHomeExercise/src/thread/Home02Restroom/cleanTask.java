package thread.Home02Restroom;

public class cleanTask implements Runnable {

    private Restroom restroom;

    public cleanTask(Restroom restroom) {
        this.restroom = restroom;
    }

    @Override
    public void run() {
        this.restroom.clean();
    }

}
