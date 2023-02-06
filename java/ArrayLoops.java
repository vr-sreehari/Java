
public class ArrayLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 6, 5, 4, 9 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int y : a) {// foreach loop
			System.out.println(y);
		}

	}

}
