package Lec58;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int dp[] = new int[arr.length];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i] = -1;
//		}
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr, arr.length - 1));
		System.out.println(RobberTD(arr, 0, dp));

	}

//	public static int Robber(int[] arr, int i) {
//		if (i >= arr.length) {
//			return 0;
//		}
//
//		int rob = Robber(arr, i + 2) + arr[i];
//		int dnrob = Robber(arr, i + 1);
//
//		return Math.max(rob, dnrob);
//	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int rob = RobberTD(arr, i + 2, dp) + arr[i];
		// RobberTD(arr, i + 2, dp)// dp[i+2]
		int dnrob = RobberTD(arr, i + 1, dp);// dp[i+1]

		return dp[i] = Math.max(rob, dnrob);
	}

	public static int Robber(int[] arr, int i) {
		if (i < 0) {
			return 0;
		}

		int rob = Robber(arr, i - 2) + arr[i];
		// Robber(arr, i - 2) dp[i-2]
		int dnrob = Robber(arr, i - 1);// dp[i-1]

		return Math.max(rob, dnrob);
	}

	public static int RobberBU(int[] arr) {
		int dp[] = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);

		for (int i = 2; i < dp.length; i++) {
			int rob = dp[i - 2] + arr[i];
			int dnrob = dp[i - 1];
			dp[i] = Math.max(rob, dnrob);
		}

		return dp[dp.length - 1];

	}

}
