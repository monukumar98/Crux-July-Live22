package Lec41;

public class ReverseLinkedList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode curr = head;
			ListNode prev = null;
			while (curr != null) {
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;

		}
	}
}
