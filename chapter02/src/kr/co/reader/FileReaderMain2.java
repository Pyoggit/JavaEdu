package kr.co.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain2 {

	public static void main(String[] args) {
		// 2. int -> 형변환, 배열 char[]
		FileReader fr = null;
		int rValue = 0;
		try {
			fr = new FileReader("test.txt");
			
			//char[]dataArray = new char[5];
			while ((rValue = fr.read()) != -1) {
				System.out.println(rValue + " = " + (char)rValue + "");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("rValue = " + rValue );
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
