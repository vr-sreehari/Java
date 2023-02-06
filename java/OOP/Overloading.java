package OOP;

public class Overloading {
	// method overloading...
	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static double max(double a, double b) {
		return a > b ? a : b;
	}

	static char max(char a, char b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5, 9));
		System.out.println(max(5.1, 9.8));
		System.out.println(max('a', 'c'));

	}

}
