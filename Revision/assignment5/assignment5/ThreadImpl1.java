package com.masai.assignment5;

public class ThreadImpl1 extends Thread{
	
	@Override
	public synchronized void run() {
		for (int i=1; i<=1000;i++) {
			i=i+1;
			System.out.println("Addition :"+i);
		}
	}

}
