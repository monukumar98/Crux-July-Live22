package Lec62;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[arr.length][arr.length];

		System.out.println(MaxProfit(arr, 0, arr.length - 1, 1, dp));
		System.out.println(MaxProfitBU(arr));

	}

	public static int MaxProfit(int[] arr, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int fs = arr[i] * year + MaxProfit(arr, i + 1, j, year + 1, dp);
		int ss = arr[j] * year + MaxProfit(arr, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(fs, ss);

	}

	public static int MaxProfitBU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];

		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = arr[i] * arr.length;

		}
		int year = arr.length - 1;
		for (int steps = 1; steps < dp.length; steps++) {
			for (int j = steps; j < dp.length; j++) {
				int i = j - steps;

				int fs = arr[i] * year + dp[i + 1][j];
				int ss = arr[j] * year + dp[i][j - 1];
				dp[i][j] = Math.max(fs, ss);

			}
			year--;

		}
		return dp[0][arr.length - 1];

	}

}
