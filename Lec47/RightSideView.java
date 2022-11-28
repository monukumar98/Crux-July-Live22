package Lec47;

import java.util.*;

public class RightSideView {

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

	class visitedlevel {
		int dept = -1;
	}

	class Solution {

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> list = new ArrayList<>();
			RightView(root, list, 0, new visitedlevel());
			return list;

		}

		public void RightView(TreeNode root, List<Integer> list, int cl, visitedlevel dl) {
			if (root == null) {
				return;
			}

			if (dl.dept < cl) {
				list.add(root.val);
				dl.dept = cl;
			}
			RightView(root.right, list, cl + 1, dl);
			RightView(root.left, list, cl + 1, dl);
		}
	}

}
