package Lec10;

public class Maximum_SubArraySUM {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maximum_sum(arr));
	}

	public static int maximum_sum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(ans, sum);
			}
		}
		return ans;

	}
}
