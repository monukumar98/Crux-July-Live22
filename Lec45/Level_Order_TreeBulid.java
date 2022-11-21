package Lec45;

import java.util.*;

public class Level_Order_TreeBulid {
	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Level_Order_TreeBulid() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		q.add(nn);
		while (!q.isEmpty()) {
			Node rv = q.poll();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);
			}
			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rv.right = node;
				q.add(node);
			}
		}

		return root;

	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		Display(node.left);
		Display(node.right);

	}

	public static void main(String[] args) {
		Level_Order_TreeBulid lv = new Level_Order_TreeBulid();
		lv.Display();
	}
}
