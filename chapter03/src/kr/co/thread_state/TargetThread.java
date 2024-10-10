package kr.co.thread_state;

public class TargetThread extends Thread {

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			// 1초 동안 일한다.(Runnable State)
			sum += i;
		}
		try {
			// 1.5초 동안 일시정지.(Timed Waiting State)
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 100000000; i++) {
			// 1초 동안 일한다(Runnable State)
			sum += i;
		}

	}

}
