package Lecture14;
import java.util.Collections;
import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(10);
		pq.add(7);
		pq.add(13);
		pq.add(15);
		pq.add(11);
		System.out.println(pq);

	}

}
