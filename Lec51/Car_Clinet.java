package Lec51;

import java.util.*;
import java.util.Comparator;

public class Car_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] arr = new Cars[5];
		arr[0] = new Cars(200, 10, "White");
		arr[1] = new Cars(1000, 20, "Black");
		arr[2] = new Cars(345, 3, "Yellow");
		arr[3] = new Cars(34, 89, "Grey");
		arr[4] = new Cars(8907, 6, "Red");
//		// Arrays.sort(arr);
//		Sort(arr, new CarCompareterSpeed());
//		Display(arr);
//		System.out.println("*************");
//		Sort(arr, new CarCOmparaterPrice());
//		
//		Display(arr);
//		System.out.println("*************");
//		Sort(arr, new CarComparaterColor());
//		Display(arr);

		Arrays.sort(arr, new Comparator<Cars>() {
			@Override
			public int compare(Cars o1, Cars o2) {
				 return o1.speed - o2.speed;
				//return o2.price - o1.price;
			}
		});
		Display(arr);
	}

	private static void Display(Cars[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

//	public static <T extends Comparable<T>>void Sort(T[] arr) {
//
//		for (int trun = 1; trun < arr.length; trun++) {// n-1 time
//			for (int i = 0; i < arr.length - trun; i++) {
//				if (arr[i].compareTo(arr[i + 1]) > 0) {
//					T temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//
//			}
//
//		}
//
//	}

	public static <T> void Sort(T[] arr, Comparator<T> camp) {

		for (int trun = 1; trun < arr.length; trun++) {// n-1 time
			for (int i = 0; i < arr.length - trun; i++) {
				if (camp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}

	}

}
