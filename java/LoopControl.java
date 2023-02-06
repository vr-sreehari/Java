import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n, sum = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");

		while (true) {
			n = scanner.nextInt();
			if (n < 0) {

				break;
			}
			sum += n;
		}
		System.out.println("The total is: " + sum);
	}

}
