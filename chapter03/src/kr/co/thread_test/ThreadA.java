package kr.co.thread_test;

import java.awt.Toolkit;

public class ThreadA implements Runnable {

	public static Toolkit tk = Toolkit.getDefaultToolkit();

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 1; i < 6; i++) {
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The end");

	}

}
