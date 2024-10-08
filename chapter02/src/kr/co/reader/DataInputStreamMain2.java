package kr.co.reader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamMain2 {

	public static void main(String[] args) {
		// 1. 상대파일을 출력 (InputStream) : FileInputStream => DataInputStream
		// 2. 보조스트림 방식으로 작성. (짐작 => 검색)
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		
		int rValue = 0;
		try {
			fis = new FileInputStream("test1.txt");
			dis = new DataInputStream(fis);

			
			int iData = dis.readInt();
			double dData = dis.readDouble();
			String sData = dis.readLine();
			
			System.out.println(iData);
			System.out.println(dData);
			System.out.println(sData);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("the end");
	}

}
