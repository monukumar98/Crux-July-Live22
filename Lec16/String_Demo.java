package Lec16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";// pool
		String s1 = "Hello";// pool
		String s2 = new String("Bye");//// heap
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = s + s1;
		String s4 = "hello" +"bye";//pool
		//System.out.println(s3);
		String s5 = "hello" + "hello";//pool
//		String s5 = s1 + s;
		String s6 = s1+s;// heap
		String s7 = s1+s;// heap
		System.out.println(s5==s3);

	}

}
