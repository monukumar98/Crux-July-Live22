package Lec38;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 1, 2, 3, 14, 5, 6, 7 };
		NGE(arr);
	}

	public static void NGE(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
             //next Greater bana raha hu 
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];

			}
           // next greater banana hai 
			st.push(i);
		}

		while (!st.isEmpty()) {
			ans[st.pop()] = -1;

		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + " " + ans[i]);
		}
	}

}
