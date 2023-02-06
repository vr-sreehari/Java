package Task;

public class PerfectSquare {
	public static void main(String[] args) {
		int n = 15;
		double sqrt = Math.sqrt(n);
		int nearestPerfectSquare = (int) Math.floor(sqrt) + 1;
		nearestPerfectSquare = nearestPerfectSquare * nearestPerfectSquare;
		System.out.println("The nearest perfect square greater than " + n + " is " + nearestPerfectSquare);
	}
}
