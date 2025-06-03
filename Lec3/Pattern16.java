package Lec3;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = n;
		int space = n - 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			// mirror
			if (row < n) {
				star--;
				space--;
			} else {
				star++;
				space++;
			}
			// next line ki prep
			System.out.println();
			row++;
		}
	}

}
