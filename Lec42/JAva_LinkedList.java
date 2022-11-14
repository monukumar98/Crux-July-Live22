package Lec42;

import java.util.LinkedList;

public class JAva_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);// last me add krega 
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println(list.remove());// 1st remove
		System.out.println(list);
		list.add(2, -9);
		System.out.println(list);
		

	}

}
