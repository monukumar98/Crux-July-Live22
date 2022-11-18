package Lec44;

public class SumRoot_to_Leaf_Numbers {
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
		public int sumNumbers(TreeNode root) {
			return sum(root, 0);

		}

		public int sum(TreeNode node, int sum) {
			if (node == null) {
				return 0;
			}

			if (node.left == null && node.right == null) {
				return sum * 10 + node.val;
			}
			int l = sum(node.left, sum * 10 + node.val);
			int r = sum(node.right, sum * 10 + node.val);
			return l + r;
		}
	}
}
