package OOP;

public class Stack {// default public
	private int s[] = new int[10];// access specifier
	private int tot;

	Stack() {
		tot = -1;
	}

	public void push(int item) {
		if (tot == s.length)
			System.out.println("Stack is Full...");
		else
			s[++tot] = item;
	}

	public int pop() {
		if (tot >= 0)
			return s[tot--];
		else
			System.out.println("Stack is Empty...");
		return -1;
	}

}
