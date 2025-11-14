package Lecture20;

import java.util.Arrays;

public class HouseRobber {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		solve(arr, dp);
		int k = solveTd(arr, dp, arr.length - 1);
		System.out.println(k);
	}

	private static int solveTd(int[] arr, int[] dp, int n) {
		if (n < 0) {
			return 0;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int rob = solveTd(arr, dp, n - 2) + dp[n - 2];
		int drob = solveTd(arr, dp, n - 1);
		dp[n] = Math.max(rob, drob);
		return dp[n];

	}

	private static void solve(int[] arr, int[] dp) {

		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < arr.length; i++) {
			int rob = dp[i - 2] + arr[i];
			int drob = dp[i - 1];
			dp[i] = Math.max(rob, drob);
		}
		System.out.println(dp[dp.length - 1]);

	}

}
