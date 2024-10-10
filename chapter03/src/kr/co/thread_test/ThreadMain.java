package kr.co.thread_test;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// 방법1 클래스 implement Runnable 로 상속(부 = 자)
		Runnable r = new ThreadA();
		Thread thread = new Thread(r);

		// 방법2 클래스 extends Thread
		Thread thread2 = new ThreadB();

		// 방법3 임시객체(Runnable 구현)
		Runnable r2 = new Runnable() {
			Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				for (int i = 1; i < 6; i++) {
					tk.beep();
					System.out.println("땡");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}

		};
		Thread thread3 = new Thread(r2);

		// 방법4 임시객체(Thread 임시객체)
		Thread thread4 = new Thread() {
			Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				for (int i = 1; i < 6; i++) {
					tk.beep();
					System.out.println("땡");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}

		};

		// 방법5(람다식)
		Thread thread5 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 1; i < 6; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		// 1~5 출력하는 프로그램 작성과,비프음이 5번 반복하는 프로그램 작성
		thread3.start();
		for (int i = 1; i < 6; i++) {
			System.out.print(i);
			Thread.sleep(1000);
		}
	}
}
