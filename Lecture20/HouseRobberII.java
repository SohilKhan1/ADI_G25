package Lecture20;

import java.util.Arrays;

public class HouseRobberII {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
//		int a = solve(arr, dp, 0, arr.length - 2);
//		int b = solve(arr, dp, 1, arr.length - 1);
//		System.out.println(a + " " + b);
//		System.out.println(Math.max(a, b));

		int a = solveTD(arr, dp, 0, arr.length - 2);
		Arrays.fill(dp, -1);
		int b = solveTD(arr, dp, 1, arr.length - 1);
		System.out.println(Math.max(a, b));
	}

	private static int solveTD(int[] arr, int[] dp, int st, int ed) {
		if (st > ed) {
			return 0;
		}
		if (dp[st] != -1) {
			return dp[st];
		}
		int rob = arr[st] + solveTD(arr, dp, st + 2, ed);
		int drob = solveTD(arr, dp, st + 1, ed);
		dp[st] = Math.max(rob, drob);
		return dp[st];

	}

//	private static int solve(int[] arr, int[] dp, int st, int ed) {
//		dp[st] = arr[st];
//		dp[st + 1] = arr[st + 1];
//		for (int i = st + 2; i < arr.length; i++) {
//			int rob = arr[i] + dp[i - 2];
//			int drob = dp[i - 1];
//			dp[i] = Math.max(rob, drob);
//
//		}
//		return dp[ed];
//	}

}
