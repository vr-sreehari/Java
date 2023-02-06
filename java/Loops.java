
public class Loops {

	public static void main(String args[]) {
		int counter = 500;

		for (int i = 0; i < 500; i++) {
			System.out.print(i);
		}
		int a, b;
		for (a = 1, b = 2; a < b; a++, b--) {
			System.out.print("for loop new method");
		}
		a = 1;
		while (a < 5) {
			System.out.print(a);
			a++;
		}
		b = 1;
		do {
			System.out.print(b);
			b++;
		} while (b < 5);

	}

}
