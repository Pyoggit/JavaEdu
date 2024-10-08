package kr.co.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<6; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("The end");
	}

}
