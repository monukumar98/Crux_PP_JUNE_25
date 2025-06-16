package Lec8;

public class Array_Swap_2 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 7 };
		System.out.println(arr[0] + " " + arr[1]);// 2 3
		Swap(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);
	}

	public static void Swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
