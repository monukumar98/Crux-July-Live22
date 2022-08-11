package Doubt_Class_1;

import java.util.Scanner;

public class Odd_and_Even_back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int oddsum = 0;
			int evensum = 0;
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					evensum += rem;// evensum = evensum +rem;
				} else {
					oddsum = oddsum + rem;
				}
				n /= 10;// n = n/10;

			}

			if (evensum % 4 == 0 || oddsum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}

	}

}
