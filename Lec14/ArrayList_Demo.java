package Lec14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, 9);// O(N)
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));// O(1)
		// size
		System.out.println(ll.size());// O(1)
		// remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
		// update
		ll.set(1, -11);// O(1)
		System.out.println(ll);
		Collections.sort(ll);// O(Nlog(N))
		Collections.reverse(ll);
		System.out.println(ll);
	}

}
