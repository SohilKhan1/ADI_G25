package Lecture15;

import java.util.*;

public class KthSmallestHeap {
	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		System.out.println(kthSmallest(arr, k)); // 7
	}

	static int kthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int x : arr) {
			if (pq.size() < k)
				pq.offer(x);
			else if (x < pq.peek()) {
				pq.poll();
				pq.offer(x);
			}
		}
		return pq.peek();
	}
}
