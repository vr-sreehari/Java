package OOP;

class Cycle {
	void display() {
		System.out.println("Im a Cycle...");
	}
}

public class Anonymous {

	public static void main(String[] args) {
		Cycle c = new Cycle() {// anonymous class
			void display() {
				System.out.println("Im a Tricycle...");
			}
		};
		Cycle c2 = new Cycle();
		c.display();
		c2.display();

	}

}
