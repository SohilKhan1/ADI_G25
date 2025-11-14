package Lecture21;

import java.util.Arrays;

public class LCS {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ace";
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int[] a : dp)
			Arrays.fill(a, -1);
		System.out.println(solve(s1, s2, 0, 0, dp));
	}
	private static int solve(String s1, String s2, int i, int j, int[][] dp) {
		if (i >= s1.length() || j >= s2.length()) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		if (s1.charAt(i) == s2.charAt(j)) {
			return dp[i][j] = 1 + solve(s1, s2, i + 1, j + 1, dp);
		} else {
			int a = solve(s1, s2, i + 1, j, dp);
			int b = solve(s1, s2, i, j + 1, dp);
			return dp[i][j] = Math.max(a, b);
		}

	}

}
