package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		System.out.println(list);
		ArrayList<String> slist = new ArrayList<String>();
		for (int i = 1; i <= 10; i++)
			slist.add("Test " + i);
		System.out.println(slist);
		ArrayList rlist = new ArrayList();
		rlist.add(100);
		rlist.add("random");
		rlist.add(true);
		System.out.println(rlist);
		for (String s : slist)
			System.out.println(s);
		Iterator ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
