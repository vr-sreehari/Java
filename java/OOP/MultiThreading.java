package OOP;

/*class Book implements Runnable {
	public void run() {
		for (int j = 0; j < 5; j++) {
			System.out.println("updating DB...");
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}*/

class Table extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {

		Runnable b1 = () -> {// anonymous lambda expression
			for (int j = 0; j < 5; j++) {
				System.out.println("updating DB...");
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Table t1 = new Table();
		Thread td1 = new Thread(b1);
		t1.setName("A New Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName());
		td1.start();
		t1.start();
		if (td1.isAlive()) {
			System.out.println("I'm Still Executing...");
		}
		td1.join();
		t1.join();
		if (td1.isAlive()) {
			System.out.println("I'm Still Executing...");
		}
		System.out.println("Bye...");
	}

}
