package Lec19;

import java.util.ArrayList;

public class Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 5 };
		int[] arr1 = { 6, 9 };
		SumofTwoArrays(arr, arr1);

	}

	public static void SumofTwoArrays(int[] arr1, int[] arr2) {

		int carry = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		ArrayList<Integer> list = new ArrayList<>();
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr1[i];
				i--;
			}
			if (j >= 0) {
				sum += arr2[j];
				j--;
			}
			sum += carry;
			list.add(sum % 10);
			carry = sum / 10;

		}
		if (carry > 0) {
			list.add(carry);
		}
		for (int k = list.size() - 1; k >= 0; k--) {
			System.out.print(list.get(k) + " ");
		}

	}

}
