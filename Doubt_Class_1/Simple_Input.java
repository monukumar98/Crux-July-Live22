package Doubt_Class_1;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			sum = sum + n;
			if (sum < 0) {
				break;
			}
			System.out.println(n);

		}

	}

}
