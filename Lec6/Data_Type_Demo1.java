package Lec6;

import java.util.Scanner;

public class Data_Type_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte b = (byte) (428);// -84
		byte b = (byte) (300);// 44
		byte b1 = 10;
		short s = 10;
		int i = 10;
		long l = 4567890879l;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		b = (byte) (i);
		i = b;
		Scanner sc = new Scanner(System.in);
		b=sc.nextByte();
		s=sc.nextShort();
		i=sc.nextInt();
		l=sc.nextLong();

	}

}
