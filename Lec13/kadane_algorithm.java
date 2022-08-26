package Lec13;

public class kadane_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, -5, 11, -1, 3 };
		System.out.println(SubArraySum(arr));

	}

	public static int SubArraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}

		}

		return ans;
	}
}
