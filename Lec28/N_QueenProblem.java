package Lec28;

public class N_QueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		Nqueen(board, 0, n);

	}

	public static void Nqueen(boolean[][] board, int row, int tq) {
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col) == true) {
				board[row][col] = true;
				Nqueen(board, row + 1, tq - 1);
				board[row][col] = false;
			}

		}

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// upper side
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// right diagonal
		r = row;
		int c = col;

		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}
		// left diagonal
		r = row;
		c = col;

		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

}
