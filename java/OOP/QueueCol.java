package OOP;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCol {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(15);
		pq.add(21);
		pq.add(145);
		pq.add(36);
		pq.add(98);
		q.add(3);
		q.add(10);
		q.add(54);
		q.add(7);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.poll());// without exeption will return null if queue empty
		System.out.println(q.peek());
		System.out.println(pq.peek());
	}

}
