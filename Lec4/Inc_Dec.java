package Lec4;

public class Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
//		System.out.println(x++);// 8 post inc
//		System.out.println(x);// 9
//		int p = 11;
//		System.out.println(p--);// 11 post dec
//		System.out.println(p);// 10
//
//		int a = 7;
//		System.out.println(++a); // pre inc--> a = a + 1;
//		System.out.println(a);
//		int a = x++ - ++x - --x + x++ + ++x;
//		System.out.println(a);//9
		int a = x++ + ++x - x-- + x++ + ++x;
		System.out.println(a);

	}

}
