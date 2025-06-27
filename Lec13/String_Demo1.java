package Lec13;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s1 == s2);// address compare krta hai
		System.out.println(s3 == s2);
		System.out.println(s4 == s1);
		int[] arr = new int[5];
		System.out.println(arr.length);
		System.out.println(s1.length());
		System.out.println(s1.equals(s4));// content compare krta hai
		int length = 9;

	}

}
