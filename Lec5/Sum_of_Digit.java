package Lec5;

public class Sum_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2347;

		int sum=0;
		while(n>0) {
			int rem =n%10;
			sum+=rem;// sum = sum + rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
