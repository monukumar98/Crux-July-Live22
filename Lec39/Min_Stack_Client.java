package Lec39;

public class Min_Stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Min_Stack s = new Min_Stack();
		s.push(5);
		s.push(7);
		s.push(2);
		s.push(9);
		s.push(4);
		s.push(3);
		s.push(8);
		s.push(1);
		s.push(17);
		s.Display();
		System.out.println(s.min());// 1
		System.out.println(s.pop());// 17
		System.out.println(s.pop());// 1
		System.out.println(s.peek());// 8
		System.out.println(s.min());// 2

	}

}
