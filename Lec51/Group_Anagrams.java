package Lec51;

import java.util.ArrayList;
import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(arr));

	}

	public static List<List<String>> groupAnagrams(String[] str) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			String s = str[i];
			String key = Keyfun(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);

		}

		List<List<String>> ans = new ArrayList<>();
		for (String key : map.keySet()) {
			ans.add(map.get(key));

		}
		return ans;
	}

	public static String Keyfun(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			    

		}
		return sb.toString();
	}

}
