package Lec11;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, -7, 4, 8, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j]=item;

		}

	}

}
