package Lec37;

import Lec35.Stack;

public class Queue_DeQueue_Efficent {

	private Dynamic_Stack ds = new Dynamic_Stack();

	public boolean isEmpty() {

		return ds.isEmpty();

	}

	public int size() {
		return ds.size();
	}

	public void Enqueue(int item) throws Exception {

		Dynamic_Stack hlp = new Dynamic_Stack();
		while (!ds.isEmpty()) {

			hlp.push(ds.pop());
		}
		ds.push(item);

		while (!hlp.isEmpty()) {

			ds.push(hlp.pop());
		}

	}

	public int Dequeue() throws Exception {
		return ds.pop();
	}

	public int getFront() throws Exception {
		return ds.peek();
	}

	public static void main(String[] args) throws Exception {

		Queue_DeQueue_Efficent qdf = new Queue_DeQueue_Efficent();

		qdf.Enqueue(10);
		qdf.Enqueue(20);
		qdf.Enqueue(30);
		qdf.Enqueue(40);
		qdf.Enqueue(50);
		System.out.println(qdf.Dequeue());
		System.out.println(qdf.Dequeue());
		System.out.println(qdf.getFront());
		qdf.Enqueue(60);
		qdf.Enqueue(70);
		System.out.println(qdf.Dequeue());
		System.out.println(qdf.getFront());
		

	}

}
