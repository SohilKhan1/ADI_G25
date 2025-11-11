package Lecture12;
import java.util.Iterator;

public class SudokuSolver {
	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solve(board, 0, 0);

	}

	private static boolean solve(char[][] board, int row, int col) {
		if (col == 9) {
			col = 0;
			row++;
		}
		if (row == 9) {
			return true;
		}

		if (board[row][col] != '.') {
			solve(board, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (ispossible(board, row, col, (char) (val + 48))) {
					board[row][col] = (char) (val + 48);
					if (solve(board, row, col + 1))
						return true;
				}

			}
		}
		return false;

	}

	private static boolean ispossible(char[][] board, int row, int col, char val) {

		int r = row;
		int c = col;
		// for row

		for (int i = 0; i < 9; i++) {
			if (board[row][i] == val) {
				return false;
			}
		}

		// for col
		for (int i = 0; i < 9; i++) {
			if (board[i][col] == val) {
				return false;
			}
		}

		// for 3*3 grid

		r = row - row % 3;
		c = col - col % 3;

		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (board[i][i] == val) {
					return false;
				}
			}
		}

		return true;
	}

}
