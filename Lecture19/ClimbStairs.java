package Lecture19;

import java.util.Arrays;

public class ClimbStairs {
	public static void main(String[] args) {
		int n = 3;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		System.out.println(solve(n, dp));
	}

	private static int solve(int n, int[] dp) {

		if (n == 0 || n == 1) {
			return 1;
		}
		int a = solve(n - 1, dp);
		int b = solve(n - 2, dp);
		dp[n] = a + b;

		return dp[n];
	}

}
