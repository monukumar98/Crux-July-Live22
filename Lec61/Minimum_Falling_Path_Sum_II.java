package Lec61;

public class Minimum_Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			ans = Math.min(ans, Falling_Path_Sum(matrix, 0, i));
		}
		System.out.println(ans);
	}

	private static int Falling_Path_Sum(int[][] matrix, int cr, int cc) {
		// TODO Auto-generated method stub
		if (cc < 0 || cc >= matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, Falling_Path_Sum(matrix, cr + 1, i));
			}

		}
		return ans + matrix[cr][cc];
	}

}
