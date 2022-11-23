package Lec46;

public class BinarySreach_Tree {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public BinarySreach_Tree(int[] in) {
		// TODO Auto-generated constructor
		this.root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = in[mid];
		nn.left = CreateTree(in, si, mid - 1);
		nn.right = CreateTree(in, mid + 1, ei);
		return nn;

	}

	public void Display() {
		Display(this.root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		str = str + nn.val;
		str = "<--" + str + "-->";
		if (nn.left != null) {
			str = nn.left.val + str;
		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);// left subtree visit
		Display(nn.right);// right subtree visit

	}

	public int max() {

		return max(root);
	}

	private int max(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int right = max(node.right);
		return Math.max(right, node.val);
	}

	public static void main(String[] args) {
		int[] in = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		BinarySreach_Tree bst = new BinarySreach_Tree(in);
		bst.Display();
		System.out.println(bst.max());

	}
}
