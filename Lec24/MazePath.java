package Lec24;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;// row
		int m = 5;// col
		printpath(0, 0, n - 1, m - 1, "");

	}

	// cr -> current row
	// cc -> current col
	// er -> end row
	// ec -> end col
	public static void printpath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		
		printpath(cr, cc + 1, er, ec, ans + "H");
		printpath(cr + 1, cc, er, ec, ans + "V");

	}

}
