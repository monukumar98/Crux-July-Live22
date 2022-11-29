package Lec48;

public class Genrecis_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = { 10, 20, 30, 40, 50 };

		// char[] a = { 'a', 'b', 'c' };

		String[] arr1 = { "Raj", "Riya", "Kunal", "Rajesh" };
		Pair[] p = new Pair[5];

		Display(arr);
		Display(arr1);
		Display(p);

	}

	public static <riya> void Display(riya[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
