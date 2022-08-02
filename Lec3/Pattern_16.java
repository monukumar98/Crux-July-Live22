package Lec3;

import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = n;

		while (row <= 2 * n - 1) {

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < n) {
				space--;
				star--;
			} else {
				space++;
				star++;
			}
			row++;
			System.out.println();

		}

	}

}
