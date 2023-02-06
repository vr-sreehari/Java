class Box {
	int height;
	int length;
	int breadth;
	static int boxCount;

	Box(int l, int b, int h) {// Constructor same name as the class name
		length = l;
		breadth = b;
		height = h;
		boxCount++;
	}

	Box(Box b) {// copy constructor
		length = b.length;
		breadth = b.breadth;
		height = b.height;
		boxCount++;
	}

	static {
		boxCount = 0;
	}

	static void showCount() {
		System.out.println("No of Objects created : " + boxCount);
	}

	void setDim(int l, int b, int h) {
		length = l;
		breadth = b;
		height = h;
	}

	int volume() {
		return height * length * breadth;
	}

	boolean isEqual(Box b) {
		if (length == b.length && breadth == b.breadth && height == b.height)
			return true;
		return false;

	}
}

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box BlackBox = new Box(10, 20, 30);
		BlackBox.setDim(52, 89, 108);
		System.out.println(BlackBox.volume()); // invoking method

		Box WoodenBox = new Box(5, 10, 23);

		Box b1 = new Box(5, 89, 108);
		System.out.println(BlackBox.isEqual(b1));

		Box b2 = new Box(b1);
		System.out.println(b1.isEqual(b1));

		System.out.println(BlackBox.height);
		System.out.println(WoodenBox.length);
		System.out.println(Box.boxCount);
		Box.showCount();

	}

}
