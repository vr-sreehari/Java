package Task;

public class Number1 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 4 == 0 && i % 6 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
