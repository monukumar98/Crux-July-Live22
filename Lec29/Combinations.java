package Lec29;

import java.util.*;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;// total queen
		boolean[] board = new boolean[n];
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Printanswer(board, k, 0, list, 0,ans);
		System.out.println(ans);

	}

	public static void Printanswer(boolean[] board, int k, int qpsf, List<Integer> list, int last,	List<List<Integer>> ans) {

		if (k == qpsf) {
			ans.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = last; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				list.add(i + 1);
				Printanswer(board, k, qpsf + 1, list, i + 1,ans);
				board[i] = false;
				list.remove(list.size() - 1);

			}
		}

	}

}
