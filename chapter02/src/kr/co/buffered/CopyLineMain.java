package kr.co.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineMain {

	public static void main(String[] args) {
		// 보조스트림 버퍼장치를 설치한다
		// 1. stream, reader => FileReader => BufferedReader
		// 2. readLine통해서 읽어온다.

		// 보조스트림 버퍼장치를 설치한다
		// 1. stream, writer => Filewriter => BufferedWriter
		// 2. println 통해서 읽어온다.

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fr = new FileReader("test.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("test_out.txt");
			pw = new PrintWriter(fw);

			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				pw.println(data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (br != null && pw != null) {
				try {
					br.close();
					pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null && fw != null) {
				try {
					fr.close();
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("파일입력완료");
	}

}
