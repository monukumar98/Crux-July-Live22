package Lec27;

import java.util.*;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ll = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		Partitioning(str, ll, ans);
		System.out.println(ans);

	}

	public static void Partitioning(String Ques, List<String> ll, List<List<String>> ans) {
		if (Ques.length() == 0) {
			// System.out.println(ll);
			// List<String> list = new ArrayList<>(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= Ques.length(); i++) {
			String s = Ques.substring(0, i);
			if (ispalindrome(s) == true) {
				ll.add(s);
				Partitioning(Ques.substring(i), ll, ans);
				ll.remove(ll.size() - 1);
			}

		}

	}

	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
