package Lec48;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.addlast("Raj");
		ll.addlast("Riya");
		ll.addlast("Kunal");
		ll.addlast("Ankit");
		LinkedList<Character> ll1 = new LinkedList<>();
		ll1.addlast('a');
		ll1.addlast('b');
		ll1.addlast('c');
		ll1.addlast('d');
		LinkedList<Integer> ll2 = new LinkedList<>();
		ll2.addlast(2);
		ll2.addlast(21);
		ll2.addlast(-2);
		ll.Display();
		ll1.Display();
		ll2.Display();

	}

}
