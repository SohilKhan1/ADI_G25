package Lecture13;
import java.util.Arrays;

public class NQueen {
	public static void main(String[] args) {
		int n = 4;
		char[][] arr = new char[n][n];
		for (char[] c : arr) {
			Arrays.fill(c, '.');
		}
		solve(n, arr, 0, 0);

	}

	private static void solve(int n, char[][] arr, int row, int col) {

		if (row == arr.length) {
			for (char[] a : arr) {
				System.out.println(Arrays.toString(a));
			}
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (issafe(arr, row, i)) {
				arr[row][i] = 'Q';
				solve(n, arr, row + 1, 0);
				arr[row][i] = '.';
			}
		}

	}

	private static boolean issafe(char[][] arr, int row, int col) {
		int r = row;
		int c = col;
		// for row
		for (int i = 0; i < arr.length; i++) {
			if (arr[r][i] == 'Q') {
				return false;
			}
		}

		// for col
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][c] == 'Q') {
				return false;
			}
		}

		// for left dig.

		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (arr[r][c] == 'Q') {
				return false;
			}
			r--;
			c--;
		}

		// for right dig.`
		r = row;
		c = col;

		while (r >= 0 && c < arr.length) {
			if (arr[r][c] == 'Q') {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}
}
