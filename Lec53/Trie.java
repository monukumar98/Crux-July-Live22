package Lec53;

import java.util.HashMap;

public class Trie {

	private class Node {
		char data;
		HashMap<Character, Node> children = new HashMap<>();
		boolean isterminal = false;
		int count;

	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.data = '*';
		this.root = nn;
	}

	public void insert(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);
				node.count++;

			} else {
				Node nn = new Node();// 13k
				nn.data = ch;
				node.children.put(ch, nn);
				node = nn;
				node.count = 1;

			}
		}
		node.isterminal = true;
	}

	public boolean search(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return false;

			}
		}
		return node.isterminal;
	}

	public boolean startsWith(String prefix) {
		Node node = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return false;

			}
		}
		return true;
	}

	public int countstartsWith(String prefix) {
		Node node = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return 0;

			}
		}
		return node.count;
	}

}
