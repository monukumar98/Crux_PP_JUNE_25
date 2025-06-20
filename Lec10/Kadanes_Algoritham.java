package Lec10;

public class Kadanes_Algoritham {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximum_sum(arr));
	}

	public static int maximum_sum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}

}
