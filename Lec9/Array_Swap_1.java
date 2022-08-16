package Lec9;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(arr.length);
//		// display(arr);
//		for (int i = 0; i < arr.length; i++) {// 0 to n-1
//			System.out.print(arr[i] + " ");
//		}

		System.out.println(arr[0] + " " + arr[1]);
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {// 0 to n-1
			System.out.print(arr[i] + " ");
		}

	}

}
