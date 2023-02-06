package OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 10, b = 5;
		int c = 0;
		try {
			int[] arr = null;
			// System.out.println(arr[0]);
			c = a / b;
			System.out.println("Try Block executed");
		} catch (ArithmeticException | NullPointerException e) {
			System.err.println("ArithmeticException Occured");
		} catch (Exception e) {
			System.err.println("Error Occured...");
		} finally {
			System.out.println("I will Run ever...");
		}
		File file = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int j;
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		// scanner.close();
		try (Scanner s1 = new Scanner(System.in)) {
			j = scanner.nextInt();
		}

		double amt = 500, withdraw = 700;
		try {
			if (amt < withdraw)
				throw new InsufficientFundsException(withdraw - amt);
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient Funds...");
		}
		System.out.println(j);

		System.out.println(c);
		System.out.println("End of program");

	}

}
