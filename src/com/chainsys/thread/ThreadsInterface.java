package com.chainsys.thread;

import java.util.Scanner;

public class ThreadsInterface implements Runnable {

	public void run() {
		
		String name="Arun";
		System.out.println("name :"+name);
		System.out.println("Nothing");
	}
	
	public static void main(String args[]) throws InterruptedException {
		ThreadsInterface ti=new ThreadsInterface();
		
		Thread t=new Thread(ti);
		Thread t1=new Thread(ti);
		t.start();
		
		t.join();
//		t.sleep(3000);
		
		System.out.println(t.isAlive());
		t.interrupted();
		System.out.println(t.isAlive());
		t1.start();
		System.out.println("Isalive "+t1.isAlive());
		t1.sleep(3000);
		System.out.println("Isalive "+t1.isAlive());
	}
	
}
