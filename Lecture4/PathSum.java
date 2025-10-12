package Lecture4;

public class PathSum {
/*
	class Solution {
		public boolean hasPathSum(TreeNode root, int target) {

			if (root == null)
				return false;

			if (root.left == null && root.right == null && target - root.val == 0)
				return true;

			boolean left = hasPathSum(root.left, target - root.val);
			boolean right = hasPathSum(root.right, target - root.val);

			return left || right;
		}
	}
*/
}
