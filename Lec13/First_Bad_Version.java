package Lec13;

public class First_Bad_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {

		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid = (hi - lo) / 2 + lo;
			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}
		return ans;

	}

	public boolean isBadVersion(int v) {

		return false;
	}
}
