package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();// 10
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(3);
		ll.add(11);
		ll.add(12);
		ll.add(31);
		ll.add(1);
		ll.add(11);
		ll.add(72);
		System.out.println(ll.size());
		ll.add(721);
		System.out.println(ll.size());
		
	}

}
