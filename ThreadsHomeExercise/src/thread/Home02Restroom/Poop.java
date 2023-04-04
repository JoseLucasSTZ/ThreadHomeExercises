package thread.Home02Restroom;

public class Poop implements Runnable {

	private Restroom restroom;

	public Poop(Restroom restroom) {
		this.restroom = restroom;

	}

	@Override
	public void run() {
		restroom.poop();

	}
}