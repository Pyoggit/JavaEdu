package kr.co.thread_state;

public class ThreadStateMain {

	public static void main(String[] args) {

		//방법1
		Thread t = new TargetThread();
		
		//방법2 다형성이 요구되기때문에 강제형변환
		Thread thread = new TraceStateThread((TargetThread)t);
		thread.start();
		
		System.out.println("메인 스레드 종료");
	}

}
