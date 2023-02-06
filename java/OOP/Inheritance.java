package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

class Employee implements Comparable<Employee> { // Parent, Super, Base Class
	private String name;
	private double salary;
	private Date joiningDate;

	Employee(String n, double s, String d) {
		name = n;
		salary = s;
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		try {
			joiningDate = date.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getInfo() {
		System.out.println("Name of the employee is: " + name + "his salary is: " + salary
				+ " and his joining date is: " + joiningDate);
	}

	/*
	 * Employee() { name = " "; salary = 0.0; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double s) {
		salary += salary * s / 100;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Employee e = (Employee) obj;

		return this.getName().equals(e.getName()) && this.getSalary() == e.getSalary();

	}

	public int compareTo(Employee e) {
		if (salary == e.salary)
			return 0;
		if (salary < e.salary)
			return -1;
		return 1;
	}

}

class Manager extends Employee { // Child, Sub, derived Class
	double bonus;

	Manager(String n, double s, String d, double b) {
		super(n, s, d); // used to refer parent class in subclass
		bonus = b;
	}

	void setBonus(double b) {
		bonus = b;
	}

	public double getSalary() { // method override
		return super.getSalary() + bonus;
	}

	public void getInfo() {
		System.out.println("Name of the employee is: " + super.getName() + "his salary is: " + super.getSalary()
				+ " and his joining date is: " + super.getJoiningDate() + " and his bonus is: " + bonus);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Sree", 40000, "30-06-2022");
		Employee e5 = new Employee("Sree", 40000, "30-06-2022");
		// e1.setSalary(50);
//		System.out.println(e1.getSalary());
		Manager m1 = new Manager("Hari", 50000, "01-06-2020", 5000);
//		System.out.println(m1.getSalary());
//		e1.getInfo();
//		m1.getInfo();
//		Polymorphism below e2 
		Employee e2 = new Manager("Dada", 33333, "05-08-2017", 4000);// allowed since manager is a employee
		System.out.println(e1.equals(e5));

		Employee[] employee = new Employee[5];
		employee[0] = e1;
		employee[1] = m1;
		employee[2] = e2;
		employee[3] = new Employee("Vidhya", 23232, "18-04-2019");
		employee[4] = new Manager("Vidhya", 23232, "18-04-2019", 0);

		Manager m2;
		if (employee[4] instanceof Manager) {
			m2 = (Manager) employee[4];// typeCasting
			m2.setBonus(2000);
		}

		for (Employee e : employee) {// dynamic binding
			System.out.println(e.getName() + " " + e.getSalary());
		}

		Arrays.sort(employee);

		for (Employee e : employee) {// dynamic binding
			System.out.println(e.getName() + " " + e.getSalary());
		}
	}

}
