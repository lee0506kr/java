package thread2;

public class PrintThread extends Thread {
	// 타켓스레드 상태값 출력
	// 타켓스레드 실행시키고, 상태값 모니터링
	// 스레드의 상태값 받아오기 getState()

	Thread targetThread;

	public PrintThread(Thread targetThread) {
		this.targetThread = targetThread;

	}

	public void run() {

		while (true) {
			// 반복하면 타켓 스레드의 상태값 확인하기

			Thread.State state = targetThread.getState();
			System.out.println("타켓 스레드의 상태 : " + state);

			if (state == Thread.State.NEW) {
				targetThread.start();

			} else if (state == Thread.State.TERMINATED) {
				break;
			}
			// *****************************************//
			try {
				// 너무 많은 출력을 방지하기 위해서 0.1초각 모니터링 중지
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
