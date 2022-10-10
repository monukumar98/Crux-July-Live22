package Lec29;

import java.util.Scanner;

public class Minimum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str = sc.next();
			minimum_number_from_given_Sequence(str);
			System.out.println();
			//t--;
		}

	}

	public static void minimum_number_from_given_Sequence(String str) {
		int[] ans = new int[str.length() + 1];
		int num = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = num;
				num++;
				for (int j = i - 1; j >= 0 && str.charAt(j) == 'D'; j--) {
					ans[j] = num;
					num++;
				}

			}

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
		

	}

}
