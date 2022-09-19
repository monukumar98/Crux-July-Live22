package Lec22;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printoutcome(n, "");

	}

	public static void printoutcome(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		printoutcome(n - 1, ans + "H");
		printoutcome(n - 1, ans + "T");

	}

}
