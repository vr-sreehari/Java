package OOP;

import java.util.Date;

class Department implements Cloneable {
	int ID;
	String deptName;

	Department(int id, String dept) {
		ID = id;
		deptName = dept;
	}

	void display() {
		System.out.println("Dept ID: " + ID + "\n Dept Name: " + deptName);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student1 implements Cloneable {
	int ID;
	String name;
	Date dob;
	Department dept;

	Student1(int id, String name, Department dpt) {
		ID = id;
		this.name = name;
		dept = dpt;
	}

	void display() {
		System.out.println("Student ID: " + ID + "\nStudent Name: " + name);
		dept.display();
	}

	protected Object clone() throws CloneNotSupportedException {
		Student1 s = (Student1) super.clone();
		s.dept = (Department) s.dept.clone();
		s.dob = (Date) s.dob.clone();// need to overide and deep copy all objects
		return s;
	}

}

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department d1 = new Department(1, "Computer");
		Student1 s1 = new Student1(1, "John", d1);
		Student1 s2 = (Student1) s1.clone();
		s1.name = "Sree";
		d1.deptName = "Maths";
		s1.display();
		s2.display();
	}

}
