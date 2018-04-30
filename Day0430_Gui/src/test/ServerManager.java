package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import chatting3.copy.Protocol;

public class ServerManager {

	private List<Socket> socketList;

	public ServerManager() {
		socketList = new ArrayList<Socket>();
	}

	public void add(Socket socket) {
		socketList.add(socket);

		new ServerThread(socket).start();
	}

	class ServerThread extends Thread {

		private String nick = "이름없음";
		private Socket socket;

		public ServerThread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			ObjectInputStream in = null;

			try {
				in = new ObjectInputStream(socket.getInputStream());

				while (true) {
					String msg = null;
					String outMsg = null;

					Protocol p = (Protocol) in.readObject();

					String type = p.getType();
					Map<String, Object> data = p.getData();

					if (type.equals("#01")) {
						outMsg = (String) data.get("nick");
						nick = outMsg;

					} else if (type.equals("#02")) {
						outMsg = (String) data.get("msg");

						for (Socket s : socketList) {
							if (s == socket) {
								continue;
							}
							BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

							writer.write(nick + " : " + outMsg);
							writer.newLine();
							writer.flush();

						}

					}

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
