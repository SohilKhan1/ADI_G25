package Lecture20;

import java.util.Arrays;

public class CoinChange {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int target = 4;
		int[][] dp = new int[arr.length][target + 1];
		for (int[] a : dp)
			Arrays.fill(a, -1);
		int ans = solve(arr, target, 0, dp);
		System.out.println(ans);
	}

	private static int solve(int[] arr, int target, int idx, int[][] dp) {
		if (target == 0) {
			return 0;
		}
		if (idx >= arr.length) {
			return 1000000;
		}
		if (dp[idx][target] != -1) {
			return dp[idx][target];
		}
		int taken = 1000000;
		if (target >= arr[idx])
			taken = 1 + solve(arr, target - arr[idx], idx, dp);
		int nottaken = 0 + solve(arr, target, idx + 1, dp);
		dp[idx][target] = Math.min(taken, nottaken);
		return dp[idx][target];
	}

}
