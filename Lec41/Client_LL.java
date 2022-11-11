package Lec41;

import java.util.Scanner;

public class Client_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Input_of_LinkedList ll = new Input_of_LinkedList();
		for (int i = 0; i < 5; i++) {
			ll.addlast(sc.nextInt());

		}
		System.out.println(ll.middleNode());

	}

}
