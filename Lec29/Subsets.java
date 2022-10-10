package Lec29;

import java.util.*;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		SubsetPrint_2(arr, 0, list, ans);
		System.out.println(ans);

	}

	public static void SubsetPrint(int[] arr, int i, String ans) {
		if (i == arr.length) {
			System.out.println(ans);
			return;
		}

		SubsetPrint(arr, i + 1, ans);
		SubsetPrint(arr, i + 1, ans + arr[i] + " ");

	}

	public static void SubsetPrint_2(int[] arr, int i, List<Integer> list, List<List<Integer>> ans) {
		// System.out.println(list);
		ans.add(new ArrayList<Integer>(list));
		for (int j = i; j < arr.length; j++) {
//			if (j !=i && arr[j] == arr[j - 1]) {
//				continue;
//			}

			list.add(arr[j]);
			SubsetPrint_2(arr, j + 1, list, ans);
			list.remove(list.size() - 1);
		}

	}

}
