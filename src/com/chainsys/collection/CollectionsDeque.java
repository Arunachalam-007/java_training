package com.chainsys.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionsDeque {

	public static void main(String[] args) {
		Deque<User> dq=new ArrayDeque<User>();
		
		User u1=new User("Arunachalam",5678l);
		dq.add(u1);
		System.out.println(dq);
		
		 
			
		

	}

}
