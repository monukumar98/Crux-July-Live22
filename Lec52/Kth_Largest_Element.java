package Lec52;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		// PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// max heap
//		pq.add(3);
//		pq.add(2);
//		pq.add(7);
//		pq.add(31);
//		pq.add(-3);
//		pq.add(11);
//		System.out.println(pq);
		System.out.println(kthlargest(arr, k));
	}

	public static int kthlargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);

		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {// top ki value
               pq.poll();
               pq.add(arr[i]);
			}

		}
		return pq.peek();

	}
}
