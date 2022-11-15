package Lec43;

import Lec39.Min_Stack;

public class Binary_Tree_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
//10 true 20 true 40 false false true 50 false false true 30 false true 60 true
//		// 70 false false false
//		bt.Display();
//		bt.postOrder();
//		bt.INOrder();
//		bt.PreOrder();
//		System.out.println(bt.find(50));
//		System.out.println(bt.max());
//		System.out.println(bt.ht());
		Min_Stack mm = new Min_Stack();
		mm.push(-2);
		mm.push(0);
		mm.push(-3);
		System.out.println(mm.min());
		System.out.println(mm.pop());
		System.out.println(mm.peek());
		System.out.println(mm.min());

	}

}
