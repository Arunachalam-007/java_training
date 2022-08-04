package com.chainsys.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

import java.util.Vector;

public class CollectionsVector {

	public static void main(String[] args) {

		PriorityQueue pq=new PriorityQueue();
		pq.add(105378);
		pq.add(37829);
		Vector v=new Vector();
		v.add(20);
		v.add(57);
		v.add(pq);
		
		System.out.println(pq);
		System.out.println(v);
	
		
		System.out.println(v.remove(2));
		System.out.println(v.contains(20));
//		v.clear();
		System.out.println(v.contains(20));
		
		Iterator itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println("Ans "+itr.next());
		}
		
	}

}
