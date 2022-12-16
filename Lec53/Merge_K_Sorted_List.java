package Lec53;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Merge_K_Sorted_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {

			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					// TODO Auto-generated method stub
					return o1.val-o2.val;//rank
				}
			});
			for (ListNode node : lists) {
				if (node != null) {
					pq.add(node);
				}

			}
			

			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;

			while (!pq.isEmpty()) {
				ListNode node = pq.poll();
				Dummy.next = node;
				Dummy = Dummy.next;
				if (node.next != null) {
					pq.add(node.next);
				}

			}

			return temp.next;

		}
	}
}
