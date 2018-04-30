package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.StandardSocketOptions;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClientThread implements Runnable {

	private String cilent;
	
	public TcpClientThread(String cilent) {
		this.cilent = cilent;
	}

	public void run() {
		Socket socket = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.0.70", 5000);

			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));

			
			
			while(true) {
				String outmsg = scan.nextLine();		
				writer.write(outmsg);
				writer.newLine();
				writer.flush();
				if(outmsg.equals("quit")) {
					break;
				}
				System.out.println("클라이언트: 수신대기중");
				String msg = reader.readLine();
				System.out.println("서버 메시지:" +msg);
			}
			System.out.println("클라이언트 종료");
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}