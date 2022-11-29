package Lec48;

public class LinkedList<T> {

	private class Node {
		T val;
		Node next;

	}

	private Node head;// 1st node address yaad krega every LinkedList
	private Node tail;// last node address yaad krega every LinkedList
	private int size;// total number of Node in LinkedList
//o(1)

	public void addfirst(T item) {
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
	public void addlast(T item) {
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
	public T GetFirst() throws Exception {
		if (size == 0) {
			throw new Exception("BkLol is Linked empty hai");
		}
		return head.val;
	}

	// O(1)
	public T GetLAst() throws Exception {
		if (size == 0) {

			throw new Exception("BkLol is Linked empty hai");
		}
		return tail.val;
	}

	// O(N)
	public T Getatindex(int k) throws Exception {

		return GetNode(k).val;
	}

//O(1)
	public T removefirst() throws Exception {
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

	public T removelast() throws Exception {
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
	public T removeatindex(int k) throws Exception {

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
	public void addatindex(int k, T item) throws Exception {
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