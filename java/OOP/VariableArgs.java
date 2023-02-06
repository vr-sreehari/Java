package OOP;

public class VariableArgs {
	static int minValue(int... value) {
		int min = Integer.MAX_VALUE;
		for (int x : value) {
			if (min > x)
				min = x;
		}
		return min;
	}

	static int[] multiVal(String c, Boolean d, int... val) {
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minValue(1, 2, 3, 5));
		System.out.println(multiVal("daata", true, 1, 2, 3, 5));

	}

}
