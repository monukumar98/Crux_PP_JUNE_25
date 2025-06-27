package Lec13;

public class String_Demo2 {
	public static void main(String[] args) {
		String s1 = "Hello";//String pool
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		s1=s1+"bye";
		System.out.println(s1);
		String s5 ="Hello"+"Bye";//String pool
		System.out.println(s5.charAt(1));
	}

}
