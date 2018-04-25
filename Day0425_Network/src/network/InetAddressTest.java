package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		// InetAddress 클래스 사용하기
		// IP주소를 저장하는 클래스
		// 객체를 만들어 낼 때 factory method를 이용
		// factory method : getInstance. getXXXX() 의형태로 객체 메소드
		InetAddress ia = null;
		InetAddress ia1 = null;

		// 현재 컴퓨터의 ip주소를 가지고 있는 객체 얻어오기
		try {
			ia = InetAddress.getLocalHost();

			System.out.println("IP 주소 : " + ia.getHostAddress());
			System.out.println("호스트 이름 : " + ia.getHostName());

			ia1 = InetAddress.getByName("www.naver.com");
			System.out.println("Naver IP : " + ia1.getHostAddress());
			InetAddress[] ipArr = InetAddress.getAllByName("");

			for (InetAddress i : ipArr) {

				System.out.println("IP 주소 : " + i.getHostAddress());
				System.out.println("호스트 이름 : " + i.getHostName());
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
