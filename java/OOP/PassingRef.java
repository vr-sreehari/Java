package OOP;

class Box {
	int length;
	int breadth;
	int height;

	Box(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}

	boolean isEqual(Box b) {// cal by reference
		b.length++;
		if (length == b.length && height == b.height && breadth == b.breadth)
			return true;
		return false;
	}

	Box doubleBox() {// return box only reference value gets stored to called variable
		Box temp = new Box(2 * this.length, 2 * this.breadth, 2 * this.height);
		return temp;
	}

}

public class PassingRef {
	static void increment(int a) {// cal by value original value is not affected
		a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		increment(a);
		System.out.println(a);

		Box b1 = new Box(5, 4, 8);
		Box b2 = new Box(5, 4, 8);
		Box b3 = b2.doubleBox();

		System.out.println(b3.height);

		System.out.println(b1.isEqual(b2));
	}

}
