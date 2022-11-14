package Lec42;

public class Remove_cycle {

	private class Node {
		int val;
		Node next;

	}

	private Node head;// 1st node address yaad krega every LinkedList
	private Node tail;// last node address yaad krega every LinkedList
	private int size;// total number of Node in LinkedList
//o(1)

	public void addfirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = head;
			head = nn;
			this.size++;
		}
	}

	// o(1)
	public void addlast(int item) {
		if (size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	public Node GetNode(int k) throws Exception {

		if (k < 0 || k >= size) {
			throw new Exception("Index Valid dedo bklol");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + " --> ");
			temp = temp.next;
		}
		System.out.println(".");
	}

	public void CreateCycle() throws Exception {
		Node nn = GetNode(2);
		this.tail.next = nn;

	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	// O(N^2)
	public void CycleRemovl1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				} else {
					temp = temp.next;

				}
			}
			start = start.next;
		}

	}

	// O(N)
	public void CycleRemovl2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {

			temp = temp.next;
			count++;
		}
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;

		}
		fast.next = null;

	}

//O(N)
	public void floydcycleremoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;

		}
		fast.next = null;

	}

	public static void main(String[] args) throws Exception {
		Remove_cycle rc = new Remove_cycle();
		rc.addlast(1);
		rc.addlast(2);
		rc.addlast(3);
		rc.addlast(4);
		rc.addlast(5);
		rc.addlast(6);
		rc.addlast(7);
		rc.addlast(8);
//		rc.Display();
		rc.CreateCycle();
		rc.CycleRemovl2();
		rc.Display();

	}

}
