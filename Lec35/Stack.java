package Lec35;

public class Stack {

	protected int[] arr;

	private int top;

//Stack s =  new Stack();
//Stack s= new Stack(50);
	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		top = -1;
	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		arr = new int[cap];
		top = -1;
	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isfull() {

		return top == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("Bklol Stack full hai");
		}
		
		top++;
		arr[top] = item;

	}

	public int pop() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Bklol Stack khali  hai");
		}

		int val = arr[top];
		top--;
		return val;

	}

	public int peek() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Bklol Stack khali  hai");
		}

		int val = arr[top];

		return val;

	}

	public int size() {

		return top + 1;
	}

	public void display() {

		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}
	

}
