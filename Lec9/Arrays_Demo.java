package Lec9;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// int arr [] = new int[5];// C type

		System.out.println(arr);
		System.out.println(arr.length);
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		// System.out.println(arr[5]);

		// set
		arr[0] = 7;
		arr[1] = -17;
		arr[2] = 11;
		arr[3] = 12;
		arr[4] = 70;

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);

//		int[] other = arr;

		display(arr);

	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {// 0 to n-1
			System.out.print(arr[i] + " ");
		}

	}

}
