package readerwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ChangeEncoding {

	// 문서 인코딩 방법 바꾸기

	public static void main(String[] args) {
		// UTF-8로 작성된 문서를 읽어서 MS949 방식의 인코딩으로 바꾸어서 복사

		// 1.파일읽어오기 위해서 FileInputStream, 쓰기 위해서 FilOutputStream
		// 2.InputStreamReader, OutputStreamWriter
		// 3.BufferReader, BufferedWriter

		BufferedReader in = null;
		BufferedWriter out = null;

		// new InputStreamReader(스트림,"UTF-8");

		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream("src/readerwrite/test.java"), "UTF-8"));

			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/readerwrite/test_copy.java"),"MS949"));
			int readeChar;
			while ((readeChar = in.read()) != -1) {
				out.write(readeChar);
				out.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
