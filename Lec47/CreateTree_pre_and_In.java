package Lec47;

public class CreateTree_pre_and_In {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {

			return CreateTree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1);

		}

		public TreeNode CreateTree(int[] inorder, int ilo, int ihi, int[] preordr, int plo, int phi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}

			TreeNode node = new TreeNode(preordr[plo]);
			int idx = sreach(inorder, ilo, ihi, preordr[plo]);
			int nel = idx - ilo;// inorder me left subtree total node count hai
			node.left = CreateTree(inorder, ilo, idx - 1, preordr, plo + 1, plo + nel);
			node.right = CreateTree(inorder, idx + 1, ihi, preordr, plo + nel + 1, phi);
			return node;

		}

		public int sreach(int[] inoder, int si, int ei, int item) {

			for (int i = si; i <= ei; i++) {
				if (inoder[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}

}
