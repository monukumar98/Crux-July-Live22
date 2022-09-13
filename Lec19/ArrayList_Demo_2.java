package Lec19;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());

		}
		//System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
