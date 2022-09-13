package Lec19;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<>();
		System.out.println(a);

		System.out.println(a.size());
		// element add kaise hoga
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		// index ka range 0 to size()
		a.add(1, -5);
		a.add(0, 8);
		System.out.println(a);

		// remove
		System.out.println(a.remove(2));
		System.out.println(a);

		// set // new value add nhi krega

		a.set(2, -7);
		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
//		Collections.reverse(a);
//		System.out.println(a);

		// element get krna hai
		System.out.println(a.get(2));

//		for (int i = 0; i < a.size(); i++) {
//			System.out.print(a.get(i) + " ");
//		}
//		System.out.println();
		//
		int[] arr = new int[3];
		for (int v : arr) {
			System.out.print(v + " ");
		}
		System.out.println();
		for (int v : a) {
			System.out.print(v + " ");
		}

	}

}
