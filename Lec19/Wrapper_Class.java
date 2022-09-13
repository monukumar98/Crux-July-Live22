package Lec19;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 156;
		int a1 = 156;
		System.out.println(a == a1);
		System.out.println(a);
		a = a1;// AutoBoxing
		Integer b = 90;
		int b1 = 9;
		b1 = b;// UnBoxing

		Integer c = 12;
		Integer c1 = 12;
		Integer d = 167;
		Integer d1 = 167;
		System.out.println(c == c1);
		System.out.println(d == d1);

	}

}
