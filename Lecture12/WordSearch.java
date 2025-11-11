package Lecture12;

public class WordSearch {
	public static void main(String[] args) {

//		 					{ 'A', 'B', 'C', 'E' }
//							{ 'S', 'F', 'C', 'S' }
//							{ 'A', 'D', 'E', 'E' }

		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String s = "SEE";

		boolean visited[][] = new boolean[board.length][board[0].length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (s.charAt(0) == board[i][j]) {
					boolean b = solve(board, i, j, 0, visited, s);
				}
			}
		}

	}

	private static boolean solve(char[][] board, int i, int j, int idx, boolean visited[][], String word) {
		if (idx == word.length()) {
			return true;
		}

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
			return false;
		}
		if (board[i][j] != word.charAt(idx)) {
			return false;
		}
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
		for (int k = 0; k < c.length; k++) {
			if (visited[i][j]) {
				return false;
			}
			visited[i][j] = true;
			if (solve(board, i + r[k], j + c[k], idx + 1, visited, word)) {
				return true;
			}
			visited[i][j] = false;

		}
		return false;

	}

}
