package Task;

public class MethodTask {

	public static int findSumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

	public static void printWelcomeMessage() {
		String message = "Welcome";
		int length = message.length();
		for (int i = 0; i < length + 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("* " + message + " *");
		for (int i = 0; i < length + 4; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static boolean isTwoDigitNumber(int number) {
		if (number >= 10 && number < 100) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWelcomeMessage();
		System.out.println(findSumOfDigits(25));
		System.out.println(isTwoDigitNumber(222));

	}

}
