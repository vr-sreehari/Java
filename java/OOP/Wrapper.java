package OOP;

public class Wrapper {

	public static void main(String[] args) {

		int i = 10;
		float f = 18;

		Integer i1 = Integer.valueOf(20);// Boxing,wrapping
		int j = i1.intValue();// unboxing,unwrapping
		Integer i2 = 25;// autoboxing,autowrapping
		int k = i2; // autounboxing
		System.out.println(k);

	}

}
