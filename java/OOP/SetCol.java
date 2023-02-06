package OOP;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCol {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<String>();
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		TreeSet<String> h3 = new TreeSet<String>();

		h.add("Priya");
		h.add("Allwyn");
		h.add("Kavitha");
		h.add("Saran");
		h.add("Manal");
		h1.add("Priya");
		h1.add("Allwyn");
		h1.add("Kavitha");
		h1.add("Saran");
		h1.add("Manal");
		h3.add("Priya");
		h3.add("Allwyn");
		h3.add("Kavitha");
		h3.add("Saran");
		h3.add("Manal");
		System.out.println(h);
		System.out.println(h1);
		System.out.println(h3);

	}

}
