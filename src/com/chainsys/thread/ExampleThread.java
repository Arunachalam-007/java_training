package com.chainsys.thread;

public class ExampleThread extends Thread {
		
		public void run() {
			for(int i=0;i<=10;i++) {
				System.out.println("i value is "+i);
				
				try {
					ExampleThread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		
	}

}
