package Lec4;

public class Pattern24 {

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
			while (j <= star) {
				System.out.print(row + " ");
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
