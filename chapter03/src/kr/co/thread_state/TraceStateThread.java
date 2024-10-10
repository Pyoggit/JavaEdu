package kr.co.thread_state;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TraceStateThread extends Thread {

	private TargetThread tt;

	public TraceStateThread(TargetThread tt) {
		setName("감시 스레드");
		this.tt = tt;
	}

	@Override
	public void run() {
		while (true) {
			// 상태점검(상대방스레드 상태 점검)
			State state = tt.getState();
			System.out.println("tt 현재 상태는 = " + state.toString());

			if (state == Thread.State.NEW) {
				tt.start();
			}else if (state == Thread.State.TERMINATED) {
				System.out.println("상태를 점검할 스레드가 종료 되었습니다.");
				break;
			}
			
			//시간 지연
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}//end of while
		System.out.println(getName() + " = The end");
	}
}
