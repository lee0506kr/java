package tcp;

import java.io.BufferedReader;
import java.io.InputStream;

public class TcpThreadTest {
	public static void main(String[] args) {

		Thread recive = new Thread(new TcpServerThread(null));
		Thread server = new Thread(new TcpClientThread(null));
		
		recive.start();
		server.start();

	}
}
