package Lec14;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[3][4];
		System.out.println(arr);

		int[][] other = arr;
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);
		// row
		System.out.println(arr.length);
		// col
		System.out.println(arr[0].length);

	}

}
