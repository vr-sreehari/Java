package OOP;

class Outer {
	int ou;

	public void getData() {
		System.out.println("Im Outer Class");
	}

	class Inner {
		int in;

		public void getData() {
			System.out.println("Im Inner Class");
		}

	}

	static class Inner2 {
		int in2;

		public void getData() {
			System.out.println("Im static inner class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {

		Outer o = new Outer();
		o.getData();
		Outer.Inner i = o.new Inner(); // for normal class
		i.getData();
		Outer.Inner2 is = new Outer.Inner2();// for static class
		is.getData();
	}

}
