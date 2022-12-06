package Lec50;

import java.util.*;

public class HashMap<K, V> {
	public class Node {
		K key;
		V value;
		Node next;

	}

	private ArrayList<Node> bukt;

	private int size = 0;

	public HashMap() {
		this(4);
	}

	public HashMap(int n) {
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);

		}
	}

	public void put(K key, V value) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		size++;

		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);
		nn.next = temp;
		bukt.set(idx, nn);

		double lf = (1.0 * size) / bukt.size();
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();

		for (int i = 0; i < 2 * bukt.size(); i++) {
			nba.add(null);

		}
		ArrayList<Node> oba = bukt;
		bukt = nba;
		for (Node temp : oba) {
			while (temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}

	}

	public boolean containsKey(K key) {

		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}

		return false;

	}

	public V get(K key) {

		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}

		return null;

	}

	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {

				break;
			}
			prev = curr;
			curr = curr.next;
		}

		if (prev == null) {
			bukt.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;
		} else if (curr != null) {

			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;

		} else {
			return null;
		}

	}

	public int hashfun(K key) {

		int bn = key.hashCode() % bukt.size();
		if (bn < 0) {
			bn += bukt.size();
		}

		return bn;

	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) {
				s = s + temp.key + "=" + temp.value + ", ";
				temp = temp.next;
			}
		}
		return s + "}";
	}

}
