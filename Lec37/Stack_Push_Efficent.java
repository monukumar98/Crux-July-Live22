package Lec37;

public class Stack_Push_Efficent {

	private Dynamic_Queue dq = new Dynamic_Queue();

	public boolean isEmpty() {

		return dq.isEmpty();

	}

	public void push(int item) throws Exception {

		dq.EnQueue(item);
	}

	public int size() {
		return dq.size();
	}

	public int pop() throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			hlp.EnQueue(dq.DeQueue());
		}
		int item = dq.DeQueue();
		dq = hlp;
		return item;

	}

	public int pekk() throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (dq.size() > 1) {
			hlp.EnQueue(dq.DeQueue());
		}
		int item = dq.DeQueue();
		hlp.EnQueue(item);
		 dq = hlp;
		return item;

	}

	public static void main(String[] args) throws Exception {
		Stack_Push_Efficent spf = new Stack_Push_Efficent();
		spf.push(10);
		spf.push(20);
		spf.push(30);
		spf.push(40);
		spf.push(50);
		System.out.println(spf.pop());
		System.out.println(spf.pop());
		System.out.println(spf.pekk());
		spf.push(-50);
		System.out.println(spf.pekk());

	}

}
