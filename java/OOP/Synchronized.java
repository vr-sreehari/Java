package OOP;

class MultiPrint {
	public synchronized void print(int n) {
		for (int i = 1; i < 6; i++) {
			System.out.println(i * n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class Synchronized {

	public static void main(String[] args) {

		MultiPrint mp = new MultiPrint();
		Thread t1 = new Thread() {
			public void run() {
				mp.print(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				mp.print(10);
			}
		};
		t1.start();
		t2.start();
		mp.print(5);
	}

}
