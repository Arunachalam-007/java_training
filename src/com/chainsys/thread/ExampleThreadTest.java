package com.chainsys.thread;

public class ExampleThreadTest {


	public static void main(String[] args) {
		ExampleThread et=new ExampleThread();
		et.start();
		System.out.println(et.getState());
		System.out.println(et.getName());
		et.interrupt();
		
		System.out.println("Is interrupted "+et.isInterrupted());
		
		et.notify();

	}

}
