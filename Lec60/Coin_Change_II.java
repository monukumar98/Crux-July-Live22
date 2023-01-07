package Lec60;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5, 4 };
		int amount = 10;
		int[][] dp = new int[coin.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coin, amount, 0, dp));

	}

	public static int Coin_Change(int[] coin, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i == coin.length) {
			return 0;
		}

		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;

		if (amount >= coin[i]) {
			inc = Coin_Change(coin, amount - coin[i], i, dp);// dp[i][amount - coin[i]]
		}
		exc = Coin_Change(coin, amount, i + 1, dp);// dp[i+1][amount]
		return dp[i][amount] = inc + exc;

	}
	public static int CoinChangesBU(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}

		for (int am = 1; am < dp.length; am++) {// amount ka track 
			for (int i = 1; i < dp[0].length; i++) {// coin ka track 
				int inc = 0;
				int exc = 0;
				if (am >= coin[i - 1]) {
					inc = dp[am - coin[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;

			}
		}
		
		return dp[amount][coin.length];

	}

}
