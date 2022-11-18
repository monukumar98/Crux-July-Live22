package Lec44;

import java.util.*;

public class Level_Order {

	Scanner sc = new Scanner(System.in);

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public Level_Order() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();

	}

	private Node CreateTree() {
		// TODO Auto-generated method stub

		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = CreateTree();// left subStree
		}

		boolean hlr = sc.nextBoolean();
		if (hlr == true) {
			nn.right = CreateTree();// right SubStree
		}
		return nn;

	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		// LinkedList<Node> ll = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			// remove
			Node nn = q.poll();// remove 1st krega 
			System.out.print(nn.data + " ");
			if (nn.left != null) {
				q.add(nn.left);
			}
			if (nn.right != null) {
				q.add(nn.right);
			}

		}
		System.out.println();

	}
	public static void main(String[] args) {
		Level_Order ll = new Level_Order();
		ll.LevelOrder();
	}

}
