package Lec62;



public class Lis_Nlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println(lengthOflis(arr));
	}

	public static int lengthOflis(int[] arr) {
		int[] lis = new int[arr.length];
		lis[0] = arr[0];
		int len = 1;
		for (int i = 1; i < lis.length; i++) {
			if (arr[i] > lis[len - 1]) {
				lis[len] = arr[i];
				len++;
			} else {
				int idx = search(lis, 0, len - 1, arr[i]);
				lis[idx] = arr[i];
			}
		}
		return len;

	}

	private static int search(int[] lis, int si, int ei, int item) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (lis[mid] >= item) {
				ans = mid;
				ei = mid - 1;

			} else {
				si = mid + 1;
			}
		}
		return ans;
	}

}
