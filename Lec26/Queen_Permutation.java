package Lec26;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;// total queen
		boolean[] board = new boolean[n];
		Printanswer(board, tq, 0, "");

	}

	public static void Printanswer(boolean[] board, int tq, int qpsf, String ans) {

		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Printanswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i]=false;
				
			}
		}

	}
}
