package OOP;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {
		Employee em = new Employee("kk", 5000.00, "20-06-1998");

		Class cls = em.getClass();

		System.out.println(cls.getName());

		Method[] methods = cls.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		try {
			System.out.println(methods[0].invoke(em, null));
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
