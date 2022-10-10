package Lec29;

import java.util.Arrays;

public class Combination_Sum_II {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(coin);
		int amount = 8;
		Printanswer(coin, amount, "", 0);
	}

	public static void Printanswer(int[] coin, int amount, String ans, int last) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = last; i < coin.length; i++) {

			if (i != last && coin[i] == coin[i - 1]) {
				continue;
			}

			if (amount >= coin[i]) {

				Printanswer(coin, amount - coin[i], ans + coin[i] + " ", i + 1);

			}
		}
	}
}
