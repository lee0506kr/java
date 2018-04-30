package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TcpServerThread implements Runnable {

	private String server;
	
	public TcpServerThread(String server) {
		this.server = server;
	}
	public void run() {
		Socket socket = null;
		ServerSocket serverSocket = null;

		try {
		
			serverSocket = new ServerSocket(5000);

			System.out.println("연결 대기중....");

			socket = serverSocket.accept();
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			// 클라이언트로 부터 메시지 받고 나서 전송
			// 클라이언트로 부터 메시지 받고
			while (true) {
				String msg = reader.readLine();
				// 재전송
				if (msg.equals("quit")) {
					break;
				}
				writer.write(msg);
				writer.newLine();
				writer.flush();

			}
			System.out.println("서버종료");
			socket.close();
		} catch (SocketException e) {
			System.out.println("클라이언트와 연결이 끊겼습니다.");

		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}