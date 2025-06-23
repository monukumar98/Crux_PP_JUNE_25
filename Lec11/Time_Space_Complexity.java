package Lec11;

public class Time_Space_Complexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		int n = 19878;
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(1)
			i++;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N) base 2)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N) base 2)
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N) base 6)
			i *= 2;
			i *= 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N) base 6)
			n /= 2;
			n /= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				//O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			//O(Sqrt(N))
			System.out.println("hey");
		}
		int k=1;
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for ( k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					//O(N^4)
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			// O(log(N) base 2)
			System.out.println("hey");
		}


	}

}
