package OOP;

class A {
	void display() {
		System.out.println("From class A");
	}
}

class B extends A {
	void display() {
		System.out.println("From class B");
	}
}

class C extends B {

}

public class MultipleInheritance {

	public static void main(String[] args) {

		C c = new C();
		c.display();

	}

}
