package thread.Home02Restroom;

public class cleanTask implements Runnable {

    private Restroom restroom;

    public cleanTask(Restroom restroom) {
        this.restroom = restroom;
    }

    @Override
    public void run() {

        while (true) {
            this.restroom.clean();

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
