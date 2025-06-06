package Lec5;

public class Check_Prime_Using_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int fact = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				fact++;
				break;
			}
		}
		if (fact == 1) {
			System.out.println("Not prime");
		} else {
			System.out.println("Prime");
		}

	}

}
