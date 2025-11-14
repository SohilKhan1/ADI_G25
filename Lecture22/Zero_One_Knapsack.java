package Lecture22;

import java.util.Arrays;

public class Zero_One_Knapsack {
	public static void main(String[] args) {
		int cap = 4;
		int val[] = { 1, 2, 3 };
		int wt[] = { 4, 5, 1 };
		int[][] dp = new int[wt.length + 1][cap + 1];
		for (int[] a : dp)
			Arrays.fill(a, -1);
		System.out.println(solve(wt, val, cap, 0, dp));
	}

	private static int solve(int[] wt, int[] val, int cap, int idx, int[][] dp) {
		if (idx == wt.length || cap == 0) {
			return 0;
		}

		if (dp[idx][cap] != -1) {
			return dp[idx][cap];
		}
		int inc = 0;
		if (cap >= wt[idx]) {
			inc = val[idx] + solve(wt, val, cap - wt[idx], idx + 1, dp);
		}
		int notinc = solve(wt, val, cap, idx + 1, dp);

		return dp[idx][cap] = Math.max(inc, notinc);
	}

}
