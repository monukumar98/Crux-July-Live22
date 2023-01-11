package Lec63;

public class Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(number(n));

	}

	public static int number(int n) {
		int mul = 5;
		int ans = 0;
		while (n != 0) {

			if ((n & 1) != 0) {
				ans += mul;
			}
			mul = mul * 5;
			n >>= 1;

		}
		return ans;

	}

}
