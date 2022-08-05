package Lec5;

public class Pre_Inc_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		System.out.println(++a);

		int x = ++a;
		System.out.println(x);

		int c = a++ + 7 + --a + 9 + ++a + a++;
		System.out.println(c);

		int b = 5;
		int p = b++ + 11 + --b + 8 + ++b + ++b;
		System.out.println(p);
		int k = 7;
		int m = --k + 7 + k-- + k++ + 7 + k++;
		System.out.println(m);

	}

}
