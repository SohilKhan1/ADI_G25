package Lecture22;

import java.util.Arrays;

public class UncrossdLInes {
	public static void main(String[] args) {
		int[] nums1 = { 1, 4, 2 };
		int[] nums2 = { 1, 2, 4 };
		int[][] dp = new int[nums1.length][nums2.length];
		for (int[] a : dp)
			Arrays.fill(a, -1);
		int k = solve(nums1, nums2, 0, 0, dp);
		System.out.println(k);
	}
	private static int solve(int[] nums1, int[] nums2, int i, int j, int[][] dp) {
		if (i >= nums1.length) {
			return 0;
		}
		if (j >= nums2.length) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (nums1[i] == nums2[j]) {
			ans = 1 + solve(nums1, nums2, i + 1, j + 1, dp);
		} else {
			int a = solve(nums1, nums2, i + 1, j, dp);
			int b = solve(nums1, nums2, i, j + 1, dp);
			ans = Math.max(a, b);
		}
		return dp[i][j] = ans;

	}

}
