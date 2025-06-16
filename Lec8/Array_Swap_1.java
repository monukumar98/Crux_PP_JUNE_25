package Lec8;

public class Array_Swap_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 1, 7 };
		// int[] arr1 = new int[] { 2, 3, 4, 1, 7 };
		System.out.println(arr[0] + " " + arr[1]);// 2 3
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// 2 3

	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
