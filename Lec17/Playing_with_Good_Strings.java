package Lec17;

public class Playing_with_Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "fmaeoghfrjaieopkmgaa";
		System.out.println(Good_Strings(str));
		

	}

	public static int Good_Strings(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isvowels(ch) == true) {
				int count = 0;
				while (i < str.length() && isvowels(str.charAt(i)) == true) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);
			}

		}
		return ans;

	}

	public static boolean isvowels(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}

}
