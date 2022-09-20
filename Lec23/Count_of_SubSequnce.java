package Lec23;

public class Count_of_SubSequnce {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		//printanswer(str, "");
		//System.out.println(count);
		System.out.println(answerCount(str, ""));
		

	}

	public static void printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;

			return;
		}

		char ch = ques.charAt(0);
		printanswer(ques.substring(1), ans);
		printanswer(ques.substring(1), ans + ch);

	}

	public static int answerCount(String ques, String ans) {
		if (ques.length() == 0) {
			//System.out.println(ans);

			return 1;
		}

		char ch = ques.charAt(0);
		int a = answerCount(ques.substring(1), ans);
		int b = answerCount(ques.substring(1), ans + ch);
		return a + b;

	}
}
