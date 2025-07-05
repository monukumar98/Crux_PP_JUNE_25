package Lec14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] a = Sum_Of_Two_Arrays(arr1, arr2);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("END");
	}

	public static int[] Sum_Of_Two_Arrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = carry + arr1[i] + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = carry + arr1[i];
			ll.add(sum % 10);
			carry = sum / 10;

			i--;
		}
		while (j >= 0) {
			int sum = carry + arr2[j];
			ll.add(sum % 10);
			carry = sum / 10;

			j--;
		}
		if (carry != 0) {
			ll.add(carry);
		}
		int[] ans = new int[ll.size()];
		Collections.reverse(ll);
		for (int k = 0; k < ans.length; k++) {
			ans[k] = ll.get(k);
		}
		return ans;

	}

}
