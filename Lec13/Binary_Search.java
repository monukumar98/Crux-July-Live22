package Lec13;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 8, 9, 12, 14, 15, 16, 17 };
		int item = 14;
		System.out.println(Search(arr, item));

	}

	public static int Search(int[] arr, int item) {
		int si = 0;
		int ei = arr.length - 1;

		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] > item) {
				ei = mid - 1;
			} else {
				si = mid + 1;
			}

		}
		return -1;

	}

}
