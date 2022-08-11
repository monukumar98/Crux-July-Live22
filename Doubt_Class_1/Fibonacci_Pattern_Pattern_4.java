package Doubt_Class_1;

import java.util.Scanner;

public class Fibonacci_Pattern_Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
        int a =0;
        int b=1;
		while (row <= n) {

			int i = 1;

			while (i <= star) {
				System.out.print(a+ "\t");
				int c=a+b;
				a=b;
				b=c;
				i++;

			}
			row++;
			System.out.println();
			star++;

		}

	}

}
