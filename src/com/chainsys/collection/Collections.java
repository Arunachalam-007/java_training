package com.chainsys.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
	
	public void display() {
		
		ArrayList al=new ArrayList();
		
		LinkedList ll=new LinkedList();
		
		
		ll.add("momo");
		ll.add(1000);
		
		
		System.out.println(ll);
		
		for (Object object : ll) {
			System.out.println(object);
		}
		al.add("Arunachalam");
		al.add(2999);
		al.add(true);
		al.add(20.90);
		
		
//		al.clear();
		System.out.println(al.equals(al));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
		
		System.out.println(al.remove(2));
		
		
		
		for (Object object : al) {
			System.out.println(object);
		}
	}

}
