package Lec60;

import java.util.Arrays;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "FOOD";
		String s2 = "MONEY";
		int[][] dp = new int[s1.length()][s2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(EditDistance(s1, s2, 0, 0, dp));

	}

	public static int EditDistance(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = EditDistance(s1, s2, i + 1, j + 1, dp);// dp[i+1][j+1]
		} else {

			int D = EditDistance(s1, s2, i + 1, j, dp);// dp[i+1][j]
			int I = EditDistance(s1, s2, i, j + 1, dp);// dp[i][j+1]
			int R = EditDistance(s1, s2, i + 1, j + 1, dp);// dp[i+1][j+1]
			ans = 1 + Math.min(D, Math.min(I, R));
		}
		return dp[i][j] = ans;

	}

	public static int EditDistance(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[0][i] = i;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[i][0] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = dp[i - 1][j - 1];
				} else {
					int D = dp[i - 1][j];
					int I = dp[i][j - 1];
					int R = dp[i - 1][j - 1];
					ans = 1 + Math.min(D, Math.min(I, R));
				}
				dp[i][j] = ans;

			}

		}

		return dp[dp.length - 1][dp[0].length - 1];
	}

}
