package Lec64;

import java.util.Scanner;

public class Tavas_and_SaDDas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		System.out.println(Count(n));

	}

	public static long Count(String s) {

		int ans = 0;
		int d = s.length();
		ans = (1 << d) - 2;// d-1 th saare number
		int pos = 0;
		for (int i = d - 1; i >= 0; i--) {
			if (s.charAt(i) == '7') {
				ans = ans + (1 << pos);
			}
			pos++;
		}
		return ans+1;

	}

}
