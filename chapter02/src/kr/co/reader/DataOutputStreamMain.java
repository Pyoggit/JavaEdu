package kr.co.reader;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamMain {

	public static void main(String[] args) {
		// 1. 상대파일을 출력 (OutputStream) : FileOutputStream => DataOutputStream
		// 2. 보조스트림 방식으로 작성. (짐작 => 검색)
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		
		int rValue = 0;
		try {
			fos = new FileOutputStream("test1.txt");
			dos = new DataOutputStream(fos);

			dos.writeInt(100);
			dos.writeDouble(123.45);
			dos.writeChars("ABC");

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("파일 저장완료");
	}

}
