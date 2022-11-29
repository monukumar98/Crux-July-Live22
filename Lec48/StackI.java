package Lec48;

public interface StackI {
	public static final int val = 90;

	void push(int item);

	int pop();

	int peek();
	void Display();

	 default void seyBye() {
		System.out.println("Bye");
		System.out.println(fun2());
	}

	static void fun1() {
		System.out.println("fun in");

	}

	private int fun2() {

		return 9;
	}

}
