package Lec9;

import java.util.*;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}
		display(arr);

	}

	public static void display(int[] arr) {
         
		for (int i = 0; i < arr.length; i++) {// 0 to n-1
			System.out.print(arr[i] + " ");
		}
		

	}

}
