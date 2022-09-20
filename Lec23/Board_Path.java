package Lec23;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		BoardPath(0, n, "");

	}

	public static void BoardPath(int curr, int n, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return;
		}
		if (curr > n) {
			return;
		}
//		BoardPath(curr + 1, n, ans + 1);
//		BoardPath(curr + 2, n, ans + 2);
//		BoardPath(curr + 3, n, ans + 3);
		for (int dice = 1; dice <= 3; dice++) {
			BoardPath(curr + dice, n, ans + dice);
		}

	}

	public static int BoardPathCount(int curr, int n, String ans) {
		if (curr == n) {
			System.out.println(ans);
			return 1;
		}
		if (curr > n) {
			return 0;
		}
//		int a1 = BoardPathCount(curr + 1, n, ans + 1);
//		int a2 = BoardPathCount(curr + 2, n, ans + 2);
//		int a3 = BoardPathCount(curr + 3, n, ans + 3);
		int a1=0;
		for (int dice = 1; dice <=3; dice++) {
			a1 = a1 + BoardPathCount(curr+dice, n, ans+dice);
		}
		return a1 ;

	}

}
