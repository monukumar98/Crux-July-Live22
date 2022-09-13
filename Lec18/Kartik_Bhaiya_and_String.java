package Lec18;

public class Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abababbaaaaabbb";
		int k = 3;
		int flipb = flipchar(str, k, 'b');
		int flipa = flipchar(str, k, 'a');

		System.out.println(Math.max(flipa, flipb));

	}

	public static int flipchar(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink krna hai
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans cal
			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;

	}

}
