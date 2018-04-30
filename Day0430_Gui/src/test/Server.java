package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket;
		ServerManager manager = new ServerManager();
		
		
		try {
			serverSocket = new ServerSocket(8000);
			System.out.println("*");
			while(true) {
				System.out.println("요청 대기중");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트 연결 되었습니다.");
				manager.add(socket);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
