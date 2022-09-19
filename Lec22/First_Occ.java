package Lec22;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 2, 3, 5, 7, 3 };
		int item = 3;
		System.out.println(findindex(arr, item, 0));

	}

	public static int findindex(int[] arr, int item, int i) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}
		return findindex(arr, item, i + 1);

	}

}
