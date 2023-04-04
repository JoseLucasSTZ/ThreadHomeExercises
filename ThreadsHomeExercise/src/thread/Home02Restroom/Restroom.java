package thread.Home02Restroom;

public class Restroom {

	public void pee() {

		String name = Thread.currentThread().getName();
		System.out.println(name + " is Knocking at door");
		synchronized (this) {

			System.out.println(name + " is Entering the restroom");
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
}
