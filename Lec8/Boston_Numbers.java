package Lec8;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BostonNumbers(n);

	}

	public static void BostonNumbers(int n) {

		int x = n;
		int sum = 0;
		int i = 2;
		while (i <= n) {

			while (n % i == 0) {
				sum = sum + sod(i);
				n = n / i;
			}
			i++;
		}
		int ans = sod(x);
		if (ans == sum) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	public static int sod(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n /= 10;
		}
		return sum;
		
	}

}
