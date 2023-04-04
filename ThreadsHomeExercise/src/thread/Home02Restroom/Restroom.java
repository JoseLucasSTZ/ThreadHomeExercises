package thread.Home02Restroom;

public class Restroom {

	private boolean isDirty = true;

	public void pee() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " is Knocking at door");

		synchronized (this) {

			System.out.println(name + " is Entering the restroom");

			if (isDirty == true) {
				waitOutSide(name);
			}

			System.out.println(name + " is Peeing");

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(name + " is Flushing the toilet");
			System.out.println(name + " is Washing hands");
			System.out.println(name + " is Leaving the restroom");
		}
	}

	public void poop() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is Knocking at door");
		synchronized (this) {

			if (isDirty == true) {
				waitOutSide(name);
			}

			System.out.println(name + " is Entering the restroom");
			System.out.println(name + " is Pooping");

			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			System.out.println(name + " is Flushing the toilet");
			System.out.println(name + " is Washing hands");
			System.out.println(name + " is Leaving the restroom");
		}
	}

	private void waitOutSide(String name) {
		System.out.println(name + ": Oh no, it's dirty!");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clean() {
		String name = Thread.currentThread().getName();

		System.out.println(name + " knocking at door");

		synchronized (this) {
			if(!isDirty){
				System.out.println(name + " It's clean yet!");
				return;
			}
			System.out.println(name + "entering the restroom");
			System.out.println("Cleanning");

			try {
				Thread.sleep(13000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(name + " Leaving the restroom");
		}
		this.isDirty = false;
		notifyAll();
	}

}
