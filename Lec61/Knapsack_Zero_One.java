package Lec61;

import java.util.Arrays;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt = { 1, 2, 3, 2, 2 };
		int val[] = { 8, 4, 0, 5, 3 };
		int cap = 4;
		int[][] dp = new int[cap + 1][wt.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, val, cap, 0, dp));
		System.out.println(KnapsackBU(wt, val, cap));

	}

	public static int Knapsack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[cap][i] != -1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);// dp[cap-wt[i]][i+1]
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);// dp[cap][i+1]

		return dp[cap][i] = Math.max(inc, exc);

	}

	public static int KnapsackBU(int[] wt, int[] val, int cap) {
		int[][] dp = new int[cap + 1][wt.length];

		for (int i = 1; i <= cap; i++) {// capacity ka
			for (int j = 1; j < dp[0].length; j++) {// weight ka index

				int inc = 0;
				int exc = 0;
				if (i >= wt[j - 1]) {
					inc = val[j - 1] + dp[i - wt[j - 1]][j - 1];
				}
				exc = dp[i][j - 1];
				dp[i][j] = Math.max(inc, exc);
			}

		}

		return dp[dp.length - 1][dp[0].length - 1];

	}

}
