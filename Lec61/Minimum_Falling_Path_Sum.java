package Lec61;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i));
		}
		System.out.println(ans);

	}

	public static int Falling_Path_Sum(int[][] matrix, int cr, int cc) {
		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}

		int down = Falling_Path_Sum(matrix, cr + 1, cc);// dp[cr+1][cc]
		int left_Daigonal = Falling_Path_Sum(matrix, cr + 1, cc - 1);// dp[cr+1][cc-1]
		int right_Daigonal = Falling_Path_Sum(matrix, cr + 1, cc + 1);// dp[cr+1][cc+1]

		return matrix[cr][cc] + Math.min(left_Daigonal, Math.min(right_Daigonal, down));

	}

}
