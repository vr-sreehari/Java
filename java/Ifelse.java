import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Marks: ");
		mark = scanner.nextInt();
		if (mark >= 90) {
			System.out.println("A Grade");
		} else {
			System.out.println("Other Grades");
		}

	}

}
