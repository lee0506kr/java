package tcp3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiServer implements Runnable {

	ServerSocket serverSocket;

	public void run() {
		try {
			Set<Socket> setlist = new HashSet<Socket>();

			Iterator<Socket> it = setlist.iterator();

			while (true) {

				Socket socket = serverSocket.accept();

				setlist.add(socket);

				Runnable readwriter = new ReadWrite(socket);
				
				readwriter.run();

			}

			// c1 에서 내용을 서버한테 보내고 서버는 받고 그 내용을 set 리스트 에다가 보낸다 .
			// 병렬처리 (스레드 사용하기)

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}