package Lec9;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 9, 7, 4, 8, 2, 11 };
		// InsertLastElement(arr, arr.length - 1);
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}

	}

	public static void InsertLastElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int val = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > val) {
			arr[j + 1] = arr[j];
			arr[j] = val;
			j--;

		}
		// correct index is j+1

	}

}
