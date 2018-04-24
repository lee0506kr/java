import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {

	public static void main(String[] args) {
		// 데이터 처리 스트림 예제2
		// DataInputStream,DataOutStream
		// byte 단위로 데이터를 쓰던것을
		// 자바 기초 자료형 단위러 데이터를 쓸수 있게 구현해놓은 스트링

		DataInputStream in = null;
		DataOutputStream out = null;

		try {
 
			out = new DataOutputStream((new BufferedOutputStream(new FileOutputStream("data.dat"))));

			in = new DataInputStream((new BufferedInputStream(new FileInputStream("data.dat"))));
			// 정수 실수 참 거직 순서대로 저장
			out.writeInt(100);
			out.writeDouble(3.14);
			out.writeBoolean(false);
			out.writeUTF("HELLO");
			// 버퍼가 꽉차지 않으면 내보내지 않음. 버퍼가 꽉차지 않아도
			// 현재 버퍼에 잇는 내용을 내보내기 위해서, flush()를 호출
			out.flush();

			// 쓴 순서대로 저장이되기 떄문에 읽어 올때도
			// 저장할 순서대로 읽어와야한다. 정수 실수 논리
			int intNum = in.readInt();
			double doubleNum = in.readDouble();
			boolean booleanNum = in.readBoolean();
			
			String str = in.readUTF();
			System.out.println(intNum);
			System.out.println(doubleNum);
			System.out.println(booleanNum);
			System.out.println(str);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
