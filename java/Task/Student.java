package Task;

class StudentD {
	String name;
	int rollNo;
	int[] marks;

	StudentD(String n, int r, int[] m) {
		name = n;
		rollNo = r;
		marks = m;
	}

	public void marksTotal() {
		int total = 0;
		for (int i = 0; i < marks.length; i++) {
			total += marks[i];
		}
		System.out.println("Total marks scored by " + name + " : " + total);
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentD student1 = new StudentD("John", 1, new int[] { 70, 80, 90 });
		student1.marksTotal();

		StudentD student2 = new StudentD("Mike", 2, new int[] { 80, 90, 80 });
		student2.marksTotal();

		StudentD student3 = new StudentD("Sara", 3, new int[] { 90, 80, 70 });
		student3.marksTotal();

	}

}
