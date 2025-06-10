package Lec7;

public class Fun_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(addition(b, a));
		System.out.println(val);
		System.out.println("Bye");
	}

	public static int addition(int a, int b) {
		int c = a + b;
		int val = 80;
		Fun_Demo3.val = Fun_Demo3.val - 5;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

}
