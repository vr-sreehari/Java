import java.util.*;

public class Input {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats your name");

		String name = scanner.nextLine();

		System.out.println("Hello " + name);

		System.out.println("Whats your Rating");

		int rat = scanner.nextInt();

		System.out.println("Your rating " + rat);
		
		System.out.println("Whats your short");

		int sho = scanner.nextShort();
		String email = scanner.nextLine();

		System.out.println("Your rating " + email);

	}
}
