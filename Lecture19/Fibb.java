package Lecture19;

import java.util.Arrays;

public class Fibb {
	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		System.out.println(fibbbTD(n, dp));
		System.out.println(fibbbBU(n, dp));
	}

	private static int fibbbBU(int n, int[] dp) {
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	private static int fibbbTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != -1) {
			return dp[n];
		}

		int a = fibbbTD(n - 1, dp);
		int b = fibbbTD(n - 2, dp);
		dp[n] = a + b;
		return dp[n];

	}

}
