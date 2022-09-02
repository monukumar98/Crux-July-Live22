package Lec16;

import java.util.Scanner;

public class String_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		String s1 = sc.next();
//		System.out.println(s1);
//		System.out.println(s);

		String s = "HelloByeokeyHey";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		String s1 = "HelloByeokeyHey";
		System.out.println(s.equals(s1));
		String s2 = "raj";
		String s3 = "raju";
		System.out.println(s2.compareTo(s3));// s2>s3 +ve or s3>s2 -ve or s3==s2 0
		String ss = s.substring(3);
		System.out.println(ss);
		System.out.println(s.substring(0,7));
		

		
	}

}
