package Lec32;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		printprime(n);

	}

	// false -- Prime hai
	// true --> not prime
	public static void printprime(int n) {

		boolean[] prime = new boolean[n + 1];
		prime[0] = true;// 0 is not prime number
		prime[1] = true;// 1 is not prime number

		for (int i = 2; i * i <= n; i++) {
			if (prime[i] == false) {// i is prime number

				for (int mul = 2; i * mul <= n; mul++) {
					prime[mul * i] = true;
				}
			}

		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {// i is prime number
				System.out.print(i + " ");
			}
		}

	}

}
