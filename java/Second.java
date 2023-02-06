
public class Second {
	public static void main(String args[]) {
		int n = 1;
		int n1 = 0b010010;
		long n2 = 8l;
		int n3 = 123_456_789;// similar to 123,456,789
		int n4 = 123__456__789;
		double n5 = 1.2345;
		double n6 = 12345e-05;
		// typecast
		byte b = 5;// 1byte
		int in;// 4bytes
		in = b;// not possible b=in--implicit typecasting
		b = (byte) in;// explicit typecasting

	}

}
