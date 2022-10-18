package Lec32;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lo = 50;
		int hi = 100;
		Random rn = new Random();
		for (int i = 0; i < 10; i++) {
			int r = rn.nextInt(hi - lo + 1) + lo;
			System.out.print(r + " ");

		}

	}

}
