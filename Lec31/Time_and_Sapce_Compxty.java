package Lec31;

public class Time_and_Sapce_Compxty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000_00; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		// O(1)
		System.out.println("Java padhna to Monu bhaiya se, 29 Oct se Noida me  ");
		System.out.println("hey");
		int n = 10000000;
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}

		while (i < n) {
			System.out.println("Hey");
			// Log(N)
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			// Log(N)
			n /= 2;
		}

		while (i <= n) {
			System.out.println("Hey");
//O(N)
			i += 2;
			i += 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// log(N) base 6
			i *= 2;
			i *= 3;
		}

		while (n > 0) {
			System.out.println("Hey");
			// log(N) base 6
			n /= 2;
			n /= 3;
		}

		int k = 10;
		while (i <= n) {
			System.out.println("Hey");
			// (O)(N/K)
			i += k;
		}

		while (i <= n) {
			System.out.println("Hey");
			// log(N) base K
			i *= k;
		}

		while (n > 0) {
			System.out.println("Hey");

			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");

			n = n - 2;
			n = n - 3;
		}
		while (n > 0) {
			n = n - k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");

				// O(N^2)
			}
		}

		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// Sqrt(N)
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}

		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// Log(N)
		}

		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				}
			}
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
				//O(N(log(n))
			}
		}
		
		int val = 1000;
		for (i = 0; i < n; i++) {
			for (int j = 0; j < val; j++) {
				for (int t = 0; t <=j; t++) {
                //(O) N*(Val)^2
				}
			}
		}
		  // bubble
		// Selection
		// instersion
		     
	}

}
