package Lec37;

import java.util.Stack;

public class Put_InDown_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(40);
		st.push(6);
		st.push(89);
		st.push(70);
		st.push(-2);
		System.out.println(st);
		InsertDown(st, -11);
		System.out.println(st);

	}

	private static void InsertDown(Stack<Integer> st, int i) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(i);
			return;
		}
		int item = st.pop();
		InsertDown(st, i);
		st.push(item);

	}

}
