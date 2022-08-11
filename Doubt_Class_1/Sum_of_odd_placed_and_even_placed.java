package Doubt_Class_1;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int oddsum = 0;
		int evensum = 0;
		int pos = 1;
		while (n > 0) {
			int rem = n % 10;
			if (pos % 2 == 0) {
				evensum = evensum + rem;
			} else {
				oddsum = oddsum + rem;
			}
			pos++;
			n = n / 10;

		}
		System.out.println(oddsum);
		System.out.println(evensum);

	}

}
