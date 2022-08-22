package Lec11;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, -7, 4, 8, 2 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {

		for (int trun = 1; trun < arr.length; trun++) {// n-1 time
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}

	}

	public static void SortOpti(int[] arr) {
         
		for (int trun = 1; trun < arr.length; trun++) {// n-1 time
		      boolean flag=false;
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag=true;
				}

			}
			
			if(flag==false) {
				break;
			}

		}

	}

}
