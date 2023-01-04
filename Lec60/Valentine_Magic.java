package Lec60;

import java.util.Arrays;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = { 2, 11, 3 };
		int[] girls = { 5, 7, 11, 3, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Valentine(boys, girls, 0, 0));

	}

	public static int Valentine(int[] boys, int[] gitls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == gitls.length) {
			return 10000000;
		}

		// Pair
		int pair = Valentine(boys, gitls, i + 1, j + 1) + Math.abs(boys[i] - gitls[j]);
		// Unpair
		int unpair = Valentine(boys, gitls, i, j + 1);

		return Math.min(pair, unpair);

	}

}
