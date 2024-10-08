package kr.co.change;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeFileMain {
	public static void main(String[] args) throws IOException {
		// 1. stream => Reader 변환 => BufferedReader
		// 2. read:Line(), ~~~
		
		//FileInputStream fi = new FileInputStream("test.txt");
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"),"UTF-8");
		//스트림방식
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"),"UTF-8"));
		String data = null;
		
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
		System.out.println("The end");
			
		
	}

}
