package Lec8;

public class Function_Demo_2 {
	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int c = a + b;
//		int r = addition();
//		System.out.println(r);
//		addition();
		System.out.println(addition());
		System.out.println(c);

	}

	public static int addition() {

		int a = 9;
		int b = 11;
		int c = a + b;
		if(c<89) {
			System.out.println(c);
			return c+1;
		}
		return c;

	}

}
