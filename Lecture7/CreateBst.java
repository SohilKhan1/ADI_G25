package Lecture7;

public class CreateBst {

//	class Solution {
//	    public TreeNode sortedArrayToBST(int[] nums) {
//	        return fun(nums, 0, nums.length - 1);
//	    }
//
//	    private TreeNode fun(int[] nums, int left, int right) {
//	        if (left > right) {
//	            return null;
//	        }
//	        int mid = left + (right - left) / 2;
//	        TreeNode root = new TreeNode(nums[mid]);
//	        root.left = fun(nums, left, mid - 1);
//	        root.right = fun(nums, mid + 1, right);
//	        return root;
//	    }
//	}
}
