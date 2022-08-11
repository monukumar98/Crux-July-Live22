package Doubt_Class_1;

import java.util.Scanner;

public class Shoping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int m = sc.nextInt();
			int n = sc.nextInt();

			int a = 0;
			int h = 0;
			int count = 1;
			while (true) {
				a = a + count;
				if (a > m) {
					System.out.println("Harshit");
					break;
				}
				count++;
				h = h + count;
				if (h > n) {
					System.out.println("Aayush");
					break;
				}
				count++;

			}
			t--;
		}

	}

}
