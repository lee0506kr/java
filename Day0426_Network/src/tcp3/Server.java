package tcp3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
	public static void main(String[] args) {

		ServerSocket serverSocket;

		try {

			serverSocket = new ServerSocket(5002);

			Socket socket1 = serverSocket.accept();			
			Socket socket2 = serverSocket.accept();

				Runnable run1 = new ReadWrite(socket1, socket2);
				Runnable run2 = new ReadWrite(socket2, socket1);

				Thread t1 = new Thread(run1);
				Thread t2 = new Thread(run2);

				t1.start();
				t2.start();
			
		} catch (IOException e) {

			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}