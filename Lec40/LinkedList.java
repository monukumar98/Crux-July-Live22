package Lec40;

public class LinkedList {

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

//O(1)
	public int GetFirst() throws Exception {
		if (size == 0) {
			throw new Exception("BkLol is Linked empty hai");
		}
		return head.val;
	}

	// O(1)
	public int GetLAst() throws Exception {
		if (size == 0) {

			throw new Exception("BkLol is Linked empty hai");
		}
		return tail.val;
	}

	// O(N)
	public int Getatindex(int k) throws Exception {

		return GetNode(k).val;
	}

//O(1)
	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("BkLol is Linked empty hai");
		}
		Node temp = head;
		head = head.next;
		if (size == 1) {
			tail = null;
		}
		size--;
		temp.next = null;
		return temp.val;

	}

	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("BkLol is Linked empty hai");
		}
		if (size == 1) {
			return removefirst();

		} else {
			Node n = GetNode(size - 2);
			Node temp = tail;
			tail = n;
			tail.next = null;
			size--;
			return temp.val;

		}
	}
//O(N)
	public int removeatindex(int k) throws Exception {

		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node curr = GetNode(k);
			Node prev = GetNode(k - 1);
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

	// O(N)
	public void addatindex(int k, int item) throws Exception {
		if (k == 0) {
			addfirst(item);
		} else if (k == size - 1) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
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

}
