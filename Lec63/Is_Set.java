package Lec63;

public class Is_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		if (isSet(n, 3)) {
			System.out.println("Set");
		} else {
			System.out.println("Unset");
		}

	}

	public static boolean isSet(int n, int i) {

		int mask = 1 << i;//10000

		if ((mask & n) != 0) {
			return true;
		} else {
			return false;
		}

	}

}
