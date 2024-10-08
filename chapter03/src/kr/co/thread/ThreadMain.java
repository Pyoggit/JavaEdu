package kr.co.thread;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
	
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=1; i<6; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		//메인쓰레드
		thread.start();
		for(int i=1; i<6; i++) {
			System.out.println(i + "땡");
			Thread.sleep(1000);
		}
		
		System.out.println("The end");
	}

}

//		Thread thread = Thread.currentThread();
//		System.out.println("" + thread.getName());