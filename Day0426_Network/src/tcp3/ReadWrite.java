package tcp3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ReadWrite implements Runnable {

	Socket socket;
	

	public ReadWrite(Socket socket) {
		this.socket = socket;
	}

	public void run() {

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		
			
			
			while(true) {
				String msg = reader.readLine();
				writer.write(msg);
				writer.newLine();
				writer.flush();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
