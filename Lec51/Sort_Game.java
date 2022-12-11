package Lec51;

import java.util.*;

public class Sort_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Employees[] arr = new Employees[n];
		for (int i = 0; i < arr.length; i++) {
			String s = sc.next();
			int val = sc.nextInt();
			arr[i] = new Employees(s, val);

		}

		Arrays.sort(arr, new Comparator<Employees>() {

			@Override
			public int compare(Employees o1, Employees o2) {
				// TODO Auto-generated method stub
				if (o1.Salary == o2.Salary) {
					return o1.name.compareTo(o2.name);
				} else
					return o2.Salary - o1.Salary;
			}
		});

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].Salary >= x) {
				System.out.println(arr[i]);
			}
		}

	}

}

class Employees {
	String name;
	int Salary;

	public Employees(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Salary = salary;
	}

	public String toString() {
		return this.name + " " + this.Salary;
	}
}
