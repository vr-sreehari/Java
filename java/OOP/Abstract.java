package OOP;

abstract class Member {
	String name;

	abstract void welcomeMessage();
}

class Student extends Member {
	void welcomeMessage() {
		System.out.println("Welcome Student...");
	}
}

class Teacher extends Member {
	void welcomeMessage() {
		System.out.println("Welcome Teacher...");
	}
}

public class Abstract {

	public static void main(String[] args) {

		Member[] m1 = new Member[4];
		m1[0] = new Student();
		m1[1] = new Student();
		m1[2] = new Teacher();
		m1[3] = new Teacher();

		for (Member m : m1) {
			m.welcomeMessage();
		}

	}

}
