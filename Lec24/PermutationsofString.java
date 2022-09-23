package Lec24;

public class PermutationsofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String ans = "";
		Permutations(str, "");

	}

	public static void Permutations(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			Permutations(s1 + s2, ans + ques.charAt(i));
		}

	}

}
