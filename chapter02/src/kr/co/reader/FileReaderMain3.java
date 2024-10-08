package kr.co.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain3 {

	public static void main(String[] args) {
		// 1. 상대파일을 읽어올 것이다.(InputStream) : FileReader
		FileInputStream fis = null;
		int rValue = 0;
		try {
			fis = new FileInputStream("test.txt");
			byte[] byteArray = new byte[5];
			while ((rValue = fis.read(byteArray)) != -1) {
				for(int i = 0; i<rValue; i ++) {
					System.out.print(byteArray[i] + " ");
					System.out.print(byteArray[i] + " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("rValue = " + rValue );
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
