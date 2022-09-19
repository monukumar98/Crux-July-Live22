package Lec22;

public class CointToss_No_Cos_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		printoutcome(n, "");

	}

	public static void printoutcome(int n, String ans) {
		if (n == 0) {
			System.out.print(ans + " ");
			return;
		}
		if (ans.length()==0 || ans.charAt(ans.length() - 1) != 'H') {
			printoutcome(n - 1, ans + "H");
		}

		printoutcome(n - 1, ans + "T");

	}

}
