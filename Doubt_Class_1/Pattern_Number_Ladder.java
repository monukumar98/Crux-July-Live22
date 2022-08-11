package Doubt_Class_1;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int val = 1;
		while (row <= n) {

			int i = 1;
			
			while (i <= star) {
				System.out.print(val + "\t");
				i++;
				val++;
			}
			row++;
			System.out.println();
			star++;

		}

	}

}
