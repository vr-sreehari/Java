package OOP;

interface Ridable { // SAM interface - Functional Interface
	void check();

	int MAX_SPEED = 90;// final static by default

	default void display() {
		System.out.println("Hello from Interface...");
	}
}

class Car implements Ridable {
	public void check() {
		System.out.println("Your riding a Car...");
	}

	public void display() {
		System.out.println("Hello from Car...");
	}
}

class Bike implements Ridable {
	public void check() {
		System.out.println("Your riding a Bike...");
	}
}

class Mechanic {
	void repair(Ridable v) {
		System.out.println("Checking...");
		v.check();
	}

}

public class Interface {

	public static void main(String[] args) {
		Car c1 = new Car();
		Bike b1 = new Bike();
		Mechanic m1 = new Mechanic();
		m1.repair(b1);
		m1.repair(c1);
		c1.display();

		Ridable r1 = new Ridable() {
			public void check() {
				System.out.println("Im riding interface...");
			}
		};
		r1.check();
		// Lambda Expression
		Ridable r2 = () -> System.out.println("Im riding interface...");

		r2.check();

	}

}
