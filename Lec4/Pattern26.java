package Lec4;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// sapce
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			int val=1;
			while (j <= star) {
				System.out.print(val+" ");
				val++;
				j++;
			}

			// next line ki prep
			System.out.println();
			row++;
			star = star + 2;
			space = space - 1;
		}
	}

}
