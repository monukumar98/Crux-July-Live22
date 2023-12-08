package Lec64;

public class Print_SubSequnces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		PrintSub(str);

	}

	public static void PrintSub(String str) {

		int n = str.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(i, str);
		}

	}

	private static void Pattern(int i, String str) {
		// TODO Auto-generated method stub
		int pos = 0;
		while (i != 0) {
			if ((i & 1) != 0) {
				System.out.print(str.charAt(pos));
			}
			i >>= 1;
			pos++;
		}
		System.out.println();
		

	}

}
