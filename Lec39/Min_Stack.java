package Lec39;

import java.util.Stack;

public class Min_Stack {

	private Stack<Integer> st = new Stack<>();
	private int min;

	public void push(int item) {

		if (st.isEmpty()) {
			min = item;
			st.push(item);
		} else if (item > min) {
			st.push(item);
		} else {

			st.push(item - 2 * min);
			min = item;
		}
	}

	public void Display() {
		System.out.println(st);
	}

	public int min() {
		return min;
	}

	public int pop() throws Exception {
		if (st.isEmpty()) {
			throw new Exception("Bklol Stack khaali hai ");
		}
		if (st.peek() > min) {
			return st.pop();
		} else {
			int popdata = st.pop();
			int rv = min;
			min = (rv - popdata) / 2;
			return rv;
		}
	}

	public int peek() throws Exception {
		if (st.isEmpty()) {
			throw new Exception("Bklol Stack khaali hai ");
		}
		if (st.peek() > min) {
			return st.peek();
		} else {

			int rv = min;

			return rv;
		}
	}

}
