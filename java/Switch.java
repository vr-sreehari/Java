import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		System.out.println("First Number: ");

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("Second Number: ");
		b = scanner.nextInt();
		System.out.println("Enter Operation: ");
		char operator = scanner.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			System.out.println("incorrect operator");

		}
	}

}
