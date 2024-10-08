package kr.co.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain4 {

	public static void main(String[] args) {
		// try - with - resorces
		int rValue = 0;
		try(FileInputStream fis = new FileInputStream("test.txt")){
			while ((rValue = fis.read()) != -1) {
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
			
		}
	}

}
