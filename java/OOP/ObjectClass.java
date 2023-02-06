package OOP;

public class ObjectClass {

	public static void main(String[] args) {

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Python");
		String s4 = new String("Python");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

	}

}
