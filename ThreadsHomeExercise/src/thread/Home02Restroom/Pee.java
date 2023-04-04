package thread.Home02Restroom;

public class Pee implements Runnable {

	private Restroom restroom;


	public Pee(Restroom restroom) {
		
		this.restroom = restroom;
	}

	@Override
	public void run() {
		restroom.pee();
		
		
	
	}

}
