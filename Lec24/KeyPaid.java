package Lec24;
import java.util.*;
public class KeyPaid {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "23";
		List<String> list = new ArrayList<>();
		Keypress(str, "",list);
		System.out.println(list);

	}

	public static void Keypress(String ques, String ans,List<String> list ) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}

		char ch = ques.charAt(0);
		String press = key[ch - '0'];
		for (int i = 0; i < press.length(); i++) {
			Keypress(ques.substring(1), ans + press.charAt(i),list);
		}

	}

}
