package Lec3;

public class Pattern19 {
	public static void main(String[] args) {
		int n = 7;
		int star = n / 2+1;
		int space = -1;
		int row = 1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// star
			int k = 1;
			if(row==1 || row==n) {
				k=2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}

			// mirror
			if (row <= n / 2) {
				star--;
				space = space + 2;
			} else {
				star++;
				space = space - 2;
			}
			System.out.println();
			row++;
		}
	}
}
