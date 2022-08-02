package Lec3;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {

			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// star
			int i = 1;
			while (i <= star) {
				if (i % 2 == 0) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
				
				
				i++;
			}

			row++;
			System.out.println();
			space--;
			star += 2;

		}

	}

}
