package thread2;

public class TargetThread extends Thread {
	// 이 스레드의 상태값을 PrintThread가 출력

	public void run() {
		// 타켓 스레드 실행 및 상태 모니터링
		for (long i = 0; i < 2000000000; i++) {

			// 스레드의 진행을 잠시 멈춤: 상태값 모니터링을 위해서
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		for (long i = 0; i < 2000000000; i++) {

		}
	}
}
