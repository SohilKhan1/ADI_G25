package Lecture11;

import java.util.*;

public class Subsets {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> res = subsets(nums);
		for (List<Integer> s : res)
			System.out.println(s);
	}

	static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		backtrack(0, nums, new ArrayList<>(), ans);
		return ans;
	}

	static void backtrack(int start, int[] nums, List<Integer> cur, List<List<Integer>> ans) {
		ans.add(new ArrayList<>(cur));
		for (int i = start; i < nums.length; i++) {
			cur.add(nums[i]);
			backtrack(i + 1, nums, cur, ans);
			cur.remove(cur.size() - 1);
		}
	}
}
