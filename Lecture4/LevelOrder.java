package Lecture4;
public class LevelOrder {
/*
	class Solution {
		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> list = new ArrayList<>();
			if (root == null)
				return list;
			solve(root, list);
			return list;
		}

		private void solve(TreeNode root, List<List<Integer>> list) {

			Queue<TreeNode> q = new LinkedList<TreeNode>();
			q.add(root);

			while (!q.isEmpty()) {
				int size = q.size();
				int k = 1;
				List<Integer> ans = new ArrayList<Integer>();
				while (k <= size) {
					TreeNode node = q.poll();
					ans.add(node.val);
					if (node.left != null)
						q.add(node.left);
					if (node.right != null)
						q.add(node.right);
					k++;
				}
				list.add(ans);
			}
		}
	}
*/
}