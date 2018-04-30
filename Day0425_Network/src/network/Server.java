package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Server {
	//스레드로 만들필요는 없음
	//애가 하는 역할은 동시에 작업해야할 일이 없다
	//받고 나서 보내기 : 작업의 순서가 정해져 있기 때문에 thread가 필요 없음
	
	//클라이언트 부분에서 Sender와 Receive를 thread로 구현한것은
	//클라이언트가 메시지 보내기와 받기를 동시에 진행해야 하기 때문이다.

	public static void main(String[] args) {
		//메세지를 주고 받기 위한 소켓
		//메시지를 전달하기 위해서 IP주소의 모음
		

		try {                                                                                                                                           
			DatagramSocket socket = new DatagramSocket(5500);
			byte[] buf = null;
			DatagramPacket packet = null;
			InetAddress ia = null;
			Set<String> setlist = new HashSet<String>();
			// 애가 할일은 5000번포트로 들어오는 데이터를 계속 받으면됨
			while (true) {

				// 패킷 준비하고, socket으로 부터 데이터 받아오기

				System.out.println("데이터 수신 대기중 ......");
				buf = new byte[512];

				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				//데이터를 받고 나면, 데이터를 다른 클라이언트들에게 전송
				//클라이언트에 전송하기 위해서는 IP주소를 알아야한다.
				//메시지를 받으면 해당 IP를 저장: 같은 클라이언트에서 메시지를 보내면 중복으로 저장됨 >> 중복이 되지 않게 저장 (Set : 중복되지 않는 모음)
				
				System.out.println(packet.getAddress().getHostAddress() + " : " + new String(buf).trim());

				setlist.add(packet.getAddress().getHostAddress());

				Iterator<String> it = setlist.iterator();
				while (it.hasNext()) {

					ia = InetAddress.getByName(it.next());
					packet = new DatagramPacket(buf, buf.length, ia, 5000);
					socket.send(packet);

				}

			}

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
