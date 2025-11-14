package Lecture19;

import java.util.Arrays;

public class minCost {
	public static void main(String[] args) {
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] dp = new int[arr.length];
		// Tabulation
		Arrays.fill(dp, -1);
		solve(arr, dp);

		// Memoization
		Arrays.fill(dp, -1);
		System.out.println(solveTD(arr, dp, arr.length - 1));
	}

	private static int solveTD(int[] arr, int[] dp, int i) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int a = solveTD(arr, dp, i - 1);
		int b = solveTD(arr, dp, i - 2);
		dp[i] = Math.min(a, b) + arr[i];
		return dp[i];
	}

	private static void solve(int[] arr, int[] dp) {
		dp[0] = arr[0];
		dp[1] = arr[1];
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i - 1], dp[i - 2]) + arr[i];
		}
		System.out.println(dp[dp.length - 1]);

	}

}
