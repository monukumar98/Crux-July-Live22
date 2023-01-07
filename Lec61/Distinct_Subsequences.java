package Lec61;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(count_Subsequences(s, t, 0, 0));

	}

	// s ka index i
	// t ka index j
	public static int count_Subsequences(String s, String t, int i, int j) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = count_Subsequences(s, t, i + 1, j + 1);

		}

		exc = count_Subsequences(s, t, i + 1, j);
		return inc + exc;

	}

}
