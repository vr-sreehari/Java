
public class ClassMethod {

	static int BoxVolume(int length, int breadth, int height) {
		return length * breadth * height;
	}

	static void printLine() {
		System.out.println("---------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLine();
		System.out.println(BoxVolume(2, 3, 4));
		printLine();
		System.out.println(BoxVolume(6, 3, 7));
		printLine();

	}

}
