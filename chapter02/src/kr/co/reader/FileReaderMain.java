package kr.co.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		// 1. 상대파일을 읽어올 것이다.(Reader) : FileReader
		FileReader fr = null;
		try {
			fr = new FileReader("test.txt");
			int data = 0;
			while ((data = fr.read()) != -1) {
				System.out.println("data = " + (char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
