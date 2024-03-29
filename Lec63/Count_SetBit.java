package Lec63;

public class Count_SetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Count(n));
		System.out.println(fastCount(n));

	}

	public static int Count(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n >>= 1;// n = n>>1;
		}
		return count;
	}

	public static int fastCount(int n) {
		int count = 0;
		while (n != 0) {

			count++;
			n = (n & (n - 1));
		}
		return count;
	}

}
