package Lec45;



public class Balanced_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			if (root == null) {
				return true;
			}

			boolean lb = isBalanced(root.left);
			boolean rb = isBalanced(root.right);
			boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;
			return lb && rb && sb;
		}

		private int ht(TreeNode node) {
			if (node == null) {
				return -1;
			}
			int left = ht(node.left);
			int right = ht(node.right);
			return Math.max(left, right) + 1;
		}
	}
}
