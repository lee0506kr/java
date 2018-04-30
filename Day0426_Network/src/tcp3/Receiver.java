package tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receiver implements Runnable {
	private Socket socket;
	
	public Receiver(Socket socket) {
		this.socket = socket;
		
	}

	// 소켓으로 부터 메시지 받아서 출력
	public void run() {
		BufferedReader reader = null;
		String msg = null;

		try {
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {

				msg = reader.readLine();
				System.out.println("상대방: " + msg);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			System.out.println("상대방이 연결을 종료했습니다.");
		}

	}
}
