package Lec64;

public class Matrix_Chain_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };
		System.out.println(MCM(arr, 0, arr.length - 1));

	}

	public static int MCM(int[] arr, int i, int j) {
		if (i + 1 == j) {
			return 0;
		}
		
		int ans = Integer.MAX_VALUE;
		for (int k = i + 1; k < j; k++) {
			int fs = MCM(arr, i, k);
			int ss = MCM(arr, k, j);
			int self = arr[i] * arr[j] * arr[k];
			ans = Math.min(ans, fs + ss + self);
		}
		return ans;
	}
	
	
	public static int mcmBU(int[] arr) {
		int[][] dp = new int[arr.length][arr.length];

		for (int slide = 2; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {

				int i = j - slide;

				int ans = Integer.MAX_VALUE;

				for (int k = i + 1; k < j; k++) {
					int fs = dp[i][k];
					int ss = dp[k][j];
					int self = arr[i] * arr[j] * arr[k];
					ans = Math.min(ans, fs + ss + self);
				}
				dp[i][j] = ans;

			}

		}

		return dp[0][arr.length - 1];

	}

}
