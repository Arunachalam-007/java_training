package com.chainsys.collection;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(75849);
		s.add(543);
		s.add(7548);
	
		System.out.println(s);
		s.push(987);
		s.push("jhdn");
		System.out.println(s);
		
		
		
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		System.out.println(s);

	}

}
