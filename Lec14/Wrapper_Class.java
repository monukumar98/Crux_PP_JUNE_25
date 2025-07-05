package Lec14;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);
		Long l = 6789l;
		a1 = a;
		int b = 9;
		Integer b1 = 8;
		b = b1;
		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c4 == c3);

	}

}
