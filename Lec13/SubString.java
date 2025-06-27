package Lec13;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		System.out.println(s.substring(2, 7));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 2));
		PrintSubString(s);

	}

	public static void PrintSubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}
}
