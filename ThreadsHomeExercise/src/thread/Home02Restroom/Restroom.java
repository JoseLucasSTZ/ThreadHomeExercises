package thread.Home02Restroom;

public class Restroom {

	private boolean isDirty = true;

	public void pee() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is Knocking at door");

		synchronized (this) {

			WaitToClean(name);

			System.out.println(name + " is Peeing");

			SleepABit(10000);

			System.out.println(name + " is Flushing the toilet");
			System.out.println(name + " is Washing hands");
			System.out.println(name + " is Leaving the restroom");
		}

		this.isDirty = true;

	}

	public void poop() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is Knocking at door");
		synchronized (this) {

			WaitToClean(name);

			System.out.println(name + " is Entering the restroom");
			System.out.println(name + " is Pooping");

			SleepABit(20000);

			System.out.println(name + " is Flushing the toilet");
			System.out.println(name + " is Washing hands");
			System.out.println(name + " is Leaving the restroom");
		}
		this.isDirty = true;
	}

	private void WaitToClean(String name) {
		while (isDirty == true) {
			System.out.println(name + " Oh, it's dirty!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void SleepABit(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void clean() {
		String name = Thread.currentThread().getName();

		System.out.println(name + " knocking at door");

		synchronized (this) {
			System.out.println(name + " entering the restroom");

			if (this.isDirty == false) {
				System.out.println(name + " It's clean yet!");
				return;
			}

			System.out.println(name + " Cleanning");
			this.isDirty = false;

			try {
				Thread.sleep(13000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		this.notifyAll();
		System.out.println(name + " Leaving the restroom");
	}

}
