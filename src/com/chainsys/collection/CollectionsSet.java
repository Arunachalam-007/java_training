package com.chainsys.collection;

import java.util.HashSet;

public class CollectionsSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(20);
		hs.add(398);
		hs.add(987);
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		System.out.println(hs.remove(398));
		
		
		System.out.println(hs);
		
		hs.clear();
		System.out.println(hs);
		
	}

}
